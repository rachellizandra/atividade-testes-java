package com.ada.ecommerce.aulatdd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Component
@Table(name = "tb_venda")
public class Venda {
    @Id
    private Long id;

    private String historico;

    private BigDecimal saldo;

    private LocalDateTime dataVenda;

    @Override
    public String toString() {
        return "Venda{" +
                "id=" + id +
                ", historico=" + historico +
                ", saldo=" + saldo +
                ", dataVenda=" + dataVenda +
                '}';
    }
}
