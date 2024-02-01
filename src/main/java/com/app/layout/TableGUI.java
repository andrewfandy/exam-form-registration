package com.app.layout;

import com.app.components.Table;
import com.app.constants.AppConstant;

import javax.swing.*;
import java.awt.*;

public class TableGUI extends JPanel {
    private static final String[][] DEFAULT = {{"", ""}};
    private final Table table;

    public TableGUI(){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(AppConstant.CONTAINER_WIDTH - 12, AppConstant.CONTAINER_HEIGHT));
        table = new Table();
        JScrollPane jScrollPane = new JScrollPane(table);
        add(jScrollPane, BorderLayout.CENTER);
    }

    public Table getTable(){
        return table;
    }
}
