package com.teste.ecan.services;

import java.util.List;

import com.teste.ecan.entities.Beneficiario;
import com.teste.ecan.entities.Documento;

public interface BeneficiarioService {

    Beneficiario cadastrarBeneficiario(Beneficiario beneficiario);

    List<Beneficiario> listarBeneficiarios();

    List<Documento> listarDocumentosPorBeneficiario(Long beneficiarioId);

    Beneficiario atualizarBeneficiario(Long beneficiarioId, Beneficiario beneficiario);

    void removerBeneficiario(Long beneficiarioId);
}