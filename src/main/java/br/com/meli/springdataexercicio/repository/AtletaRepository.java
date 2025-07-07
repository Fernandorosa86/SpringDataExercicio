package br.com.meli.springdataexercicio.repository;

import br.com.meli.springdataexercicio.entity.Atleta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AtletaRepository extends JpaRepository<Atleta, Long> {
}
