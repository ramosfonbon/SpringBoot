package ramosfonbon.northwind.controllerrelation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ramosfonbon.northwind.modelrelation.ProductoRelation;
import ramosfonbon.northwind.modelrelation.ProductoTipoRelation;
import ramosfonbon.northwind.repositoryrelation.ProductoRelationRepository;

import java.util.List;

@RestController
public class ProductoRelationController {

    @Autowired
    ProductoRelationRepository productoRelationRepository;

    @GetMapping(value = "/Productos")
    public List<ProductoTipoRelation> getListProductos8(){
        return productoRelationRepository.findAll();
    }


}
