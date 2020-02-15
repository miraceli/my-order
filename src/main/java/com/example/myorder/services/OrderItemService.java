package com.example.myorder.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myorder.api.dtos.OrderItemDto;
import com.example.myorder.entities.Order;
import com.example.myorder.entities.OrderItem;
import com.example.myorder.entities.Product;
import com.example.myorder.repositories.OrderItemRepository;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private ProductService productService;

    public List<OrderItem> createOrderItens(List<OrderItemDto> itens, Order order) {
        return itens.stream()
                .map(orderItemDto -> buildOrderItem(orderItemDto, order))
                .collect(Collectors.toList());
    }

    private OrderItem buildOrderItem(OrderItemDto orderItemDto, Order order) {
        return new OrderItem()
                .setProduct(productService.findById(orderItemDto.getProductId()))
                .setOrder(order)
                .setQuantity(orderItemDto.getQuantity());
    }

    private Product find(List<Integer> productsId) {
    return null;
    }
}