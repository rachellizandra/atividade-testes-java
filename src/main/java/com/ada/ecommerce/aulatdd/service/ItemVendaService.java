package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.ItemVenda;
import com.ada.ecommerce.aulatdd.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemVendaService {
    @Autowired
    ItemVendaRepository itemVendaRepository;

    public ItemVendaService() {
        this.itemVendaRepository = itemVendaRepository;
    }

    public List<ItemVenda> listarItens() {
        return itemVendaRepository.findAll();
    }

    public void encontrarItemPorId(Long id) {
        itemVendaRepository.findById(id).ifPresent(itemVenda -> System.out.println(itemVenda));
    }

    public void cadastrarItem(ItemVenda itemVenda) {
        itemVendaRepository.save(itemVenda);
    }

    public void deletarItem(Long id) {
        itemVendaRepository.deleteById(id);
    }

    public void atualizarItemVenda(ItemVenda itemVendaAnterior) {
        ItemVenda itemVendaAtualizado = itemVendaRepository.findById(itemVendaAnterior.getId()
        ).orElseThrow(() -> new RuntimeException("Item da venda não encontrado"));

        itemVendaAtualizado.setStatus(itemVendaAnterior.getStatus());
        itemVendaAtualizado.setFormaPagamento(itemVendaAnterior.getFormaPagamento());
        itemVendaAtualizado.setQuantidade(itemVendaAnterior.getQuantidade());
        itemVendaAtualizado.setPrazoEntrega(itemVendaAnterior.getPrazoEntrega());
        itemVendaAtualizado.setDataCriacao(itemVendaAnterior.getDataCriacao());

        itemVendaRepository.save(itemVendaAtualizado);
    }
}
