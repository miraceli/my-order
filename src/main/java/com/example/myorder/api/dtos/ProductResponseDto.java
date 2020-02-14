package com.example.myorder.api.dtos;

import io.swagger.annotations.ApiModelProperty;

public class ProductResponseDto {

    @ApiModelProperty(value = "${product.response.name}")
    private String name;

    @ApiModelProperty(value = "${product.response.value}")
    private Double value;

    @ApiModelProperty(value = "${product.response.restaurant}")
    private RestaurantResponseDto restaurant;

    public String getName() {
        return name;
    }

    public ProductResponseDto setName(String name) {
        this.name = name;
        return this;
    }

    public Double getValue() {
        return value;
    }

    public ProductResponseDto setValue(Double value) {
        this.value = value;
        return this;
    }

    public RestaurantResponseDto getRestaurant() {
        return restaurant;
    }

    public ProductResponseDto setRestaurant(RestaurantResponseDto restaurant) {
        this.restaurant = restaurant;
        return this;
    }

}
