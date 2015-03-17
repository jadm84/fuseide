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
 * <p>Java class for camelJMXAgentDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="camelJMXAgentDefinition">
 *   &lt;complexContent>
 *     &lt;extension base="{http://camel.apache.org/schema/blueprint}identifiedType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="disabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="onlyRegisterProcessorWithCustomId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registryPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="connectorPort" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mbeanServerDefaultDomain" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mbeanObjectDomainName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="serviceUrlPath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="createConnector" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="usePlatformMBeanServer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registerAlways" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="registerNewRoutes" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="statisticsLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loadStatisticsEnabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="includeHostName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "camelJMXAgentDefinition")
public class CamelJMXAgentDefinition
    extends IdentifiedType
{

    @XmlAttribute(name = "disabled")
    protected String disabled;
    @XmlAttribute(name = "onlyRegisterProcessorWithCustomId")
    protected String onlyRegisterProcessorWithCustomId;
    @XmlAttribute(name = "registryPort")
    protected String registryPort;
    @XmlAttribute(name = "connectorPort")
    protected String connectorPort;
    @XmlAttribute(name = "mbeanServerDefaultDomain")
    protected String mbeanServerDefaultDomain;
    @XmlAttribute(name = "mbeanObjectDomainName")
    protected String mbeanObjectDomainName;
    @XmlAttribute(name = "serviceUrlPath")
    protected String serviceUrlPath;
    @XmlAttribute(name = "createConnector")
    protected String createConnector;
    @XmlAttribute(name = "usePlatformMBeanServer")
    protected String usePlatformMBeanServer;
    @XmlAttribute(name = "registerAlways")
    protected String registerAlways;
    @XmlAttribute(name = "registerNewRoutes")
    protected String registerNewRoutes;
    @XmlAttribute(name = "statisticsLevel")
    protected String statisticsLevel;
    @XmlAttribute(name = "loadStatisticsEnabled")
    protected String loadStatisticsEnabled;
    @XmlAttribute(name = "includeHostName")
    protected String includeHostName;
    @XmlAttribute(name = "mask")
    protected String mask;

    /**
     * Gets the value of the disabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * Sets the value of the disabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabled(String value) {
        this.disabled = value;
    }

    /**
     * Gets the value of the onlyRegisterProcessorWithCustomId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnlyRegisterProcessorWithCustomId() {
        return onlyRegisterProcessorWithCustomId;
    }

    /**
     * Sets the value of the onlyRegisterProcessorWithCustomId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnlyRegisterProcessorWithCustomId(String value) {
        this.onlyRegisterProcessorWithCustomId = value;
    }

    /**
     * Gets the value of the registryPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryPort() {
        return registryPort;
    }

    /**
     * Sets the value of the registryPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryPort(String value) {
        this.registryPort = value;
    }

    /**
     * Gets the value of the connectorPort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectorPort() {
        return connectorPort;
    }

    /**
     * Sets the value of the connectorPort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectorPort(String value) {
        this.connectorPort = value;
    }

    /**
     * Gets the value of the mbeanServerDefaultDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbeanServerDefaultDomain() {
        return mbeanServerDefaultDomain;
    }

    /**
     * Sets the value of the mbeanServerDefaultDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbeanServerDefaultDomain(String value) {
        this.mbeanServerDefaultDomain = value;
    }

    /**
     * Gets the value of the mbeanObjectDomainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMbeanObjectDomainName() {
        return mbeanObjectDomainName;
    }

    /**
     * Sets the value of the mbeanObjectDomainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMbeanObjectDomainName(String value) {
        this.mbeanObjectDomainName = value;
    }

    /**
     * Gets the value of the serviceUrlPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUrlPath() {
        return serviceUrlPath;
    }

    /**
     * Sets the value of the serviceUrlPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUrlPath(String value) {
        this.serviceUrlPath = value;
    }

    /**
     * Gets the value of the createConnector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateConnector() {
        return createConnector;
    }

    /**
     * Sets the value of the createConnector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateConnector(String value) {
        this.createConnector = value;
    }

    /**
     * Gets the value of the usePlatformMBeanServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsePlatformMBeanServer() {
        return usePlatformMBeanServer;
    }

    /**
     * Sets the value of the usePlatformMBeanServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsePlatformMBeanServer(String value) {
        this.usePlatformMBeanServer = value;
    }

    /**
     * Gets the value of the registerAlways property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterAlways() {
        return registerAlways;
    }

    /**
     * Sets the value of the registerAlways property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterAlways(String value) {
        this.registerAlways = value;
    }

    /**
     * Gets the value of the registerNewRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNewRoutes() {
        return registerNewRoutes;
    }

    /**
     * Sets the value of the registerNewRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNewRoutes(String value) {
        this.registerNewRoutes = value;
    }

    /**
     * Gets the value of the statisticsLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticsLevel() {
        return statisticsLevel;
    }

    /**
     * Sets the value of the statisticsLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticsLevel(String value) {
        this.statisticsLevel = value;
    }

    /**
     * Gets the value of the loadStatisticsEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadStatisticsEnabled() {
        return loadStatisticsEnabled;
    }

    /**
     * Sets the value of the loadStatisticsEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadStatisticsEnabled(String value) {
        this.loadStatisticsEnabled = value;
    }

    /**
     * Gets the value of the includeHostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncludeHostName() {
        return includeHostName;
    }

    /**
     * Sets the value of the includeHostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncludeHostName(String value) {
        this.includeHostName = value;
    }

    /**
     * Gets the value of the mask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Sets the value of the mask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

}