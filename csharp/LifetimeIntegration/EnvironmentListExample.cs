﻿using System;
using LifetimeIntegration.LifetimeEnvironments;

namespace LifetimeIntegration {
    class EnvironmentListExample {

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
            EnvironmentInfo[] environments = null;

            //Invoke the Environment_List web method
            success = service.Environment_List(authentication, out status, out environments);

            //If the call was successful, print information about the environments
            if (success) {
                foreach (EnvironmentInfo environment in environments) {
                    Console.WriteLine(String.Format("{0}: {1} front-end(s) running on {2} with {3}",
                                                    environment.Name, environment.NumberOfFrontEnds,
                                                    environment.ApplicationServerType,
                                                    environment.DatabaseProvider));
                }
            } else {
                // Implement error handling by checking the status.ResponseId field
                // See the possible error codes in the APIStatus structure documentation
            }
        }
    }
}

// This example displays the output:

// Development: 1 front-end(s) running on .Net with Oracle
// Quality Assurance: 1 front-end(s) running on .Net with Oracle
// Production: 1 front-end(s) running on .Net with Oracle
