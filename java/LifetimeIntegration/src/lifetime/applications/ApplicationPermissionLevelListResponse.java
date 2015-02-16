
package lifetime.applications;

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
 *         &lt;element name="ApplicationPermissionLevels" type="{http://www.outsystems.com}ArrayOfApplicationPermissionLevel" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.outsystems.com}APIStatus" minOccurs="0"/>
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "applicationPermissionLevels",
    "status",
    "success"
})
@XmlRootElement(name = "ApplicationPermissionLevel_ListResponse")
public class ApplicationPermissionLevelListResponse {

    @XmlElement(name = "ApplicationPermissionLevels")
    protected ArrayOfApplicationPermissionLevel applicationPermissionLevels;
    @XmlElement(name = "Status")
    protected APIStatus status;
    @XmlElement(name = "Success")
    protected boolean success;

    /**
     * Gets the value of the applicationPermissionLevels property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApplicationPermissionLevel }
     *     
     */
    public ArrayOfApplicationPermissionLevel getApplicationPermissionLevels() {
        return applicationPermissionLevels;
    }

    /**
     * Sets the value of the applicationPermissionLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApplicationPermissionLevel }
     *     
     */
    public void setApplicationPermissionLevels(ArrayOfApplicationPermissionLevel value) {
        this.applicationPermissionLevels = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link APIStatus }
     *     
     */
    public APIStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIStatus }
     *     
     */
    public void setStatus(APIStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the success property.
     * 
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Sets the value of the success property.
     * 
     */
    public void setSuccess(boolean value) {
        this.success = value;
    }

}
