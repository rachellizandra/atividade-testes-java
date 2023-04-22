package com.ada.ecommerce.aulatdd.service;

import com.ada.ecommerce.aulatdd.model.Produto;
import com.ada.ecommerce.aulatdd.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutoService() {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    public void encontrarProdutoPorId(Long id) {
        produtoRepository.findById(id).ifPresent(produto -> System.out.println(produto));
    }

    public void criarProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
