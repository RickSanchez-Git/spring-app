package annotation.autowired;

import org.springframework.stereotype.Component;

@Component
public class Tea implements Drink {
    private Tea () {};

    public Tea getTea() {
        return new Tea();
    }

    public void drinkUp () {
        System.out.println("Tea drunk");
    }
}
