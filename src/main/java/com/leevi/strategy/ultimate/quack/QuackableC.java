package com.leevi.strategy.ultimate.quack;

import com.leevi.strategy.ultimate.Quackable;

public class QuackableC implements Quackable {
    @Override
    public void quack(){
        System.out.println("C quack ....");
    }
}
