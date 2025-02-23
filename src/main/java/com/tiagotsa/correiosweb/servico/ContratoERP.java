
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
 * <p>Classe Java de contratoERP complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="contratoERP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cartoesPostagem" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}cartaoPostagemERP" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="cliente" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}clienteERP" minOccurs="0"/&gt;
 *         &lt;element name="codigoCliente" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="codigoDiretoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contratoPK" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}contratoERPPK" minOccurs="0"/&gt;
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataAtualizacaoDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataVigenciaFimDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dataVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataVigenciaInicioDDMMYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="datajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="datajVigenciaFim" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="datajVigenciaInicio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descricaoDiretoriaRegional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descricaoStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diretoriaRegional" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}unidadePostagemERP" minOccurs="0"/&gt;
 *         &lt;element name="horajAtualizacao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "contratoERP", propOrder = {
    "cartoesPostagem",
    "cliente",
    "codigoCliente",
    "codigoDiretoria",
    "contratoPK",
    "dataAtualizacao",
    "dataAtualizacaoDDMMYYYY",
    "dataVigenciaFim",
    "dataVigenciaFimDDMMYYYY",
    "dataVigenciaInicio",
    "dataVigenciaInicioDDMMYYYY",
    "datajAtualizacao",
    "datajVigenciaFim",
    "datajVigenciaInicio",
    "descricaoDiretoriaRegional",
    "descricaoStatus",
    "diretoriaRegional",
    "horajAtualizacao",
    "statusCodigo"
})
public class ContratoERP {

    @XmlElement(nillable = true)
    protected List<CartaoPostagemERP> cartoesPostagem;
    protected ClienteERP cliente;
    protected long codigoCliente;
    protected String codigoDiretoria;
    protected ContratoERPPK contratoPK;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    protected String dataAtualizacaoDDMMYYYY;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVigenciaFim;
    protected String dataVigenciaFimDDMMYYYY;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVigenciaInicio;
    protected String dataVigenciaInicioDDMMYYYY;
    protected Integer datajAtualizacao;
    protected Integer datajVigenciaFim;
    protected Integer datajVigenciaInicio;
    protected String descricaoDiretoriaRegional;
    protected String descricaoStatus;
    protected UnidadePostagemERP diretoriaRegional;
    protected Integer horajAtualizacao;
    protected String statusCodigo;

    /**
     * Gets the value of the cartoesPostagem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cartoesPostagem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCartoesPostagem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartaoPostagemERP }
     * 
     * 
     */
    public List<CartaoPostagemERP> getCartoesPostagem() {
        if (cartoesPostagem == null) {
            cartoesPostagem = new ArrayList<CartaoPostagemERP>();
        }
        return this.cartoesPostagem;
    }

    /**
     * Obt�m o valor da propriedade cliente.
     * 
     * @return
     *     possible object is
     *     {@link ClienteERP }
     *     
     */
    public ClienteERP getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     * @param value
     *     allowed object is
     *     {@link ClienteERP }
     *     
     */
    public void setCliente(ClienteERP value) {
        this.cliente = value;
    }

    /**
     * Obt�m o valor da propriedade codigoCliente.
     * 
     */
    public long getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * Define o valor da propriedade codigoCliente.
     * 
     */
    public void setCodigoCliente(long value) {
        this.codigoCliente = value;
    }

    /**
     * Obt�m o valor da propriedade codigoDiretoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDiretoria() {
        return codigoDiretoria;
    }

    /**
     * Define o valor da propriedade codigoDiretoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDiretoria(String value) {
        this.codigoDiretoria = value;
    }

    /**
     * Obt�m o valor da propriedade contratoPK.
     * 
     * @return
     *     possible object is
     *     {@link ContratoERPPK }
     *     
     */
    public ContratoERPPK getContratoPK() {
        return contratoPK;
    }

