package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private Car car;

    public List<Car> listCars(String qnt) {
        int quantity;
        List<Car> cList = car.getCarsList();
        if (qnt == null) {
            return cList;
        }
        try {
            quantity = Integer.parseInt(qnt);
        }
        catch (Exception e) {
            quantity = cList.size();
        }
        List<Car> outList = cList.stream().limit(quantity).toList();
        return outList;
    }

}
