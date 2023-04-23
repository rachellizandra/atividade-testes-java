package com.ada.ecommerce.aulatdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@Component
public class Venda {
    @Id
    private Long id;
    private String historico;
    private Double saldo;
    private LocalDateTime dataVenda;
}
