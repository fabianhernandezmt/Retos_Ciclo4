package Ciclo4_Reto1.Ciclo4_Reto1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Ciclo4_Reto1.Ciclo4_Reto1.model.User;
import Ciclo4_Reto1.Ciclo4_Reto1.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll(){
        return userRepository.getAll();
    }

    public Optional <User> getUser(int id){
        return userRepository.getUser(id);

    }

    //public Optional<User> getUserEmail(String email){
    //    return userRepository.getUserEmail(email);
    //}

    public Boolean getUserEmail(String email){
        User user = userRepository.getUserEmail(email);
        return user!= null;
    }



    public User save(User u){
        if(u.getId()==null){
            return userRepository.save(u);
        }else{
            Optional<User> uaux=userRepository.getUser(u.getId());
            if(uaux.isEmpty()){
                return userRepository.save(u);     
            }else{
                return u;
            }
        }



    }

    }

    


    

