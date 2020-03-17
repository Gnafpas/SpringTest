package main.java.CustomAnnotations;

/**
 * Created by George on 12/3/20.
 */
public class Object {

    @Annotations.JsonField
    private String id;
    @Annotations.JsonField
    private  String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
