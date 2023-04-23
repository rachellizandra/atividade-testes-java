package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.Cliente;
import com.ada.ecommerce.aulatdd.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/novo")
    public void criarCliente(@RequestBody Cliente cliente) {
        clienteService.criarCliente(cliente);
    }
    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<Cliente>> listaCarrinhos() {
        return ResponseEntity.ok(clienteService.listaCliente());
    }

    @GetMapping("/{id}")
    public void encontrarClientePorId(@PathVariable Long id) {
        clienteService.encontrarClientePorId(id);
    }
    @DeleteMapping("/{id}")
    public void Cliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
    }
}
