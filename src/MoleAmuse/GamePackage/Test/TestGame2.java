package MoleAmuse.GamePackage.Test;

import MoleAmuse.GamePackage.*;
import MoleAmuse.GamePackage.MementoPackage.RecordList;
import MoleAmuse.GamePackage.MementoPackage.ScoreOriginator;

public class TestGame2 implements Game {
    @Override
    public void Play() {
        System.out.println("playing game2...");
        ScoreOriginator scoreOriginator = new ScoreOriginator();
        scoreOriginator.setRecord(100,"game2");
        RecordList.getInstance().add(scoreOriginator.saveRecordToMemento());
    }
}
