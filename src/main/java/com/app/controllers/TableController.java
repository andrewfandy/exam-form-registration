package com.app.controllers;

import com.app.components.Table;
import com.app.utils.Validation;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class TableController {

    public static void setData(Table table, ArrayList<JTextField> fields) {
        ArrayList<String> data = new ArrayList<>();
        fields.forEach(field -> {
            data.add(field.getText());
        });

        table.setDataRow(data);
        AppController.update(Integer.parseInt(data.get(1)));
    }

    public static void deleteData(Table table){
        int selectedRow = table.getSelectedRow();
        if(selectedRow != -1){
            String data = ""+table.getValueAt(selectedRow, 1);
            ((DefaultTableModel)table.getModel()).removeRow(selectedRow);
            AppController.update(-Integer.parseInt(data));
        }else {
            Validation.deleteError();
        }
    }
}
