
package lifetime.authentication;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfApplicationPermissionLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfApplicationPermissionLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationPermissionLevel" type="{http://www.outsystems.com}ApplicationPermissionLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApplicationPermissionLevel", propOrder = {
    "applicationPermissionLevel"
})
public class ArrayOfApplicationPermissionLevel {

    @XmlElement(name = "ApplicationPermissionLevel", nillable = true)
    protected List<ApplicationPermissionLevel> applicationPermissionLevel;

    /**
     * Gets the value of the applicationPermissionLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationPermissionLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationPermissionLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationPermissionLevel }
     * 
     * 
     */
    public List<ApplicationPermissionLevel> getApplicationPermissionLevel() {
        if (applicationPermissionLevel == null) {
            applicationPermissionLevel = new ArrayList<ApplicationPermissionLevel>();
        }
        return this.applicationPermissionLevel;
    }

}
