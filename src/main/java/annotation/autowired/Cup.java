package annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cup {
    private Drink drink;

    @Autowired
    public Cup (@Qualifier("tea") Drink drink) {
        this.drink = drink;
    }

    public Drink getDrink() {
        return drink;
    }
}
