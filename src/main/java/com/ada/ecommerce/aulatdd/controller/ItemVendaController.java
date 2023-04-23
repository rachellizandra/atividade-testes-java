package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.ItemVenda;
import com.ada.ecommerce.aulatdd.service.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itemvenda")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @PostMapping("/novo")
    public void criarItemVenda(@RequestBody ItemVenda itemVenda) {
        itemVendaService.criarItemVenda(itemVenda);
    }
    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<ItemVenda>> listaItemVenda() {
        return ResponseEntity.ok(itemVendaService.listaItemVenda());
    }

    @GetMapping("/{id}")
    public void encontrarItemVendaPorId(@PathVariable Long id) {
        itemVendaService.encontrarItemVendaPorId(id);
    }
    @DeleteMapping("/{id}")
    public void deletarItemVenda(@PathVariable Long id) {
        itemVendaService.deletarItemVenda(id);
    }

}
