package com.app.controllers;

import com.app.layout.AppGUI;

import javax.swing.*;

public class AppController extends AppGUI {
    public static void update(int counter){
        credit+=counter;
        footer.setText(String.format("Total SKS : %d", credit));

    }
}
