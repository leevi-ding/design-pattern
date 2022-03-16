package com.leevi.strategy.designed.duck;

import com.leevi.strategy.designed.fly.FlyableA;
import com.leevi.strategy.designed.Duck;
import com.leevi.strategy.designed.Flyable;
import com.leevi.strategy.designed.Quackable;
import com.leevi.strategy.designed.quack.QuackableA;

public class DuckA implements Duck {

    private Flyable flyable;
    private Quackable quackable;

    public DuckA(){
        this.flyable = new FlyableA();
        this.quackable = new QuackableA();
    }

    @Override
    public void fly(){
        flyable.fly();
    }

    @Override
    public void quack(){
        quackable.quack();
    }
}
