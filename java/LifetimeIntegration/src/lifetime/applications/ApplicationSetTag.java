
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
 *         &lt;element name="EnvironmentApplicationsForTag" type="{http://www.outsystems.com}EnvironmentApplicationTagList" minOccurs="0"/>
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
    "environmentApplicationsForTag"
})
@XmlRootElement(name = "Application_SetTag")
public class ApplicationSetTag {

    @XmlElement(name = "Authentication")
    protected WebServiceSimpleAuthentication authentication;
    @XmlElement(name = "EnvironmentApplicationsForTag")
    protected EnvironmentApplicationTagList environmentApplicationsForTag;

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
     * Gets the value of the environmentApplicationsForTag property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentApplicationTagList }
     *     
     */
    public EnvironmentApplicationTagList getEnvironmentApplicationsForTag() {
        return environmentApplicationsForTag;
    }

    /**
     * Sets the value of the environmentApplicationsForTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentApplicationTagList }
     *     
     */
    public void setEnvironmentApplicationsForTag(EnvironmentApplicationTagList value) {
        this.environmentApplicationsForTag = value;
    }

}
