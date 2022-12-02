package org.example;

import org.example.Behavioral.Factory.BallonFactory.BalloonFactory;
import org.example.Behavioral.Factory.BallonFactory.enums.BalloonType;
import org.example.Behavioral.Factory.BallonFactory.enums.Color;
public class Main {
    public static void main(String[] args) {
        BalloonFactory balloonFactory = new BalloonFactory();
        System.out.println(balloonFactory.getBalloon(Color.WHITE, BalloonType.ANIMAL));
        System.out.println(balloonFactory.getBalloon(Color.WHITE, BalloonType.CIRCLE));

        System.out.println(balloonFactory.getBalloon(Color.BLACK, BalloonType.ANIMAL).getColor());
        System.out.println(balloonFactory.getBalloon(Color.BLACK, BalloonType.CIRCLE).getColor());

    }
}