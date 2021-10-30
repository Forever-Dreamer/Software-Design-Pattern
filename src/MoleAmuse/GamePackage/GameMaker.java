package MoleAmuse.GamePackage;

import MoleAmuse.GamePackage.CookingPackage.Cooking;
import MoleAmuse.GamePackage.Test.TestGame1;
import MoleAmuse.GamePackage.Test.TestGame2;
import MoleAmuse.GamePackage.RacingPackage.Racing;
import MoleAmuse.GamePackage.TictactoePackage.Tictactoe;


//外观模式
public class GameMaker {

    private Game tictactoe;
    private Game cooking;
    private Game racing;

    /**
     * 测试用例
     */
    private Game testGame1;
    private Game testGame2;


    private static GameMaker instance=new GameMaker();
    public static GameMaker getInstance(){return instance;}
    public GameMaker() {
        tictactoe = new Tictactoe();
        cooking = new Cooking();
        racing = new Racing();

        //测试
        testGame1 = new TestGame1();
        testGame2 = new TestGame2();
    }

    //井字棋游戏接口
    public void playTictactoe(){
        tictactoe.Play();
    }

    //做菜游戏接口
    public void playCooking(){
        cooking.Play();
    }

    //赛车游戏接口
    public void playRacing(){
        racing.Play();
    }


    /**
     * 测试用例
     */
    public void playtestGame1(){
        testGame1.Play();
    }
    public void playtestGame2(){
        testGame2.Play();
    }


}

