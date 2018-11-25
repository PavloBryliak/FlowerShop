package Flowers;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter

public enum Colour {
    BLUE("#00F"), WHITE("#FFF"), RED("#F0F"), PURPLE("#0FF");

    private String rgb;
    Colour(String rgb) {this.rgb = rgb;}


}
