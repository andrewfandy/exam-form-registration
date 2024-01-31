package com.app.layout;

import com.app.constants.AppConstant;

import javax.swing.*;
import java.awt.*;

public class AppGUI extends JFrame {
    protected static JLabel header, footer;
    protected static int credit = 0;
    public AppGUI(){
        super("Form Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new Dimension(AppConstant.APP_WIDTH, AppConstant.APP_HEIGHT));
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        header = new JLabel("Form Registration", SwingConstants.CENTER);
        header.setPreferredSize(new Dimension(AppConstant.HEADER_WIDTH, AppConstant.HEADER_HEIGHT));
        add(header, BorderLayout.NORTH);

        JPanel container = new JPanel();
        container.setBackground(Color.LIGHT_GRAY);
        container.setLayout(new BorderLayout());
        container.add(new FormGUI(), BorderLayout.WEST);
        container.add(new TableGUI(), BorderLayout.EAST);
        add(container, BorderLayout.CENTER);


        footer = new JLabel(String.format("Total SKS : %d", credit), SwingConstants.CENTER);
        footer.setPreferredSize(new Dimension(AppConstant.HEADER_WIDTH, AppConstant.HEADER_HEIGHT));
        add(footer, BorderLayout.SOUTH);
    }

}
