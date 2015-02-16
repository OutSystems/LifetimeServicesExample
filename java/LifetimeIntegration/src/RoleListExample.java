import javax.xml.ws.Holder;
import lifetime.roles.*;
 
public class RoleListExample {
 
	public static void main(String[] args) {
		
        // Use the AuthenticationService API to get a session token. 
        // See its implementation on the Authorization Service API
		String token = AuthenticationExample.GetToken();
		
        // Create an authentication object to send in the WS call and set it with the session token
        WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
        authentication.setToken(token);
        
		// Role Management Service WS proxy created by Oracle wsimport tool
		RoleManagementService service = new RoleManagementService();
						
		// Objects to store the values returned
		Holder<ArrayOfPlatformRole> roles = new Holder<ArrayOfPlatformRole>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
		// Invoke the Role_List web method, to only display active users
		service.getRoleManagementServiceSoap().roleList(authentication, roles, status, success);
		
		// If the call was successful, print information about the roles
		if (success.value) {
			for (PlatformRole role : roles.value.getPlatformRole()) {
				System.out.println(String.format("%-20s %s",role.getName(), role.getDescription()));
			}
		} else {
            // Implement error handling by checking the status.ResponseId field
            // See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:

// Administrator            Built-in administrator role of the platform
// Developer                Built-in developer role of the platform
// FactoryManager           Responsible for deploying applications from QA to Prod