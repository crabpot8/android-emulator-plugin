# Android Emulator Plugin for Hudson/Jenkins

Lets you automatically generate and run an [Android](http://developer.android.com/) emulator for the duration of a build, with the emulator logs being captured as artifacts.

For more information, visit the wiki page:  
<http://wiki.jenkins-ci.org/display/JENKINS/Android+Emulator+Plugin>

<h1>Contributing</h1>

<h2>Setting Up Your Development Environment</h2>

Let's pretend you want to use Eclipse as the IDE

1. Fork the github project
2. Clone your github repository to your local computer
3. cd into the directory containing the pom.xml
4. Use maven to create an eclipse .project file

~~~
mvn -DdownloadSources=true -DdownloadJavadocs=true -DoutputDirectory=target/eclipse-classes eclipse:eclipse
~~~

5. Open eclipse, choose file->Import->General->Existing Project into Workspace
6. Select the directory containing the pom.xml file and click finish

Now make some changes. To test, run the project as so
~~~
mvn hpi:run
~~~
This will run an instance of jenkins on your local machine with the updated plugin installed. 
