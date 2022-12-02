package gui101;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener; //Listens to text boxes, text fields, text documents
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;// Listens to Button

public class Controller implements ActionListener, DocumentListener {
    private PokeDexGUI gui;
    private Pokedex pokedex;

    public Controller(PokeDexGUI gui, Pokedex pokedex){
        this.gui = gui;
        this.pokedex = pokedex;

        gui.setActionListener(this);
        gui.setDocumentListener(this);


    }

    public void updateView(){
        gui.setPokemonNumber(pokedex.getCurrNum(), pokedex.getPokemons().length);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
