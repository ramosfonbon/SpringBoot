package ramosfonbon.northwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ramosfonbon.northwind.model.Tipo;
import ramosfonbon.northwind.repository.TipoRepository;

import java.util.List;

@RestController
public class TipoController {

    @Autowired
    TipoRepository tipoRepository;

    @GetMapping(value = "/simple/listTipos")
    public List<Tipo> getListTipo(){
        return tipoRepository.findAll();
    }

}
