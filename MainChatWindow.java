package HomeWork04;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class MainChatWindow extends JFrame {

    private static final int CHAT_WINDOW_WIDTH = 448;
    private static final int CHAT_WINDOW_HEIGHT = 800;
    private static final int CHAT_WINDOW_COORDINATE_X = 700;
    private static final int CHAT_WINDOW_COORDINATE_Y = 100;

    public MainChatWindow(){
        setTitle("Chat window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(CHAT_WINDOW_COORDINATE_X, CHAT_WINDOW_COORDINATE_Y, CHAT_WINDOW_WIDTH, CHAT_WINDOW_HEIGHT);
        setVisible(true);
        add(panelSendingMessages());
        revalidate();
    }

    private JPanel panelSendingMessages(){

        JPanel panelAllChat = new JPanel();
        panelAllChat.setPreferredSize(new Dimension(CHAT_WINDOW_WIDTH, CHAT_WINDOW_HEIGHT));
        panelAllChat.setBackground(Color.pink);
        //panelAllChat.setBorder(BorderFactory.createLineBorder(Color.magenta));
        panelAllChat.setLayout(new BorderLayout());

        JPanel panelSendingMessages = new JPanel();
        panelSendingMessages.setPreferredSize(new Dimension(CHAT_WINDOW_WIDTH, CHAT_WINDOW_HEIGHT/10));
        panelSendingMessages.setBackground(Color.pink);
        panelSendingMessages.setLayout(new FlowLayout(FlowLayout.LEFT));

        JButton buttonSendingMessages = new JButton("SEND");
        buttonSendingMessages.setVisible(true);
        buttonSendingMessages.setPreferredSize(new Dimension(CHAT_WINDOW_WIDTH/6, CHAT_WINDOW_HEIGHT/10));
        buttonSendingMessages.setBackground(Color.lightGray);
        buttonSendingMessages.setDefaultCapable(true);
        //buttonSendingMessages.requestFocusInWindow();

        JTextField textFieldForTypeMassage = new JTextField();
        textFieldForTypeMassage.setPreferredSize(new Dimension(CHAT_WINDOW_WIDTH - CHAT_WINDOW_WIDTH/4,CHAT_WINDOW_HEIGHT/10));

        JPanel panelForAlreadySentMassages = new JPanel();
        panelForAlreadySentMassages.setPreferredSize(new Dimension(CHAT_WINDOW_WIDTH, CHAT_WINDOW_HEIGHT - CHAT_WINDOW_HEIGHT/6));
        panelForAlreadySentMassages.setBackground(Color.pink);
        panelForAlreadySentMassages.setLayout(new FlowLayout(FlowLayout.TRAILING));

        JScrollPane panelScrollForAlreadySentMassages = new JScrollPane(panelForAlreadySentMassages, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        panelAllChat.add(panelScrollForAlreadySentMassages,BorderLayout.NORTH);
        panelSendingMessages.add(textFieldForTypeMassage);
        panelSendingMessages.add(buttonSendingMessages);
        panelAllChat.add(panelSendingMessages, BorderLayout.SOUTH);

        buttonSendingMessages.addActionListener(new ListenerForSendMassage(textFieldForTypeMassage,panelForAlreadySentMassages,panelAllChat));
        textFieldForTypeMassage.addActionListener(new ListenerForSendMassage(textFieldForTypeMassage,panelForAlreadySentMassages,panelAllChat));

//        textFieldForTypeMassage.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(!textFieldForTypeMassage.getText().equals("")){
//                    panelForAlreadySentMassages.add(panelForSendingMassage(textFieldForTypeMassage.getText()));
//                    textFieldForTypeMassage.setText("");
//                    panelAllChat.revalidate();
//                }
//            }
//        });

        return panelAllChat;
    }

//    private JPanel panelForSendingMassage(String textSendingMassage){
//            JPanel panelForSendingMassage = new JPanel();
//            panelForSendingMassage.setBackground(Color.ORANGE);
//            panelForSendingMassage.setPreferredSize(new Dimension(CHAT_WINDOW_WIDTH / 2, CHAT_WINDOW_HEIGHT / 10));
//            JLabel labelTextSendingMassage = new JLabel(textSendingMassage);
//            panelForSendingMassage.add(labelTextSendingMassage);
//            return panelForSendingMassage;
//    }





}



