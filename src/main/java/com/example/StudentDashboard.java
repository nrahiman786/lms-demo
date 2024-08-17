import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDashboard extends JFrame {
    private Student student;

    public StudentDashboard(String studentName) {
        // Simulating a student login
        student = new Student(studentName, "S001", "student@example.com");

        // Frame setup
        setTitle("Student Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        // Display student info
        JLabel nameLabel = new JLabel("Welcome, " + student.getName());
        panel.add(nameLabel);

        // Button to view courses
        JButton viewCoursesButton = new JButton("View Enrolled Courses");
        panel.add(viewCoursesButton);

        // View enrolled courses
        viewCoursesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder courseList = new StringBuilder("Enrolled Courses:\n");
                for (Course course : student.getEnrolledCourses()) {
                    courseList.append(course.getCourseName()).append("\n");
                }
                JOptionPane.showMessageDialog(null, courseList.toString());
            }
        });

        // Button to enroll in a course
        JButton enrollCourseButton = new JButton("Enroll in Course");
        panel.add(enrollCourseButton);

        // Enroll action
        enrollCourseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String courseName = JOptionPane.showInputDialog("Enter Course Name:");
                if (courseName != null && !courseName.isEmpty()) {
                    Course course = new Course(courseName);
                    student.enrollCourse(course);
                    JOptionPane.showMessageDialog(null, "Enrolled successfully!");
                }
            }
        });
    }
}
