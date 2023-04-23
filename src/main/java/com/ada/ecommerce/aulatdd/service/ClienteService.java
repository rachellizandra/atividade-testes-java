package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Cliente;
import com.ada.ecommerce.aulatdd.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    public ClienteService() {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public void encontrarClientePorId(Long id) {
        clienteRepository.findById(id).ifPresent(cliente -> System.out.println(cliente));
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void deletarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public void atualizarCliente(Cliente clienteAnterior) {
        Cliente clienteAtualizado = clienteRepository.findById(clienteAnterior.getId()
        ).orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        clienteAtualizado.setNome(clienteAnterior.getNome());
        clienteAtualizado.setCpf(clienteAnterior.getCpf());
        clienteAtualizado.setEmail(clienteAnterior.getEmail());
        clienteAtualizado.setTelefone(clienteAnterior.getTelefone());
        clienteAtualizado.setEndereco(clienteAnterior.getEndereco());

        clienteRepository.save(clienteAnterior);
    }
}
