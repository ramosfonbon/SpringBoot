package ramosfonbon.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import ramosfonbon.northwind.model.Tipo;

import java.util.List;

public interface TipoRepository
        extends CrudRepository<Tipo, Long> {

    List<Tipo> findAll();
    Tipo findByTipoId(int tipoId);

}

