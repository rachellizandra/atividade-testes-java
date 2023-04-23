package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Cliente;
import com.ada.ecommerce.aulatdd.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ClienteService() {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listaCliente() {
        return clienteRepository.findAll();
    }

    public void encontrarClientePorId(Long id) {
        clienteRepository.findById(id).ifPresent(cliente -> System.out.println(cliente));
    }

    public void criarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
