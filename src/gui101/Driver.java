package gui101;

import gui101.Controller;
import gui101.Pokedex;

public class Driver {
    public static void main(String[] args) {

        PokeDexGUI gui = new PokeDexGUI();
        Pokedex model = new Pokedex(926);
        Controller controller = new Controller(gui, model);
    }

}
