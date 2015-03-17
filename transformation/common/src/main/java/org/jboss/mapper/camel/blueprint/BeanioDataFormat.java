//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.13 at 12:09:41 PM EST 
//


package org.jboss.mapper.camel.blueprint;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beanioDataFormat complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beanioDataFormat">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/blueprint}dataFormat">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="mapping" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="streamName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ignoreUnidentifiedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreUnexpectedRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ignoreInvalidRecords" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="encoding" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beanioDataFormat")
public class BeanioDataFormat
    extends DataFormat
{

    @XmlAttribute(name = "mapping", required = true)
    protected String mapping;
    @XmlAttribute(name = "streamName", required = true)
    protected String streamName;
    @XmlAttribute(name = "ignoreUnidentifiedRecords")
    protected Boolean ignoreUnidentifiedRecords;
    @XmlAttribute(name = "ignoreUnexpectedRecords")
    protected Boolean ignoreUnexpectedRecords;
    @XmlAttribute(name = "ignoreInvalidRecords")
    protected Boolean ignoreInvalidRecords;
    @XmlAttribute(name = "encoding")
    protected String encoding;

    /**
     * Gets the value of the mapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapping() {
        return mapping;
    }

    /**
     * Sets the value of the mapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapping(String value) {
        this.mapping = value;
    }

    /**
     * Gets the value of the streamName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreamName() {
        return streamName;
    }

    /**
     * Sets the value of the streamName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreamName(String value) {
        this.streamName = value;
    }

    /**
     * Gets the value of the ignoreUnidentifiedRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreUnidentifiedRecords() {
        return ignoreUnidentifiedRecords;
    }

    /**
     * Sets the value of the ignoreUnidentifiedRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreUnidentifiedRecords(Boolean value) {
        this.ignoreUnidentifiedRecords = value;
    }

    /**
     * Gets the value of the ignoreUnexpectedRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreUnexpectedRecords() {
        return ignoreUnexpectedRecords;
    }

    /**
     * Sets the value of the ignoreUnexpectedRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreUnexpectedRecords(Boolean value) {
        this.ignoreUnexpectedRecords = value;
    }

    /**
     * Gets the value of the ignoreInvalidRecords property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreInvalidRecords() {
        return ignoreInvalidRecords;
    }

    /**
     * Sets the value of the ignoreInvalidRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreInvalidRecords(Boolean value) {
        this.ignoreInvalidRecords = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}