package com.teste.ecan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.ecan.entities.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long> {
	

}
