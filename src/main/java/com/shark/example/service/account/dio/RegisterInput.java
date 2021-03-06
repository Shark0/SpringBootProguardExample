package com.shark.example.service.account.dio;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
public class RegisterInput implements Serializable {
    @NotEmpty
    @ApiModelProperty(value = "帳號", required = true)
    @JsonProperty("account")
    @SerializedName("account")
    private String account;

    @NotEmpty
    @ApiModelProperty(value = "姓名", required = true)
    @JsonProperty("name")
    @SerializedName("name")
    private String name;

    @NotEmpty
    @ApiModelProperty(value = "密碼", required = true)
    @JsonProperty("password")
    @SerializedName("password")
    private String password;
}
