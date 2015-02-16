
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
 *         &lt;element name="Status" type="{http://www.outsystems.com}APIStatus" minOccurs="0"/>
 *         &lt;element name="ApplicationSolutionBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="ApplicationSolutionSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "status",
    "applicationSolutionBinary",
    "applicationSolutionSize",
    "success"
})
@XmlRootElement(name = "Solution_PackAndDownloadResponse")
public class SolutionPackAndDownloadResponse {

    @XmlElement(name = "Status")
    protected APIStatus status;
    @XmlElement(name = "ApplicationSolutionBinary")
    protected byte[] applicationSolutionBinary;
    @XmlElement(name = "ApplicationSolutionSize")
    protected String applicationSolutionSize;
    @XmlElement(name = "Success")
    protected boolean success;

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
     * Gets the value of the applicationSolutionBinary property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getApplicationSolutionBinary() {
        return applicationSolutionBinary;
    }

    /**
     * Sets the value of the applicationSolutionBinary property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setApplicationSolutionBinary(byte[] value) {
        this.applicationSolutionBinary = ((byte[]) value);
    }

    /**
     * Gets the value of the applicationSolutionSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicationSolutionSize() {
        return applicationSolutionSize;
    }

    /**
     * Sets the value of the applicationSolutionSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicationSolutionSize(String value) {
        this.applicationSolutionSize = value;
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
