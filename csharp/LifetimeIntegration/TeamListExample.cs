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
            PlatformTeam[] teams = null;

            //Invoke the Team_List web method
            success = service.Team_List(authentication, out status, out teams);

            //If the call was successful, print information about the role
            if (success) {
                foreach (PlatformTeam team in teams) {
                    Console.WriteLine(String.Format("{0}", team.Name));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

// This example displays the output:

// Customer Portal team
// Directory team
// CRM team
