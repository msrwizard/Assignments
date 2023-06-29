# Welcome to URL Hit Counter README File :wave:


## Framework Used
___
```bash
 Springboot
```

## Language Used
___
```bash
 Java
```

## Tools Used
___
```bash
 Intellij IDEA
 Maven
```

# :office: DataFlow of the program 
<br>

## Controller
___
> In the controller package we have created a class file UrlHitController to create apis of the functions we have to perform and also created the functions to perform the given tasks but controller takes help of the UrlHitService class to perform the tasks as it reduces high coupling in the code.

    
## Service
___
> In the service package we have created a class file UrlHitService to perform the given tasks and returning the output to controller. Service also takes help of UrlHitRepository class to perform the task and fetch the output from it and it makes it more less coupled.


## Repository
___
> In the repository package we have created a class file UrlHitRepository to perform the given tasks and returning the output to service. Repository have the Data List of Visitors and their count and it perform all the task and give output to service class.

## Data Structure
___
> HashMap : This is used for as a DataBase and stores the visitor Information.


## The Url Hit Counterfollows the following data flow:
___
Client Interaction: The client, such as Postman, sends requests to the Localhost server using url provider .

Controller Layer: In the Spring Boot application, the incoming requests are handled by the Controller layer. The Controller receives the requests and delegates them to the appropriate methods in the service layer.

Service Layer: When a request is received from the Controller, the Service layer call the Repository layer and returns it back to Controller layer.

Repository Layer : The Repository layer contains the business logic of the application and handles Counting and Storing Part. When a request is received from the Service, the Repository layer performs the necessary actions.

Response: After the data operation is completed, the response flows back through the layers in the reverse order. The Service layer receives the response from the Repository layer, performs any necessary post-processing or formatting, and sends it back to the Controller.


## Summary
___
This is a README file for explain the details about the project. This is a URL Hit Counter project which is used to keep a track of hit count of url by a visitor. In this project we can perform the following functions given below :-

* Get total count of URL Hit.
* Hit URL from different Visitors.
* Fetch the details of all the visitors and their visit count.