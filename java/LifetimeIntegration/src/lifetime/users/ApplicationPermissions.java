
package lifetime.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ApplicationPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicationPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationPermissions" type="{http://www.outsystems.com}ArrayOfEnvironmentPermissionForApplication" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationPermissions", propOrder = {
    "applicationPermissions"
})
public class ApplicationPermissions {

    @XmlElement(name = "ApplicationPermissions")
    protected ArrayOfEnvironmentPermissionForApplication applicationPermissions;

    /**
     * Gets the value of the applicationPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEnvironmentPermissionForApplication }
     *     
     */
    public ArrayOfEnvironmentPermissionForApplication getApplicationPermissions() {
        return applicationPermissions;
    }

    /**
     * Sets the value of the applicationPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEnvironmentPermissionForApplication }
     *     
     */
    public void setApplicationPermissions(ArrayOfEnvironmentPermissionForApplication value) {
        this.applicationPermissions = value;
    }

}
