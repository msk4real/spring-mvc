package web;

import java.util.List;

public interface CarService {

    List<Car> getCarListByCount(List<Car> carList, int count);
}
