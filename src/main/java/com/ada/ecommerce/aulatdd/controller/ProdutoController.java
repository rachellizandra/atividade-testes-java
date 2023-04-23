package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.Produto;
import com.ada.ecommerce.aulatdd.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @PostMapping("/novo")
    public void criarProduto(@RequestBody Produto produto) {
        produtoService.criarProduto(produto);
    }
    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<Produto>> listaProdutos() {
        return ResponseEntity.ok(produtoService.listaProdutos());
    }

    @GetMapping("/{id}")
    public void encontrarProdutoPorId(@PathVariable Long id) {
        produtoService.encontrarProdutoPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }

    @PutMapping("/atualizar")
    public void atualizarProduto(@RequestBody Produto produto){
        produtoService.atualizarProduto(produto);
    }
}
