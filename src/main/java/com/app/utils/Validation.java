package com.app.utils;

import com.app.components.Table;

import javax.swing.*;
import java.util.ArrayList;

public class Validation {
    private static boolean saveValidation(ArrayList<JTextField> fields){
        for(JTextField field : fields){
            if(field.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Must not be empty field",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    private static boolean isNumeric(String txt){
        try{
            int number = Integer.parseInt(txt);
            if(number < 0){
                throw new NumberFormatException();
            }
        } catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null,
                    "SKS must be positive & integer number",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true;
    }

    private static boolean subjectExistOnTable(ArrayList<JTextField> fields){
        ArrayList<String> subjects = Table.getSubjectData();
        for(JTextField field : fields){
            if(subjects.contains(field.getText().toLowerCase())){
                JOptionPane.showMessageDialog(null,
                        "Subject is exist on Table",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                return true;
            }
        }
        return false;
    }

    private static boolean maximumSKS(String sks){
        final int MAXIMUM_SKS = 20;
        int subjectOnField = Integer.parseInt(sks);
        int subjectOnTable = Table.getTotalSKS();
        int tablePlusField = subjectOnField + subjectOnTable;
        if(subjectOnTable > MAXIMUM_SKS ||
                subjectOnField > MAXIMUM_SKS ||
                tablePlusField > MAXIMUM_SKS)
        {
            JOptionPane.showMessageDialog(null,
                    "Maximum SKS is 20",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }
    public static boolean toSave(ArrayList<JTextField> fields){
        return saveValidation(fields) &&
                isNumeric(fields.get(1).getText()) &&
                !subjectExistOnTable(fields) &&
                !maximumSKS(fields.get(1).getText());

    }

    private static boolean rowSelected(){
        return true;
    }
    public static boolean toDelete(){
        return true;
    }

}
