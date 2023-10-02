
package com.spring.programmingstudent.repository;

import com.spring.programmingstudent.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long> {
    

}
