
# Run your application
To generate the start scripts simply run:

`mvn package`

And then simply run the script. On Mac and Linux, the command is:

`sh target/bin/webapp`

On Windows the command is:

`C:/> target/bin/webapp.bat`

That’s it. Your application should start up on port 8080. You can see the JSP at http://localhost:8080 and the servlet and http://localhost:8080/hello

Ref:
https://devcenter.heroku.com/articles/create-a-java-web-application-using-embedded-tomcat