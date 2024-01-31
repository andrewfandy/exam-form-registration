package com.app.controllers;

import com.app.components.Table;

import javax.swing.*;
import java.util.ArrayList;

public class TableController {

    public static void setData(ArrayList<JTextField> fields) {
        ArrayList<String> data = new ArrayList<>();
        fields.forEach(field -> {
            data.add(field.getText());
        });

        Table.setDataRow(data);
        AppController.update(Integer.parseInt(data.get(1)));
    }

    public static void deleteData(){

    }
}
