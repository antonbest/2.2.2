package web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servise.CarServise;


@Controller
public class CarController {


 private final CarServise carServise;

 public CarController(CarServise carServise){
     this.carServise=carServise;
 }

 @GetMapping("/cars")
    public String index(@RequestParam(value = "count", defaultValue = "5") Integer count, Model model){
     model.addAttribute("auto", carServise.get(count));
     return "cars";
 }




}
