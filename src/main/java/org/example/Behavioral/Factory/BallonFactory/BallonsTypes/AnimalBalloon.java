package org.example.Behavioral.Factory.BallonFactory.BallonsTypes;

import org.example.Behavioral.Factory.BallonFactory.enums.AnimalType;
import org.example.Behavioral.Factory.BallonFactory.enums.Color;
public class AnimalBalloon extends Balloon {
    private AnimalType animalType;
    private Double price ;

    public AnimalBalloon(AnimalType animalType) {
        this.animalType = animalType;
    }

    public AnimalBalloon(AnimalType animalType, Double price) {
        this.animalType = animalType;
        this.price = price;
    }

    public AnimalBalloon(Color color) {
        super.setColor(color);
    }

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
