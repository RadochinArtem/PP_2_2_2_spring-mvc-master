package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImp implements CarService {

    private final CarDao carDao;
    @Autowired
    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }
    @Override
    public List<Car> listCarsByCount (int counter) {
        List<Car> cars = new ArrayList<>();
        for (int i = 1; i < counter + 1; i++) {
            cars.add(carDao.getCarById(i));
        }
        return cars;
    }
}
