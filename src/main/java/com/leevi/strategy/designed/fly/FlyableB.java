package com.leevi.strategy.designed.fly;

import com.leevi.strategy.designed.Flyable;

public class FlyableB implements Flyable {
    @Override
    public void fly(){
        System.out.println("B fly .....");
    }
}
