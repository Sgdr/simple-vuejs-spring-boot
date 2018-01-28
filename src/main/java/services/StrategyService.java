package services;

import entities.StrategyProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author sgdr
 */
@Controller
public class StrategyService {

    @RequestMapping(value = "/strategy/{id}", method = RequestMethod.GET)
    public @ResponseBody StrategyProperties getStrategiesProperty(@PathVariable("id") String id) {
        System.out.println("HERE");
        return new StrategyProperties(id, "STARTED");
    }
}
