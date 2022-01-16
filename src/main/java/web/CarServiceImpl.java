package web;

import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getCarListByCount(List<Car> carList, int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
