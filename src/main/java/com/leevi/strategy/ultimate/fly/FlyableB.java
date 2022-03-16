package com.leevi.strategy.ultimate.fly;

import com.leevi.strategy.ultimate.Flyable;

public class FlyableB implements Flyable {
    @Override
    public void fly(){
        System.out.println("B fly .....");
    }
}
