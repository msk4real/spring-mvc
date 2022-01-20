package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao{

    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
