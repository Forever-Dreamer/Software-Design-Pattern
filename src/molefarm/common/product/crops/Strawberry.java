package molefarm.common.product.crops;

import molefarm.common.product.AbstractCrops;
import molefarm.common.status.product.Color;
import molefarm.common.status.product.Size;

/**
 * ่่๐
 */
public class Strawberry extends AbstractCrops implements Cloneable {
    /**
     * ๅๅญ
     */
    private final String name = "่่\uD83C\uDF53";
    /**
     * ้ข่ฒ
     */
    private final Color color = Color.RED;
    /**
     * ๅคงๅฐ
     */
    private final Size size = Size.MEDIUM;
    /**
     * ไปทๆ ผ
     */
    private final Double price = 15.0;

    public Strawberry() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public Size getSize() {
        return size;
    }

    @Override
    public Double getPrice() {
        return price;
    }

}
