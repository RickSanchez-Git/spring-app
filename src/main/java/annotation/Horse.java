package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//Java-annotation
@Component("WhiteHorse")
public class Horse {
    private String color;

    @Value("${horse.speed}")
    private int speed;

    private Horse () {};

    public Horse getHorse() {
        return new Horse();
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
}
