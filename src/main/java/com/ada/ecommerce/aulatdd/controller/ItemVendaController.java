package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.ItemVenda;
import com.ada.ecommerce.aulatdd.service.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemVendaController {

    @Autowired
    private ItemVendaService itemVendaService;

    @PostMapping("/novo")
    public void cadastrarItemVenda(@RequestBody ItemVenda itemVenda) {
        itemVendaService.cadastrarItem(itemVenda);
    }

    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<ItemVenda>> listarItemVendas() {
        return ResponseEntity.ok(itemVendaService.listarItens());
    }

    @GetMapping("/{id}")
    public void encontrarItemVendaPorId(@PathVariable Long id) {
        itemVendaService.encontrarItemPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarItemVenda(@PathVariable Long id) {
        itemVendaService.deletarItem(id);
    }

    @PutMapping("/atualizar")
    public void atualizarItem(@RequestBody ItemVenda itemVenda){
        itemVendaService.atualizarItemVenda(itemVenda);
    }
}
