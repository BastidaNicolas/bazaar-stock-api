package com.bazaarstock.bazaarstockapi.repository;

import com.bazaarstock.bazaarstockapi.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    @Query(value = "SELECT * FROM producto p WHERE p.price = (SELECT MAX(price) FROM producto p2)", nativeQuery = true)
    Producto findByMaxPrice();

    @Query(value = "SELECT * FROM producto p WHERE p.price = (SELECT MIN(price) FROM producto p2)", nativeQuery = true)
    Producto findByMinPrice();

    List<Producto> findAllByOrderByPriceDesc();

    List<Producto> findAllByOrderByPriceAsc();
}
