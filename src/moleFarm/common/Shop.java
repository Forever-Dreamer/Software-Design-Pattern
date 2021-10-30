package moleFarm.common;

import moleFarm.Home;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.adapter.conc.MoleAdapter;

/**
 * 商店类
 * 仓库从商店买入种子、肥料
 * 仓库卖出作物到商店
 */
public class Shop {

    private MoleAdapter mole=MoleAdapter.getInstance();

    private MoleFarmWarehouse moleFarmWarehouse= mole.getFarmWarehouse();

    //关联商店与仓库
    private Shop() {
    }

    public static Shop getInstance() {
        return new Shop();
    }

    public boolean buySeeds(AbstractSeed seed, int num) {
        return moleFarmWarehouse.buySeeds(seed, num);
    }

    public boolean buyFertilizer(AbstractFertilizer fertilizer, int num) {
        return moleFarmWarehouse.buyFertilizer(fertilizer, num);
    }

    public boolean sellCrops(AbstractCrops crops, int num) {
        return moleFarmWarehouse.sellCrops(crops, num);
    }
}
