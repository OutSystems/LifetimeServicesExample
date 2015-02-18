using System;
using LifetimeIntegration.LifetimeUsers;

namespace LifetimeIntegration {
    class UserListExample {

        //List IT users registered in LifeTime
        static void Main(string[] args) {

            // Use the AuthenticationService API to get a session token. 
            // See its implementation on the Authorization Service API
            String token = AuthenticationExample.getToken();

            // Create an authentication object to send in the WS call and set it with the session token
            WebServiceSimpleAuthentication authentication = new WebServiceSimpleAuthentication();
            authentication.Token = token;

            // Role Management Service WS proxy created by Visual Studio
            UserManagementService service = new UserManagementService();

            // The status of the WS call
            bool success = false;
            APIStatus status = null;

            //Invoke the User_List web method, to only display active users
            PlatformUser[] users = null;
            users = service.User_List(authentication, false, out status, out success);


            //If the call was successful, print information about the users
            if (success) {
                foreach (PlatformUser user in users) {
                    Console.WriteLine(String.Format("{0} ({1}) has the {2} role", user.Name, user.Username, user.RoleName));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

// This example displays the output:

// Administrator (admin) has the Administrator role
// Jackie Finch (j.finch) has the FactoryManager role
// John Rodriguez (jrz) has the Developer role