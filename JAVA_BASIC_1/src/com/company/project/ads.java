package com.company.project;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ads {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Two JTables Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(1, 2)); // Two columns layout

        // Create first table
        String[] columnNames1 = {"ID", "Name", "Age"};
        Object[][] data1 = {
            {1, "Alice", 25},
            {2, "Bob", 30},
            {3, "Charlie", 22}
        };
        JTable table1 = new JTable(new DefaultTableModel(data1, columnNames1));

        // Add first table to a scroll pane
        JScrollPane scrollPane1 = new JScrollPane(table1);

        // Create second table
        String[] columnNames2 = {"Product", "Price", "Quantity"};
        Object[][] data2 = {
            {"Laptop", 1200, 5},
            {"Phone", 800, 10},
            {"Tablet", 600, 7}
        };
        JTable table2 = new JTable(new DefaultTableModel(data2, columnNames2));

        // Add second table to a scroll pane
        JScrollPane scrollPane2 = new JScrollPane(table2);

        // Add scroll panes to frame
        frame.add(scrollPane1);
        frame.add(scrollPane2);

        // Set frame visibility
        frame.setVisible(true);
    }
}

