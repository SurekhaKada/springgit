package com.example.Gitdemo;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Fatcorial {

    @GetMapping("/factorial/{number}")
    public ResponseEntity<Integer> calculateFactorial(@PathVariable int number) {
        if (number < 0) {
            return ResponseEntity.badRequest().body(null);
        }

        int factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return ResponseEntity.ok(factorial);
    }
}
