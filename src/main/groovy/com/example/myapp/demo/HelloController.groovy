package com.example.myapp.demo

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import com.example.myapp.demo.ExampleObject

@RestController
class HelloController{
    @RequestMapping("/hello")
    public sayHello(){
        return "Hello"
    }

    @RequestMapping(name =  "/testpost", method = RequestMethod.POST)
    public ResponseEntity<ExampleObject> sendNudes(@RequestBody ExampleObject exampleObject){
        return new ResponseEntity<ExampleObject>(exampleObject, HttpStatus.OK)
    }

}