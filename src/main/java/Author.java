import java.io.Serializable;

public class Author implements Serializable {
    private String firstName;
    private String lastName;

    public Author() { };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
