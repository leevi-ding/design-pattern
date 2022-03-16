package com.leevi.strategy.designed.fly;

import com.leevi.strategy.designed.Flyable;

public class FlyableC implements Flyable {
    @Override
    public void fly(){
        System.out.println("C fly .....");
    }
}
