package com.app.layout;

import com.app.components.Table;
import com.app.constants.AppConstant;

import javax.swing.*;
import java.awt.*;

public class TableGUI extends JPanel {
    private static final String[][] DEFAULT = {{"", ""}};

    public TableGUI(){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(AppConstant.CONTAINER_WIDTH - 12, AppConstant.CONTAINER_HEIGHT));
        JScrollPane jScrollPane = new JScrollPane(new Table());
        add(jScrollPane, BorderLayout.CENTER);
    }
}
