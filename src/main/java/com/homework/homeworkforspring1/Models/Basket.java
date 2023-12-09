package com.homework.homeworkforspring1.Models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@Scope("session")
public class Basket {
    private List<Integer> itemsCart = new ArrayList<>();

    public Basket(List<Integer> items) {
        this.itemsCart = items;
    }

    public List<Integer> getItemsCart() {
        return itemsCart;
    }

    public void add(List<Integer> id) {
        itemsCart.addAll(id);
    }

}
