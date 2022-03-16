package com.leevi.strategy.ultimate;

import com.leevi.strategy.ultimate.fly.FlyableA;
import com.leevi.strategy.ultimate.fly.FlyableC;
import com.leevi.strategy.ultimate.quack.QuackableC;
import com.leevi.strategy.ultimate.fly.FlyableB;
import com.leevi.strategy.ultimate.quack.QuackableA;
import com.leevi.strategy.ultimate.quack.QuackableB;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(
            DuckFactory.createDuck(new FlyableA(),new QuackableA()),
            DuckFactory.createDuck(new FlyableB(),new QuackableB()),
            DuckFactory.createDuck(new FlyableC(),new QuackableC())
        );
        ducks.forEach(Duck::fly);
        ducks.forEach(Duck::quack);
    }
}
