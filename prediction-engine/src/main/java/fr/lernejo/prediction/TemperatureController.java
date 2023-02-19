package fr.lernejo.prediction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TemperatureController {


    private final ArrayList<Temperature> lastDaysTemperature = new ArrayList<>();

    @GetMapping("/api/temperature")
    public List<Temperature> getLastDaysTemperature(){
        return lastDaysTemperature;
    }
}
