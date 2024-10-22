package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String carsPage(HttpServletRequest request, ModelMap model) {
        Car car = new Car();
        List<Car> cList = car.getCarsList();
        if (request.getParameter("count") == null) {
            model.addAttribute("cars___", cList);
            return "cars";
        }
        int quantity = Integer.parseInt(request.getParameter("count"));
        List<Car> outList = cList.stream().limit(quantity).toList();
        model.addAttribute("cars___", outList);
        return "cars";
    }

}
