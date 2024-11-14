package com.dmarangoni;

import akka.actor.typed.ActorSystem;

public class AkkaBigPrimes {
    public static void main(String[] args) {

        ActorSystem<String> actorSystem = ActorSystem.create(FirstSimpleBehavior.create(), "FirstActorSystem");

        actorSystem.tell("Hello World");
        actorSystem.tell("Other message");

    }
}