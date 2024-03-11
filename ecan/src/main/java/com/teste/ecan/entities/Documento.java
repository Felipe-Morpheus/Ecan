package com.teste.ecan.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "documento")  // Substitua "documento" pelo nome real da tabela
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipoDocumento;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private Date dataInclusao;

    private Date dataAtualizacao;

    @ManyToOne
    @JoinColumn(name = "beneficiario_id")  
    @JsonIgnore
    private Beneficiario beneficiario;

    public Documento(Long id, String tipoDocumento, String descricao, Date dataInclusao, Date dataAtualizacao,
            Beneficiario beneficiario) {
        super();
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.descricao = descricao;
        this.dataInclusao = dataInclusao;
        this.dataAtualizacao = dataAtualizacao;
        this.beneficiario = beneficiario;
    }

    public Documento() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Beneficiario getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(Beneficiario beneficiario) {
        this.beneficiario = beneficiario;
    }
}
