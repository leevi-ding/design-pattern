package com.leevi.strategy.ultimate.fly;

import com.leevi.strategy.ultimate.Flyable;

public class FlyableA implements Flyable {
    @Override
    public void fly(){
        System.out.println("A fly .....");
    }
}
