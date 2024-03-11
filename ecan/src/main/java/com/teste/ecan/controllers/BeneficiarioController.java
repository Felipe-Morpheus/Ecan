package com.teste.ecan.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.ecan.entities.Beneficiario;
import com.teste.ecan.entities.Documento;
import com.teste.ecan.services.BeneficiarioService;

@RestController
@RequestMapping("api/beneficiarios")
public class BeneficiarioController {
	
	@Autowired
	private BeneficiarioService beneficiarioService;
	
	 @PostMapping
	    public Beneficiario cadastrarBeneficiario(@RequestBody Beneficiario beneficiario) {
	        return beneficiarioService.cadastrarBeneficiario(beneficiario);
	    }

	    @GetMapping
	    public List<Beneficiario> listarBeneficiarios() {
	        return beneficiarioService.listarBeneficiarios();
	    }

	    @GetMapping("/{beneficiarioId}/documentos")
	    public List<Documento> listarDocumentosPorBeneficiario(@PathVariable Long beneficiarioId) {
	        return beneficiarioService.listarDocumentosPorBeneficiario(beneficiarioId);
	    }

	    @PutMapping("/{beneficiarioId}")
	    public Beneficiario atualizarBeneficiario(@PathVariable Long beneficiarioId, @RequestBody Beneficiario beneficiario) {
	        return beneficiarioService.atualizarBeneficiario(beneficiarioId, beneficiario);
	    }

	    @DeleteMapping("/{beneficiarioId}")
	    public void removerBeneficiario(@PathVariable Long beneficiarioId) {
	        beneficiarioService.removerBeneficiario(beneficiarioId);
	    }
	}