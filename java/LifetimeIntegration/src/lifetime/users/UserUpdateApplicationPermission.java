
package lifetime.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Authentication" type="{http://www.outsystems.com}WebServiceSimpleAuthentication" minOccurs="0"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnvironmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PermissionLevelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "authentication",
    "username",
    "applicationKey",
    "environmentKey",
    "permissionLevelId"
})
@XmlRootElement(name = "User_UpdateApplicationPermission")
public class UserUpdateApplicationPermission {

    @XmlElement(name = "Authentication")
    protected WebServiceSimpleAuthentication authentication;
    @XmlElement(name = "Username")
    protected String username;
    @XmlElement(name = "ApplicationKey")
    protected String applicationKey;
    @XmlElement(name = "EnvironmentKey")
    protected String environmentKey;
    @XmlElement(name = "PermissionLevelId")
    protected int permissionLevelId;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceSimpleAuthentication }
     *     
     */
    public WebServiceSimpleAuthentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceSimpleAuthentication }
     *     
     */
    public void setAuthentication(WebServiceSimpleAuthentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the applicationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    /**
     * Sets the value of the applicationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationKey(String value) {
        this.applicationKey = value;
    }

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
     * Gets the value of the permissionLevelId property.
     * 
     */
    public int getPermissionLevelId() {
        return permissionLevelId;
    }

    /**
     * Sets the value of the permissionLevelId property.
     * 
     */
    public void setPermissionLevelId(int value) {
        this.permissionLevelId = value;
    }

}
