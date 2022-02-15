package ramosfonbon.northwind.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ramosfonbon.northwind.model.Dueno;

import java.util.List;

@Repository
public interface DuenoRepository
        extends CrudRepository<Dueno, Long> {

    List<Dueno> findAll();

    Dueno findByDuenoId(int duenoId );

    Dueno save(Dueno dueno);

    @Override
    void delete(Dueno dueno);
}
