package br.com.meli.springdataexercicio.repository;

import br.com.meli.springdataexercicio.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
}
