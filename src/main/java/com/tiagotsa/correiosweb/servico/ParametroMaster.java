
package com.tiagotsa.correiosweb.servico;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de parametroMaster complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="parametroMaster"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prmCoParametro" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="prmTxParametro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prmTxValor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parametroMaster", propOrder = {
    "prmCoParametro",
    "prmTxParametro",
    "prmTxValor"
})
public class ParametroMaster {

    protected long prmCoParametro;
    protected String prmTxParametro;
    protected String prmTxValor;

    /**
     * Obt�m o valor da propriedade prmCoParametro.
     * 
     */
    public long getPrmCoParametro() {
        return prmCoParametro;
    }

    /**
     * Define o valor da propriedade prmCoParametro.
     * 
     */
    public void setPrmCoParametro(long value) {
        this.prmCoParametro = value;
    }

    /**
     * Obt�m o valor da propriedade prmTxParametro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmTxParametro() {
        return prmTxParametro;
    }

    /**
     * Define o valor da propriedade prmTxParametro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmTxParametro(String value) {
        this.prmTxParametro = value;
    }

    /**
     * Obt�m o valor da propriedade prmTxValor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrmTxValor() {
        return prmTxValor;
    }

    /**
     * Define o valor da propriedade prmTxValor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrmTxValor(String value) {
        this.prmTxValor = value;
    }

}
