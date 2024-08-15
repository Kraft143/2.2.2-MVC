package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Red",1952, "tesla"));
        cars.add(new Car("blue",1955, "buggati"));
        cars.add(new Car("black",1957, "mers"));
    }


    public void init(){

    }


    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public List<Car> getByCount(int count) {
        if(count> cars.size()){
            return cars;
        }
        return cars.subList(0,count);
    }
}
