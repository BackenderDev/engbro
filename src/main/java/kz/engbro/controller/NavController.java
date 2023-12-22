package kz.engbro.controller;

import kz.engbro.entity.enumuration.Level;
import kz.engbro.entity.model.User;
import kz.engbro.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/nav")
public class NavController {
    private final AuthService authService;

    @Autowired
    public NavController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping
    public String navList() {
        return "navList";
    }

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> navMenu(@RequestBody String sum){
        System.out.println("sum: " + sum);
        User user = AuthService.USER;
//        int s = Integer.valueOf(sum);
//        if(s >= 13){
//            user.setLevel(Level.ADVANCED);
//        } else if (s > 10){
//            user.setLevel(Level.INTERMEDIATE);
//        } else if (s > 6){
//            user.setLevel(Level.ELEMENTARY);
//        } else if (s > 3){
//            user.setLevel(Level.BEGINNER);
//        }
        String jsonResponse = "{\"message\": \"Уровень пользователя обновлен\", \"level\": \"" + "asas" + "\"}";

        // Возвращаем JSON-строку и статус OK
        return new ResponseEntity<>(jsonResponse, HttpStatus.OK);
    }
}