    /**
     * Define o valor da propriedade contratoPK.
     * 
     * @param value
     *     allowed object is
     *     {@link ContratoERPPK }
     *     
     */
    public void setContratoPK(ContratoERPPK value) {
        this.contratoPK = value;
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
     * Obt�m o valor da propriedade dataAtualizacaoDDMMYYYY.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAtualizacaoDDMMYYYY() {
        return dataAtualizacaoDDMMYYYY;
    }

    /**
     * Define o valor da propriedade dataAtualizacaoDDMMYYYY.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAtualizacaoDDMMYYYY(String value) {
        this.dataAtualizacaoDDMMYYYY = value;
    }

    /**
     * Obt�m o valor da propriedade dataVigenciaFim.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigenciaFim() {
        return dataVigenciaFim;
    }

    /**
     * Define o valor da propriedade dataVigenciaFim.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigenciaFim(XMLGregorianCalendar value) {
        this.dataVigenciaFim = value;
    }

    /**
     * Obt�m o valor da propriedade dataVigenciaFimDDMMYYYY.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVigenciaFimDDMMYYYY() {
        return dataVigenciaFimDDMMYYYY;
    }

    /**
     * Define o valor da propriedade dataVigenciaFimDDMMYYYY.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVigenciaFimDDMMYYYY(String value) {
        this.dataVigenciaFimDDMMYYYY = value;
    }

    /**
     * Obt�m o valor da propriedade dataVigenciaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVigenciaInicio() {
        return dataVigenciaInicio;
    }

    /**
     * Define o valor da propriedade dataVigenciaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVigenciaInicio(XMLGregorianCalendar value) {
        this.dataVigenciaInicio = value;
    }

    /**
     * Obt�m o valor da propriedade dataVigenciaInicioDDMMYYYY.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataVigenciaInicioDDMMYYYY() {
        return dataVigenciaInicioDDMMYYYY;
    }

    /**
     * Define o valor da propriedade dataVigenciaInicioDDMMYYYY.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataVigenciaInicioDDMMYYYY(String value) {
        this.dataVigenciaInicioDDMMYYYY = value;
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
     * Obt�m o valor da propriedade datajVigenciaFim.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatajVigenciaFim() {
        return datajVigenciaFim;
    }

    /**
     * Define o valor da propriedade datajVigenciaFim.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatajVigenciaFim(Integer value) {
        this.datajVigenciaFim = value;
    }

    /**
     * Obt�m o valor da propriedade datajVigenciaInicio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDatajVigenciaInicio() {
        return datajVigenciaInicio;
    }

    /**
     * Define o valor da propriedade datajVigenciaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDatajVigenciaInicio(Integer value) {
        this.datajVigenciaInicio = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoDiretoriaRegional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDiretoriaRegional() {
        return descricaoDiretoriaRegional;
    }

    /**
     * Define o valor da propriedade descricaoDiretoriaRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDiretoriaRegional(String value) {
        this.descricaoDiretoriaRegional = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoStatus() {
        return descricaoStatus;
    }

    /**
     * Define o valor da propriedade descricaoStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoStatus(String value) {
        this.descricaoStatus = value;
    }

    /**
     * Obt�m o valor da propriedade diretoriaRegional.
     * 
     * @return
     *     possible object is
     *     {@link UnidadePostagemERP }
     *     
     */
    public UnidadePostagemERP getDiretoriaRegional() {
        return diretoriaRegional;
    }

    /**
     * Define o valor da propriedade diretoriaRegional.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadePostagemERP }
     *     
     */
    public void setDiretoriaRegional(UnidadePostagemERP value) {
        this.diretoriaRegional = value;
    }

    /**
     * Obt�m o valor da propriedade horajAtualizacao.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHorajAtualizacao() {
        return horajAtualizacao;
    }

    /**
     * Define o valor da propriedade horajAtualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHorajAtualizacao(Integer value) {
        this.horajAtualizacao = value;
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
