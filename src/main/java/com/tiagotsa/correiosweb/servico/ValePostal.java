
package com.tiagotsa.correiosweb.servico;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de valePostal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="valePostal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cidNoCidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctcCoAadministrativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ctcNuContrato" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ctcNuContratoEct" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="cvpEdBairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvpEdCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvpEdComplemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvpEdNumero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvpNoCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cvpNuCep" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="descricaoErro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estSgEstado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="monVarTarifaAdicional" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monVarTarifaServico" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monVarValorDescontos" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="monVarValorImposto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prsCoProdutoServico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pveNu" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pveOrgNuAgencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pveOrgNuAgenciaDes" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="pveOrgNuAgenciaOri" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="retornaCodErro" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sitNoSituacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tlgTxDescricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vapDhTransacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="vapNuEtiquetaEncomenda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vapVrCobradoEct" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="vapVrNominal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valePostal", propOrder = {
    "cidNoCidade",
    "ctcCoAadministrativo",
    "ctcNuContrato",
    "ctcNuContratoEct",
    "cvpEdBairro",
    "cvpEdCliente",
    "cvpEdComplemento",
    "cvpEdNumero",
    "cvpNoCliente",
    "cvpNuCep",
    "descricaoErro",
    "estSgEstado",
    "monVarTarifaAdicional",
    "monVarTarifaServico",
    "monVarValorDescontos",
    "monVarValorImposto",
    "prsCoProdutoServico",
    "pveNu",
    "pveOrgNuAgencia",
    "pveOrgNuAgenciaDes",
    "pveOrgNuAgenciaOri",
    "retornaCodErro",
    "sitNoSituacao",
    "tlgTxDescricao",
    "vapDhTransacao",
    "vapNuEtiquetaEncomenda",
    "vapVrCobradoEct",
    "vapVrNominal"
})
public class ValePostal {

    protected String cidNoCidade;
    protected String ctcCoAadministrativo;
    protected Long ctcNuContrato;
    protected Long ctcNuContratoEct;
    protected String cvpEdBairro;
    protected String cvpEdCliente;
    protected String cvpEdComplemento;
    protected String cvpEdNumero;
    protected String cvpNoCliente;
    protected Long cvpNuCep;
    protected String descricaoErro;
    protected String estSgEstado;
    protected int monVarTarifaAdicional;
    protected int monVarTarifaServico;
    protected int monVarValorDescontos;
    protected int monVarValorImposto;
    protected Long prsCoProdutoServico;
    protected Long pveNu;
    protected Long pveOrgNuAgencia;
    protected Long pveOrgNuAgenciaDes;
    protected Long pveOrgNuAgenciaOri;
    protected int retornaCodErro;
    protected String sitNoSituacao;
    protected String tlgTxDescricao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar vapDhTransacao;
    protected String vapNuEtiquetaEncomenda;
    protected Double vapVrCobradoEct;
    protected Double vapVrNominal;

    /**
     * Obt�m o valor da propriedade cidNoCidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidNoCidade() {
        return cidNoCidade;
    }

    /**
     * Define o valor da propriedade cidNoCidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidNoCidade(String value) {
        this.cidNoCidade = value;
    }

    /**
     * Obt�m o valor da propriedade ctcCoAadministrativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtcCoAadministrativo() {
        return ctcCoAadministrativo;
    }

    /**
     * Define o valor da propriedade ctcCoAadministrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCtcCoAadministrativo(String value) {
        this.ctcCoAadministrativo = value;
    }

    /**
     * Obt�m o valor da propriedade ctcNuContrato.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCtcNuContrato() {
        return ctcNuContrato;
    }

    /**
     * Define o valor da propriedade ctcNuContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCtcNuContrato(Long value) {
        this.ctcNuContrato = value;
    }

    /**
     * Obt�m o valor da propriedade ctcNuContratoEct.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCtcNuContratoEct() {
        return ctcNuContratoEct;
    }

    /**
     * Define o valor da propriedade ctcNuContratoEct.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCtcNuContratoEct(Long value) {
        this.ctcNuContratoEct = value;
    }

    /**
     * Obt�m o valor da propriedade cvpEdBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdBairro() {
        return cvpEdBairro;
    }

    /**
     * Define o valor da propriedade cvpEdBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdBairro(String value) {
        this.cvpEdBairro = value;
    }

    /**
     * Obt�m o valor da propriedade cvpEdCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdCliente() {
        return cvpEdCliente;
    }

    /**
     * Define o valor da propriedade cvpEdCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdCliente(String value) {
        this.cvpEdCliente = value;
    }

    /**
     * Obt�m o valor da propriedade cvpEdComplemento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdComplemento() {
        return cvpEdComplemento;
    }

    /**
     * Define o valor da propriedade cvpEdComplemento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdComplemento(String value) {
        this.cvpEdComplemento = value;
    }

    /**
     * Obt�m o valor da propriedade cvpEdNumero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpEdNumero() {
        return cvpEdNumero;
    }

    /**
     * Define o valor da propriedade cvpEdNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpEdNumero(String value) {
        this.cvpEdNumero = value;
    }

    /**
     * Obt�m o valor da propriedade cvpNoCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCvpNoCliente() {
        return cvpNoCliente;
    }

    /**
     * Define o valor da propriedade cvpNoCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCvpNoCliente(String value) {
        this.cvpNoCliente = value;
    }

    /**
     * Obt�m o valor da propriedade cvpNuCep.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCvpNuCep() {
        return cvpNuCep;
    }

    /**
     * Define o valor da propriedade cvpNuCep.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCvpNuCep(Long value) {
        this.cvpNuCep = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoErro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoErro() {
        return descricaoErro;
    }

    /**
     * Define o valor da propriedade descricaoErro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoErro(String value) {
        this.descricaoErro = value;
    }

    /**
     * Obt�m o valor da propriedade estSgEstado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstSgEstado() {
        return estSgEstado;
    }

    /**
     * Define o valor da propriedade estSgEstado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstSgEstado(String value) {
        this.estSgEstado = value;
    }

    /**
     * Obt�m o valor da propriedade monVarTarifaAdicional.
     * 
     */
    public int getMonVarTarifaAdicional() {
        return monVarTarifaAdicional;
    }

