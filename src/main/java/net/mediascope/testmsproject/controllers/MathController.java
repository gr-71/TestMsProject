package net.mediascope.testmsproject.controllers;

import net.mediascope.testmsproject.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("math")
public class MathController {

    private final MathService mathService;

    @Autowired
    public MathController(MathService mathService) {
        this.mathService = mathService;
    }

    @GetMapping("/get_fibo")
    public String getFibonachiForUser(
            @RequestParam(value = "name") String userName,
            @RequestParam(value = "number") Integer fibonachiNumber
    ){
        return mathService.getFibonachiForUser(userName, fibonachiNumber);
    }
}
