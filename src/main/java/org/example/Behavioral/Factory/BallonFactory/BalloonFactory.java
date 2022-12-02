package org.example.Behavioral.Factory.BallonFactory;

import org.example.Behavioral.Factory.BallonFactory.BallonsTypes.Balloon;
import org.example.Behavioral.Factory.BallonFactory.balloons.animal.SimpleBalloon;
import org.example.Behavioral.Factory.BallonFactory.balloons.ZebraBalloon;
import org.example.Behavioral.Factory.BallonFactory.enums.AnimalType;
import org.example.Behavioral.Factory.BallonFactory.enums.BalloonType;
import org.example.Behavioral.Factory.BallonFactory.enums.Color;

import java.util.Random;

public class BalloonFactory {
    public Balloon getBalloon(Color color, BalloonType type) {
        Random random = new Random();
        return type == BalloonType.ANIMAL ?
                new ZebraBalloon(Color.values()[random.nextInt(Color.values().length)]) :
                new SimpleBalloon(color);
    }

    public Balloon getBalloon(Color color, BalloonType type, AnimalType animal) {
        Random random = new Random();
        return type == BalloonType.ANIMAL ?
                new ZebraBalloon(Color.values()[random.nextInt(Color.values().length)]) :
                new SimpleBalloon(color);
    }
}
