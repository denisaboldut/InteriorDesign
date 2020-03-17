package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
