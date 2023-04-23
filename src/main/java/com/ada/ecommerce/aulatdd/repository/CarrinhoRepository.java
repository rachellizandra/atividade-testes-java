package com.ada.ecommerce.aulatdd.repository;

import com.ada.ecommerce.aulatdd.model.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {

}
