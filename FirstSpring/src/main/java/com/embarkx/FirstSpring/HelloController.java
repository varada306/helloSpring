package com.embarkx.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HelloResponse  helloParam(@PathVariable String name){
        return new HelloResponse("Hello " + name);
    }

    @GetMapping("/hello")
    public HelloResponse hello(){
        System.out.println("Hello");
        return new HelloResponse("feature changes for PR");
    }

    @PostMapping("hello")
    public HelloResponse helloPost(@RequestBody String name){
        return new HelloResponse("Hello " + name + "!");
    }
}
