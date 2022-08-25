package projects.java.register;

import javax.persistence.*;

@Entity
@Table
public class Register {

    @Id
    @SequenceGenerator(
            name = "register_sequence",
            sequenceName = "register_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "register_sequence"
    )
    private Long id;
    private String name;
    private String address;
    private String email;
    private String password;
    private String course;

    public Register() {
    }

    public Register(Long id, String name, String address, String email, String password, String course) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.password = password;
        this.course = course;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
