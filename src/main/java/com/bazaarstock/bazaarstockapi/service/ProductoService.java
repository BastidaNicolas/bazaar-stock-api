package com.bazaarstock.bazaarstockapi.service;

import com.bazaarstock.bazaarstockapi.model.Producto;
import com.bazaarstock.bazaarstockapi.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    @Override
    public Producto getProducto(Long id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void create(Producto producto) {
        productoRepository.save(producto);
    }

    @Override
    public Producto getProductoMax() {
        return productoRepository.findByMaxPrice();
    }

    @Override
    public Producto getProductoMin() {
        return productoRepository.findByMinPrice();
    }

    @Override
    public List<Producto> getProductoMinMax() {
        return productoRepository.findAllByOrderByPriceAsc();
    }

    @Override
    public List<Producto> getProductoMaxMin() {
        return productoRepository.findAllByOrderByPriceDesc();
    }
}
