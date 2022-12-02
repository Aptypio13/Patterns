package org.example.Behavioral.Factory.BallonFactory.balloons;

import org.example.Behavioral.Factory.BallonFactory.BallonsTypes.AnimalBalloon;
import org.example.Behavioral.Factory.BallonFactory.enums.AnimalType;
import org.example.Behavioral.Factory.BallonFactory.enums.Color;

public class ZebraBalloon extends AnimalBalloon {
    public ZebraBalloon(AnimalType animalType, Double price) {
        super(animalType, price);
    }

    public ZebraBalloon(Color color) {
        super(color);
    }

    @Override
    public String toString() {
        return "SimpleBalloon{" +
                "price=" + super.getPrice() +
                " color=" + super.getColor() +
                '}';
    }
}
