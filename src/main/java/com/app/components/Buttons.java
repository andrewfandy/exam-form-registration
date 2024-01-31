package com.app.components;

import com.app.controllers.FormController;
import com.app.controllers.TableController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Buttons extends JPanel {
    private static JButton saveBtn, deleteBtn;
    FormController controller;
    public Buttons(){
        setLayout(new FlowLayout());
        saveBtn = new JButton("Save");
        saveBtn.addActionListener(this::saveAction);

        deleteBtn = new JButton("Delete");
        deleteBtn.addActionListener(this::deleteAction);

        add(saveBtn);
        add(deleteBtn);

        controller = new FormController();
    }

    private void saveAction(ActionEvent e){
        ArrayList<JTextField> fields = Fields.getFields();
        controller.saveOnTable(fields);
    }
    private void deleteAction(ActionEvent e){
        controller.deleteOnTable();
    }

}
