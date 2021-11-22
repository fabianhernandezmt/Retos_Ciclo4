package Ciclo4_Reto1.Ciclo4_Reto1.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Ciclo4_Reto1.Ciclo4_Reto1.crudrepository.UserCrudRepository;
import Ciclo4_Reto1.Ciclo4_Reto1.model.User;


@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;
    
    public List<User> getAll(){
        return (List<User>) userCrudRepository.findAll();
    }

    public Optional <User> getUser(int id){
        return userCrudRepository.findById(id);
    }

    public User save(User u){
        return userCrudRepository.save(u);

    }

    public Boolean existeEmail(String email){
        Optional<User> usuario = userCrudRepository.findByEmail(email);

        return !usuario.isEmpty();
    }

    public Optional<User> autenticarUsuario(String email, String password){
        return userCrudRepository.findByEmailAndPassword(email, password);
    }

}
