package com.handson.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
   @GetMapping("/home")
   public ResponseEntity<String> home(){
	   return new ResponseEntity<>("welcome home", HttpStatus.OK);
   }
   

   @GetMapping("/user")
   public ResponseEntity<String> user(){
	   return new ResponseEntity<>("welcome user", HttpStatus.OK);
   }
   

   @GetMapping("/admin")
   public ResponseEntity<String> admin(){
	   return new ResponseEntity<>("welcome admin", HttpStatus.OK);
   }
   @GetMapping("/superadmin")
   public ResponseEntity<String> superadmin(){
	   return new ResponseEntity<>("welcome superadmin", HttpStatus.OK);
   }
   
   
}
