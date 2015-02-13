using System;
using LifetimeIntegration.LifetimeTeams;

namespace LifetimeIntegration {
    class TeamListExample {

        //List IT roles registered in LifeTime
        public static void Main(string[] args) {

            // Use the AuthenticationService API to get a session token. 
            // See its implementation on the Authorization Service API
            String token = AuthenticationExample.getToken();

            // Create an authentication object to send in the WS call and set it with the session token
            WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
            authentication.Token = token;

            // Role Management Service WS proxy created by Visual Studio
            TeamManagementService service = new TeamManagementService();

            // The status of the WS call
            bool success = false;
            APIStatus status = null;

            //Invoke the Team_List web method
            Platform_Team[] teams = null;
            status = service.Team_List(authentication, out teams, out success);

            //If the call was successfull, print information about the role
            if (success) {
                foreach (Platform_Team team in teams) {
                    Console.WriteLine(String.Format("{0}", team.Name));
                }
            } else {
                //Implement error handling. See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

// This example displays the output:

// Customer Portal team
// Directory team
// CRM team
