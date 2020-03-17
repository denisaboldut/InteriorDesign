package net.javaguides.springboot.springsecurity.repository;

import net.javaguides.springboot.springsecurity.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Client, Long> {
	Client findByEmail(String email);
}
