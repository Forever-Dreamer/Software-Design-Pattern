package chatroom;

import framework.simplefactory.Mole;
import framework.simplefactory.MoleFactory;

public class MediatorTestDemo {
    public static void main(String[] args) {
        MoleFactory moleFactory = new MoleFactory();
        Mole mole1 = moleFactory.createMole("Momo", "Red");
        Mole mole2 = moleFactory.createMole("Molele", "Red");
        Chatroom chatroom = Chatroom.getInstance();
        chatroom.addMessage(mole1.getMoleName(), "你好");
        chatroom.addMessage(mole2.getMoleName(), "小摩尔");
        chatroom.showMessage();
    }

}
