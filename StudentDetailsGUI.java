/*Written in VS Code*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentDetailsGUI extends JFrame implements ActionListener {
    // Instance variables
    private JTextField txtName, txtSurname, txtStudentNumber, txtQuiz, txtAssignment, txtSummative;
    private JButton btnCalculate, btnClear;
    private JLabel lblFinalMark, lblGradeComment;

    // Constructor
    public StudentDetailsGUI() {
        // Set up the GUI
        setTitle("Student Details");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 2));

        // Add components to the GUI
        add(new JLabel("    Name: "));
        txtName = new JTextField();
        add(txtName);
        add(new JLabel("    Surname: "));
        txtSurname = new JTextField();
        add(txtSurname);
        add(new JLabel("    Student Number: "));
        txtStudentNumber = new JTextField();
        add(txtStudentNumber);
        add(new JLabel("    Online Quiz Mark: "));
        txtQuiz = new JTextField();
        add(txtQuiz);
        add(new JLabel("    Assignment Mark: "));
        txtAssignment = new JTextField();
        add(txtAssignment);
        add(new JLabel("    Summative Assessment Mark: "));
        txtSummative = new JTextField();
        add(txtSummative);
        btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(this);
        add(btnCalculate);
        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        add(btnClear);
        lblFinalMark = new JLabel();
        add(lblFinalMark);
        lblGradeComment = new JLabel();
        add(lblGradeComment);

        // Display the GUI
        setVisible(true);
    }

    // ActionListener method
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            // Get the student details and marks
            String name = txtName.getText();
            String surname = txtSurname.getText();
            String studentNumber = txtStudentNumber.getText();
            double quizMark = Double.parseDouble(txtQuiz.getText());
            double assignmentMark = Double.parseDouble(txtAssignment.getText());
            double summativeMark = Double.parseDouble(txtSummative.getText());

            // Calculate the final mark
            double finalMark = quizMark * 0.1 + assignmentMark * 0.4 + summativeMark * 0.5;

            // Calculate the grade comment
            String gradeComment;
            if (finalMark >= 75.0) {
                gradeComment = "Pass with Distinction";
            } else if (finalMark >= 50.0 && summativeMark >= 40.0) {
                gradeComment = "Pass";
            } else if (finalMark >= 40.0 && finalMark < 50.0) {
                gradeComment = "Supplement";
            } else if (summativeMark < 40.0) {
                gradeComment = "Fail on Subminimum";
            } else {
                gradeComment = "Fail";
            }

            // Set the final mark and grade comment labels
            lblFinalMark.setText("Final Mark: " + String.format("%.2f", finalMark));
            lblGradeComment.setText("Grade Comment: " + gradeComment);
        } else if (e.getSource() == btnClear) {
            // Clear all fields
            txtName.setText("");
            txtSurname.setText("");
            txtStudentNumber.setText("");
            txtQuiz.setText("");
            txtAssignment.setText("");
            txtSummative.setText("");
            lblFinalMark.setText("");
            lblGradeComment.setText("");
        }
    }

    // Main method
    public static void main(String[] args) {
        new StudentDetailsGUI();
    }
}
