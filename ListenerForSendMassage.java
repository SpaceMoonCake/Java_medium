package HomeWork04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerForSendMassage implements ActionListener {

    private JTextField textFieldForTypeMassage;
    private JPanel panelForAlreadySentMassages;
    private JPanel panelAllChat;


    public ListenerForSendMassage (JTextField textFieldForTypeMassage, JPanel panelForAlreadySentMassages, JPanel panelAllChat) {
        this.panelAllChat = panelAllChat;
        this.panelForAlreadySentMassages = panelForAlreadySentMassages;
        this.textFieldForTypeMassage = textFieldForTypeMassage;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(!textFieldForTypeMassage.getText().equals("")){
            panelForAlreadySentMassages.add(panelForSendingMassage(textFieldForTypeMassage.getText()));
            textFieldForTypeMassage.setText("");
            panelAllChat.revalidate();
        }
    }

    private JPanel panelForSendingMassage(String textSendingMassage){
        JPanel panelForSendingMassage = new JPanel();
        panelForSendingMassage.setBackground(Color.ORANGE);
        panelForSendingMassage.setPreferredSize(new Dimension(448 / 2, 800 / 10));
        JLabel labelTextSendingMassage = new JLabel(textSendingMassage);
        panelForSendingMassage.add(labelTextSendingMassage);
        return panelForSendingMassage;
    }
}
