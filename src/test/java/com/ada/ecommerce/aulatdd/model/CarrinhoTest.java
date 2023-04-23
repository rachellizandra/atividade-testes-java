package com.ada.ecommerce.aulatdd.model;

import com.ada.ecommerce.aulatdd.repository.CarrinhoRepository;
import com.ada.ecommerce.aulatdd.service.CarrinhoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class CarrinhoTest {
    /*
    /**
     * Adicionar um produto ao carrinho de compras
     *
     * • O cliente adiciona um produto ao carrinho de compras
     *
     * • O sistema atualiza o valor total do carrinho de compras


    @Autowired
    CarrinhoService carrinhoService;
    @Autowired
    CarrinhoRepository carrinhoRepository;

    @Autowired
    private MockMvc mockMvc;
    List<Produto> produtos = new ArrayList<>(); // Lista de produtos no carrinho

    public Carrinho criarCarrinhoTeste() throws Exception {
        Produto produto1 = new Produto(1l, "mouse óptico", 3, "multilaser", BigDecimal.valueOf(9.99));
        produtos.add(produto1);
        String id = "1";
        BigDecimal valorTotal = BigDecimal.valueOf(56.99);
        Integer quantidade = 5;
        LocalDateTime dataInsercao = LocalDateTime.of(2023, Month.APRIL, 15, 15, 56);

        Carrinho carrinho1 = new Carrinho(Long.parseLong(id), valorTotal, quantidade, dataInsercao, produtos);
        return carrinhoRepository.save(carrinho1);
    }

    @Test
    public void testarAdicionarProdutoNoCarrinho() throws Exception {
        // Criar um produto de teste
        //Produto produto1 = new Produto(1l, "mouse óptico", 3, "multilaser", BigDecimal.valueOf(9.99));

        // Verificar se o produto foi adicionado corretamente ao carrinho
        Carrinho carrinho = criarCarrinhoTeste();
        // Adicionar o produto ao carrinho
        //carrinho.adicionarProduto(produto1);
        //carrinhoService.adicionarProdutoAoCarrinho(produto1);

        Assertions.assertEquals(5, carrinho.getQuantidade());
        Assertions.assertEquals(new BigDecimal(56.99), carrinho.getValorTotal());
    }
    */
}