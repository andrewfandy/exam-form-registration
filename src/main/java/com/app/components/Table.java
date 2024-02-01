package com.app.components;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class Table extends JTable {
    private static final String[] columnNames = {"Subject Name", "SKS"};
    private DefaultTableModel model;

    public Table() {
        model = new DefaultTableModel(null,columnNames);
        setModel(model);
    }

    public void setDataRow(ArrayList<String> data){
        model.addRow(data.toArray());
    }

    public ArrayList<String> getSubjectData(){
        ArrayList<String> subject = new ArrayList<>();
        for(int row = 0; row < model.getRowCount(); row++){
            String value = model.getValueAt(row, 0).toString();
            subject.add(value.toLowerCase());
        }
        return subject;
    }


    public int getTotalSKS(){
        int value = 0;
        for(int row = 0; row < model.getRowCount(); row++){
            value += Integer.parseInt(model.getValueAt(row, 1).toString());
        }
        return value;
    }


}
