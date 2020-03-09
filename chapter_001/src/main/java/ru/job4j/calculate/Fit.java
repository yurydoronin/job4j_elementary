package ru.job4j.calculate;

/**
 * Class Fit, for counting an ideal weight.
 *
 * @author Yury Doronin (doronin.ltd@gmail.com)
 * @version 1.0
 * @since 04.03.2019
 */
public class Fit {

    /**
     * Method manWeight, counting an ideal weight of a man.
     *
     * @param height, man's height.
     * @return a perfect man's height.
     */
    public double manWeight(double height) {
        return (height - 100) * 1.15;
    }

    /**
     * Method womanWeight, counting an ideal weight of a woman.
     *
     * @param height, woman's height.
     * @return a perfect woman's height.
     */
    public double womanWeight(double height) {
        return (height - 110) * 1.15;
    }
}
