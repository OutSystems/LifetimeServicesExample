
package lifetime.users;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWORCApplicationShortInfoApplicationPermissionsRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWORCApplicationShortInfoApplicationPermissionsRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WORCApplicationShortInfoApplicationPermissionsRecord" type="{http://www.outsystems.com}WORCApplicationShortInfoApplicationPermissionsRecord" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWORCApplicationShortInfoApplicationPermissionsRecord", propOrder = {
    "worcApplicationShortInfoApplicationPermissionsRecord"
})
public class ArrayOfWORCApplicationShortInfoApplicationPermissionsRecord {

    @XmlElement(name = "WORCApplicationShortInfoApplicationPermissionsRecord", nillable = true)
    protected List<WORCApplicationShortInfoApplicationPermissionsRecord> worcApplicationShortInfoApplicationPermissionsRecord;

    /**
     * Gets the value of the worcApplicationShortInfoApplicationPermissionsRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the worcApplicationShortInfoApplicationPermissionsRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWORCApplicationShortInfoApplicationPermissionsRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WORCApplicationShortInfoApplicationPermissionsRecord }
     * 
     * 
     */
    public List<WORCApplicationShortInfoApplicationPermissionsRecord> getWORCApplicationShortInfoApplicationPermissionsRecord() {
        if (worcApplicationShortInfoApplicationPermissionsRecord == null) {
            worcApplicationShortInfoApplicationPermissionsRecord = new ArrayList<WORCApplicationShortInfoApplicationPermissionsRecord>();
        }
        return this.worcApplicationShortInfoApplicationPermissionsRecord;
    }

}
