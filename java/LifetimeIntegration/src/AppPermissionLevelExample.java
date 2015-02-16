import javax.xml.ws.Holder;
import lifetime.applications.*;

public class AppPermissionLevelExample {
	
    // List the application permission levels available
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
		Holder<ArrayOfApplicationPermissionLevel> permissionLevels = new Holder<ArrayOfApplicationPermissionLevel>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
		// Invoke the Application_List web method
		service.getApplicationManagementServiceSoap().applicationPermissionLevelList(authentication, permissionLevels, status, success);
		
        // If the call was successful, print the permission levels available
		if (success.value) {
			for (ApplicationPermissionLevel permission : permissionLevels.value.getApplicationPermissionLevel()) {
				System.out.println(String.format("%s", permission.getShortLabel()));
			}
		} else {
            // Implement error handling by checking the status.ResponseId field
            // See the possible error codes in the APIStatus structure documentation
		}
	}
}

// This example displays the following output:

// List Versions                 
// No Access                     
// Change & Deploy               
// Reuse & Monitor   