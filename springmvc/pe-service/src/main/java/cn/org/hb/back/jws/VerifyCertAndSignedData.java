
package cn.org.hb.back.jws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for verifyCertAndSignedData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="verifyCertAndSignedData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bstrCert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifyCertAndSignedData", propOrder = {
    "bstrCert",
    "inData",
    "signedData"
})
public class VerifyCertAndSignedData {

    protected String bstrCert;
    protected String inData;
    protected String signedData;

    /**
     * Gets the value of the bstrCert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBstrCert() {
        return bstrCert;
    }

    /**
     * Sets the value of the bstrCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBstrCert(String value) {
        this.bstrCert = value;
    }

    /**
     * Gets the value of the inData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInData() {
        return inData;
    }

    /**
     * Sets the value of the inData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInData(String value) {
        this.inData = value;
    }

    /**
     * Gets the value of the signedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedData() {
        return signedData;
    }

    /**
     * Sets the value of the signedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedData(String value) {
        this.signedData = value;
    }

}