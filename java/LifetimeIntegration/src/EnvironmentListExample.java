import javax.xml.ws.Holder;
import lifetime.environments.*;
 
 
public class EnvironmentListExample {
 
	public static void main(String[] args) {
		
        // Use the AuthenticationService API to get a session token. 
        // See its implementation on the Authorization Service API
		String token = AuthenticationExample.GetToken();
		
        // Create an authentication object to send in the WS call and set it with the session token
        WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
        authentication.setToken(token);

		// Environment Management Service WS proxy created by Oracle wsimport tool
		EnvironmentManagementService service = new EnvironmentManagementService();
		
		// Objects to store the values returned
		Holder<ArrayOfEnvironmentInfo> environmentList = new Holder<ArrayOfEnvironmentInfo>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
		// Invoke the Environment_List web method
		service.getEnvironmentManagementServiceSoap().environmentList(authentication, success, status, environmentList);
		
		// If the call was successful, print information about the environments
		if (success.value) {
			for (EnvironmentInfo environment : environmentList.value.getEnvironmentInfo()) {
				System.out.println(String.format("%s: %s front-end(s) running %s over an %s",
													environment.getName(),
													environment.getNumberOfFrontEnds(),
													environment.getApplicationServerType(), 
													environment.getDatabaseProvider()));
			}
		} else {
            // Implement error handling by checking the status.ResponseId field
            // See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:

// Development: 1 front-end(s) running on .Net with Oracle
// Quality Assurance: 1 front-end(s) running on .Net with Oracle
// Production: 1 front-end(s) running on .Net with Oracle