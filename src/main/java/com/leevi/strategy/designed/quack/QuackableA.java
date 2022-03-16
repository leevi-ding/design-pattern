package com.leevi.strategy.designed.quack;

import com.leevi.strategy.designed.Quackable;

public class QuackableA implements Quackable {
    @Override
    public void quack(){
        System.out.println("A quack ....");
    }
}
