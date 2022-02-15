package ramosfonbon.northwind.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ramosfonbon.northwind.model.Dueno;
import ramosfonbon.northwind.repository.DuenoRepository;

import java.util.List;

@RestController
public class DuenoController {

    @Autowired
    DuenoRepository duenoRepository;

    @GetMapping(value = "/dueno/list")
    List<Dueno> getDuenoList(){
        return duenoRepository.findAll();
    }

    @PostMapping(value = "/dueno/add")
    Dueno addDueno(@RequestBody Dueno dueno){
        return duenoRepository.save(dueno);
    }

    // ........./dueno/del/4
    @GetMapping(value = "/dueno/del/{duenoid}")
    Boolean delDueno(@PathVariable("duenoid") int duenoId){
        Dueno dueno = duenoRepository.findByDuenoId(duenoId);
        if (dueno != null){
            duenoRepository.delete(dueno);
            return true;
        }else {
            return false;
        }
    }
}
