
package com.example.domain.response.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.processing.Generated;

@Generated("jsonschema2pojo")
public class VersionDetail {

    @SerializedName("rarity")
    @Expose
    private Integer rarity;
    @SerializedName("version")
    @Expose
    private Version version;

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

}
