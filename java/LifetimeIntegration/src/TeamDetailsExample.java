import javax.xml.ws.Holder;
import lifetime.teams.*;
 
public class TeamDetailsExample {
 
	public static void main(String[] args) {
		
        // Use the AuthenticationService API to get a session token. 
        // See its implementation on the Authorization Service API
		String token = AuthenticationExample.GetToken();
		
        // Create an authentication object to send in the WS call and set it with the session token
        WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
        authentication.setToken(token);

		// User Management Service WS proxy created by Oracle wsimport tool
		TeamManagementService service = new TeamManagementService();
				
		// Objects to store the values returned
		Holder<PlatformTeam> team = new Holder<PlatformTeam>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>();
		
		// Invoke the Team_List web method, to only display active users
		service.getTeamManagementServiceSoap().teamGetDetails(authentication, "Customer Portal team", success, status, team);
		
		// If the call was successful, print information about the users
		if (success.value) {
			System.out.println(String.format("%s", team.value.getName()));
			for (ApplicationShortInfo application : team.value.getApplicationList().getApplicationShortInfo()) {
				System.out.println(String.format("\t%s", application.getName()));
			}
		} else {
            // Implement error handling by checking the status.ResponseId field
            // See the possible error codes in the APIStatus structure documentation
		}
	}
}
	
// This example displays the output:

// Customer Portal team:
//		Cases
//		CRM Services
//		Customer Portal