
package lifetime.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEnvironmentPermissionForApplication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEnvironmentPermissionForApplication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentPermissionForApplication" type="{http://www.outsystems.com}EnvironmentPermissionForApplication" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnvironmentPermissionForApplication", propOrder = {
    "environmentPermissionForApplication"
})
public class ArrayOfEnvironmentPermissionForApplication {

    @XmlElement(name = "EnvironmentPermissionForApplication", nillable = true)
    protected List<EnvironmentPermissionForApplication> environmentPermissionForApplication;

    /**
     * Gets the value of the environmentPermissionForApplication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentPermissionForApplication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentPermissionForApplication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentPermissionForApplication }
     * 
     * 
     */
    public List<EnvironmentPermissionForApplication> getEnvironmentPermissionForApplication() {
        if (environmentPermissionForApplication == null) {
            environmentPermissionForApplication = new ArrayList<EnvironmentPermissionForApplication>();
        }
        return this.environmentPermissionForApplication;
    }

}
