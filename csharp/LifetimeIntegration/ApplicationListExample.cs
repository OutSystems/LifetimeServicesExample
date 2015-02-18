using System;
using LifetimeIntegration.LifetimeApplications;

namespace LifetimeIntegration {
    class ApplicationListExample {

        // List the application versions for each environment
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

            // Invoke the Application_List web method
            // WS returns a boolean and status code to signal success
            ApplicationInfo[] applicationList = service.Application_List(authentication, out status, out success);

            // If the call was successful, print the applications and their versions
            if (success) {
                foreach (ApplicationInfo application in applicationList) {
                    Console.Write(String.Format("\n{0,-30}", application.Name));
                    foreach (EnvironmentApplicationInfo applicationInEnvironment in application.StatusInEnvironments) {
                        // Print app version or '-' if it is not deployed on the environment
                        Console.Write(String.Format("{0,-20}",
                            applicationInEnvironment.ExistsInEnvironment ? applicationInEnvironment.Version : "-"));
                    }
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}
// This example displays the following output:

// Campaigns                     0.11                -                   -                   
// Cases                         0.3                 0.3                 -                   
// CRM Services                  0.1                 0.1                 -                   
