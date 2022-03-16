package com.leevi.strategy.ultimate.quack;

import com.leevi.strategy.ultimate.Quackable;

public class QuackableA implements Quackable {
    @Override
    public void quack(){
        System.out.println("A quack ....");
    }
}
