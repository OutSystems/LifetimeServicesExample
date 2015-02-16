
package lifetime.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentPermissionForApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentPermissionForApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnvironmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnvironmentHost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnvironmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationPermissionLevelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentPermissionForApplication", propOrder = {
    "environmentKey",
    "environmentName",
    "environmentHost",
    "environmentType",
    "applicationPermissionLevelId"
})
public class EnvironmentPermissionForApplication {

    @XmlElement(name = "EnvironmentKey")
    protected String environmentKey;
    @XmlElement(name = "EnvironmentName")
    protected String environmentName;
    @XmlElement(name = "EnvironmentHost")
    protected String environmentHost;
    @XmlElement(name = "EnvironmentType")
    protected String environmentType;
    @XmlElement(name = "ApplicationPermissionLevelId")
    protected int applicationPermissionLevelId;

    /**
     * Gets the value of the environmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentKey() {
        return environmentKey;
    }

    /**
     * Sets the value of the environmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentKey(String value) {
        this.environmentKey = value;
    }

    /**
     * Gets the value of the environmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * Sets the value of the environmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentName(String value) {
        this.environmentName = value;
    }

    /**
     * Gets the value of the environmentHost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentHost() {
        return environmentHost;
    }

    /**
     * Sets the value of the environmentHost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentHost(String value) {
        this.environmentHost = value;
    }

    /**
     * Gets the value of the environmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentType() {
        return environmentType;
    }

    /**
     * Sets the value of the environmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentType(String value) {
        this.environmentType = value;
    }

    /**
     * Gets the value of the applicationPermissionLevelId property.
     * 
     */
    public int getApplicationPermissionLevelId() {
        return applicationPermissionLevelId;
    }

    /**
     * Sets the value of the applicationPermissionLevelId property.
     * 
     */
    public void setApplicationPermissionLevelId(int value) {
        this.applicationPermissionLevelId = value;
    }

}
