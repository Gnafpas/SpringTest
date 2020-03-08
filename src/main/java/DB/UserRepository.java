package main.java.DB;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


//@Repository
//public interface UserRepository<U> extends CrudRepository<UserBean, Long>{
//    List findByLastName(String lastName);
//    @Query("SELECT e FROM Employee e WHERE e.age = :age")
//    public List findByAge(@Param("age") int age);
//}
