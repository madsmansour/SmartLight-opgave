package hu.hungarian;

import javafx.scene.paint.Color;

public class SmartLight {

    private short lightPercent;
    private Color color;

    public SmartLight() {
        color = Color.WHITESMOKE;
        lightPercent = 0;
    }
    public void turnUp(){
        lightPercent += 20;
        if (lightPercent > 100)
            lightPercent = 100;
    }

    public void turnDown(){
        lightPercent -= 20;
        if (lightPercent < 0)
            lightPercent = 0;

    }
    public String toString(){
        return "The color of the smartlight is: " + getColor() + "And the lightpercent is at: " + getLightPercent();
    }

    public short getLightPercent() {
        return lightPercent;
    }

    public void setLightPercent(short lightPercent) {
        if (lightPercent > 100 )
            lightPercent = 100;
        if (lightPercent < 0)
            lightPercent = 0;
        this.lightPercent = lightPercent;

    }

    public Color getColor() {
        if (color == Color.BLACK);
        color = color.WHITESMOKE;
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
