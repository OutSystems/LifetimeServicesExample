using System;
using LifetimeIntegration.LifetimeEnvironments;

namespace LifetimeIntegration {
    class EnvironmentPermissionLevelExample {

        //List the environments registered in LifeTime
        static void Main(string[] args) {

            // Use the AuthenticationService API to get a session token. 
            // See its implementation on the Authorization Service API
            String token = AuthenticationExample.getToken();

            // Create an authentication object to send in the WS call and set it with the session token
            WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
            authentication.Token = token;

            //Environment Management Service WS proxy created by Visual Studio
            EnvironmentManagementService service = new EnvironmentManagementService();

            // The status of the WS call
            bool success = false;
            APIStatus status = null;

            //Invoke the EnvironmentPermissionLevel_List web method
            EnvironmentPermissionLevel[] permissionLevels = service.EnvironmentPermissionLevel_List(authentication, out status, out success);

            //If the call was successful, print the permission levels available
            if (success) {
                foreach (EnvironmentPermissionLevel permission in permissionLevels) {
                    Console.WriteLine(String.Format("{0}", permission.ShortLabel));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

// This example displays the output:

// Change & Deploy               
// List                          
// No Access                     
// Full Control                  
// Reuse & Monitor               

