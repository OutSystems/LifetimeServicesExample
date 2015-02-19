# LifeTime Services API Examples

This repository contains some samples on how to use the OutSystems Platform, LifeTime Services API.

This API provides you functionality to manage your infrastructure such as:

 - Manage environments
 - Manage applications
 - Manage teams
 - Manage users
 - Manage roles

 [Learn more in the official docs](http://www.outsystems.com/help/servicestudio/9.0/default.htm#APIs/LifeTimeServices/Overview_of_LifeTime_Services_API.htm)


 ## Running on .NET

 If you want to run these samples on your own infrastructure:

1. Open in Visual Studio
2. Under the Web References folder, update all web references to point to your infrastructure
3. Change the  `AuthenticationExample.cs` to include your username and password



 ## Running on Java

1. Update the web service stubs using
```wsimport -d <destination folder> 
			-extension 
			-keep 
			-p <destination package> 
			http://<your infrastructure>/LifeTimeServices/AuthenticationService?WSDL" 
```
2. Open Eclipse
3. Check to see if WS stubs were correctly generated
4. Change the `AuthenticationExample.java` to include your username and password

