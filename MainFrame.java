package CW;
/**
 * The MainFrame class serves as the entry point for the London Musical Ticket software.
 * It configures the application's look and feel using the Nimbus style, initializing
 * the primary graphical interface - the MusicalTicketApplication JFrame. This class sets
 * up the main user interface, making it visible, appropriately sized, and centered on the screen.
 */
public class MainFrame {
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
        java.awt.EventQueue.invokeLater(() -> {
            MusicalTicketApplication HomeFrame = new MusicalTicketApplication();
            HomeFrame.setVisible(true);
            HomeFrame.pack();
            HomeFrame.setLocationRelativeTo(null);
        });
    }
}
