package web.Servise;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServise implements CarServiseInter {

    private List<Car> car;

    {
        car = new ArrayList<>();

        car.add(new Car("White", "Toyota", 4));
        car.add(new Car("Black", "BMW", 5));
        car.add(new Car("Blue", "Kia", 3));
        car.add(new Car("Green", "Ford", 8));
        car.add(new Car("Yellow", "Honda", 2));
    }


    public List<Car> index() {
        return car;
    }


    @Override
    public List<Car> get(Integer a) {
        return car.stream().limit(a).collect(Collectors.toList());
    }
}
