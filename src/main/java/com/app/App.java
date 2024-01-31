package com.app;

import com.app.layout.AppGUI;

import javax.swing.*;

public class App
{
    private static final AppGUI app = new AppGUI();

    public static void main( String[] args )
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                app.setVisible(true);
            }
        });
    }
}
