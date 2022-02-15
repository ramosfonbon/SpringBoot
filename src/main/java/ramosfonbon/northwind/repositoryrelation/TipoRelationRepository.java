package ramosfonbon.northwind.repositoryrelation;

import org.springframework.data.repository.CrudRepository;
import ramosfonbon.northwind.modelrelation.TipoRelation;

import java.util.List;

// CRUD   Create, Read, Update, Delete
// ABCC   Altas, Bajas, Cambios, Consultas
public interface TipoRelationRepository
        extends CrudRepository<TipoRelation, Long> {

    List<TipoRelation> findAll();

}

