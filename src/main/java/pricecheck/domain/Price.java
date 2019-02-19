package pricecheck.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Price {
    private BigDecimal total;
}
