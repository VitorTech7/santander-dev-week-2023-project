package com.diovitor.santanderdevweek2023project.controller;

import com.diovitor.santanderdevweek2023project.model.DepartamentoModel;
import com.diovitor.santanderdevweek2023project.repository.DepartamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {

    @Autowired
    private DepartamentoRepository departamentoRepository;

    @GetMapping
    public List<DepartamentoModel> listarDepartamentos() {
        return departamentoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DepartamentoModel> getDepartamento(@PathVariable Long id) {
        return departamentoRepository.findById(id);
    }

    @PostMapping
    public DepartamentoModel criarDepartamento(@RequestBody DepartamentoModel departamentoModel) {
        return departamentoRepository.save(departamentoModel);
    }

    @PutMapping("/{id}")
    public DepartamentoModel atualizarDepartamento(@PathVariable Long id, @RequestBody DepartamentoModel departamentoModel) {
        departamentoModel.setId(id);
        return departamentoRepository.save(departamentoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarDepartamento(@PathVariable Long id) {
        departamentoRepository.deleteById(id);
    }
}
