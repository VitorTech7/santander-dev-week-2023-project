package com.diovitor.santanderdevweek2023project.controller;

import com.diovitor.santanderdevweek2023project.model.ProdutoModel;
import com.diovitor.santanderdevweek2023project.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<ProdutoModel> listarProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ProdutoModel> getProduto(@PathVariable Long id) {
        return produtoRepository.findById(id);
    }

    @PostMapping
    public ProdutoModel criarProduto(@RequestBody ProdutoModel produtoModel) {
        return produtoRepository.save(produtoModel);
    }

    @PutMapping("/{id}")
    public ProdutoModel atualizarProduto(@PathVariable Long id, @RequestBody ProdutoModel produtoModel) {
        produtoModel.setId(id);
        return produtoRepository.save(produtoModel);
    }

    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoRepository.deleteById(id);
    }
}
