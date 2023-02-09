package com.trabalhoOO.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalhoOO.agencia.model.Aeroporto;

@Repository
public interface AeroportoRepository extends JpaRepository<Aeroporto, Integer> {

}
