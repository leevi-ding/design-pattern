package com.leevi.strategy.ultimate.quack;

import com.leevi.strategy.ultimate.Quackable;

public class QuackableB implements Quackable {
    @Override
    public void quack(){
        System.out.println("B quack ....");
    }
}
