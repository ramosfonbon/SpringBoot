package ramosfonbon.northwind.repositoryrelation;

import org.springframework.data.repository.CrudRepository;
import ramosfonbon.northwind.modelrelation.ProductoTipoRelation;

import java.util.List;

// CRUD   Create, Read, Update, Delete
// ABCC   Altas, Bajas, Cambios, Consultas
public interface ProductoRelationRepository
        extends CrudRepository<ProductoTipoRelation, Long> {

    List<ProductoTipoRelation> findAll();

}

