package ru.pazik98.ZuzexTestTask.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "registration")
public class RegistrationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "house_id")
    @JsonProperty("house_id")
    private long house_id;

    @Column(name = "user_id")
    @JsonProperty("user_id")
    private long user_id;

    public RegistrationEntity() {
    }

    public RegistrationEntity(long house_id, long user_id) {
        this.house_id = house_id;
        this.user_id = user_id;
    }

    public RegistrationEntity(long id, long house_id, long user_id) {
        this.id = id;
        this.house_id = house_id;
        this.user_id = user_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getHouse_id() {
        return house_id;
    }

    public void setHouse_id(long house_id) {
        this.house_id = house_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }
}
