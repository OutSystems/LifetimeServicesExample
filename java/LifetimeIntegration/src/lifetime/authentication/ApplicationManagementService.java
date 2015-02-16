
package lifetime.authentication;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * The Platform API for getting information about applications managed by the platform.
 * To use this API you need to send an authentication argument with username/password, or use the AuthenticationService Web Service API to acquire a session token to send as argument.
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "ApplicationManagementService", targetNamespace = "http://LifeTimeServices/ApplicationManagementService/", wsdlLocation = "http://outsystemscloud/LifeTimeServices/ApplicationManagementService.asmx?WSDL")
public class ApplicationManagementService
    extends Service
{

    private final static URL APPLICATIONMANAGEMENTSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(lifetime.authentication.ApplicationManagementService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = lifetime.authentication.ApplicationManagementService.class.getResource(".");
            url = new URL(baseUrl, "http://outsystemscloud/LifeTimeServices/ApplicationManagementService.asmx?WSDL");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://outsystemscloud/LifeTimeServices/ApplicationManagementService.asmx?WSDL', retrying as a local file");
            logger.warning(e.getMessage());
        }
        APPLICATIONMANAGEMENTSERVICE_WSDL_LOCATION = url;
    }

    public ApplicationManagementService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ApplicationManagementService() {
        super(APPLICATIONMANAGEMENTSERVICE_WSDL_LOCATION, new QName("http://LifeTimeServices/ApplicationManagementService/", "ApplicationManagementService"));
    }

    /**
     * 
     * @return
     *     returns ApplicationManagementServiceSoap
     */
    @WebEndpoint(name = "ApplicationManagementServiceSoap")
    public ApplicationManagementServiceSoap getApplicationManagementServiceSoap() {
        return super.getPort(new QName("http://LifeTimeServices/ApplicationManagementService/", "ApplicationManagementServiceSoap"), ApplicationManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ApplicationManagementServiceSoap
     */
    @WebEndpoint(name = "ApplicationManagementServiceSoap")
    public ApplicationManagementServiceSoap getApplicationManagementServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://LifeTimeServices/ApplicationManagementService/", "ApplicationManagementServiceSoap"), ApplicationManagementServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ApplicationManagementServiceSoap
     */
    @WebEndpoint(name = "ApplicationManagementServiceSoap12")
    public ApplicationManagementServiceSoap getApplicationManagementServiceSoap12() {
        return super.getPort(new QName("http://LifeTimeServices/ApplicationManagementService/", "ApplicationManagementServiceSoap12"), ApplicationManagementServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ApplicationManagementServiceSoap
     */
    @WebEndpoint(name = "ApplicationManagementServiceSoap12")
    public ApplicationManagementServiceSoap getApplicationManagementServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://LifeTimeServices/ApplicationManagementService/", "ApplicationManagementServiceSoap12"), ApplicationManagementServiceSoap.class, features);
    }

}
