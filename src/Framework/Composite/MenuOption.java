package Framework.Composite;

import Framework.Composite.Component;
import Framework.Composite.Menu;

import java.util.ArrayList;

public class MenuOption extends Component {
    // 菜单操作类

    private String name;
    private Menu lastMenu;

    public MenuOption(String name) {
        this.name = name;
        this.lastMenu = null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(Component... component) {
        super.add(component);
    }

    @Override
    public Menu getLast() {
        return lastMenu.getLast();
    }


    @Override
    public void printMenu() {
        super.printMenu();
    }

    @Override
    public void setLastMenu(Menu lastMenu) {
        this.lastMenu = lastMenu;
    }

    @Override
    public ArrayList<Component> getMenu() {
        return null;
    }

}