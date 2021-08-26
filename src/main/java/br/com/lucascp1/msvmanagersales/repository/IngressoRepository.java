package br.com.lucascp1.msvmanagersales.repository;

import br.com.lucascp1.msvmanagersales.model.Ingresso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngressoRepository extends JpaRepository<Ingresso, Integer> {
}
