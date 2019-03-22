package MainThread;

import View.MenuCreator;
import View.MenuCategory;

public class MainThread {
    public static void main (String[] args) {
        MenuCreator menuCreator = new MenuCreator();
        menuCreator.createMenu();
        MenuCategory menuCategory = new MenuCategory();
        menuCategory.createCategory();
    }
}
