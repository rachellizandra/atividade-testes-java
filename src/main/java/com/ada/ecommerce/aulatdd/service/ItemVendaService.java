package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.ItemVenda;
import com.ada.ecommerce.aulatdd.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ItemVendaService {

    @Autowired
    ItemVendaRepository itemVendaRepository;

    public ItemVendaService() {
        this.itemVendaRepository = itemVendaRepository;
    }

    public List<ItemVenda> listaItemVenda() {
        return itemVendaRepository.findAll();
    }

    public void encontrarItemVendaPorId(Long id) {
        itemVendaRepository.findById(id).ifPresent(itemVenda -> System.out.println(itemVenda));
    }

    public void criarItemVenda(ItemVenda itemVenda) {
        itemVendaRepository.save(itemVenda);
    }

    public void deletarItemVenda(Long id) {
        itemVendaRepository.deleteById(id);
    }
}
