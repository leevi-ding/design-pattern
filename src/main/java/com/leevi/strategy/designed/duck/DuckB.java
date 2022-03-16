package com.leevi.strategy.designed.duck;

import com.leevi.strategy.designed.fly.FlyableB;
import com.leevi.strategy.designed.Duck;
import com.leevi.strategy.designed.Flyable;
import com.leevi.strategy.designed.Quackable;
import com.leevi.strategy.designed.quack.QuackableB;

public class DuckB implements Duck {

    private Flyable flyable;
    private Quackable quackable;

    public DuckB(){
        this.flyable = new FlyableB();
        this.quackable = new QuackableB();
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
