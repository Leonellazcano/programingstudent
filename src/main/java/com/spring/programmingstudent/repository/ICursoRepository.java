
package com.spring.programmingstudent.repository;

import com.spring.programmingstudent.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long> {
    
}
