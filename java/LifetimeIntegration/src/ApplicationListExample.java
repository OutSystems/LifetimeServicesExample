import javax.xml.ws.Holder;

import lifetime.applications.*;
 
public class ApplicationListExample {
	
	//List the application versions for each environment
	public static void main(String[] args) {
		
        // Use the AuthenticationService API to get a session token. 
        // See its implementation on the Authorization Service API
		String token = AuthenticationExample.GetToken();
		
        // Create an authentication object to send in the WS call and set it with the session token
        WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
        authentication.setToken(token);
		
		// Application Management Service WS proxy created by Oracle wsimport tool
		ApplicationManagementService service = new ApplicationManagementService();
		
		// Objects to store the values returned
		Holder<ArrayOfApplicationInfo> applicationList = new Holder<ArrayOfApplicationInfo>();
		Holder<Boolean> success = new Holder<Boolean>();
		Holder<APIStatus> status = new Holder<APIStatus>();

		
		// Invoke the Application_List web method
		service.getApplicationManagementServiceSoap().applicationList(authentication, success, status, applicationList);
		
		if (success.value) {
			for (ApplicationInfo application : applicationList.value.getApplicationInfo()) {
				//For each application
				System.out.print(String.format("\n%-30s", application.getName()));
				for (EnvironmentApplicationInfo applicationInEnvironment : application.getStatusInEnvironments().getEnvironmentApplicationInfo()) {
					System.out.print(String.format("%-20s", 
							applicationInEnvironment.isExistsInEnvironment() ? applicationInEnvironment.getVersion() : "-"));
				}
			}
		} else {
            // Implement error handling by checking the status.value.ResponseId field
			// See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:
 
// Campaigns                     0.11                -                   -                   
// Cases                         0.3                 0.3                 -                   
// CRM Services                  0.1                 0.1                 - 