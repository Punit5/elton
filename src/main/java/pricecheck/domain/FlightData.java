package pricecheck.domain;

import lombok.Data;

@Data
public class FlightData {
    private String type;
    private String origin;
    private String destination;
    private String departureDate;
    private String returnDate;
    private Price price;
    private Links links;
}
