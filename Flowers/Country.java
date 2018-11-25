package Flowers;

import lombok.Getter;

@Getter
public enum Country {
    SPAIN("Spain"), NETHERLANDS("Netherlands");

    private String country;
    Country(String country){
        this.country = country;
    }
}
