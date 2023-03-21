import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResumeGenerator extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextArea experienceArea;

    public ResumeGenerator() {
        setTitle("Resume Generator");

        // create labels and fields for name, email, and phone
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);

        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);

        JLabel phoneLabel = new JLabel("Phone:");
        phoneField = new JTextField(20);

        // create label and text area for experience
        JLabel experienceLabel = new JLabel("Experience:");
        experienceArea = new JTextArea(10, 20);
        JScrollPane scrollPane = new JScrollPane(experienceArea);

        // create button to generate resume
        JButton generateButton = new JButton("Generate Resume");
        generateButton.addActionListener(this);

        // add components to the frame
        Container c = getContentPane();
        c.setLayout(new GridLayout(5, 2));
        c.add(nameLabel);
        c.add(nameField);
        c.add(emailLabel);
        c.add(emailField);
        c.add(phoneLabel);
        c.add(phoneField);
        c.add(experienceLabel);
        c.add(scrollPane);
        c.add(new JLabel());
        c.add(generateButton);

        setSize(400, 300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String experience = experienceArea.getText();

        // create resume as a string
        String resume = "Name: " + name + "\n\n" +
                        "Email: " + email + "\n\n" +
                        "Phone: " + phone + "\n\n" +
                        "Experience: " + experience;

        // display resume in a dialog box
        JOptionPane.showMessageDialog(this, resume, "Resume", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        ResumeGenerator rg = new ResumeGenerator();
        rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
