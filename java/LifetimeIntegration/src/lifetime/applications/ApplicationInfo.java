
package lifetime.applications;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URLPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconHash" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IconURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusInEnvironments" type="{http://www.outsystems.com}ArrayOfEnvironmentApplicationInfo" minOccurs="0"/>
 *         &lt;element name="IsSystem" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationInfo", propOrder = {
    "key",
    "name",
    "description",
    "urlPath",
    "iconHash",
    "iconURL",
    "statusInEnvironments",
    "isSystem",
    "isHidden"
})
public class ApplicationInfo {

    @XmlElement(name = "Key")
    protected String key;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "URLPath")
    protected String urlPath;
    @XmlElement(name = "IconHash")
    protected String iconHash;
    @XmlElement(name = "IconURL")
    protected String iconURL;
    @XmlElement(name = "StatusInEnvironments")
    protected ArrayOfEnvironmentApplicationInfo statusInEnvironments;
    @XmlElement(name = "IsSystem")
    protected boolean isSystem;
    @XmlElement(name = "IsHidden")
    protected boolean isHidden;

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the urlPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPath() {
        return urlPath;
    }

    /**
     * Sets the value of the urlPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPath(String value) {
        this.urlPath = value;
    }

    /**
     * Gets the value of the iconHash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconHash() {
        return iconHash;
    }

    /**
     * Sets the value of the iconHash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconHash(String value) {
        this.iconHash = value;
    }

    /**
     * Gets the value of the iconURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconURL() {
        return iconURL;
    }

    /**
     * Sets the value of the iconURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconURL(String value) {
        this.iconURL = value;
    }

    /**
     * Gets the value of the statusInEnvironments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEnvironmentApplicationInfo }
     *     
     */
    public ArrayOfEnvironmentApplicationInfo getStatusInEnvironments() {
        return statusInEnvironments;
    }

    /**
     * Sets the value of the statusInEnvironments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEnvironmentApplicationInfo }
     *     
     */
    public void setStatusInEnvironments(ArrayOfEnvironmentApplicationInfo value) {
        this.statusInEnvironments = value;
    }

    /**
     * Gets the value of the isSystem property.
     * 
     */
    public boolean isIsSystem() {
        return isSystem;
    }

    /**
     * Sets the value of the isSystem property.
     * 
     */
    public void setIsSystem(boolean value) {
        this.isSystem = value;
    }

    /**
     * Gets the value of the isHidden property.
     * 
     */
    public boolean isIsHidden() {
        return isHidden;
    }

    /**
     * Sets the value of the isHidden property.
     * 
     */
    public void setIsHidden(boolean value) {
        this.isHidden = value;
    }

}
