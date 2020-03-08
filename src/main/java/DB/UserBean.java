//package main.java.DB;
//
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "user")
//public class UserBean  implements Serializable {
//
//    private static final long serialVersionUID = -3009157732242241606L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private String id;
//
//    @Column(name = "Name")
//    private String name;
//
//    @Override
//    public String toString() {
//        return String.format("Employee[id=%d, nme='%s']", id, name);
//    }
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
//
//
