using System;
using LifetimeIntegration.LifetimeApplications;

namespace LifetimeIntegration {
    class AppPermissionLevelExample {
        // List the application permission levels available
        public static void Main(string[] args) {
            
            // Use the AuthenticationService API to get a session token. 
            // See its implementation on the Authorization Service API
            String token = AuthenticationExample.getToken();
            
            // Create an authentication object to send in the WS call and set it with the session token
            WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
            authentication.Token = token;
            
            // Application Management Service WS proxy created by Visual Studio
            ApplicationManagementService service = new ApplicationManagementService();

            // The status of the WS call
            bool success = false;
            APIStatus status = null;

            // Invoke the ApplicationPermissionLevel_List web method
            // WS returns a boolean and status code to signal success            
            ApplicationPermissionLevel[] permissionLevels = service.ApplicationPermissionLevel_List(authentication,out status, out success);
            

            // If the call was successfull, print the permission levels available
            if (success) {
                foreach (ApplicationPermissionLevel permission in permissionLevels) {
                    Console.WriteLine(String.Format("{0,-30}", permission.ShortLabel));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

// This example displays the following output:

// List Versions                 
// No Access                     
// Change & Deploy               
// Reuse & Monitor    
