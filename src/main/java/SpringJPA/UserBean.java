package main.java.SpringJPA;


import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "user")
@NamedQuery(name = "UserBean.findBynameCustom", query = "select u from UserBean u where u.name = ?1")
public class UserBean  implements Serializable {

    private static final long serialVersionUID = -3009157732242241606L;
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Override
    public String toString() {
        return String.format("Employee[id=%d, nme='%s']", id, name);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


