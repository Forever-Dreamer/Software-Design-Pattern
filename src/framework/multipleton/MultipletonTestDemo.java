package framework.multipleton;

public class MultipletonTestDemo {
    public static void main(String[] args) {


        String zone1 = ManorZones.getInstance("moleamuse").toString();
        String zone2 = ManorZones.getInstance("MoleFarm").toString();
        String zone3 = ManorZones.getInstance("molemall").toString();
        String zone4 = ManorZones.getInstance("Chatroom").toString();

        System.out.println("游乐园的分区包括：" + zone1 + "," + zone2 + "," + zone3 + "," + zone4);

        ManorZones zone5 = ManorZones.getInstance("a");

    }

}