package com.lambda.project;
import java.util.Optional;

interface UserService {
 default String getWelcomeMessage() {
     return "Welcome, Guest!";
 }

 Optional<String> getUser(String name);

 default String getPersonalizedWelcomeMessage(String name) {
     return getUser(name)
             .map(userName -> "Welcome, " + userName + "!") 
             .orElse(getWelcomeMessage()); 
 }
}

class UserServiceImpl implements UserService {
 
 public Optional<String> getUser(String name) {
     return Optional.ofNullable(name);
 }
}

public class Welcome {
 public static void main(String[] args) {
     UserService userService = new UserServiceImpl();

     System.out.println(userService.getPersonalizedWelcomeMessage("Alice")); 

     System.out.println(userService.getPersonalizedWelcomeMessage(null));
 }
}

