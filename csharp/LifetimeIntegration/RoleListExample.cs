using System;
using LifetimeIntegration.LifetimeRoles;

namespace LifetimeIntegration {
    class RoleListExample {

        //List IT roles registered in LifeTime
        public static void Main(string[] args) {

            // Use the AuthenticationService API to get a session token. 
            // See its implementation on the Authorization Service API
            String token = AuthenticationExample.getToken();

            // Create an authentication object to send in the WS call and set it with the session token
            WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
            authentication.Token = token;

            // Role Management Service WS proxy created by Visual Studio
            RoleManagementService service = new RoleManagementService();
            
            // The status of the WS call
            bool success = false;
            APIStatus status = null;

            //Invoke the Role_List web method
            PlatformRole[] roles = service.Role_List(authentication, out status, out success);

            //If the call was successful, print information about the role
            if (success) {
                foreach (PlatformRole role in roles) {
                    Console.WriteLine(String.Format("{0,-20}{1}", role.Name, role.Description));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

//This example displays the output:

// Administrator            Built-in administrator role of the platform
// Developer                Built-in developer role of the platform
// FactoryManager           Responsible for deploying applications from QA to Prod