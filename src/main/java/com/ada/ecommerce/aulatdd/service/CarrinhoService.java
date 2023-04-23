package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Carrinho;
import com.ada.ecommerce.aulatdd.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrinhoService {
    @Autowired
    CarrinhoRepository carrinhoRepository;

    public CarrinhoService() {
        this.carrinhoRepository = carrinhoRepository;
    }

    public List<Carrinho> listarCarrinhos() {
        return carrinhoRepository.findAll();
    }

    public void encontrarCarrinhoPorId(Long id) {
        carrinhoRepository.findById(id).ifPresent(carrinho -> System.out.println(carrinho));
    }

    public void cadastrarCarrinho(Carrinho carrinho) {
        carrinhoRepository.save(carrinho);
    }

    public void deletarCarrinho(Long id) {
        carrinhoRepository.deleteById(id);
    }

    public void atualizarCarrinho(Carrinho carrinhoAnterior) {
        Carrinho carrinhoAtualizado = carrinhoRepository.findById(carrinhoAnterior.getId()
        ).orElseThrow(() -> new RuntimeException("Carrinho não encontrado"));

        carrinhoAtualizado.setQuantidade(carrinhoAnterior.getQuantidade());
        carrinhoAtualizado.setDataInsercao(carrinhoAnterior.getDataInsercao());

        carrinhoRepository.save(carrinhoAtualizado);
    }
}
