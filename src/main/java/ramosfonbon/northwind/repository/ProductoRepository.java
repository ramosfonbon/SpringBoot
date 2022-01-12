package ramosfonbon.northwind.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import ramosfonbon.northwind.model.Producto;

import java.util.List;

public interface ProductoRepository extends
                CrudRepository<Producto, Integer> {

    public List<Producto> findAll();

    public List<Producto> findAllByTipoId(int tipoId);

    public Producto findByProductoId(int productoId);

}
