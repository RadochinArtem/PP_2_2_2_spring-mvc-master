package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private static int CARS_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++CARS_COUNT,"Model1",1111));
        cars.add(new Car(++CARS_COUNT,"Model2",2222));
        cars.add(new Car(++CARS_COUNT,"Model3",3333));
        cars.add(new Car(++CARS_COUNT,"Model4",4444));
        cars.add(new Car(++CARS_COUNT,"Model5",5555));
    }
    @Override
    public Car getCarById(int id){
        return cars.stream().filter(cars -> cars.getId() == id).findAny().orElse(null);
    }

}
