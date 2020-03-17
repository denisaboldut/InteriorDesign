package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
