import javax.swing.*; 
import java.awt.*;

public class newspaper {

    public static void main(String[] args) {
        
        // Create the main application window
        JFrame frame = new JFrame("The Daily Times");
        frame.setSize(850, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

       //header section
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.Y_AXIS));//sets vertical layout for header
        header.setBackground(new Color(220, 220, 220));

        JLabel title = new JLabel("THE DAILY TIMES");
        title.setFont(new Font("Serif", Font.BOLD, 40));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel subtitle = new JLabel("Truth • Technology • Society");
        subtitle.setFont(new Font("SansSerif", Font.ITALIC, 16));
        subtitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel meta = new JLabel("29 May 2026  |  Kathmandu Edition ");
        meta.setFont(new Font("SansSerif", Font.PLAIN, 12));
        meta.setAlignmentX(Component.CENTER_ALIGNMENT);

        header.add(Box.createVerticalStrut(10)); //adds empty vertical space of 10 pixels
        header.add(title);
        header.add(subtitle);
        header.add(meta);
        header.add(Box.createVerticalStrut(10));
        
        // Add header to the top of the frame
        frame.add(header, BorderLayout.NORTH);

        //main story section
        JTextArea mainStory = new JTextArea();
        mainStory.setText(
            "BREAKING: STUDENTS BUILD JAVA SWING NEWSPAPER APP\n\n" +
            "A group of computer engineering students has developed a desktop-based\n" +
            "newspaper cover page using Java Swing. The project demonstrates how GUI\n" +
            "applications can be built using layouts, panels, and event-driven programming.\n\n" +
            "Experts say this reflects the growing interest in practical programming\n" +
            "among undergraduate students in Nepal and beyond."
        );

        mainStory.setFont(new Font("Serif", Font.PLAIN, 16));
        mainStory.setLineWrap(true); //wraps lines when they exceed the width of the text area
        mainStory.setWrapStyleWord(true); //wraps lines at word boundaries instead of breaking words
        mainStory.setEditable(false); //makes the text area non-editable
        mainStory.setBorder(BorderFactory.createTitledBorder("Main Story"));

        frame.add(mainStory, BorderLayout.CENTER);

        //side news section
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));

        JTextArea tech = new JTextArea(
            "TECH:\nAI tools are reshaping education and coding."
        );

        JTextArea sports = new JTextArea(
            "SPORTS:\nLocal college football finals concluded yesterday."
        );

        JTextArea world = new JTextArea(
            "WORLD:\nGlobal demand for software engineers is rising."
        );

        JTextArea career = new JTextArea(
            "CAREER:\nCybersecurity and cloud computing remain top fields."
        );

        JTextArea[] blocks = {tech, sports, world, career};//array of text areas for side news blocks

        for (JTextArea area : blocks) {
            area.setFont(new Font("SansSerif", Font.PLAIN, 13));
            area.setLineWrap(true);
            area.setWrapStyleWord(true);
            area.setEditable(false);
            area.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
            sidePanel.add(area);
            sidePanel.add(Box.createVerticalStrut(10));
        }

        frame.add(sidePanel, BorderLayout.EAST);

        // ================= FOOTER =================
        JLabel footer = new JLabel("Contact: news@dailytimes.com", SwingConstants.CENTER);
        footer.setFont(new Font("SansSerif", Font.PLAIN, 12));

        frame.add(footer, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}