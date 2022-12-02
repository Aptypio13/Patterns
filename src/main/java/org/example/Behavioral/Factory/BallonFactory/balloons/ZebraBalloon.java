package org.example.Behavioral.Factory.BallonFactory.balloons;

import org.example.Behavioral.Factory.BallonFactory.BallonsTypes.AnimalBalloon;
import org.example.Behavioral.Factory.BallonFactory.enums.Color;

public class ZebraBalloon extends AnimalBalloon {
    public ZebraBalloon(Color color) {
        super.setColor(color);
    }
    @Override
    public String toString() {
        return "SimpleBalloon{" +
                "price=" + super.getPrice() +
                " color=" + super.getColor() +
                '}';
    }
}
