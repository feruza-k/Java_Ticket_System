package CW;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SaveCSV {

    // Method to save JTextArea content as CSV
    public static void saveAsCSV(JTextArea area) {
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MMddHHmm"));
        String filePath = "Order#" + timeStamp + ".csv"; // Generates a unique file name based on timestamp

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            String text = area.getText();

            // Split text by newlines and write each line to the CSV file
            String[] lines = text.split("\\n");
            for (String line : lines) {
                line = line.replace(",", ";"); // Replace commas with a different delimiter if needed
                writer.write(line);
                writer.newLine();
            }

            System.out.println("CSV file saved successfully at: " + filePath);

            // Show a message dialog to indicate successful file save and an option to open it
            int choice = JOptionPane.showConfirmDialog(null,
                    "Thank You!\nThe file \"" + filePath + "\" was saved!\n\nDo you want to open it?",
                    "File Saved", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                openCSVFile(filePath);
            }

        } catch (IOException e) {
            // Handle file IO exception
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "An error occurred while saving the file:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to open the saved CSV file
    private static void openCSVFile(String filePath) {
        try {
            Desktop.getDesktop().open(new File(filePath));
        } catch (IOException e) {
            // Handle file opening exception
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,
                    "An error occurred while opening the file:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
