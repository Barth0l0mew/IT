package ComCompany.Phones;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Phones extends JFrame {
    private JPanel panel;
    private JScrollBar scrollBar1;
    private JTable table;
    private JButton addButton;
    private JButton editButton;
    private JButton deletButton;
    public static DefaultTableModel model;
    public static List<Phone> phones = new ArrayList<>();
    static{
        phones.add(new Phone("surname", "name", "address", "phone"));
        phones.add(new Phone("surname2", "name2", "address2", "phone2"));
    }
    public Phones(){
        setTitle("Sample1");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 300);
        String[] columnNames = {"Surname", "Name", "Address","Number"};
        //model = new DefaultTableModel(null, columnNames);
        model = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return true;
            };
        };
        model.addColumn("sdasd");
        for (String el:columnNames)
            model.addColumn(el);
//        JScrollPane scrollPane = new JScrollPane();
//        panel.add(scrollPane, BorderLayout.CENTER);

        for (Phone phone:phones)
        model.addRow(new String[]{phone.getSurname(), phone.getName(), phone.getAddress(), phone.getNumber()});
        table.setModel(model);
        setContentPane(panel);
        setLocationRelativeTo(null);
        addMenu();
        setVisible(true);
        deletButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row=table.getSelectedRow();
                if (row>=0) {
                    DeleteForm dialog = new DeleteForm(row);
                    dialog.setSize(500, 550);
                    dialog.setLocationRelativeTo(null);
                    dialog.pack();
                    dialog.setTitle("Вы уверены?");
                    dialog.setVisible(true);
                }
                //int row=table.getSelectedRow();
                //model.removeRow(row);
            }
        });
    }
    private void addMenu() {
        // create a menubar
        JMenuBar menuBar = new JMenuBar();

        // create a menu
        JMenu menu1 = new JMenu("Phone");

        // create menuitems
        JMenuItem mAdd = new JMenuItem("Add");
        JMenuItem mEdit = new JMenuItem("Edit");
        JMenuItem mDelete = new JMenuItem("Detele");
        JMenuItem mExit = new JMenuItem("Exit");

        // add menu items to menu
        menu1.add(mAdd);
        menu1.add(mEdit);
        menu1.add(mDelete);
        menu1.add(mExit);

        // add menu to menu bar
        menuBar.add(menu1);

        // add menubar to frame
        setJMenuBar(menuBar);
       mExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {

        Phones phones = new Phones();
    }
}
