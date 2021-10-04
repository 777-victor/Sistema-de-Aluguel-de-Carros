package com.pacotes.aluguel.repository;

import com.pacotes.aluguel.model.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Long> {
}