
package ru.gismeteo.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MMForecastResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MMForecastResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://ws.gismeteo.ru/}ServiceResult"/>
 *         &lt;element name="data" type="{http://ws.gismeteo.ru/}ArrayOfMMForecast" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MMForecastResult", propOrder = {
    "result",
    "data"
})
public class MMForecastResult {

    @XmlElement(required = true)
    protected ServiceResult result;
    protected ArrayOfMMForecast data;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResult }
     *     
     */
    public ServiceResult getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResult }
     *     
     */
    public void setResult(ServiceResult value) {
        this.result = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMMForecast }
     *     
     */
    public ArrayOfMMForecast getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMMForecast }
     *     
     */
    public void setData(ArrayOfMMForecast value) {
        this.data = value;
    }

}
