package com.trabalhoOO.agencia.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.trabalhoOO.agencia.model.Usuário;

@Repository
public interface UsuárioRepository extends JpaRepository<Usuário, Integer>{

}
