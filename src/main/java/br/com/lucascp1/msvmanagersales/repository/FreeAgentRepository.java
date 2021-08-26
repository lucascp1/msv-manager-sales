package br.com.lucascp1.msvmanagersales.repository;

import br.com.lucascp1.msvmanagersales.model.FreeAgent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeAgentRepository extends JpaRepository<FreeAgent, Integer> {
}
