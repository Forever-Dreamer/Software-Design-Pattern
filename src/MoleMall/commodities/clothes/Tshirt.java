package MoleMall.commodities.clothes;

import MoleMall.abstractFactory.AbstractClothes;
import MoleMall.bridge.ClothesColor;
import MoleMall.visitor.ClothesVisitor;

public class Tshirt extends AbstractClothes {

    protected ClothesColor color;

    public void setColor(ClothesColor color)
    {
        this.color = color;
    }

    public Tshirt()
    {
        this.item="衬衫";
        this.color=null;
        this.style="nbber";
        this.price=70.0;
    }

    public  Tshirt(ClothesColor color, Double price)
    {
        this.item="衬衫";
        this.style="nbber";
        this.price=price;
        setColor(color);
    }
    public Double getPrice() {
        return price;
    }
    public String getItem() {
        return item;
    }
    @Override
    public void Purchase() {
        System.out.printf("You have bought a "+this.color.color+" "+this.item);
    }

    @Override
    public void transfer() {
        System.out.printf("You have transferred a "+this.color.color+" "+this.item);
    }

    @Override
    public void accept(ClothesVisitor clothesVisitor) {
        clothesVisitor.visit(this);
    }
}
