package com.leevi.strategy.designed.quack;

import com.leevi.strategy.designed.Quackable;

public class QuackableC implements Quackable {
    @Override
    public void quack(){
        System.out.println("C quack ....");
    }
}
