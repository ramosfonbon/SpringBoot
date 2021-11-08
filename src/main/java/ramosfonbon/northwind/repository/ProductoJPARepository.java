package ramosfonbon.northwind.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ramosfonbon.northwind.model.Producto;
import ramosfonbon.northwind.model.ProductoTipo;
import ramosfonbon.northwind.model.Tipo;

import java.util.List;

public interface ProductoJPARepository extends
        CrudRepository<Producto, Integer> {

    @Query("SELECT " +
            " producto.productoId as productoId, " +
            "producto.nombre as nombre, " +
            "producto.existencia as existencia,"+
            "producto.precio as precio, "+
            "tipo.descripcion as nombreTipo," +
            "producto.tipoId as tipoId FROM Producto producto  " +
            "left join fetch Tipo tipo on " +
            "   tipo.tipoId = producto.tipoId" )
    @Transactional(readOnly = true)
    public List<ProductoTipo> FindQ();

   // public Producto save(Producto producto);

}
