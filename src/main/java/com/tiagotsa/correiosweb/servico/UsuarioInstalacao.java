
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
 * <p>Classe Java de usuarioInstalacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="usuarioInstalacao"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataAtualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataInclusao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="dataSenha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="gerenteMaster" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}gerenteConta" minOccurs="0"/&gt;
 *         &lt;element name="hashSenha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parametros" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}parametroMaster" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://cliente.bean.master.sigep.bsb.correios.com.br/}statusUsuario" minOccurs="0"/&gt;
 *         &lt;element name="validade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuarioInstalacao", propOrder = {
    "dataAtualizacao",
    "dataInclusao",
    "dataSenha",
    "gerenteMaster",
    "hashSenha",
    "id",
    "login",
    "nome",
    "parametros",
    "senha",
    "status",
    "validade"
})
public class UsuarioInstalacao {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAtualizacao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInclusao;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSenha;
    protected GerenteConta gerenteMaster;
    protected String hashSenha;
    protected Long id;
    protected String login;
    protected String nome;
    @XmlElement(nillable = true)
    protected List<ParametroMaster> parametros;
    protected String senha;
    @XmlSchemaType(name = "string")
    protected StatusUsuario status;
    protected String validade;

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
     * Obt�m o valor da propriedade dataInclusao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInclusao() {
        return dataInclusao;
    }

    /**
     * Define o valor da propriedade dataInclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInclusao(XMLGregorianCalendar value) {
        this.dataInclusao = value;
    }

    /**
     * Obt�m o valor da propriedade dataSenha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSenha() {
        return dataSenha;
    }

    /**
     * Define o valor da propriedade dataSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSenha(XMLGregorianCalendar value) {
        this.dataSenha = value;
    }

    /**
     * Obt�m o valor da propriedade gerenteMaster.
     * 
     * @return
     *     possible object is
     *     {@link GerenteConta }
     *     
     */
    public GerenteConta getGerenteMaster() {
        return gerenteMaster;
    }

    /**
     * Define o valor da propriedade gerenteMaster.
     * 
     * @param value
     *     allowed object is
     *     {@link GerenteConta }
     *     
     */
    public void setGerenteMaster(GerenteConta value) {
        this.gerenteMaster = value;
    }

    /**
     * Obt�m o valor da propriedade hashSenha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashSenha() {
        return hashSenha;
    }

    /**
     * Define o valor da propriedade hashSenha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashSenha(String value) {
        this.hashSenha = value;
    }

    /**
     * Obt�m o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Obt�m o valor da propriedade login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define o valor da propriedade login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
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
     * Gets the value of the parametros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the parametros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParametros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametroMaster }
     * 
     * 
     */
    public List<ParametroMaster> getParametros() {
        if (parametros == null) {
            parametros = new ArrayList<ParametroMaster>();
        }
        return this.parametros;
    }

    /**
     * Obt�m o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obt�m o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link StatusUsuario }
     *     
     */
    public StatusUsuario getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusUsuario }
     *     
     */
    public void setStatus(StatusUsuario value) {
        this.status = value;
    }

    /**
     * Obt�m o valor da propriedade validade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidade() {
        return validade;
    }

    /**
     * Define o valor da propriedade validade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidade(String value) {
        this.validade = value;
    }

}
