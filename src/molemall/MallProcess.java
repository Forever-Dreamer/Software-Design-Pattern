package molemall;
//import MoleMall.abstractFactory.CommodityFood;

import molemall.shops.ClothesShop;
import molemall.shops.FoodShop;
import molemall.utils.JsonUtils;
import java.util.*;


public class MallProcess {
    //服装店
    private ClothesShop clothesShop=ClothesShop.newInstance();
    //食品店
    private FoodShop foodShop=FoodShop.newInstance();

    private static final Map<String, String> map = JsonUtils.searchMapper();

    private MallProcess() {
    }

    private static volatile MallProcess mallProcess = new MallProcess();

    public static synchronized MallProcess newInstance() {
        return mallProcess;
    }

    /**
     * 商场总进程
     */
    public void process() {
        ClothesShop clothesShop = ClothesShop.newInstance();

        System.out.println("欢迎来到商场！");

        while(true){
            System.out.println("\n请选择你要进入的商店：1——服装店，2——食品店，0——游戏首页");
            Scanner input=new Scanner(System.in);
            int shopSelect = input.nextInt();
            if(shopSelect==1){
                System.out.println("欢迎进入服装店！");
                System.out.println("服装店售卖情况如下：\n");
                clothesShop.showClothesShop();
                System.out.println("\n是否要按价格筛选商品？(按y筛选)");
                String judge = input.next();
                if (judge.equals("y")) {
                    System.out.println("请输入最低价格：");
                    double start_price = input.nextDouble();
                    System.out.println("请输入最高价格：");
                    double end_price = input.nextDouble();
                    clothesShop.filterClothes(start_price,end_price);
                }
                while(true) {
                    while(true){
                    System.out.println("\n请输入你想要选择的服装名称");
                    String clothesName = input.next();
                    List<String> clo=Arrays.asList("夹克", "衬衫", "牛仔裤", "短裤");
                    if(clo.contains(clothesName)){
                        clothesShop.createClothes(clothesName);
                        break;
                    }}
                    System.out.println("你还要继续逛服装店吗?(按y继续)");
                    String in = input.next();
                    if (in.equals("y")) {
                        continue;
                    }
                    else {
                        break;
                    }
                }
                clothesShop.checkout();//结账
            }
            else if(shopSelect==2){

                System.out.println("欢迎进入食品店！");
                foodShop.showFoodShop();
                while(true) {
                    while(true){
                        System.out.println("\n请输入你想要选择的食品名称");
                        String foodName = input.next();
                        List<String> clo=Arrays.asList("汉堡", "苏打水", "西瓜");
                        if(clo.contains(foodName)){
                            foodShop.createFood(foodName);
                            break;
                        }
                        else System.out.println("没有找到该食品哦");
                    }
                    System.out.println("你还要继续逛食品店吗?(按y继续)");
                    String in = input.next();
                    if (in.equals("y")) {
                        continue;
                    }
                    else {
                        break;
                    }
                }
                foodShop.checkout();//结账
            }
            else if(shopSelect==0){

            }
            else {
                continue;
            }
        }

    }

    public static void main(String[] args){//测试用
        MallProcess mallProcess = MallProcess.newInstance();
        mallProcess.process();
        return;
    }
}
