package com.spring.programmingstudent.controller;

import com.spring.programmingstudent.model.Tema;
import com.spring.programmingstudent.service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemaController {
    
      @Autowired
    private ITemaService temaServ;
    
      //1-Crear un nuevo tema
    @PostMapping ("/temas/crear")
    public String crearCurso(@RequestBody Tema tema) {
        temaServ.saveTema(tema);
        
        return "Tema creado correctamente";   
        
    }
    
    //2-Modificar los datos de un determinado tema
     @PutMapping("/tema/edit")
    public String editTema(@RequestBody Tema tema) {
        temaServ.editTema(tema);
        return "Tema editado correctamente";
    }
    
}
