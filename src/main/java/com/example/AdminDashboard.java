import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdminDashboard extends JFrame {
    private ArrayList<Course> courses;

    public AdminDashboard() {
        // Frame setup
        setTitle("Admin Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        courses = new ArrayList<>();

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        // Course management buttons
        JButton addCourseButton = new JButton("Add Course");
        JButton viewCoursesButton = new JButton("View Courses");
        panel.add(addCourseButton);
        panel.add(viewCoursesButton);

        // Add course action
        addCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseName = JOptionPane.showInputDialog("Enter Course Name:");
                if (courseName != null && !courseName.isEmpty()) {
                    courses.add(new Course(courseName));
                    JOptionPane.showMessageDialog(null, "Course added successfully!");
                }
            }
        });

        // View courses action
        viewCoursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder courseList = new StringBuilder("Courses:\n");
                for (Course course : courses) {
                    courseList.append(course.getCourseName()).append("\n");
                }
                JOptionPane.showMessageDialog(null, courseList.toString());
            }
        });
    }
}
