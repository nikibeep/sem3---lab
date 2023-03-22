import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class ResumeGenerator extends JFrame implements ActionListener {

    private JTextField nameField;
    private JTextField emailField;
    private JTextField phoneField;
    private JTextArea experienceArea;
    private JLabel imageLabel;

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
        c.setLayout(new GridLayout(6, 2));
        c.add(nameLabel);
        c.add(nameField);
        c.add(emailLabel);
        c.add(emailField);
        c.add(phoneLabel);
        c.add(phoneField);
        c.add(experienceLabel);
        c.add(scrollPane);

        // add image chooser button
        JButton imageChooserButton = new JButton("Choose Image");
        imageChooserButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(ResumeGenerator.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getPath());
                    imageLabel.setIcon(imageIcon);
                }
            }
        });
        c.add(new JLabel());
        c.add(imageChooserButton);

        // add image to the frame
        imageLabel = new JLabel();
        c.add(imageLabel);

        c.add(new JLabel());
        c.add(generateButton);

        setSize(500, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String experience = experienceArea.getText();
    
        // create resume as a string with the image
        ImageIcon imageIcon = (ImageIcon) imageLabel.getIcon();
        String resume = "<html><body><div style='background-color: #D5F5E3; padding: 10px;'>" +
                "<div><img src='" + imageIcon + "'></div>" +
                "<div style='margin-top: 20px;'><b style='color: #FF5733; font-size: 20px;'>Name:</b> <span style='font-size: 20px;'>" + name + "</span></div>" +
                "<div style='margin-top: 10px;'><b style='color: #FF5733; font-size: 20px;'>Email:</b> <span style='font-size: 20px;'>" + email + "</span></div>" +
                "<div style='margin-top: 10px;'><b style='color: #FF5733; font-size: 20px;'>Phone:</b> <span style='font-size: 20px;'>" + phone + "</span></div>" +
                "<div style='margin-top: 20px;'><b style='color: #FF5733; font-size: 20px;'>Experience:</b></div>" +
                "<div style='background-color: #FDEDEC; padding: 10px; margin-top: 10px;'><span style='font-size: 18px;'>" + experience + "</span></div></div></body></html>";
    
        // display resume with the image in a dialog box
        JLabel resumeLabel = new JLabel(resume);
        JOptionPane.showMessageDialog(this, resumeLabel, "Resume", JOptionPane.INFORMATION_MESSAGE);
    }
    
    

    public static void main(String[] args) {
        ResumeGenerator rg = new ResumeGenerator();
        rg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
