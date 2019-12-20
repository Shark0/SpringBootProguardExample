package com.shark.example.service.account.dio;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class RegisterInput implements Serializable {
    @ApiModelProperty(value = "帳號", required = true)
    @JsonProperty("account")
    @SerializedName("account")
    private String account;

    @ApiModelProperty(value = "姓名", required = true)
    @JsonProperty("name")
    @SerializedName("name")
    private String name;

    @ApiModelProperty(value = "密碼")
    @JsonProperty("password")
    @SerializedName("password")
    private String password;
}
