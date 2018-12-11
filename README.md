# FilterMatchAssignment
To Deploy the application
Download and install java development kit (JDK) version 7 or above
Download apache tomcat version 7
Copy the provided war file (FilteringMatches.war) into webapps folder of apache tomcat (e.g  copy the FilteringMatches.war file  D:\apache-tomcat-7.0.92-windows-x64\apache-tomcat-7.0.92\webapps)
Set the JAVA_HOME Variable
1.	Locate your Java installation directory
If you didn't change the path during installation, it'll be something like C:\Program Files\Java\jdk1.8.0_65
You can also type where java at the command prompt.
2.	Do one of the following:
Windows 7 – Right click My Computer and select Properties > Advanced 
Windows 8 – Go to Control Panel > System > Advanced System Settings
Windows 10 – Search for Environment Variables then select Edit the system environment variables
3.	Click the Environment Variables button.
4.	Under System Variables, click New.
5.	In the Variable Name field, enter either:
•	JAVA_HOME if you installed the JDK (Java Development Kit)
or
•	JRE_HOME if you installed the JRE (Java Runtime Environment) 
6.	In the Variable Value field, enter your JDK or JRE installation path .
If the path contains spaces, use the shortened path name. For example, C:\Progra~1\Java\jdk1.8.0_65

  
7.	Click OK and Apply Changes as prompted
8.	Add  JAVA_Home or JRE_HOME to path variable in user variable.

To start the tomcat server traverse to bin folder of tomcat(e.g D:\apache-tomcat-7.0.92-windows-x64\apache-tomcat-7.0.92\bin) in command prompt and run startup.bat 
The server is up and running (ensure it but hitting http://localhost:8080 in your browser and the home pages of apache tomcat lunches)
To start the application hit url “http://localhost:8080/FilteringMatches/Home.html” in your browser and the application lunches

Working of application:
On initial loading of page list of all 25 people is displayed on selection any of the filter the list gets updated as per filter. 
We have reset filter button to reset all the filters
Data to the web page is provided by web service
1st  user of initial list(obtained on page load) is considered as logged in user
For filter hasPhoto, is_contact_exchanged and favourite which has boolean value. If the checkbox is checked then it indicates true else false



