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
@Table(name = "tb_item_venda")
public class ItemVenda {
    @Id
    private Long id;

    private String status;

    private String formaPagamento;

    private Integer quantidade;

    private LocalDateTime dataCriacao;

    private LocalDateTime prazoEntrega;

    @Override
    public String toString() {
        return "ItemVenda{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", quantidade=" + quantidade +
                ", dataCriacao=" + dataCriacao +
                ", prazoEntrega=" + prazoEntrega +
                '}';
    }
}
