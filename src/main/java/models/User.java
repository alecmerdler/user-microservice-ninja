package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by alec on 10/4/16.
 */

@Entity
public class User {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    Long id;

    private String username;
    private String email;

    public User() {
        this.username = "";
        this.email = "";
    }

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
