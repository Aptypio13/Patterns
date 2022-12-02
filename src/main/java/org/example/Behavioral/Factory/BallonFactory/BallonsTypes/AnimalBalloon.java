package org.example.Behavioral.Factory.BallonFactory.BallonsTypes;

import org.example.Behavioral.Factory.BallonFactory.enums.AnimalType;
public class AnimalBalloon extends Balloon {
    private AnimalType animalType;
    private final Double price = 10.0;

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
