package Flowers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class Rose extends Flower{
    private Country country;
    private FlowerType type;
    private Colour color;
    private int quantity;
    private SepalLenght lenght;
    private float price;

    public Rose(int number) {
        this.lenght = SepalLenght.LARGE;
        this.price = 15;
        this.color = Colour.RED;
        this.country = Country.SPAIN;
        this.type = FlowerType.ROSE;
        this.quantity = number;
    }
}
