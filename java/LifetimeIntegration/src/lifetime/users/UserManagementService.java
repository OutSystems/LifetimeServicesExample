
package lifetime.users;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * The Platform API to manage IT users: users created in the platform. The authenticated user needs to have 'Manage Infrastructure' permissions in the platform to use this API.
 * To use this API you need to send an authentication argument with username/password, or use the AuthenticationService Web Service API to acquire a session token to send as argument.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "UserManagementService", targetNamespace = "http://LifeTimeServices/UserManagementService/", wsdlLocation = "http://outsystemscloud/LifeTimeServices/UserManagementService.asmx?WSDL")
public class UserManagementService
    extends Service
{

    private final static URL USERMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(lifetime.users.UserManagementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = lifetime.users.UserManagementService.class.getResource(".");
            url = new URL(baseUrl, "http://outsystemscloud/LifeTimeServices/UserManagementService.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://outsystemscloud/LifeTimeServices/UserManagementService.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        USERMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public UserManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserManagementService() {
        super(USERMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://LifeTimeServices/UserManagementService/", "UserManagementService"));
    }

    /**
     * 
     * @return
     *     returns UserManagementServiceSoap
     */
    @WebEndpoint(name = "UserManagementServiceSoap")
    public UserManagementServiceSoap getUserManagementServiceSoap() {
        return super.getPort(new QName("http://LifeTimeServices/UserManagementService/", "UserManagementServiceSoap"), UserManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserManagementServiceSoap
     */
    @WebEndpoint(name = "UserManagementServiceSoap")
    public UserManagementServiceSoap getUserManagementServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://LifeTimeServices/UserManagementService/", "UserManagementServiceSoap"), UserManagementServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns UserManagementServiceSoap
     */
    @WebEndpoint(name = "UserManagementServiceSoap12")
    public UserManagementServiceSoap getUserManagementServiceSoap12() {
        return super.getPort(new QName("http://LifeTimeServices/UserManagementService/", "UserManagementServiceSoap12"), UserManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserManagementServiceSoap
     */
    @WebEndpoint(name = "UserManagementServiceSoap12")
    public UserManagementServiceSoap getUserManagementServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://LifeTimeServices/UserManagementService/", "UserManagementServiceSoap12"), UserManagementServiceSoap.class, features);
    }

}
