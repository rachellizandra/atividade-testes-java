package com.ada.ecommerce.aulatdd.model;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class VendaTest {

    /**
     * Finalizar uma venda
     *
     * • O cliente finaliza a compra
     *
     * • O sistema verifica se o carrinho de compras está vazio
     *
     * • O sistema verifica se o cliente tem saldo suficiente para efetuar a compra
     *
     * • O sistema atualiza o estoque dos produtos comprados
     *
     * • O sistema registra a venda no histórico do cliente
     *
     * • O sistema atualiza o saldo do cliente
     */

}