package ramosfonbon.northwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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
    // URL   protocolo://direccion:puerto/recurso?par1=val1&par2=val2&....&parn=valn

    @GetMapping(value="/tipo/{tipoId}") //     localhost://..../tipo/1234
    public Tipo getTipo(@PathVariable("tipoId") int tipoId){
        Tipo tipo = tipoRepository.findByTipoId(tipoId);
        return tipo;
   }

}
