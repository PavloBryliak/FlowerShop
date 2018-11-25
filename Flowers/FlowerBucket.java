package Flowers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@ToString
@Getter
@Setter

public class FlowerBucket {
    //private int quantity = 1;
    private ArrayList<Flower> flowers = new ArrayList();
    float price = 0;

    public void addFlower(Flower fl){
        flowers.add(fl);
    }

    public double getPrice(){
        for (Flower flower: flowers){
            price = price + flower.getPrice() * flower.getQuantity();
        }
        return price;
    }
}
