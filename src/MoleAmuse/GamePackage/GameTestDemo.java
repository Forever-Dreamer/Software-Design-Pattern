package MoleAmuse.GamePackage;

import MoleAmuse.GamePackage.MementoPackage.RecordList;
import MoleAmuse.GamePackage.MementoPackage.ScoreOriginator;


public class GameTestDemo {

    public static void main(String[] args) {
        ScoreOriginator scoreOriginator = new ScoreOriginator();
        RecordList dartsRecordList = new RecordList();
        GameMaker gameMaker = new GameMaker();

        gameMaker.playTictactoe();
        scoreOriginator.setRecord(10,"五子棋游戏");
        dartsRecordList.add(scoreOriginator.saveRecordToMemento());
        System.out.println("\n当前游戏名称："+scoreOriginator.getName()+"\n当前分数为:"+scoreOriginator.getScore()+"\n");

        gameMaker.playCooking();
        scoreOriginator.setRecord(20,"做饭小游戏");
        dartsRecordList.add(scoreOriginator.saveRecordToMemento());
        System.out.println("\n当前游戏名称："+scoreOriginator.getName()+"\n当前分数为:"+scoreOriginator.getScore()+"\n");

        gameMaker.playRacing();
        scoreOriginator.setRecord(30,"赛车游戏");
        dartsRecordList.add(scoreOriginator.saveRecordToMemento());
        System.out.println("\n当前游戏名称："+scoreOriginator.getName()+"\n当前分数为:"+scoreOriginator.getScore()+"\n");

        System.out.println("\n开始打印得分备忘录内容...");
        for (int i=2;i>=0;i--) {
            dartsRecordList.get(i);
        }
    }
}