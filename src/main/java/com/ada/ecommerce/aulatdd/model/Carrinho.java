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

import java.time.LocalDateTime;

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

    private Integer quantidade;

    private LocalDateTime dataInsercao;

    @Override
    public String toString() {
        return "Carrinho{" +
                "id=" + id +
                ", quantidade=" + quantidade +
                ", dataInsercao=" + dataInsercao +
                '}';
    }
}
