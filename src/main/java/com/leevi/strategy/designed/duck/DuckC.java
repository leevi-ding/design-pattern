package com.leevi.strategy.designed.duck;

import com.leevi.strategy.designed.quack.QuackableC;
import com.leevi.strategy.designed.Duck;
import com.leevi.strategy.designed.Flyable;
import com.leevi.strategy.designed.Quackable;
import com.leevi.strategy.designed.fly.FlyableC;

public class DuckC implements Duck {

    private Flyable flyable;
    private Quackable quackable;

    public DuckC(){
        this.flyable = new FlyableC();
        this.quackable = new QuackableC();
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
