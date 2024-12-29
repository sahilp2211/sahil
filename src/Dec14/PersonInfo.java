package Dec14;

public class PersonInfo {
    String name;
    String email;
    String number;

    public String info(String name) {
        return name;
    }

    public String info(String name, String email) {
        return name + " " + email;
    }

    public String info(String name, String email, String number) {
        return name + " " + email + number;
    }
}