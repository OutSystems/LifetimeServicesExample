
package lifetime.roles;

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
 *         &lt;element name="RoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnvironmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewPermissionLevelId" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "roleName",
    "environmentKey",
    "newPermissionLevelId"
})
@XmlRootElement(name = "Role_UpdatePermission")
public class RoleUpdatePermission {

    @XmlElement(name = "Authentication")
    protected WebServiceSimpleAuthentication authentication;
    @XmlElement(name = "RoleName")
    protected String roleName;
    @XmlElement(name = "EnvironmentKey")
    protected String environmentKey;
    @XmlElement(name = "NewPermissionLevelId")
    protected int newPermissionLevelId;

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
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String value) {
        this.roleName = value;
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
     * Gets the value of the newPermissionLevelId property.
     * 
     */
    public int getNewPermissionLevelId() {
        return newPermissionLevelId;
    }

    /**
     * Sets the value of the newPermissionLevelId property.
     * 
     */
    public void setNewPermissionLevelId(int value) {
        this.newPermissionLevelId = value;
    }

}
