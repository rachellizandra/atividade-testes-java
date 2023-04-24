package com.ada.ecommerce.aulatdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Component
@Table(name = "tb_carrinho")
public class Carrinho {
    @Id
    private Long id;
    private BigDecimal valorTotal;

    private Integer quantidade;
    private LocalDateTime dataInsercao;

    public void adicionarProduto(Produto produto) {
        List<Produto> produtos = new ArrayList<>();

        // Verifica se o produto já existe no carrinho
        boolean produtoExistente = false;
        for (Produto p : produtos) {
            if (p.getId().equals(produto.getId())) {
                p.setQuantidade(p.getQuantidade() + 1);
                produtoExistente = true;
                break;
            }
        }

        // Se o produto não existe no carrinho, adiciona um novo
        if (!produtoExistente) {
            produto.setQuantidade(produto.getQuantidade());
            produtos.add(produto);
        }

        // Atualiza o valor total do carrinho
        valorTotal = valorTotal.add(produto.getPreco());
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "id=" + id +
                ", valorTotal=" + valorTotal +
                ", dataInsercao=" + dataInsercao +
                '}';
    }
}
