package com.ada.ecommerce.aulatdd.repository;

import com.ada.ecommerce.aulatdd.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {

}

