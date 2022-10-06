package com.bazaarstock.bazaarstockapi.controller;

import com.bazaarstock.bazaarstockapi.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService interProducto;

}
