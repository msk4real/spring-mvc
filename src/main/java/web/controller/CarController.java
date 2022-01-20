package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count", defaultValue = "5") int count,
                             ModelMap model) {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car("Ford", 123, "black"));
        carsList.add(new Car("Ferrari", 145, "red"));
        carsList.add(new Car("Honda", 434, "blue"));
        carsList.add(new Car("Mazda", 563, "yellow"));
        carsList.add(new Car("Bentley", 334, "purple"));
        model.addAttribute("cars", carService.getCarListByCount(carsList, count));
        return "cars";
    }
}
