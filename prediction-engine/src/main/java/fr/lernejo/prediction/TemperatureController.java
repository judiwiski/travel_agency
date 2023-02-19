package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TemperatureController {


    private final ArrayList<Temperature> lastDaysTemperature = new ArrayList<>();

    private final Temperature temperature = new Temperature("France", "2021-12-16",10.25);


    @GetMapping("/api/temperature")
    public List<Temperature> getLastDaysTemperature(){
        return lastDaysTemperature;
    }
}
