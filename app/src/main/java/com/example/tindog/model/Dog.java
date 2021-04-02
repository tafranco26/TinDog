package com.example.tindog.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dog {
    @PrimaryKey
    @NonNull
    private String id;
    private String name;
    private String race;
    private String ownersPhone;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public String getOwnersPhone() {
        return ownersPhone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setOwnersPhone(String ownersPhone) {
        this.ownersPhone = ownersPhone;
    }
}
