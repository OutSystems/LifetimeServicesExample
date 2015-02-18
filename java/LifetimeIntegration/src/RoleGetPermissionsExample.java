import javax.xml.ws.Holder;
import lifetime.roles.*;
 
public class RoleGetPermissionsExample {
 
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
		Holder<ArrayOfEnvironmentPermissionForRole> permissions = new Holder<ArrayOfEnvironmentPermissionForRole>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
        //Invoke the Role_GetPermissions web method for the Developer role
		service.getRoleManagementServiceSoap().roleGetPermissions(authentication, "Developer", success, status, permissions);
		
		// If the call was successful, print information about the roles
		if (success.value) {
			for (EnvironmentPermissionForRole permission : permissions.value.getEnvironmentPermissionForRole()) {
				System.out.println(String.format("%-20s %s",permission.getEnvironmentName(), permission.getEnvironmentPermissionLevelId()));
			}
		} else {
            // Implement error handling by checking the status.ResponseId field
            // See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:

// Development         5
// Production          1
// Quality Assurance   1