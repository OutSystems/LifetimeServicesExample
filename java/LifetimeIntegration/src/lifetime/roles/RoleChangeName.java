
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
 *         &lt;element name="OldRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NewRoleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "oldRoleName",
    "newRoleName"
})
@XmlRootElement(name = "Role_ChangeName")
public class RoleChangeName {

    @XmlElement(name = "Authentication")
    protected WebServiceSimpleAuthentication authentication;
    @XmlElement(name = "OldRoleName")
    protected String oldRoleName;
    @XmlElement(name = "NewRoleName")
    protected String newRoleName;

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
     * Gets the value of the oldRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldRoleName() {
        return oldRoleName;
    }

    /**
     * Sets the value of the oldRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldRoleName(String value) {
        this.oldRoleName = value;
    }

    /**
     * Gets the value of the newRoleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRoleName() {
        return newRoleName;
    }

    /**
     * Sets the value of the newRoleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRoleName(String value) {
        this.newRoleName = value;
    }

}
