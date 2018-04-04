package com.visapps.cinemaonline.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Visek on 12.03.2018.
 */

public class Auth {

    @SerializedName("success")
    @Expose
    private Boolean success;
    @SerializedName("roles")
    @Expose
    private List<String> roles = null;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
