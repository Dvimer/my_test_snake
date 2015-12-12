package demix.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame {
    private int countClick=0;
    private int;
    private Button myButton;
    private Label myText;

    public Main(){
        super("Первая программа");
        setSize(800, 800);
        myButton = new Button("Hello");
        myText = new Label("Hello World "+countClick);
        add(myText, BorderLayout.NORTH);
        add(myButton, BorderLayout.SOUTH);

        myButton.addActionListener(new ActionListener() {
                                       @Override
                                       public void actionPerformed(ActionEvent e) {
                                           countClick++;
                                           myText.setText("Hello World " + countClick);
                                       }
                                   }
        );
    }

    public static void main(String[] args) {




        Main myProgram = new Main();
        myProgram.setVisible(true);


        myProgram.addWindowListener(new WindowAdapter() {
                                        @Override
                                        public void windowClosing(WindowEvent e) {
                                            super.windowClosing(e);
                                            e.getWindow().dispose();
                                        }
                                    }
        );
    }


}
