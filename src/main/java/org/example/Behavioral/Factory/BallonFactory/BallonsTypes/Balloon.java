package org.example.Behavioral.Factory.BallonFactory.BallonsTypes;

import org.example.Behavioral.Factory.BallonFactory.enums.Color;
public abstract class Balloon {
    private Color color;
    private Double price;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
