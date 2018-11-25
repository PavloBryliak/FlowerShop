package Flowers;

import lombok.Getter;

@Getter
public enum FlowerType {
    CHAMOMILE("Chamomile"), ROSE("Rose"), TULIP("Tulip");

    private String country;
    FlowerType(String country){
        this.country = country;
    }
}