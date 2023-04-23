package com.ada.ecommerce.aulatdd.repository;

import com.ada.ecommerce.aulatdd.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {
}


