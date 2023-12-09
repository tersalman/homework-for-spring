package com.homework.homeworkforspring1.Services;

import com.homework.homeworkforspring1.Models.Basket;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketServiceImpl implements BasketService{
    private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void addItems(List<Integer> id) {
        basket.add(id);
    }

    @Override
    public List<Integer> get() {
        return basket.getItemsCart();
    }
}
