package com.app.controllers;


import com.app.utils.Validation;

import javax.swing.*;
import java.util.ArrayList;

public class FormController {


    public void saveOnTable(ArrayList<JTextField> fields){
        if(Validation.toSave(fields)){
            TableController.setData(fields);
        }
    }

    public void deleteOnTable(){
        if(Validation.toDelete()){
            TableController.deleteData();
        }
    }

}
