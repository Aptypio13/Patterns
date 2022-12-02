package org.example.Behavioral.Factory.BallonFactory.balloons.animal;

import org.example.Behavioral.Factory.BallonFactory.BallonsTypes.Balloon;
import org.example.Behavioral.Factory.BallonFactory.enums.Color;
public class SimpleBalloon extends Balloon {
    private Double price;

    public SimpleBalloon(Double price) {
        this.price = price;
    }

    public SimpleBalloon(Color color) {
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "SimpleBalloon{" +
                "price=" + price +
                " color=" + super.getColor() +
                '}';
    }
}
