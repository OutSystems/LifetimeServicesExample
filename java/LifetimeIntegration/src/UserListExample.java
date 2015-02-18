import javax.xml.ws.Holder;
import lifetime.users.*;
 
public class UserListExample {
 
	public static void main(String[] args) {
		
        // Use the AuthenticationService API to get a session token. 
        // See its implementation on the Authorization Service API
		String token = AuthenticationExample.GetToken();
		
        // Create an authentication object to send in the WS call and set it with the session token
        WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
        authentication.setToken(token);

		// User Management Service WS proxy created by Oracle wsimport tool
		UserManagementService service = new UserManagementService();
				
		// Objects to store the values returned
		Holder<ArrayOfPlatformUser> users = new Holder<ArrayOfPlatformUser>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
		// Invoke the User_List web method, to only display active users
		service.getUserManagementServiceSoap().userList(authentication, false, success, status, users);
		
		// If the call was successful, print information about the users
		if (success.value) {
			for (PlatformUser user : users.value.getPlatformUser()) {
				System.out.println(String.format("%s (%s) has the %s role", user.getName(),
						user.getUsername(), user.getRoleName()));
			}
		} else {
			//Implement error handling. See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:

// Administrator (admin) has the Administrator role
// Jackie Finch (j.finch) has the FactoryManager role
// John Rodriguez (jrz) has the Developer role