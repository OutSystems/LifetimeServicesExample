
package lifetime.applications;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ApplicationManagementServiceSoap", targetNamespace = "http://LifeTimeServices/ApplicationManagementService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ApplicationManagementServiceSoap {


    /**
     * Returns a list of applications and their information, that are visible within the platform for the authenticated platform user.
     * 
     * @param status
     * @param authentication
     * @param applications
     * @param success
     */
    @WebMethod(operationName = "Application_List", action = "http://LifeTimeServices/ApplicationManagementService/Application_List")
    @RequestWrapper(localName = "Application_List", targetNamespace = "http://www.outsystems.com", className = "lifetime.applications.ApplicationList")
    @ResponseWrapper(localName = "Application_ListResponse", targetNamespace = "http://www.outsystems.com", className = "lifetime.applications.ApplicationListResponse")
    public void applicationList(
        @WebParam(name = "Authentication", targetNamespace = "http://www.outsystems.com")
        WebServiceSimpleAuthentication authentication,
        @WebParam(name = "Success", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<Boolean> success,
        @WebParam(name = "Status", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<APIStatus> status,
        @WebParam(name = "Applications", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<ArrayOfApplicationInfo> applications);

    /**
     * Sets a tag for each application in a given environment.
     * 
     * @param status
     * @param environmentApplicationsForTag
     * @param authentication
     * @param success
     */
    @WebMethod(operationName = "Application_SetTag", action = "http://LifeTimeServices/ApplicationManagementService/Application_SetTag")
    @RequestWrapper(localName = "Application_SetTag", targetNamespace = "http://www.outsystems.com", className = "lifetime.applications.ApplicationSetTag")
    @ResponseWrapper(localName = "Application_SetTagResponse", targetNamespace = "http://www.outsystems.com", className = "lifetime.applications.ApplicationSetTagResponse")
    public void applicationSetTag(
        @WebParam(name = "Authentication", targetNamespace = "http://www.outsystems.com")
        WebServiceSimpleAuthentication authentication,
        @WebParam(name = "EnvironmentApplicationsForTag", targetNamespace = "http://www.outsystems.com")
        EnvironmentApplicationTagList environmentApplicationsForTag,
        @WebParam(name = "Success", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<Boolean> success,
        @WebParam(name = "Status", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<APIStatus> status);

    /**
     * The list of permission levels that a platform user has over an application.
     * 
     * @param status
     * @param authentication
     * @param applicationPermissionLevels
     * @param success
     */
    @WebMethod(operationName = "ApplicationPermissionLevel_List", action = "http://LifeTimeServices/ApplicationManagementService/ApplicationPermissionLevel_List")
    @RequestWrapper(localName = "ApplicationPermissionLevel_List", targetNamespace = "http://www.outsystems.com", className = "lifetime.applications.ApplicationPermissionLevelList")
    @ResponseWrapper(localName = "ApplicationPermissionLevel_ListResponse", targetNamespace = "http://www.outsystems.com", className = "lifetime.applications.ApplicationPermissionLevelListResponse")
    public void applicationPermissionLevelList(
        @WebParam(name = "Authentication", targetNamespace = "http://www.outsystems.com")
        WebServiceSimpleAuthentication authentication,
        @WebParam(name = "Success", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<Boolean> success,
        @WebParam(name = "Status", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<APIStatus> status,
        @WebParam(name = "ApplicationPermissionLevels", targetNamespace = "http://www.outsystems.com", mode = WebParam.Mode.OUT)
        Holder<ArrayOfApplicationPermissionLevel> applicationPermissionLevels);

}