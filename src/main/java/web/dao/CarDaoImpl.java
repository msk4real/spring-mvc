package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
    @Override
    public List<Car> setCarList(){
        List<Car>carsList = new ArrayList<>();
        carsList.add(new Car("Ford", 123, "black"));
        carsList.add(new Car("Ferrari", 145, "red"));
        carsList.add(new Car("Honda", 434, "blue"));
        carsList.add(new Car("Mazda", 563, "yellow"));
        carsList.add(new Car("Bentley", 334, "purple"));
        return carsList;
    }
}
