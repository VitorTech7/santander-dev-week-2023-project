package com.diovitor.santanderdevweek2023project.controller;

import com.diovitor.santanderdevweek2023project.model.UsuarioModel;
import com.diovitor.santanderdevweek2023project.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<UsuarioModel> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<UsuarioModel> getUsuario(@PathVariable Long id) {
        return usuarioRepository.findById(id);
    }

    @PostMapping
    public UsuarioModel criarUsuario(@RequestBody UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    @PutMapping("/{id}")
    public UsuarioModel atualizarUsuario(@PathVariable Long id, @RequestBody UsuarioModel usuarioModel) {
        usuarioModel.setId(id);
        return usuarioRepository.save(usuarioModel);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
