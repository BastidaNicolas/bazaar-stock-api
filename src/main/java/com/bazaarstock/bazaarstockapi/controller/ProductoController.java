package com.bazaarstock.bazaarstockapi.controller;

import com.bazaarstock.bazaarstockapi.model.Producto;
import com.bazaarstock.bazaarstockapi.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService interProducto;

    @PostMapping("/productos/crear")
    public String createProducto(@RequestBody Producto producto){
        interProducto.create(producto);
        return "Producto creado";
    }

    @GetMapping("/productos/traer")
    public List<Producto> getProductos(){
        List<Producto> productos = interProducto.getAll();
        return productos;
    }

    @DeleteMapping("/productos/eliminar/{id}")
    public String deleteProducto(@PathVariable Long id){
        interProducto.delete(id);
        return "Producto eliminado";
    }

    @GetMapping("/productos/traer/{id}")
    public Producto getProducto(@PathVariable Long id){
        return interProducto.getProducto(id);
    }

    @GetMapping("/productos/traer/max")
    public Producto getProductoMax(){
        return interProducto.getProductoMax();
    }

    @GetMapping("/productos/traer/min")
    public Producto getProductoMin(){
        return interProducto.getProductoMin();
    }
    @GetMapping("/productos/traer/min_max")
    public List<Producto> getProductoMinMax(){
        List<Producto> productos = interProducto.getProductoMinMax();
        return productos;
    }

    @GetMapping("/productos/traer/max_min")
    public List<Producto> getProductoMaxMin(){
        List<Producto> productos = interProducto.getProductoMaxMin();
        return productos;
    }

    @PutMapping("/productos/editar/{id}")
    public Producto editProducto(
            @PathVariable Long id,
            @RequestParam String nName,
            @RequestParam Integer nQuantity,
            @RequestParam Float nPrice
    ){
        Producto producto = interProducto.getProducto(id);

        producto.setName(nName);
        producto.setQuantity(nQuantity);
        producto.setPrice(nPrice);

        interProducto.create(producto);

        return producto;
    }

}
