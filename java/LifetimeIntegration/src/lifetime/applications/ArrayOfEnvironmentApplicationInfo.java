
package lifetime.applications;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEnvironmentApplicationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEnvironmentApplicationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnvironmentApplicationInfo" type="{http://www.outsystems.com}EnvironmentApplicationInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEnvironmentApplicationInfo", propOrder = {
    "environmentApplicationInfo"
})
public class ArrayOfEnvironmentApplicationInfo {

    @XmlElement(name = "EnvironmentApplicationInfo", nillable = true)
    protected List<EnvironmentApplicationInfo> environmentApplicationInfo;

    /**
     * Gets the value of the environmentApplicationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environmentApplicationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironmentApplicationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnvironmentApplicationInfo }
     * 
     * 
     */
    public List<EnvironmentApplicationInfo> getEnvironmentApplicationInfo() {
        if (environmentApplicationInfo == null) {
            environmentApplicationInfo = new ArrayList<EnvironmentApplicationInfo>();
        }
        return this.environmentApplicationInfo;
    }

}
