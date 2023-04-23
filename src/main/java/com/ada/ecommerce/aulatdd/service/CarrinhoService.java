package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Carrinho;
import com.ada.ecommerce.aulatdd.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CarrinhoService {

    @Autowired
    CarrinhoRepository carrinhoRepository;

    public CarrinhoService() {
        this.carrinhoRepository = carrinhoRepository;
    }

    public List<Carrinho> listaCarrinho() {
        return carrinhoRepository.findAll();
    }

    public void encontrarCarrinhoPorId(Long id) {
        carrinhoRepository.findById(id).ifPresent(carrinho -> System.out.println(carrinho));
    }

    public void criarCarrinho(Carrinho carrinho) {
        carrinhoRepository.save(carrinho);
    }

    public void deletarCarrinho(Long id) {
        carrinhoRepository.deleteById(id);
    }
}
