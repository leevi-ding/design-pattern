package com.leevi.strategy.designed.quack;

import com.leevi.strategy.designed.Quackable;

public class QuackableB implements Quackable {
    @Override
    public void quack(){
        System.out.println("B quack ....");
    }
}
