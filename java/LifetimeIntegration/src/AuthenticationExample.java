import javax.xml.ws.Holder;
import lifetime.authentication.*;

public class AuthenticationExample {

	// Obtain a session token to avoid sending the credentials on every request
	public static void main(String[] args) {
		GetToken();
	}
	
	public static String GetToken() {
 
		// LifeTime credentials used to obtain a session token
        String username = "username";
        String password = "password";
        
        // Objects to store the values returned
        Holder<String> token = new Holder<String>();
		Holder<APIStatus> status = new Holder<APIStatus>();
		Holder<Boolean> success = new Holder<Boolean>(); 
        
		// Authentication Service WS proxy created by Oracle wsimport tool
        AuthenticationService service = new AuthenticationService();
        service.getAuthenticationServiceSoap().authenticationGetToken(username, password, success, status, token);
        
        if(success.value) {
        	// System.out.println(String.format("Token obtained %s", token.value));
        } else {
			// Implement error handling. 
			// See the possible error codes in the APIStatus structure documentation
		}
        return token.value;
	}
}
// This example displays the output:
// Token obtained 96fef1f3-f20c-4254-98f7-02d6fb50cdf7