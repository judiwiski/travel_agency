package fr.lernejo.travelsite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DestinationController {

    //private final ArrayList<Destination> destinations = new ArrayList<>();

    private final Destination destination = new Destination("France", 150);

   /*@GetMapping("/api/travels")
    public List<Destination> getDestinationList(){
        return destinations;
    }*/

    @GetMapping("/api/travels")
    public Destination getDestinationTest(){
        return destination;
    }

}
