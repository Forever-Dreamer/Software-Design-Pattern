package MoleFarm.pattern.abstractFactory.conc;

import MoleFarm.common.exception.factory.FactoryNotFoundException;
import MoleFarm.common.exception.product.FactoryNotProduceException;
import MoleFarm.common.exception.product.conc.CropsNotFoundException;
import MoleFarm.common.exception.product.conc.FertilizerNotFoundException;
import MoleFarm.common.exception.product.conc.SeedNotFoundException;
import MoleFarm.common.exception.product.conc.ToolNotFoundException;
import MoleFarm.common.product.AbstractCrops;
import MoleFarm.common.product.AbstractFertilizer;
import MoleFarm.common.product.AbstractSeed;
import MoleFarm.common.product.AbstractTool;
import MoleFarm.pattern.abstractFactory.IFactory;
import MoleFarm.pattern.factory.conc.CropsFactory;
import MoleFarm.pattern.factory.conc.FertilizerFactory;
import MoleFarm.pattern.factory.conc.SeedFactory;
import MoleFarm.pattern.factory.conc.ToolFactory;

import java.util.Arrays;
import java.util.List;

/**
 * 具体生产种子，肥料，农具的工厂
 * 生产白菜、草莓、水稻的作物及种子
 * 生产高级肥料
 * 生产水壶和镰刀
 * 此类生产产品去moleFarm.pattern.factory.conc下的对应工厂调用方法
 */
public class ConcreteFactory1 implements IFactory {
    private final List<String> cropsList = Arrays.asList("Cabbage", "Strawberry", "Rice");
    private final List<String> seedList = Arrays.asList("CabbageSeed", "StrawberrySeed", "RiceSeed");
    private final List<String> fertilizerList = Arrays.asList("AdvancedFertilizer");
    private final List<String> toolList = Arrays.asList("WateringCan", "Sick");
    private final CropsFactory cropsFactory = CropsFactory.newInstance();
    private final SeedFactory seedFactory = SeedFactory.newInstance();
    private final FertilizerFactory fertilizerFactory = FertilizerFactory.newInstance();
    private final ToolFactory toolFactory = ToolFactory.newInstance();

    public static ConcreteFactory1 newInstance() throws FactoryNotFoundException {
        return IFactory.newConcreteFactory("ConcreteFactory1");
    }

    @Override
    public AbstractCrops createCrops(String name) throws FactoryNotProduceException {
        if (cropsList.contains(name)) {
            try {
                return cropsFactory.create(name);
            } catch (CropsNotFoundException e) {
                e.printStackTrace();
            }
        }
        throw new FactoryNotProduceException("此工厂不生产该作物");
    }

    @Override
    public AbstractSeed createSeed(String name) throws FactoryNotProduceException {
        if (seedList.contains(name)) {
            try {
                return seedFactory.create(name);
            } catch (SeedNotFoundException e) {
                e.printStackTrace();
            }
        }
        throw new FactoryNotProduceException("此工厂不生产该种子");
    }

    @Override
    public AbstractFertilizer createFertilier(String name) throws FactoryNotProduceException {
        if (fertilizerList.contains(name)) {
            try {
                return fertilizerFactory.create(name);
            } catch (FertilizerNotFoundException e) {
                e.printStackTrace();
            }
        }
        throw new FactoryNotProduceException("此工厂不生产该肥料");
    }

    @Override
    public AbstractTool createTool(String name) throws FactoryNotProduceException {
        if (toolList.contains(name)) {
            try {
                return toolFactory.create(name);
            } catch (ToolNotFoundException e) {
                e.printStackTrace();
            }
        }
        throw new FactoryNotProduceException("此工厂不生产该工具");
    }
}
