package com.l3.gl.view;

import javax.swing.*;

public class Ui {
    private JFrame frame;
    private JButton addUserButton;
    private JButton addProductButton;

    public Ui() {
        frame = new JFrame("TP Project");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        addUserButton = new JButton("Add User");
        addProductButton = new JButton("Add Product");

        panel.add(addUserButton);
        panel.add(addProductButton);

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);
    }

    public JButton getAddUserButton() { return addUserButton; }
    public JButton getAddProductButton() { return addProductButton; }
}
