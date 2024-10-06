//import javax.swing.JFrame;
//
//public class gui {
//    public static void main(String[] args){
//        JFrame frame = new JFrame();
//
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.setVisible(true);
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//
//public class gui {
//    public static void main(String[] args){
//        JFrame frame = new JFrame();
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//
//        frame.setLayout(new FlowLayout());//flow left to right
//
//        JLabel label = new JLabel("Hello, Swing");
//        JButton button = new JButton("Click me");
//
//        frame.add(label);
//        frame.add(button);
//
//        frame.setVisible(true);
//    }
//}

//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class gui {
//    public static void main(String[] args){
//        JFrame frame = new JFrame("java swing app with handle events");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//
//        JLabel label = new JLabel("Hello swing");
//        JButton btn = new JButton("Click me");
//
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                label.setText("Button clicked");
//            }
//        });
//
//        frame.add(label);
//        frame.add(btn);
//        frame.setVisible(true);
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//
//public class gui {
//    public static void main(String[] args){
//        JFrame frame = new JFrame("Border layout");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLayout(new BorderLayout());
//
//        frame.add(new JButton("North"), BorderLayout.NORTH);
//        frame.add(new JButton("South"), BorderLayout.SOUTH);
//        frame.add(new JButton("East"), BorderLayout.EAST);
//        frame.add(new JButton("West"), BorderLayout.WEST);
//        frame.add(new JButton("Center"), BorderLayout.CENTER);
//        frame.setVisible(true);
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//
//public class gui {
//    public static void main(String[] args){
//        JFrame frame = new JFrame("Swing form");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//
//        //form
//        JLabel label = new JLabel("Name :");
//        JTextField name = new JTextField(15);
//
//        JLabel label1 = new JLabel("Age :");
//        JTextField age = new JTextField(3);
//
//        JButton submit = new JButton("Submit");
//
//        frame.add(label);
//        frame.add(name);
//        frame.add(label1);
//        frame.add(age);
//
//        frame.add(submit);
//
//        frame.setVisible(true);
//
//
//
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//
//public class gui{
//    public static void main(String[] args){
//        JFrame frame = new JFrame("BoxLayout");
//        frame.setSize(400, 300);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
//
//        frame.add(new JLabel("Name:"));
//        frame.add(new JTextField(15));
//
//        frame.add(new JLabel("Age:"));
//        frame.add(new JTextField(3));
//
//        frame.add(new JButton("Submit"));
//
//        frame.setVisible(true);
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//
//public class gui {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("BoxLayout Example");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
///*  using main panel for x axis and set up separate panel for the name , age , submit  */
//        // Set up the main panel with BoxLayout in the vertical direction
//        JPanel mainPanel = new JPanel();
//        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
//
//        // Create a panel for the first line (Name and TextField)
//        JPanel namePanel = new JPanel();
//        namePanel.setLayout(new BoxLayout(namePanel, BoxLayout.X_AXIS));
//        namePanel.add(new JLabel("Name: "));
//        namePanel.add(Box.createHorizontalStrut(10)); // Spacer
//        namePanel.add(new JTextField(15));
//
//        // Create a panel for the second line (Age and TextField)
//        JPanel agePanel = new JPanel();
//        agePanel.setLayout(new BoxLayout(agePanel, BoxLayout.X_AXIS));
//        agePanel.add(new JLabel("Age: "));
//        agePanel.add(Box.createHorizontalStrut(20)); // Spacer
//        agePanel.add(new JTextField(3));
//
//        // Create a panel for the third line (Submit button)
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
//        buttonPanel.add(new JButton("Submit"));
//
//        // Add the panels to the main panel, with spacing in between
//        mainPanel.add(namePanel);
//        mainPanel.add(Box.createVerticalStrut(10)); // Spacer
//        mainPanel.add(agePanel);
//        mainPanel.add(Box.createVerticalStrut(10)); // Spacer
//        mainPanel.add(buttonPanel);
//
//        // Add the main panel to the frame
//        frame.add(mainPanel);
//        frame.setVisible(true);
//    }
//}
//
//import javax.swing.*;
//import java.awt.*;
//
//public class gui {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("GridLayout Example");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // Set the GridLayout manager with 3 rows and 2 columns
//        frame.setLayout(new GridLayout(3, 2));
//
//        // Add components in row-by-row order
//        frame.add(new JLabel("Name:"));
//        frame.add(new JTextField(15));
//
//        frame.add(new JLabel("Age:"));
//        frame.add(new JTextField(3));
//
//        frame.add(new JLabel(""));
//        frame.add(new JButton("Submit"));
//
//        frame.setVisible(true);
//    }
//}

//import javax.swing.*;
//import java.awt.*;
//
//public class gui {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Panel with FlowLayout");
//        frame.setSize(300, 200);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLayout(new FlowLayout());
//
//        // Create a panel with BoxLayout for vertical layout
//        JPanel panel = new JPanel();
//        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
//
//        panel.add(new JLabel("Name:"));
//        panel.add(new JTextField(15));
//
//        // Add spacing
//        panel.add(Box.createVerticalStrut(10));
//
//        panel.add(new JLabel("Age:"));
//        panel.add(new JTextField(3));
//
//        panel.add(Box.createVerticalStrut(10));
//
//        panel.add(new JButton("Submit"));
//
//        frame.add(panel);
//        frame.setVisible(true);
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PostgreSQLExample {
    public static void main(String[] args) {
        // Database URL, username, and password
        String url = "jdbc:postgresql://localhost:5432/exampledb";
        String user = "your_username";  // replace with your PostgreSQL username
        String password = "your_password";  // replace with your PostgreSQL password

        JFrame frame = new JFrame("Data Entry Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));

        // Input components
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        JLabel ageLabel = new JLabel("Age:");
        JTextField ageField = new JTextField(3);
        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(new JLabel("")); // empty label for grid alignment
        frame.add(submitButton);

        // Action listener for the Submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                int age;

                // Check and parse age input
                try {
                    age = Integer.parseInt(ageField.getText());
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter a valid age.");
                    return;
                }

                // Database connection and insert
                try (Connection conn = DriverManager.getConnection(url, user, password)) {
                    String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
                    PreparedStatement statement = conn.prepareStatement(sql);
                    statement.setString(1, name);
                    statement.setInt(2, age);
                    statement.executeUpdate();

                    JOptionPane.showMessageDialog(frame, "Data inserted successfully!");

                    // Clear fields after submission
                    nameField.setText("");
                    ageField.setText("");

                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                    JOptionPane.showMessageDialog(frame, "Error connecting to the database.");
                }
            }
        });

        frame.setVisible(true);
    }
}

    }
}