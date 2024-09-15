
package br.com.projetoBase.repositorio;

import br.com.projetoBase.modelo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
}