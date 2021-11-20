package Ciclo4_Reto1.Ciclo4_Reto1.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import Ciclo4_Reto1.Ciclo4_Reto1.model.User;
import Ciclo4_Reto1.Ciclo4_Reto1.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getAll();
    }



    @GetMapping("/{email}")
    public boolean getUserEmail(@PathVariable("email") String email){
        return userService.getUserEmail(email);
    }



    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public User save(@RequestBody User u){
        return userService.save(u);
    }


}
