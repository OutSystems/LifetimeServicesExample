
package lifetime.teams;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfApplicationShortInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfApplicationShortInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationShortInfo" type="{http://www.outsystems.com}ApplicationShortInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfApplicationShortInfo", propOrder = {
    "applicationShortInfo"
})
public class ArrayOfApplicationShortInfo {

    @XmlElement(name = "ApplicationShortInfo", nillable = true)
    protected List<ApplicationShortInfo> applicationShortInfo;

    /**
     * Gets the value of the applicationShortInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationShortInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationShortInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApplicationShortInfo }
     * 
     * 
     */
    public List<ApplicationShortInfo> getApplicationShortInfo() {
        if (applicationShortInfo == null) {
            applicationShortInfo = new ArrayList<ApplicationShortInfo>();
        }
        return this.applicationShortInfo;
    }

}
