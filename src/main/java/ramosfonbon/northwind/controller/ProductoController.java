package ramosfonbon.northwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ramosfonbon.northwind.model.Producto;
import ramosfonbon.northwind.model.ProductoTipo;
import ramosfonbon.northwind.repository.ProductoJPARepository;
import ramosfonbon.northwind.repository.ProductoRepository;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    ProductoJPARepository productoJPARepositorySimple;

    @Autowired
    ProductoRepository productoRepository;


    @GetMapping(value = "/listProductosJPA")
    public List<ProductoTipo> getListProductosJPA(){
        return productoJPARepositorySimple.FindQ();
    }

    @GetMapping(value = "/listProductos")
    public List<Producto> getListProductos(){
        return productoRepository.findAll();
    }

}
