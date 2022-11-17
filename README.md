# Assignment2

## First Part
in this assignment we had to build java program using intillij that read a information from xml url from ynet news website and convert it to html web 

## Second Part
Create a Jenkins CI/CD pipeline Job to Build and Deploy (Run) the application on a new
instance, writing pipeline script to clone the git repository on the instance , run mvn command and send message to the developer throw slack .

Recommendation for running the project:
you need to install java 11 and maven  <br />
first step run the clone repository command : git https://github.com/medhasm/Assignment2.git <br />
second step enter the directory command : cd Assignmen2 <br />
third step run maven : mvn clean package <br />

**Her We Can See the Website how it look after converting to html and run it on port 8080.**
<br />

![web](https://user-images.githubusercontent.com/57920502/202321805-fbcac804-12d1-40e0-a98e-4d9d82c0d613.png)

**in this image we can see the stage view in jenkins passing the build and git cloning steps**<br />
**using the command mvn and git clone.**


![jenkins (3)](https://user-images.githubusercontent.com/57920502/202321788-9798ab96-f7b5-4000-8af7-4248822cb4bc.png)


**In the last image sending message throw the  slack to the developer that every thing passed in success.**
![slack](https://user-images.githubusercontent.com/57920502/202321794-5c674579-73c3-4794-bc06-4d38d02a02e9.png)









