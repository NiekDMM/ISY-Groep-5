import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Startscherm extends JFram{
    private char gekozenSymbool = 'X';

    public Startscherm(){
        setTitle("Tic Tac Toe - Startscherm")
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }
}