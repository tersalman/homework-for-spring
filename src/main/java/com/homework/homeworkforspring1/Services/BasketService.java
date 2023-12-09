package com.homework.homeworkforspring1.Services;

import com.homework.homeworkforspring1.Models.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BasketService {
    void addItems (List<Integer> id);
    List<Integer> get();
}
