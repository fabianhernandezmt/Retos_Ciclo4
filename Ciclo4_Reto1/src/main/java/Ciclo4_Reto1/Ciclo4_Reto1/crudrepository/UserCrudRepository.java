package Ciclo4_Reto1.Ciclo4_Reto1.crudrepository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import Ciclo4_Reto1.Ciclo4_Reto1.model.User;

public interface UserCrudRepository extends CrudRepository <User, Integer>  {

    @Transactional(readOnly = true)
    User findByEmail(String email);


}



