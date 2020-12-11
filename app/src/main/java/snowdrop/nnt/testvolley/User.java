package snowdrop.nnt.testvolley;

public class User {
    private Object id;
    private String name;
//    private String phone;

    public User() {

    }

    public User(Object id, String name) {
        this.id = id;
        this.name = name;
//        this.phone = phone;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
