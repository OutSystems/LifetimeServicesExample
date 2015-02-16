
package lifetime.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WORCApplicationShortInfoApplicationPermissionsRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WORCApplicationShortInfoApplicationPermissionsRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssSTApplicationShortInfo" type="{http://www.outsystems.com}ApplicationShortInfo" minOccurs="0"/>
 *         &lt;element name="ssSTApplicationPermissions" type="{http://www.outsystems.com}ApplicationPermissions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WORCApplicationShortInfoApplicationPermissionsRecord", propOrder = {
    "ssSTApplicationShortInfo",
    "ssSTApplicationPermissions"
})
public class WORCApplicationShortInfoApplicationPermissionsRecord {

    protected ApplicationShortInfo ssSTApplicationShortInfo;
    protected ApplicationPermissions ssSTApplicationPermissions;

    /**
     * Gets the value of the ssSTApplicationShortInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationShortInfo }
     *     
     */
    public ApplicationShortInfo getSsSTApplicationShortInfo() {
        return ssSTApplicationShortInfo;
    }

    /**
     * Sets the value of the ssSTApplicationShortInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationShortInfo }
     *     
     */
    public void setSsSTApplicationShortInfo(ApplicationShortInfo value) {
        this.ssSTApplicationShortInfo = value;
    }

    /**
     * Gets the value of the ssSTApplicationPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationPermissions }
     *     
     */
    public ApplicationPermissions getSsSTApplicationPermissions() {
        return ssSTApplicationPermissions;
    }

    /**
     * Sets the value of the ssSTApplicationPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationPermissions }
     *     
     */
    public void setSsSTApplicationPermissions(ApplicationPermissions value) {
        this.ssSTApplicationPermissions = value;
    }

}
