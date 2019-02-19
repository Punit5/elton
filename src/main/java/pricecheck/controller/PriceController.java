package pricecheck.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

public class PriceController {

    public void getData() {
        RestTemplate template = new RestTemplate();

        String s = template.getForObject("https://test.api.amadeus.com/v1/shopping/flight-dates?origin=MAD&destination=MUC", String.class);
        System.out.println(s);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getPrice() {
        return "{\"test\":\"price\"}";
    }

}
