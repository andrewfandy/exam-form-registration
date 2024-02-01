package com.app.layout;

import com.app.App;
import com.app.components.Buttons;
import com.app.components.Fields;
import com.app.components.Table;

import javax.swing.*;
import java.awt.*;

public class FormGUI extends JPanel {
    private JPanel subjectField, sksField, fieldContainer, buttons;
    public FormGUI(Table table){
        setLayout(new BorderLayout());

        fieldContainer = new JPanel();
        fieldContainer.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = 0;
        gbc.weighty = 1;
        gbc.weightx = 0;
        gbc.gridx = 0;
        gbc.gridy = 0;
        subjectField = new Fields("Subject Name");
        fieldContainer.add(subjectField, gbc);

        gbc.gridy++;
        sksField = new Fields("SKS Credit");
        fieldContainer.add(sksField, gbc);

        add(fieldContainer, BorderLayout.CENTER);

        buttons = new Buttons(table);
        add(buttons, BorderLayout.SOUTH);
    }

}
