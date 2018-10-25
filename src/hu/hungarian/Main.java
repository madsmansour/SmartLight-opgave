package hu.hungarian;


import javafx.scene.paint.Color;
import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        SmartLight s = new SmartLight();
        System.out.println(s.toString());


        SmartLight mads1 = new SmartLight();
        mads1.setColor(Color.BLACK);
        mads1.setLightPercent((short) 20);
        System.out.println(s.toString());

        SmartLight mads2 = new SmartLight();
        mads2.setColor(Color.RED);
        mads2.setLightPercent((short) (20));
        System.out.println(s.toString());


    }
}
