package Flowers;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data

public class Tulip extends Flower{
    private Country country;
    private FlowerType type;
    private Colour color;
    private int quantity;
    private SepalLenght lenght;
    private float price;

    public Tulip(int number) {
        this.lenght = SepalLenght.MEDIUM;
        this.price = 5;
        this.color = Colour.BLUE;
        this.country = Country.NETHERLANDS;
        this.type = FlowerType.TULIP;
        this.quantity = number;

    }

}
