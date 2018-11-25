package Flowers;


import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Chamomile extends Flower{
    private Country country;
    private FlowerType type;
    private Colour color;
    private int quantity;
    private SepalLenght lenght;
    private float price;


    public Chamomile(int number) {
        this.lenght = SepalLenght.SMALL;
        this.price = 15;
        this.color = Colour.WHITE;
        this.country = Country.NETHERLANDS;
        this.type = FlowerType.CHAMOMILE;
        this.quantity = number;
    }
}
