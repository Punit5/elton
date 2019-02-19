package pricecheck.domain;

import lombok.Data;

@Data
public class FlightResponse {
    private Meta meta;
    private FlightData data;
}
