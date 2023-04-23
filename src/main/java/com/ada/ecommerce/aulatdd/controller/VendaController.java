package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.Venda;
import com.ada.ecommerce.aulatdd.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendas")
public class VendaController {
    @Autowired
    private VendaService vendaService;

    @PostMapping("/novo")
    public void criarVenda(@RequestBody Venda venda) {
        vendaService.cadastrarVenda(venda);
    }

    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<Venda>> listarVendas() {
        return ResponseEntity.ok(vendaService.listarVendas());
    }

    @GetMapping("/{id}")
    public void encontrarVendaPorId(@PathVariable Long id) {
        vendaService.encontrarVendaPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarVenda(@PathVariable Long id) {
        vendaService.deletarVenda(id);
    }

    @PutMapping("/atualizar")
    public void atualizarVenda(@RequestBody Venda venda){
        vendaService.atualizarVenda(venda);
    }
}
