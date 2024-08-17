import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private static final String VERSION = "1.0.0";  // LMS version

    public LoginPage() {
        // Frame setup
        setTitle("LMS - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        add(panel);

        // Login form panel
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        panel.add(formPanel, BorderLayout.CENTER);

        // Username Label and Field
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(15);
        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(usernameLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(usernameField, gbc);

        // Password Label and Field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);
        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(passwordLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(passwordField, gbc);

        // Login Button
        JButton loginButton = new JButton("Login");
        gbc.gridx = 1;
        gbc.gridy = 2;
        formPanel.add(loginButton, gbc);

        // Login Action
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Simple admin/student login logic
                if (username.equals("admin") && password.equals("admin")) {
                    new AdminDashboard().setVisible(true);
                    dispose();
                } else if (username.equals("student") && password.equals("student")) {
                    new StudentDashboard(username).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid login credentials!");
                }
            }
        });

        // Footer Panel for Version and Caption
        JPanel footerPanel = new JPanel(new BorderLayout());
        JLabel versionLabel = new JLabel("Version " + VERSION, JLabel.CENTER);
        JLabel captionLabel = new JLabel("LMS Simulation for DevOps Project", JLabel.CENTER);
        footerPanel.add(captionLabel, BorderLayout.NORTH);
        footerPanel.add(versionLabel, BorderLayout.SOUTH);
        panel.add(footerPanel, BorderLayout.SOUTH);
    }
}
