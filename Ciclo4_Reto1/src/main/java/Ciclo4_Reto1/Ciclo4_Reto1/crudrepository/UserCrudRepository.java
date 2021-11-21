package Ciclo4_Reto1.Ciclo4_Reto1.crudrepository;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import Ciclo4_Reto1.Ciclo4_Reto1.model.User;

public interface UserCrudRepository extends CrudRepository <User, Integer>  {

    @Transactional(readOnly = true)
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword (String email, String password);

}



