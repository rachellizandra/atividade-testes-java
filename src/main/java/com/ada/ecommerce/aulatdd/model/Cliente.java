package com.ada.ecommerce.aulatdd.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Component
@Table(name = "tb_cliente")
public class Cliente {
    @Id
    private Long id;

    private String nome;

    private String email;

    private String cpf;

    private String telefone;

    private String endereco;

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
