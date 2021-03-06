
package com.example.domain.response.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class RedBlue {

    @SerializedName("back_default")
    @Expose
    private String backDefault;
    @SerializedName("back_gray")
    @Expose
    private String backGray;
    @SerializedName("front_default")
    @Expose
    private String frontDefault;
    @SerializedName("front_gray")
    @Expose
    private String frontGray;

    public String getBackDefault() {
        return backDefault;
    }

    public void setBackDefault(String backDefault) {
        this.backDefault = backDefault;
    }

    public String getBackGray() {
        return backGray;
    }

    public void setBackGray(String backGray) {
        this.backGray = backGray;
    }

    public String getFrontDefault() {
        return frontDefault;
    }

    public void setFrontDefault(String frontDefault) {
        this.frontDefault = frontDefault;
    }

    public String getFrontGray() {
        return frontGray;
    }

    public void setFrontGray(String frontGray) {
        this.frontGray = frontGray;
    }

}
