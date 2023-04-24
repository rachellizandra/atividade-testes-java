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

    /**
     * Adicionar um produto ao carrinho de compras
     *
     * • O cliente adiciona um produto ao carrinho de compras
     *
     * • O sistema atualiza o valor total do carrinho de compras
    */

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

        Carrinho carrinho1 = new Carrinho(Long.parseLong(id), valorTotal, quantidade, dataInsercao);
        return carrinhoRepository.save(carrinho1);
    }

    @Test
    public void testarCriarCarrinho() throws Exception {
        Carrinho carrinho = criarCarrinhoTeste();

        assertEquals(5, carrinho.getQuantidade());
        assertEquals(BigDecimal.valueOf(56.99), carrinho.getValorTotal());
    }


    @Test
    public void testarAdicionarProdutoNoCarrinho() throws Exception {
        Produto produto2 = new Produto(1l, "mouse óptico", 3, "multilaser", BigDecimal.valueOf(9.99));
        Produto produto3 = new Produto(2l, "teclado dell", 1, "dell 2.0", BigDecimal.valueOf(19.99));

        produtos.add(produto2);
        produtos.add(produto3);

        // Verificar se o produto foi adicionado corretamente ao carrinho
        Carrinho carrinho = criarCarrinhoTeste();
        // Adicionar o produto ao carrinho
        carrinho.adicionarProduto(produto2);
        carrinho.adicionarProduto(produto3);
        //carrinhoService.adicionarProdutoAoCarrinho(produto1);
        System.out.println(produtos.size());
        System.out.println(carrinho.getValorTotal());

        assertEquals(3, produtos.size());
        assertEquals(BigDecimal.valueOf(86.97), carrinho.getValorTotal());
    }

}