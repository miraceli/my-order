package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

public class CreateRestaurantDto {

    @NotEmpty
    @ApiModelProperty(value = "Nome")
    private String name;

    @NotEmpty
    @ApiModelProperty(value = "Email")
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "Telefone")
    private String phone;

    @NotEmpty
    @ApiModelProperty(value = "Endereço")
    private String address;


    public String getName() {
        return name;
    }

    public CreateRestaurantDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateRestaurantDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public CreateRestaurantDto setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CreateRestaurantDto setAddress(String address) {
        this.address = address;
        return this;
    }
}
