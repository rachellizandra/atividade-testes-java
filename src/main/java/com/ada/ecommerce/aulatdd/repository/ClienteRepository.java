package com.ada.ecommerce.aulatdd.repository;

import com.ada.ecommerce.aulatdd.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