    /**
     * Define o valor da propriedade monVarTarifaAdicional.
     * 
     */
    public void setMonVarTarifaAdicional(int value) {
        this.monVarTarifaAdicional = value;
    }

    /**
     * Obt�m o valor da propriedade monVarTarifaServico.
     * 
     */
    public int getMonVarTarifaServico() {
        return monVarTarifaServico;
    }

    /**
     * Define o valor da propriedade monVarTarifaServico.
     * 
     */
    public void setMonVarTarifaServico(int value) {
        this.monVarTarifaServico = value;
    }

    /**
     * Obt�m o valor da propriedade monVarValorDescontos.
     * 
     */
    public int getMonVarValorDescontos() {
        return monVarValorDescontos;
    }

    /**
     * Define o valor da propriedade monVarValorDescontos.
     * 
     */
    public void setMonVarValorDescontos(int value) {
        this.monVarValorDescontos = value;
    }

    /**
     * Obt�m o valor da propriedade monVarValorImposto.
     * 
     */
    public int getMonVarValorImposto() {
        return monVarValorImposto;
    }

    /**
     * Define o valor da propriedade monVarValorImposto.
     * 
     */
    public void setMonVarValorImposto(int value) {
        this.monVarValorImposto = value;
    }

    /**
     * Obt�m o valor da propriedade prsCoProdutoServico.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrsCoProdutoServico() {
        return prsCoProdutoServico;
    }

    /**
     * Define o valor da propriedade prsCoProdutoServico.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrsCoProdutoServico(Long value) {
        this.prsCoProdutoServico = value;
    }

    /**
     * Obt�m o valor da propriedade pveNu.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveNu() {
        return pveNu;
    }

    /**
     * Define o valor da propriedade pveNu.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveNu(Long value) {
        this.pveNu = value;
    }

    /**
     * Obt�m o valor da propriedade pveOrgNuAgencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveOrgNuAgencia() {
        return pveOrgNuAgencia;
    }

    /**
     * Define o valor da propriedade pveOrgNuAgencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveOrgNuAgencia(Long value) {
        this.pveOrgNuAgencia = value;
    }

    /**
     * Obt�m o valor da propriedade pveOrgNuAgenciaDes.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveOrgNuAgenciaDes() {
        return pveOrgNuAgenciaDes;
    }

    /**
     * Define o valor da propriedade pveOrgNuAgenciaDes.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveOrgNuAgenciaDes(Long value) {
        this.pveOrgNuAgenciaDes = value;
    }

    /**
     * Obt�m o valor da propriedade pveOrgNuAgenciaOri.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPveOrgNuAgenciaOri() {
        return pveOrgNuAgenciaOri;
    }

    /**
     * Define o valor da propriedade pveOrgNuAgenciaOri.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPveOrgNuAgenciaOri(Long value) {
        this.pveOrgNuAgenciaOri = value;
    }

    /**
     * Obt�m o valor da propriedade retornaCodErro.
     * 
     */
    public int getRetornaCodErro() {
        return retornaCodErro;
    }

    /**
     * Define o valor da propriedade retornaCodErro.
     * 
     */
    public void setRetornaCodErro(int value) {
        this.retornaCodErro = value;
    }

    /**
     * Obt�m o valor da propriedade sitNoSituacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitNoSituacao() {
        return sitNoSituacao;
    }

    /**
     * Define o valor da propriedade sitNoSituacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitNoSituacao(String value) {
        this.sitNoSituacao = value;
    }

    /**
     * Obt�m o valor da propriedade tlgTxDescricao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTlgTxDescricao() {
        return tlgTxDescricao;
    }

    /**
     * Define o valor da propriedade tlgTxDescricao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTlgTxDescricao(String value) {
        this.tlgTxDescricao = value;
    }

    /**
     * Obt�m o valor da propriedade vapDhTransacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVapDhTransacao() {
        return vapDhTransacao;
    }

    /**
     * Define o valor da propriedade vapDhTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVapDhTransacao(XMLGregorianCalendar value) {
        this.vapDhTransacao = value;
    }

    /**
     * Obt�m o valor da propriedade vapNuEtiquetaEncomenda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVapNuEtiquetaEncomenda() {
        return vapNuEtiquetaEncomenda;
    }

    /**
     * Define o valor da propriedade vapNuEtiquetaEncomenda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVapNuEtiquetaEncomenda(String value) {
        this.vapNuEtiquetaEncomenda = value;
    }

    /**
     * Obt�m o valor da propriedade vapVrCobradoEct.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVapVrCobradoEct() {
        return vapVrCobradoEct;
    }

    /**
     * Define o valor da propriedade vapVrCobradoEct.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVapVrCobradoEct(Double value) {
        this.vapVrCobradoEct = value;
    }

    /**
     * Obt�m o valor da propriedade vapVrNominal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getVapVrNominal() {
        return vapVrNominal;
    }

    /**
     * Define o valor da propriedade vapVrNominal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setVapVrNominal(Double value) {
        this.vapVrNominal = value;
    }

}
