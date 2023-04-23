package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.Venda;
import com.ada.ecommerce.aulatdd.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private VendaService vendaService;

    @PostMapping("/novo")
    public void criarVenda(@RequestBody Venda venda) {
        vendaService.criarVenda(venda);
    }
    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<Venda>> listaVenda() {
        return ResponseEntity.ok(vendaService.listaVenda());
    }

    @GetMapping("/{id}")
    public void encontrarVendaPorId(@PathVariable Long id) {
        vendaService.encontrarVendaPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletarVenda(@PathVariable Long id) {
        vendaService.deletarVenda(id);
    }

}
