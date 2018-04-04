package com.visapps.cinemaonline.models;

/**
 * Created by Visek on 18.03.2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("actor")
    @Expose
    private String actor;
    @SerializedName("role")
    @Expose
    private String role;

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
