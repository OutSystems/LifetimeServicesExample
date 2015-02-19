
package lifetime.teams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlatformTeam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlatformTeam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApplicationList" type="{http://www.outsystems.com}ArrayOfApplicationShortInfo" minOccurs="0"/>
 *         &lt;element name="UserList" type="{http://www.outsystems.com}ArrayOfPlatformUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformTeam", propOrder = {
    "id",
    "name",
    "description",
    "applicationList",
    "userList"
})
public class PlatformTeam {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ApplicationList")
    protected ArrayOfApplicationShortInfo applicationList;
    @XmlElement(name = "UserList")
    protected ArrayOfPlatformUser userList;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the applicationList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfApplicationShortInfo }
     *     
     */
    public ArrayOfApplicationShortInfo getApplicationList() {
        return applicationList;
    }

    /**
     * Sets the value of the applicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfApplicationShortInfo }
     *     
     */
    public void setApplicationList(ArrayOfApplicationShortInfo value) {
        this.applicationList = value;
    }

    /**
     * Gets the value of the userList property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPlatformUser }
     *     
     */
    public ArrayOfPlatformUser getUserList() {
        return userList;
    }

    /**
     * Sets the value of the userList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPlatformUser }
     *     
     */
    public void setUserList(ArrayOfPlatformUser value) {
        this.userList = value;
    }

}
