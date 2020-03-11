package main.java.DB;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository<U> extends CrudRepository<UserBean, Long> {
    List findByName(String name);
    /**
     * @param id
     * @return
     */
    @Query(value = "SELECT * FROM user u WHERE " +
            "u.id = :id",
            nativeQuery = true
    )
    List<UserBean> custom(@Param("id") long id);


    List < UserBean > findBynameCustom(String name);


}

