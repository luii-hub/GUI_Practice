package gui101;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionListener;

public class PokeDexGUI extends JFrame{
    private JButton addButton;
    private JButton clearButton;
    private JButton prevButton;
    private JButton nextButton;
    private  JLabel labelPokedex;

    private JTextField tfName;
    JTextArea taDesc;
    PokeDexGUI() {
        super("gui101.Pokedex");
        setLayout(new BorderLayout());

        //Set size of our Window
        setSize(450, 500);

        //Position of Init is Important kasi we should always code what we want to add before we show it
        init();

        //Explicitly set the visibility to true
        setVisible(true);

        //Prevent user from resizing
        setResizable(false);

        //Default: Hide the Frame, don't end the program, so we explicitly do this...
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // We add Layout elements/components here
    private void init(){

        //SOUTH PANEL
        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new FlowLayout());
        panelSouth.setBackground(Color.CYAN);

        //Button
        addButton = new JButton("Add");
        panelSouth.add(addButton);

        clearButton = new JButton("Clear");
        panelSouth.add(clearButton);

        this.add(panelSouth, BorderLayout.SOUTH);

        //NORTH PANEL
        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout());
        panelNorth.setBackground(Color.RED);

        //This could be anything
        labelPokedex = new JLabel("gui101.Pokedex");
        labelPokedex.setForeground(Color.white);
        labelPokedex.setFont(new Font("Verdana", Font.BOLD, 20));
        panelNorth.add(labelPokedex);

        this.add(panelNorth, BorderLayout.NORTH);

        // WEST PANEL
        JPanel panelWest = new JPanel();

        //Note FlowLayout is bad when we want to make things centered. We can explicitly try to pinpoint the correct pixels, but its bad practice
        panelWest.setLayout(new GridBagLayout());
        panelWest.setBackground(Color.decode("#DFDFDF"));
        prevButton = new JButton("<");
        panelWest.add(prevButton);

        /*     GridLayout           GridBagLayout
                [] [] []            [    ] [ ] []
                [] [] []            [] [   ] [  ]
                [] [] []            [] [  ] [   ]
         */
        this.add(panelWest, BorderLayout.WEST);

        // EAST PANEL
        JPanel panelEast = new JPanel();
        panelEast.setLayout(new GridBagLayout());
        panelEast.setBackground(Color.decode("#DFDFDF"));
        nextButton = new JButton(">");
        panelEast.add(nextButton);

        this.add(panelEast, BorderLayout.EAST);

        //CENTER PANEL
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.decode("#DFDFDF"));
        //Make padding
        panelCenter.setBorder(new EmptyBorder(10, 10, 10, 10));
        panelCenter.setLayout(new BorderLayout());

        //North Panel Inside Center panel
        JPanel centerNorth = new JPanel();
        centerNorth.setBackground(Color.decode("#DFDFDF"));

        JLabel pkmnName = new JLabel("gui101.Pokemon Name: ");
        pkmnName.setForeground(Color.decode("#0A285F"));
        centerNorth.add(pkmnName);

        tfName = new JTextField(20);
        centerNorth.add(tfName);

        panelCenter.add(centerNorth, BorderLayout.NORTH);

        //Notes by lui: may  bug ata dito so idk... (I assume its a visual bug)
        //Center Panel inside CENTER panel
        taDesc = new JTextArea();
        JScrollPane scroll = new JScrollPane(taDesc);

        panelCenter.add(scroll, BorderLayout.CENTER);

        this.add(panelCenter, BorderLayout.CENTER);

    }

    public void setActionListener(ActionListener listener){
        addButton.addActionListener(listener);
        clearButton.addActionListener(listener);
        prevButton.addActionListener(listener);
        nextButton.addActionListener(listener);
    }

    public void setDocumentListener(DocumentListener listener){
        tfName.getDocument().addDocumentListener(listener);
        taDesc.getDocument().addDocumentListener(listener);
    }

    public void setPokemonNumber(int currNum, int numPokemons){
        labelPokedex.setText("POKEDEX (gui101.Pokemon " + currNum + " of " + numPokemons + ")");
    }

    public void setPokemonDesc(){

    }
}
