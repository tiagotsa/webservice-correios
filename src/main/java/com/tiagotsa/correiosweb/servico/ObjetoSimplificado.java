
package com.tiagotsa.correiosweb.servico;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de objetoSimplificado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="objetoSimplificado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datahora_cancelamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numero_pedido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="status_pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objetoSimplificado", propOrder = {
    "datahoraCancelamento",
    "numeroPedido",
    "statusPedido"
})
public class ObjetoSimplificado {

    @XmlElement(name = "datahora_cancelamento")
    protected String datahoraCancelamento;
    @XmlElement(name = "numero_pedido")
    protected Integer numeroPedido;
    @XmlElement(name = "status_pedido")
    protected String statusPedido;

    /**
     * Obt�m o valor da propriedade datahoraCancelamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatahoraCancelamento() {
        return datahoraCancelamento;
    }

    /**
     * Define o valor da propriedade datahoraCancelamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatahoraCancelamento(String value) {
        this.datahoraCancelamento = value;
    }

    /**
     * Obt�m o valor da propriedade numeroPedido.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPedido() {
        return numeroPedido;
    }

    /**
     * Define o valor da propriedade numeroPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPedido(Integer value) {
        this.numeroPedido = value;
    }

    /**
     * Obt�m o valor da propriedade statusPedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusPedido() {
        return statusPedido;
    }

    /**
     * Define o valor da propriedade statusPedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusPedido(String value) {
        this.statusPedido = value;
    }

}
