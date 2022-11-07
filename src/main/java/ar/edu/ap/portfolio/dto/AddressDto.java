package ar.edu.ap.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class AddressDto implements Serializable {
    private final String name;
    private final Integer number;
    private final String city;
    private final String province;
    private final String zipCode;
}
