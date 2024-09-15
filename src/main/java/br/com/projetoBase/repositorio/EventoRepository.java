
package br.com.projetoBase.repositorio;

import br.com.projetoBase.modelo.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long>{
    
}

