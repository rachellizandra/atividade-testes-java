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

    public void atualizarProduto(Produto produtoAntigo) {
        Produto produtoEstoque = produtoRepository.findById(produtoAntigo.getId()
        ).orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        produtoEstoque.setNome(produtoAntigo.getNome());
        produtoEstoque.setDescricao(produtoAntigo.getDescricao());
        produtoEstoque.setPreco(produtoAntigo.getPreco());

        produtoRepository.save(produtoEstoque);
    }
}
