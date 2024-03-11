package com.teste.ecan.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.ecan.entities.Beneficiario;
import com.teste.ecan.entities.Documento;
import com.teste.ecan.repositories.BeneficiarioRepository;
import com.teste.ecan.repositories.DocumentoRepository;

@Service
public class BeneficiarioServiceImpl implements BeneficiarioService {

    @Autowired
    private BeneficiarioRepository beneficiarioRepository;

    @Autowired
    private DocumentoRepository documentoRepository;

    @Override
    public Beneficiario cadastrarBeneficiario(Beneficiario beneficiario) {
        // Implementar lógica de validação se necessário
        return beneficiarioRepository.save(beneficiario);
    }

    @Override
    public List<Beneficiario> listarBeneficiarios() {
        return beneficiarioRepository.findAll();
    }

    @Override
    public List<Documento> listarDocumentosPorBeneficiario(Long beneficiarioId) {
        Optional<Beneficiario> beneficiarioOptional = beneficiarioRepository.findById(beneficiarioId);
        if (beneficiarioOptional.isPresent()) {
            return beneficiarioOptional.get().getDocumentos();
        }
        return null; // Ou lançar exceção
    }

    @Override
    public Beneficiario atualizarBeneficiario(Long beneficiarioId, Beneficiario beneficiario) {
        // Implementar lógica de validação se necessário
        Optional<Beneficiario> beneficiarioOptional = beneficiarioRepository.findById(beneficiarioId);
        if (beneficiarioOptional.isPresent()) {
            beneficiario.setId(beneficiarioId);
            return beneficiarioRepository.save(beneficiario);
        }
        return null; // Ou lançar exceção
    }

    @Override
    public void removerBeneficiario(Long beneficiarioId) {
        beneficiarioRepository.deleteById(beneficiarioId);
    }
}