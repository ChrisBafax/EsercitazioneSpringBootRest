package it.academy.corso.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ChristianController {

    @GetMapping("/chris")
    public ResponseEntity<Map<String,String>> chris (){
        Map <String,String> out = new HashMap<>();
        out.put("Message","Christian");
        return new ResponseEntity<>(out, HttpStatus.OK);
    }

    @GetMapping("/chris2")
    public ResponseEntity<String> chris2 (){
        String message = "Ciao, sono Chris ";
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
