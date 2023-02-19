package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InscriptionController{

    private final List<Inscription> users = new ArrayList<>();
    //private final Inscription user = new Inscription("test@gmail.com", "test", "France", WeatherExpectation.WARMER, 5);

    @PostMapping("/api/inscription")
    public void add(@RequestBody Inscription inscription){
        //users.add(inscription);
    }

    @GetMapping("/api/inscription")
    public List<Inscription> getUsers(){
        return users;
    }
}
