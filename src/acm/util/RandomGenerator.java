
package acm.util;

import java.awt.*;
import java.util.Random;

public class RandomGenerator extends Random {


    public RandomGenerator() {

    }


    public int nextInt(int n) {
        return nextInt(0, n - 1);
    }

    public boolean nextBoolean() {
        return nextBoolean(0.5);
    }

    public int nextInt(int low, int high) {
        return low + (int) ((high - low + 1) * nextDouble());
    }


    public double nextDouble(double low, double high) {
        return low + (high - low) * nextDouble();
    }

    public boolean nextBoolean(double p) {
        return nextDouble() < p;
    }


    public Color nextColor() {
        return new Color(nextInt(256), nextInt(256), nextInt(256));
    }


    public static RandomGenerator getInstance() {
        if (standardInstance == null) standardInstance = new RandomGenerator();
        return standardInstance;
    }


    private static RandomGenerator standardInstance;

}