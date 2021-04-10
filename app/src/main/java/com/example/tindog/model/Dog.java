package com.example.tindog.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Dog {
    @PrimaryKey
    @NonNull
    public String id;
    public String dogName;
    public String race;
    public int dogAge;
    public String dogImgUrl;
    public String ownerName;
    public String ownersPhone;

    public Dog(){
        this.id = "";
        this.dogName = "";
        this.race = "";
        this.dogImgUrl = "";
        this.ownerName = "";
        this.ownersPhone = "";
    }

    public Dog( @NonNull String id, String dogName, String race, int dogAge, String dogImgUrl, String ownerName, String ownersPhone){
        this.id = id;
        this.dogName = dogName;
        this.race = race;
        this.dogAge = dogAge;
        this.dogImgUrl = dogImgUrl;
        this.ownerName = ownerName;
        this.ownersPhone = ownersPhone;

    }



//******geters*****//
    public String getId() {
        return id;
    }

    public String getDogName() { return dogName; }

    public String getRace() {
        return race;
    }

    public int getdogAge() {
        return dogAge;
    }

    public String getdogImgUrl() { return dogImgUrl; }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnersPhone() {
        return ownersPhone;
    }

    //******seters*****//


    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.dogName = name;
    }

    public void setRace(String race) { this.race = race; }

    public void setdogAge(int dogAge) {this.dogAge= dogAge;}

    public void setdogImgUrl(String recipeImgUrl) { this.dogImgUrl = recipeImgUrl; }


    public void setownerName(String ownerName) {this.ownerName= ownerName;}


    public void setOwnersPhone(String ownersPhone) {
        this.ownersPhone = ownersPhone;
    }


}
