package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Venda;
import com.ada.ecommerce.aulatdd.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class VendaService {

    @Autowired
    VendaRepository vendaRepository;

    public VendaService() {
        this.vendaRepository = vendaRepository;
    }

    public List<Venda> listaVenda() {
        return vendaRepository.findAll();
    }

    public void encontrarVendaPorId(Long id) {
        vendaRepository.findById(id).ifPresent(venda -> System.out.println(venda));
    }

    public void criarVenda(Venda venda) {
        vendaRepository.save(venda);
    }

    public void deletarVenda(Long id) {
        vendaRepository.deleteById(id);
    }
}
