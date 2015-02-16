
package lifetime.roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlatformRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlatformRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CanManageInfrastructure" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsProtected" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AllowChangePermissions" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="PermissionsPerEnvironment" type="{http://www.outsystems.com}ArrayOfEnvironmentPermissionForRole" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformRole", propOrder = {
    "id",
    "name",
    "description",
    "canManageInfrastructure",
    "isProtected",
    "allowChangePermissions",
    "permissionsPerEnvironment"
})
public class PlatformRole {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CanManageInfrastructure")
    protected boolean canManageInfrastructure;
    @XmlElement(name = "IsProtected")
    protected boolean isProtected;
    @XmlElement(name = "AllowChangePermissions")
    protected boolean allowChangePermissions;
    @XmlElement(name = "PermissionsPerEnvironment")
    protected ArrayOfEnvironmentPermissionForRole permissionsPerEnvironment;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
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
     * Gets the value of the canManageInfrastructure property.
     * 
     */
    public boolean isCanManageInfrastructure() {
        return canManageInfrastructure;
    }

    /**
     * Sets the value of the canManageInfrastructure property.
     * 
     */
    public void setCanManageInfrastructure(boolean value) {
        this.canManageInfrastructure = value;
    }

    /**
     * Gets the value of the isProtected property.
     * 
     */
    public boolean isIsProtected() {
        return isProtected;
    }

    /**
     * Sets the value of the isProtected property.
     * 
     */
    public void setIsProtected(boolean value) {
        this.isProtected = value;
    }

    /**
     * Gets the value of the allowChangePermissions property.
     * 
     */
    public boolean isAllowChangePermissions() {
        return allowChangePermissions;
    }

    /**
     * Sets the value of the allowChangePermissions property.
     * 
     */
    public void setAllowChangePermissions(boolean value) {
        this.allowChangePermissions = value;
    }

    /**
     * Gets the value of the permissionsPerEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEnvironmentPermissionForRole }
     *     
     */
    public ArrayOfEnvironmentPermissionForRole getPermissionsPerEnvironment() {
        return permissionsPerEnvironment;
    }

    /**
     * Sets the value of the permissionsPerEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEnvironmentPermissionForRole }
     *     
     */
    public void setPermissionsPerEnvironment(ArrayOfEnvironmentPermissionForRole value) {
        this.permissionsPerEnvironment = value;
    }

}
