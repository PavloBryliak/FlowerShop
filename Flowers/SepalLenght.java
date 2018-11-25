package Flowers;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter

public enum SepalLenght {
    SMALL("15"), MEDIUM("25"), LARGE("35");

    private String lenght;
    SepalLenght(String lenght) {this.lenght = lenght;}


}
