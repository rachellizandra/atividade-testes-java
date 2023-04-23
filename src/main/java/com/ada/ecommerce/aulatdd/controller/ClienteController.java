package com.ada.ecommerce.aulatdd.controller;

import com.ada.ecommerce.aulatdd.model.Cliente;
import com.ada.ecommerce.aulatdd.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/novo")
    public void criarCliente(@RequestBody Cliente cliente) {
        clienteService.cadastrarCliente(cliente);
    }

    @GetMapping(value = "/lista", produces = "application/json")
    public ResponseEntity<List<Cliente>> listarClientes() {
        return ResponseEntity.ok(clienteService.listarClientes());
    }

    @GetMapping("/{id}")
    public void encontrarClientePorId(@PathVariable Long id) {
        clienteService.encontrarClientePorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarCliente(@PathVariable Long id) {
        clienteService.deletarCliente(id);
    }

    @PutMapping("/atualizar")
    public void atualizarCliente(@RequestBody Cliente cliente){
        clienteService.atualizarCliente(cliente);
    }

}
