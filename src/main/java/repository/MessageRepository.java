package net.javaguides.springboot.springsecurity.repository;


import net.javaguides.springboot.springsecurity.model.DesignerMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<DesignerMessage, Long> {
    List<DesignerMessage> findAllByOrderByIdDesc();
}
