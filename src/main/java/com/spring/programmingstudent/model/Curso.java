
package com.spring.programmingstudent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id_curso;
    private String nombre;
    private String modalidad;
    private String fecha_finalizacion;
    @OneToMany (mappedBy="curso")
    private List<Tema> listaDeTemas;

    public Curso() {
    }

    
    public Curso(Long id_curso, String nombre, String modalidad, String fecha_Finalizacion, List<Tema> listaDeTemas) {
        this.id_curso = id_curso;
        this.nombre = nombre;
        this.modalidad = modalidad;
        this.fecha_finalizacion = fecha_Finalizacion;
        this.listaDeTemas = listaDeTemas;
    }
    
    
    
    
    
    
    
    
}
