package br.com.estudos.multimodulo.repository;

import br.com.estudos.multimodulo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
