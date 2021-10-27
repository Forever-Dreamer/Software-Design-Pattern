package MoleFarm.common.product.tool;

import MoleFarm.common.product.AbstractTool;

public class Shovel extends AbstractTool {
    private final String name = "铲子";

    private Shovel() {
    }

    private static Shovel shovel = new Shovel();

    public static Shovel newInstance() {
        return shovel;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void ToolBehavior() {
        System.out.println("正在用" + name + "铲除作物...");
    }
}
