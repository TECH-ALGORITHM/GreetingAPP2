package com.Greetings2App.Greeting2.Controller;

import com.Greetings2App.Greeting2.Models.Greetings;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/greetings")
public class GreetingsController {
    //UC1
    @GetMapping("/{name}")
    public Greetings getGreeting(@PathVariable String name) {
        return new Greetings("Hello " + name);
    }

    @PostMapping
    public Greetings postGreeting(@RequestBody String name) {
        return new Greetings("Hello " + name + " from POST");
    }

    @PutMapping("/{name}")
    public Greetings putGreeting(@PathVariable String name) {
        return new Greetings("Hello " + name + " from PUT");
    }

    @DeleteMapping("/{name}")
    public Greetings deleteGreeting(@PathVariable String name) {
        return new Greetings("Goodbye " + name + " fromDELETE");
    }
}

