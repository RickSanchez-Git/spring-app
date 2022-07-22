package annotation.autowired;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Coffee implements Drink {
    private Coffee () {};

    public Coffee getCoffee () {
        return new Coffee();
    }
    public void drinkUp () {
        System.out.println("Coffee drunk");
    }
}
