package ramosfonbon.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import ramosfonbon.northwind.model.Tipo;

import java.util.List;
// CRUD   Create, Read, Update, Delete
// ABCC   Altas, Bajas, Cambios, Consultas
public interface TipoRepository
        extends CrudRepository<Tipo, Long> {

    List<Tipo> findAll();
    List<Tipo> findAllByTipoIdLessThan(int tipoId);
    Tipo findByTipoId(int tipoId);

    Tipo save(Tipo tipo);
    void delete(Tipo tipo);

    void deleteAllByDescripcion(String descripcion);

}

