
package lifetime.authentication;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EnvironmentApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentApplicationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExistsInEnvironment" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsModified" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="LastPublishedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="LastPublishedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentApplicationInfo", propOrder = {
    "environmentKey",
    "existsInEnvironment",
    "version",
    "isModified",
    "lastPublishedOn",
    "lastPublishedBy"
})
public class EnvironmentApplicationInfo {

    @XmlElement(name = "EnvironmentKey")
    protected String environmentKey;
    @XmlElement(name = "ExistsInEnvironment")
    protected boolean existsInEnvironment;
    @XmlElement(name = "Version")
    protected String version;
    @XmlElement(name = "IsModified")
    protected boolean isModified;
    @XmlElement(name = "LastPublishedOn", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastPublishedOn;
    @XmlElement(name = "LastPublishedBy")
    protected String lastPublishedBy;

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
     * Gets the value of the existsInEnvironment property.
     * 
     */
    public boolean isExistsInEnvironment() {
        return existsInEnvironment;
    }

    /**
     * Sets the value of the existsInEnvironment property.
     * 
     */
    public void setExistsInEnvironment(boolean value) {
        this.existsInEnvironment = value;
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
     * Gets the value of the isModified property.
     * 
     */
    public boolean isIsModified() {
        return isModified;
    }

    /**
     * Sets the value of the isModified property.
     * 
     */
    public void setIsModified(boolean value) {
        this.isModified = value;
    }

    /**
     * Gets the value of the lastPublishedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastPublishedOn() {
        return lastPublishedOn;
    }

    /**
     * Sets the value of the lastPublishedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastPublishedOn(XMLGregorianCalendar value) {
        this.lastPublishedOn = value;
    }

    /**
     * Gets the value of the lastPublishedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastPublishedBy() {
        return lastPublishedBy;
    }

    /**
     * Sets the value of the lastPublishedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastPublishedBy(String value) {
        this.lastPublishedBy = value;
    }

}
