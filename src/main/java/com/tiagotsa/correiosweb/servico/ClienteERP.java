
package com.tiagotsa.correiosweb.servico;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de clienteERP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="clienteERP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cnpj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contratos" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}contratoERP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descricaoStatusCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gerenteConta" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}gerenteConta" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="inscricaoEstadual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCodigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteERP", propOrder = {
    "cnpj",
    "contratos",
    "dataAtualizacao",
    "datajAtualizacao",
    "descricaoStatusCliente",
    "gerenteConta",
    "horajAtualizacao",
    "id",
    "inscricaoEstadual",
    "nome",
    "statusCodigo"
})
public class ClienteERP {

    protected String cnpj;
    @XmlElement(nillable = true)
    protected List<ContratoERP> contratos;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    protected Integer datajAtualizacao;
    protected String descricaoStatusCliente;
    @XmlElement(nillable = true)
    protected List<GerenteConta> gerenteConta;
    protected Long horajAtualizacao;
    protected long id;
    protected String inscricaoEstadual;
    protected String nome;
    protected String statusCodigo;

    /**
     * Obt�m o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Gets the value of the contratos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contratos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContratos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContratoERP }
     * 
     * 
     */
    public List<ContratoERP> getContratos() {
        if (contratos == null) {
            contratos = new ArrayList<ContratoERP>();
        }
        return this.contratos;
    }

    /**
     * Obt�m o valor da propriedade dataAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtualizacao() {
        return dataAtualizacao;
    }

    /**
     * Define o valor da propriedade dataAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtualizacao(XMLGregorianCalendar value) {
        this.dataAtualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade datajAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatajAtualizacao() {
        return datajAtualizacao;
    }

    /**
     * Define o valor da propriedade datajAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatajAtualizacao(Integer value) {
        this.datajAtualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoStatusCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoStatusCliente() {
        return descricaoStatusCliente;
    }

    /**
     * Define o valor da propriedade descricaoStatusCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoStatusCliente(String value) {
        this.descricaoStatusCliente = value;
    }

    /**
     * Gets the value of the gerenteConta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gerenteConta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGerenteConta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GerenteConta }
     * 
     * 
     */
    public List<GerenteConta> getGerenteConta() {
        if (gerenteConta == null) {
            gerenteConta = new ArrayList<GerenteConta>();
        }
        return this.gerenteConta;
    }

    /**
     * Obt�m o valor da propriedade horajAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getHorajAtualizacao() {
        return horajAtualizacao;
    }

    /**
     * Define o valor da propriedade horajAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHorajAtualizacao(Long value) {
        this.horajAtualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obt�m o valor da propriedade inscricaoEstadual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    /**
     * Define o valor da propriedade inscricaoEstadual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInscricaoEstadual(String value) {
        this.inscricaoEstadual = value;
    }

    /**
     * Obt�m o valor da propriedade nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o valor da propriedade nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Obt�m o valor da propriedade statusCodigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCodigo() {
        return statusCodigo;
    }

    /**
     * Define o valor da propriedade statusCodigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCodigo(String value) {
        this.statusCodigo = value;
    }

}
