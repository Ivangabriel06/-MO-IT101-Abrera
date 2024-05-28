/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mo.it101.group.abrera;

/**
 *
 * @author Ivan Gabriel Abrera
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilestoneCalculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Milestone Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        
        MilestonePanel milestone1 = new MilestonePanel("Milestone 1 (Max 25): ", 25);
        MilestonePanel milestone2 = new MilestonePanel("Milestone 2 (Max 40): ", 40);
        MilestonePanel terminalAssessment = new MilestonePanel("Terminal Assessment (Max 35): ", 35);

        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        panel.add(milestone1);
        panel.add(milestone2);
        panel.add(terminalAssessment);

        frame.add(panel, BorderLayout.CENTER);

        
        JButton calculateButton = new JButton("Calculate Grade");
        frame.add(calculateButton, BorderLayout.SOUTH);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double grade1 = milestone1.getGrade();
                    double grade2 = milestone2.getGrade();
                    double terminalGrade = terminalAssessment.getGrade();
                    double totalGrade = grade1 + grade2 + terminalGrade;

                    new ResultDialog("Your total grade is: " + totalGrade + " / 100");
                } catch (NumberFormatException ex) {
                    new ResultDialog("Please enter valid numbers.");
                } catch (IllegalArgumentException ex) {
                    new ResultDialog(ex.getMessage());
                }
            }
        });

        frame.setVisible(true);
    }
}

