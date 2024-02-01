package com.app.controllers;


import com.app.components.Table;
import com.app.utils.Validation;

import javax.swing.*;
import java.util.ArrayList;

public class FormController {
    private final Table table;

    public FormController(Table table){
        this.table = table;
    }


    public void saveOnTable(ArrayList<JTextField> fields){
        if(Validation.toSave(table, fields)){
            TableController.setData(table, fields);
        }
    }

    public void deleteOnTable(){
        TableController.deleteData(table);
    }

}
