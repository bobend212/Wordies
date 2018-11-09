package gui.build;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {

    public static JButton testButton;
    ChooseData chooseData;


    public MyFrame() {


        //OKNO DIALOGOWE WYSWIETLANE PRZED URUCHOMIENIEM APLIKACJI
        //JOptionPane.showMessageDialog(null, "Pamietaj o wczytaniu slowek do Excela", "Witaj w Wordies", JOptionPane.INFORMATION_MESSAGE);

        //OKNA WCZYTUJACE SCIEZKE I NAZWE PLIKU
        //chooseData = new ChooseData();

        //TWORZENIE GLOWNEGO GUI



        createMainGUI();


    }

    public void createMainGUI() {

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }


        setTitle("Wordies 1.1.0 ©mk");
        setSize(500, 500);
        setLocation(620, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        MyPanel panel = new MyPanel();
        add(panel);

        ExcelArea excelArea = new ExcelArea();
        add(excelArea);


    }




}
