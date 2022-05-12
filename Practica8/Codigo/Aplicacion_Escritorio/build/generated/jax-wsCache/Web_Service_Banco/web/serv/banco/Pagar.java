
package web.serv.banco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pagar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pagar"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Numero_Tarjeta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Monto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CVV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagar", propOrder = {
    "numeroTarjeta",
    "monto",
    "nombre",
    "cvv"
})
public class Pagar {

    @XmlElement(name = "Numero_Tarjeta")
    protected int numeroTarjeta;
    @XmlElement(name = "Monto")
    protected int monto;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "CVV")
    protected String cvv;

    /**
     * Gets the value of the numeroTarjeta property.
     * 
     */
    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    /**
     * Sets the value of the numeroTarjeta property.
     * 
     */
    public void setNumeroTarjeta(int value) {
        this.numeroTarjeta = value;
    }

    /**
     * Gets the value of the monto property.
     * 
     */
    public int getMonto() {
        return monto;
    }

    /**
     * Sets the value of the monto property.
     * 
     */
    public void setMonto(int value) {
        this.monto = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the cvv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVV() {
        return cvv;
    }

    /**
     * Sets the value of the cvv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVV(String value) {
        this.cvv = value;
    }

}
