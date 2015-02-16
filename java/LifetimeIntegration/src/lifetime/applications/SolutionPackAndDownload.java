
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
 *         &lt;element name="Authentication" type="{http://www.outsystems.com}WebServiceSimpleAuthentication" minOccurs="0"/>
 *         &lt;element name="EnvironmentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationTagInfo" type="{http://www.outsystems.com}ArrayOfApplicationTag" minOccurs="0"/>
 *         &lt;element name="SolutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SolutionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "authentication",
    "environmentKey",
    "applicationTagInfo",
    "solutionName",
    "solutionDescription"
})
@XmlRootElement(name = "Solution_PackAndDownload")
public class SolutionPackAndDownload {

    @XmlElement(name = "Authentication")
    protected WebServiceSimpleAuthentication authentication;
    @XmlElement(name = "EnvironmentKey")
    protected String environmentKey;
    @XmlElement(name = "ApplicationTagInfo")
    protected ArrayOfApplicationTag applicationTagInfo;
    @XmlElement(name = "SolutionName")
    protected String solutionName;
    @XmlElement(name = "SolutionDescription")
    protected String solutionDescription;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link WebServiceSimpleAuthentication }
     *     
     */
    public WebServiceSimpleAuthentication getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link WebServiceSimpleAuthentication }
     *     
     */
    public void setAuthentication(WebServiceSimpleAuthentication value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the environmentKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnvironmentKey() {
        return environmentKey;
    }

    /**
     * Sets the value of the environmentKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnvironmentKey(String value) {
        this.environmentKey = value;
    }

    /**
     * Gets the value of the applicationTagInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApplicationTag }
     *     
     */
    public ArrayOfApplicationTag getApplicationTagInfo() {
        return applicationTagInfo;
    }

    /**
     * Sets the value of the applicationTagInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApplicationTag }
     *     
     */
    public void setApplicationTagInfo(ArrayOfApplicationTag value) {
        this.applicationTagInfo = value;
    }

    /**
     * Gets the value of the solutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionName() {
        return solutionName;
    }

    /**
     * Sets the value of the solutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionName(String value) {
        this.solutionName = value;
    }

    /**
     * Gets the value of the solutionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolutionDescription() {
        return solutionDescription;
    }

    /**
     * Sets the value of the solutionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolutionDescription(String value) {
        this.solutionDescription = value;
    }

}
