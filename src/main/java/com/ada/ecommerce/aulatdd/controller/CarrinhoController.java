package com.ada.ecommerce.aulatdd.controller;


import com.ada.ecommerce.aulatdd.model.Carrinho;
import com.ada.ecommerce.aulatdd.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carrinhos")
public class CarrinhoController {
    @Autowired
    private CarrinhoService carrinhoService;

    @PostMapping("/novo")
    public void criarCarrinho(@RequestBody Carrinho carrinho) {
        carrinhoService.cadastrarCarrinho(carrinho);
    }

    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<Carrinho>> listarCarrinhos() {
        return ResponseEntity.ok(carrinhoService.listarCarrinhos());
    }

    @GetMapping("/{id}")
    public void encontrarCarrinhoPorId(@PathVariable Long id) {
        carrinhoService.encontrarCarrinhoPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarCarrinho(@PathVariable Long id) {
        carrinhoService.deletarCarrinho(id);
    }

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody Carrinho carrinho){
        carrinhoService.atualizarCarrinho(carrinho);
    }

}
