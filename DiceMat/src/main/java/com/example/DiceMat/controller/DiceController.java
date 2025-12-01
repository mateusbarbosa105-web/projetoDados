package com.example.DiceMat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Random;

@Controller
public class DiceController {

    private final Random random = new Random();

    @GetMapping("/")
    public String index(@RequestParam(value = "username", required = false) String username, Model model) {
        model.addAttribute("username", username);
        return "index";
    }

    @GetMapping("/roll")
    public String rollDice(@RequestParam(value = "username", required = false) String username,Model model) {
    model.addAttribute("username", username);
    int diceNumber = random.nextInt(6) + 1;
    model.addAttribute("diceNumber", diceNumber);
    int diceNumber2 = random.nextInt(6) + 1;
    model.addAttribute("diceNumber2", diceNumber2);
    return "index";
}
}