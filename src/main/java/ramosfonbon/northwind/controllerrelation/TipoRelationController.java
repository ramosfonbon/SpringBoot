package ramosfonbon.northwind.controllerrelation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ramosfonbon.northwind.modelrelation.TipoRelation;
import ramosfonbon.northwind.repositoryrelation.TipoRelationRepository;


import java.util.List;

@RestController
public class TipoRelationController {

    @Autowired
    TipoRelationRepository tipoRepository;

    @GetMapping(value = "/listTipos")
    public List<TipoRelation> getListTipo(){
        return tipoRepository.findAll();
    }


}
