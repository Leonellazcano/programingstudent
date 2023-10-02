
package com.spring.programmingstudent.dto;

import com.spring.programmingstudent.model.Tema;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class CursoTemaDTO {
    
    private String nombreCurso;
    private List<Tema> lista_temas;
    
    
    public CursoTemaDTO() {
    }

    public CursoTemaDTO(String nombreCurso, List<Tema> lista_temas) {
        this.nombreCurso = nombreCurso;
        this.lista_temas = lista_temas;
    }

  
}
