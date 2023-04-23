package com.ada.ecommerce.aulatdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Component
public class Produto {

    @Id
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;

    public Produto() {

    }


    @Override
    public String toString() {
        return "Produto [descricao=" + descricao + ", nome=" + nome + ", preco=" + preco + "]";
    }
}
