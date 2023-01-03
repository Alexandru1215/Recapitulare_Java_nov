package gui_JOption;

import javax.swing.*;

public class TestJOption {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Hello, What is your name ?");
        JOptionPane.showMessageDialog(null, "Hello , " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age !"));
        JOptionPane.showMessageDialog(null, "Thank you , so you are  " + age);

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter  your hegight"));
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");

    }
}
