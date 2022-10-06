package com.bazaarstock.bazaarstockapi.repository;

import com.bazaarstock.bazaarstockapi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
