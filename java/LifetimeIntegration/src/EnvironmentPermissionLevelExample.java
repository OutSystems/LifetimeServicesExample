import javax.xml.ws.Holder;
import lifetime.environments.*;
 
 
public class EnvironmentPermissionLevelExample {
 
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
		Holder<ArrayOfEnvironmentPermissionLevel> permissionLevels = new Holder<ArrayOfEnvironmentPermissionLevel>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
		// Invoke the EnvironmentPermissionLevel_List web method
		service.getEnvironmentManagementServiceSoap().environmentPermissionLevelList(authentication, permissionLevels, status, success);
		
		// If the call was successful, print information about the environments
		if (success.value) {
			for (EnvironmentPermissionLevel permission : permissionLevels.value.getEnvironmentPermissionLevel()) {
				System.out.println(String.format("%s", permission.getShortLabel()));
			}
		} else {
            // Implement error handling by checking the status.ResponseId field
            // See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:

// Change & Deploy               
// List                          
// No Access                     
// Full Control                  
// Reuse & Monitor   