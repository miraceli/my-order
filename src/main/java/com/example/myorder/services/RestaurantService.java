package com.example.myorder.services;

import com.example.myorder.api.dtos.CreateRestaurantDto;
import com.example.myorder.api.dtos.RestaurantResponseDto;
import com.example.myorder.entities.Restaurant;
import com.example.myorder.repositories.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    public void createRestaurant(CreateRestaurantDto createRestaurantDto) {

        Restaurant restaurant = new Restaurant()
                .setName(createRestaurantDto.getName())
                .setEmail(createRestaurantDto.getEmail())
                .setPhone(createRestaurantDto.getPhone());

        restaurantRepository.save(restaurant);
    }

    public RestaurantResponseDto getById(Integer id) {
        Optional<Restaurant> optional = restaurantRepository.findById(id);

        Restaurant restaurant = optional.get();
        return new RestaurantResponseDto()
                .setId(restaurant.getId())
                .setName(restaurant.getName())
                .setEmail(restaurant.getEmail())
                .setPhone(restaurant.getPhone());

    }

}
