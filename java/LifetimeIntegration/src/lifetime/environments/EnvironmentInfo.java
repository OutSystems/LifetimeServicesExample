
package lifetime.environments;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Order" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HostName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UseHTTPS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InProductionMode" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NumberOfFrontEnds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ApplicationServerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationServer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatabaseProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsCloudEnvironment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentInfo", propOrder = {
    "key",
    "name",
    "version",
    "order",
    "hostName",
    "useHTTPS",
    "inProductionMode",
    "numberOfFrontEnds",
    "applicationServerType",
    "applicationServer",
    "databaseProvider",
    "isCloudEnvironment"
})
public class EnvironmentInfo {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "Order")
    protected int order;
    @XmlElement(name = "HostName")
    protected String hostName;
    @XmlElement(name = "UseHTTPS")
    protected boolean useHTTPS;
    @XmlElement(name = "InProductionMode")
    protected boolean inProductionMode;
    @XmlElement(name = "NumberOfFrontEnds")
    protected int numberOfFrontEnds;
    @XmlElement(name = "ApplicationServerType")
    protected String applicationServerType;
    @XmlElement(name = "ApplicationServer")
    protected String applicationServer;
    @XmlElement(name = "DatabaseProvider")
    protected String databaseProvider;
    @XmlElement(name = "IsCloudEnvironment")
    protected boolean isCloudEnvironment;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the order property.
     * 
     */
    public int getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     */
    public void setOrder(int value) {
        this.order = value;
    }

    /**
     * Gets the value of the hostName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * Sets the value of the hostName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostName(String value) {
        this.hostName = value;
    }

    /**
     * Gets the value of the useHTTPS property.
     * 
     */
    public boolean isUseHTTPS() {
        return useHTTPS;
    }

    /**
     * Sets the value of the useHTTPS property.
     * 
     */
    public void setUseHTTPS(boolean value) {
        this.useHTTPS = value;
    }

    /**
     * Gets the value of the inProductionMode property.
     * 
     */
    public boolean isInProductionMode() {
        return inProductionMode;
    }

    /**
     * Sets the value of the inProductionMode property.
     * 
     */
    public void setInProductionMode(boolean value) {
        this.inProductionMode = value;
    }

    /**
     * Gets the value of the numberOfFrontEnds property.
     * 
     */
    public int getNumberOfFrontEnds() {
        return numberOfFrontEnds;
    }

    /**
     * Sets the value of the numberOfFrontEnds property.
     * 
     */
    public void setNumberOfFrontEnds(int value) {
        this.numberOfFrontEnds = value;
    }

    /**
     * Gets the value of the applicationServerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationServerType() {
        return applicationServerType;
    }

    /**
     * Sets the value of the applicationServerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationServerType(String value) {
        this.applicationServerType = value;
    }

    /**
     * Gets the value of the applicationServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationServer() {
        return applicationServer;
    }

    /**
     * Sets the value of the applicationServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationServer(String value) {
        this.applicationServer = value;
    }

    /**
     * Gets the value of the databaseProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseProvider() {
        return databaseProvider;
    }

    /**
     * Sets the value of the databaseProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseProvider(String value) {
        this.databaseProvider = value;
    }

    /**
     * Gets the value of the isCloudEnvironment property.
     * 
     */
    public boolean isIsCloudEnvironment() {
        return isCloudEnvironment;
    }

    /**
     * Sets the value of the isCloudEnvironment property.
     * 
     */
    public void setIsCloudEnvironment(boolean value) {
        this.isCloudEnvironment = value;
    }

}
