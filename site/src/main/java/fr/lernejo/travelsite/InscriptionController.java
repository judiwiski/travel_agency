package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class InscriptionController {
    private final ArrayList<Inscription> users = new ArrayList<>();


    @PostMapping("/api/inscription")
    public void add(@RequestBody Inscription inscription){
        users.add(inscription);
        System.out.println("user add !");
        for (Inscription user:users) {
            System.out.println(user);
        }
    }

    @GetMapping("/api/inscription")
    public List<Inscription> getUsers(){
        return users;
    }
}
