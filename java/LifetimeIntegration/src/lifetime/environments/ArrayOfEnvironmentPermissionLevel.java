
package lifetime.environments;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEnvironmentPermissionLevel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEnvironmentPermissionLevel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentPermissionLevel" type="{http://www.outsystems.com}EnvironmentPermissionLevel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnvironmentPermissionLevel", propOrder = {
    "environmentPermissionLevel"
})
public class ArrayOfEnvironmentPermissionLevel {

    @XmlElement(name = "EnvironmentPermissionLevel", nillable = true)
    protected List<EnvironmentPermissionLevel> environmentPermissionLevel;

    /**
     * Gets the value of the environmentPermissionLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentPermissionLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentPermissionLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentPermissionLevel }
     * 
     * 
     */
    public List<EnvironmentPermissionLevel> getEnvironmentPermissionLevel() {
        if (environmentPermissionLevel == null) {
            environmentPermissionLevel = new ArrayList<EnvironmentPermissionLevel>();
        }
        return this.environmentPermissionLevel;
    }

}
