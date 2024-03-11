package com.teste.ecan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.ecan.entities.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
