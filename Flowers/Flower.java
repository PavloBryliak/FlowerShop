package Flowers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter

public class Flower{
    private SepalLenght lenght;
    private FlowerType type;
    private Country countryOfOrigin;
    private Colour color;
    private float price;
    private int quantity;

    public Flower() {
    }
}