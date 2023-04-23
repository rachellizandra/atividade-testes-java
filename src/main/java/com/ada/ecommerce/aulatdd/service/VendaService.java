package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Venda;
import com.ada.ecommerce.aulatdd.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    VendaRepository vendaRepository;

    public VendaService() {
        this.vendaRepository = vendaRepository;
    }

    public List<Venda> listarVendas() {
        return vendaRepository.findAll();
    }

    public void encontrarVendaPorId(Long id) {
        vendaRepository.findById(id).ifPresent(venda -> System.out.println(venda));
    }

    public void cadastrarVenda(Venda venda) {
        vendaRepository.save(venda);
    }

    public void deletarVenda(Long id) {
        vendaRepository.deleteById(id);
    }

    public void atualizarVenda(Venda vendaAnterior) {
        Venda vendaAtualizada = vendaRepository.findById(vendaAnterior.getId()
        ).orElseThrow(() -> new RuntimeException("Venda não encontrada"));

        vendaAtualizada.setDataVenda(vendaAnterior.getDataVenda());
        vendaAtualizada.setHistorico(vendaAnterior.getHistorico());
        vendaAtualizada.setSaldo(vendaAnterior.getSaldo());

        vendaRepository.save(vendaAtualizada);
    }
}
