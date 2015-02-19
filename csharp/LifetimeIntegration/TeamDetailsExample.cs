using System;
using LifetimeIntegration.LifetimeTeams;

namespace LifetimeIntegration {
    class TeamDetailsExample {

        //List applications managed by a specific team
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
            PlatformTeam team = null;

            //Invoke the Team_Details web method
            success = service.Team_GetDetails(authentication, "Customer Portal team", out status, out team);

            //If the call was successful, print information about the role
            if (success) {
                Console.WriteLine(String.Format("{0}:", team.Name));
                foreach (ApplicationShortInfo application in team.ApplicationList) {
                    Console.WriteLine(String.Format("\t{0}", application.Name));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

//This example displays the output:

// Customer Portal team:
//    Cases
//    CRM Services
//    Customer Portal

