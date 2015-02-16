
package lifetime.roles;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEnvironmentPermissionForRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEnvironmentPermissionForRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentPermissionForRole" type="{http://www.outsystems.com}EnvironmentPermissionForRole" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnvironmentPermissionForRole", propOrder = {
    "environmentPermissionForRole"
})
public class ArrayOfEnvironmentPermissionForRole {

    @XmlElement(name = "EnvironmentPermissionForRole", nillable = true)
    protected List<EnvironmentPermissionForRole> environmentPermissionForRole;

    /**
     * Gets the value of the environmentPermissionForRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentPermissionForRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentPermissionForRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentPermissionForRole }
     * 
     * 
     */
    public List<EnvironmentPermissionForRole> getEnvironmentPermissionForRole() {
        if (environmentPermissionForRole == null) {
            environmentPermissionForRole = new ArrayList<EnvironmentPermissionForRole>();
        }
        return this.environmentPermissionForRole;
    }

}
