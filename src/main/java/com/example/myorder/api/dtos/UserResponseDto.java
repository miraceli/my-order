package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class UserResponseDto {

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.id=ID do Usuário")
    private String id;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.name=Nome")
    private String name;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.email=Email")
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.phone=Telefone")
    private String phone;

    @NotEmpty
    @ApiModelProperty(value = "$(User.create.address=Endereço")
    private String address;

    public String getId() {
        return id;
    }

    public UserResponseDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public UserResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResponseDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserResponseDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public UserResponseDto setAddress(String address) {
        this.address = address;
        return this;
    }
}
