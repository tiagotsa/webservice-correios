
package com.tiagotsa.correiosweb.servico;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de validaPlp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="validaPlp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cliente" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="diretoria" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadePostagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="servico" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="servicosAdicionais" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validaPlp", propOrder = {
    "cliente",
    "numero",
    "diretoria",
    "cartao",
    "unidadePostagem",
    "servico",
    "servicosAdicionais",
    "usuario",
    "senha"
})
public class ValidaPlp {

    protected long cliente;
    protected String numero;
    protected long diretoria;
    protected String cartao;
    protected String unidadePostagem;
    protected Long servico;
    protected List<String> servicosAdicionais;
    protected String usuario;
    protected String senha;

    /**
     * Obt�m o valor da propriedade cliente.
     * 
     */
    public long getCliente() {
        return cliente;
    }

    /**
     * Define o valor da propriedade cliente.
     * 
     */
    public void setCliente(long value) {
        this.cliente = value;
    }

    /**
     * Obt�m o valor da propriedade numero.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Define o valor da propriedade numero.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Obt�m o valor da propriedade diretoria.
     * 
     */
    public long getDiretoria() {
        return diretoria;
    }

    /**
     * Define o valor da propriedade diretoria.
     * 
     */
    public void setDiretoria(long value) {
        this.diretoria = value;
    }

    /**
     * Obt�m o valor da propriedade cartao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCartao() {
        return cartao;
    }

    /**
     * Define o valor da propriedade cartao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCartao(String value) {
        this.cartao = value;
    }

    /**
     * Obt�m o valor da propriedade unidadePostagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadePostagem() {
        return unidadePostagem;
    }

    /**
     * Define o valor da propriedade unidadePostagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadePostagem(String value) {
        this.unidadePostagem = value;
    }

    /**
     * Obt�m o valor da propriedade servico.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getServico() {
        return servico;
    }

    /**
     * Define o valor da propriedade servico.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setServico(Long value) {
        this.servico = value;
    }

    /**
     * Gets the value of the servicosAdicionais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the servicosAdicionais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServicosAdicionais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServicosAdicionais() {
        if (servicosAdicionais == null) {
            servicosAdicionais = new ArrayList<String>();
        }
        return this.servicosAdicionais;
    }

    /**
     * Obt�m o valor da propriedade usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define o valor da propriedade usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
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

}
