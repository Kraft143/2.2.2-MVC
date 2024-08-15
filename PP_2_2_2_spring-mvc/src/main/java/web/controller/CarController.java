package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	@Autowired
	CarService carService;

	@GetMapping(value = "/cars")
	public String printWelcome(@RequestParam(name = "count",defaultValue = "0") int count, ModelMap model) {
		List<String> messages = new ArrayList<>();
		List<Car> carsByCount = carService.getByCount(count);
		model.addAttribute("cars", carsByCount);
		return "car";
	}
	
}