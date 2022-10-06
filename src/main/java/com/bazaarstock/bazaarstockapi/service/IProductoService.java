package com.bazaarstock.bazaarstockapi.service;

import com.bazaarstock.bazaarstockapi.model.Producto;

import java.util.List;

public interface IProductoService {
    List<Producto> getAll();

    void delete(Long id);

    Producto getProducto(Long id);

    void create(Producto producto);

    Producto getProductoMax();

    Producto getProductoMin();

    List<Producto> getProductoMinMax();

    List<Producto> getProductoMaxMin();
}
