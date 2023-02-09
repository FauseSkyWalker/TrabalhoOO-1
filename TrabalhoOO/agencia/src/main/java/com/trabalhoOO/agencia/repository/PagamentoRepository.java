package com.trabalhoOO.agencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trabalhoOO.agencia.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
