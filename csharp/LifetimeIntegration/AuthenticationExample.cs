using System;
using LifetimeIntegration.LifetimeAuthentication;

namespace LifetimeIntegration {
    class AuthenticationExample {
        
        // Get a session token to avoid sending the credentials on every request
        public static String getToken() {
                        
            // LifeTime credentials used to obtain a session token
            const string username = "user";
            const string password = "password";

            // Authentication Service WS proxy created by Visual Studio
            AuthenticationService service = new AuthenticationService();

            // The status of the WS call
            bool success = false;
            APIStatus status = null;
            

            // Authentication token to be used when invoking other services
            // WS returns a boolean and status code to signal success
            string token = service.Authentication_GetToken(username, password, out status, out success);

            // If the call was successful, print the session token obtained
            if (success) {
                Console.Write(String.Format("Token obtained: {0}", token));
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
            return token;
        }
    }
}

// This example displays the output:
// Token obtained 96fef1f3-f20c-4254-98f7-02d6fb50cdf7