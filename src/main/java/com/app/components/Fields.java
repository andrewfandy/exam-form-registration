package com.app.components;


import com.app.constants.AppConstant;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Fields extends JPanel {
    private JLabel label;
    private static ArrayList<JTextField> fields = new ArrayList<>();
    private static JTextField field;


    public Fields(String labelName){
        setPreferredSize(new Dimension(AppConstant.CONTAINER_WIDTH, 20));
        setLayout(new BorderLayout());
        label = new JLabel(labelName);
        add(label, BorderLayout.WEST);

        field = new JTextField();
        field.setColumns(20);
        fields.add(field);
        add(field, BorderLayout.EAST);
    }

    public static ArrayList<JTextField> getFields(){
        return fields;
    }
}
