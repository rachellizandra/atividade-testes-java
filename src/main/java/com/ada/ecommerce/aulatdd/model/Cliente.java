package com.ada.ecommerce.aulatdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Component
public class Cliente {
    @Id
    private Long id;
    private String nome;
    private String cpf;
    private String endereco;
}
