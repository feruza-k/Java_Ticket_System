package CW;
/**
 * This form allows users to select ticket options, choose seats, and finalize their booking.
 * It includes functionalities for displaying available seats, setting ticket types, and managing bookings.
 * The form provides an interface for users to interact with and book their preferred tickets for the musical event.
 */

public class BookTickets extends javax.swing.JFrame {
    private String musical = "";
    private String month = "'";
    private String day = "";
    private String time = "";
    private String ticket1 = ""; 
    private String ticket2 = "";
    private String ticket3 = "";
    private String seatType1 = "";
    private String seatType2 = "";
    private String seatType3 = "";
    private String seatRow1 = "";
    private String seatRow2 = "";
    private String seatRow3 = "";
    private String seatNum1 = "";
    private String seatNum2 = "";
    private String seatNum3 = "";
    int totalPrice = 0;
    

    public BookTickets() {
        initComponents();

    }
 /**
 * Sets the ticket type and calculates the price based on the provided ticket value.
 * Updates the ticket information in the given JTextArea.
 */
public void setTicketType(String ticket, String seatType, String seatRow, String seatNum) {
    int price;

    // Calculate price based on the ticket type
    switch (ticket) {
        case "Adult":
            price = 60;
            break;
        case "Senior":
            price = 40;
            break;
        case "Student":
            price = 30;
            break;
        default: // For the first value 'Option', do nothing and return
            return;
    }

    // Append ticket information to the JTextArea
    area.append("Ticket: " + ticket + "\n");
    area.append("Seat: " + seatType + ", Row " + seatRow + ", " + seatNum + "\n");
    area.append(ticket + " Price: £" + price + "\n\n");
    area.append("-----------------------------------------------\n");

    // Update the total price with the calculated ticket price
    totalPrice += price;
}

    // Methods check for the user input
    private boolean isValidName(String name) {
        return name.matches("[A-Za-z ]{1,20}"); // Allows only letters and spaces, up to 20 characters
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{1,11}"); // Allows only digits, up to 11 numbers
    }

    private boolean isValidEmail(String email) {
        return email.matches("[\\w.-]{1,20}@[\\w.-]{1,15}"); // Simple email pattern, up to 20 characters before '@', and 8 after
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        musicalListBtn = new javax.swing.JButton();
        showScheduleBtn = new javax.swing.JButton();
        bookTicketsBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        musicalBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        monthBox = new javax.swing.JComboBox<>();
        dayBox = new javax.swing.JComboBox<>();
        timeBox = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ticketOption1 = new javax.swing.JComboBox<>();
        ticketOption2 = new javax.swing.JComboBox<>();
        ticketOption3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        seatOption1 = new javax.swing.JComboBox<>();
        seatOption2 = new javax.swing.JComboBox<>();
        seatOption3 = new javax.swing.JComboBox<>();
        seatRowBox1 = new javax.swing.JComboBox<>();
        seatNumBox1 = new javax.swing.JComboBox<>();
        seatRowBox2 = new javax.swing.JComboBox<>();
        seatRowBox3 = new javax.swing.JComboBox<>();
        seatNumBox2 = new javax.swing.JComboBox<>();
        seatNumBox3 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        phoneTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        printBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        bookBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 650));
        setPreferredSize(new java.awt.Dimension(850, 650));

        jScrollPane2.setBackground(new java.awt.Color(249, 249, 249));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(249, 249, 249));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 650));
        jPanel1.setSize(new java.awt.Dimension(850, 650));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("London Theatre Shows");

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 16)); // NOI18N
        jLabel2.setText("See the best London Theatre shows, including popular West End musicals, hit plays, and new productions.");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setText("West End and London Musical Tickets");

        homeBtn.setText("Home");
        homeBtn.setOpaque(true);
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        musicalListBtn.setText("Musical List");
        musicalListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicalListBtnActionPerformed(evt);
            }
        });

        showScheduleBtn.setText("Show Schedule");
        showScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showScheduleBtnActionPerformed(evt);
            }
        });

        bookTicketsBtn.setBackground(new java.awt.Color(0, 0, 0));
        bookTicketsBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        bookTicketsBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookTicketsBtn.setText("Book Tickets");
        bookTicketsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookTicketsBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        musicalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Musical", "Mamma Mia", "The Lion King", "Back to the Future", "Matilda", "Frozen", "La La Land", "The Devil wears Prada", "ELF", "Moulin Rouge", "The Phantom of the Opera", "The Adams Family", "Shrek", "The Witches", "Wicked", "A String Quartet Christmas" }));
        musicalBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicalBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel7.setText("Musical Type");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(musicalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(musicalBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel4.setText("Choose Your Musical");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel5.setText("Pick the Date");

        monthBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "December", "January", "February", "March", "June", "July" }));
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        dayBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBoxActionPerformed(evt);
            }
        });

        timeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "10:00 - 12:20", "14:00 - 16:20", "19:00 - 21:20" }));
        timeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel8.setText("Ticket Types");

        ticketOption1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Adult", "Senior", "Student" }));
        ticketOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketOption1ActionPerformed(evt);
            }
        });

        ticketOption2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 2", "Adult", "Senior", "Student" }));
        ticketOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketOption2ActionPerformed(evt);
            }
        });

        ticketOption3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 3", "Adult", "Senior", "Student" }));
        ticketOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketOption3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel6.setText("Pick Your Seat:");

        seatOption1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section", "Circle", "Stalls" }));
        seatOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatOption1ActionPerformed(evt);
            }
        });

        seatOption2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section", "Circle", "Stalls" }));
        seatOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatOption2ActionPerformed(evt);
            }
        });

        seatOption3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Section", "Circle", "Stalls" }));
        seatOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatOption3ActionPerformed(evt);
            }
        });

        seatRowBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Row", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
        seatRowBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatRowBox1ActionPerformed(evt);
            }
        });

        seatNumBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        seatNumBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatNumBox1ActionPerformed(evt);
            }
        });

        seatRowBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Row", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
        seatRowBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatRowBox2ActionPerformed(evt);
            }
        });

        seatRowBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Row", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" }));
        seatRowBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatRowBox3ActionPerformed(evt);
            }
        });

        seatNumBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        seatNumBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatNumBox2ActionPerformed(evt);
            }
        });

        seatNumBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18" }));
        seatNumBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatNumBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ticketOption1, javax.swing.GroupLayout.Alignment.LEADING, 0, 118, Short.MAX_VALUE)
                            .addComponent(ticketOption2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ticketOption3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seatOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(seatRowBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seatNumBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(seatRowBox3, 0, 1, Short.MAX_VALUE)
                                    .addComponent(seatRowBox2, 0, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seatNumBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(seatNumBox3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatRowBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNumBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatRowBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNumBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ticketOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatRowBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seatNumBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel9.setText("Contact Details");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel10.setText("Checkout");

        printBtn.setBackground(new java.awt.Color(0, 102, 204));
        printBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        printBtn.setForeground(new java.awt.Color(255, 255, 255));
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(0, 102, 204));
        resetBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        resetBtn.setForeground(new java.awt.Color(255, 255, 255));
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        bookBtn.setBackground(new java.awt.Color(0, 102, 204));
        bookBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        bookBtn.setForeground(new java.awt.Color(255, 255, 255));
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        area.setColumns(20);
        area.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jLabel11.setText("Full Name");

        jLabel12.setText("Email Address");

        jLabel13.setText("Phone Number");
        jLabel13.setToolTipText("");

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exit.png"))); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bookBtn)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn)
                                .addGap(80, 80, 80))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(musicalListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(showScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(bookTicketsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(homeBtn)
                    .addComponent(musicalListBtn)
                    .addComponent(showScheduleBtn)
                    .addComponent(bookTicketsBtn))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addComponent(bookBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(0, 137, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        MusicalTicketApplication HomeFrame = new MusicalTicketApplication();
        HomeFrame.setVisible(true);
        HomeFrame.pack();
        HomeFrame.setLocationRelativeTo(null); 
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void musicalListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicalListBtnActionPerformed
        MusicalList MusicalFrame = new MusicalList();
        MusicalFrame.setVisible(true);
        MusicalFrame.pack();
        MusicalFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_musicalListBtnActionPerformed

    private void bookTicketsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookTicketsBtnActionPerformed

    }//GEN-LAST:event_bookTicketsBtnActionPerformed

    private void showScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showScheduleBtnActionPerformed
        ShowSchedule ScheduleFrame = new ShowSchedule();
        ScheduleFrame.setVisible(true);
        ScheduleFrame.pack();
        ScheduleFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_showScheduleBtnActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        month = (String) monthBox.getSelectedItem();
    }//GEN-LAST:event_monthBoxActionPerformed

    private void musicalBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicalBoxActionPerformed
        musical = (String) musicalBox.getSelectedItem();
    }//GEN-LAST:event_musicalBoxActionPerformed

    private void dayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBoxActionPerformed
        day = (String) dayBox.getSelectedItem();
    }//GEN-LAST:event_dayBoxActionPerformed

    private void timeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeBoxActionPerformed
        time = (String) timeBox.getSelectedItem();
    }//GEN-LAST:event_timeBoxActionPerformed

    private void ticketOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketOption1ActionPerformed
        ticket1 = (String) ticketOption1.getSelectedItem();
    }//GEN-LAST:event_ticketOption1ActionPerformed

    private void ticketOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketOption2ActionPerformed
        ticket2 = (String) ticketOption2.getSelectedItem();
    }//GEN-LAST:event_ticketOption2ActionPerformed

    private void ticketOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketOption3ActionPerformed
        ticket3 = (String) ticketOption3.getSelectedItem();
    }//GEN-LAST:event_ticketOption3ActionPerformed

    private void seatOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatOption1ActionPerformed
        seatType1 = (String) seatOption1.getSelectedItem();
    }//GEN-LAST:event_seatOption1ActionPerformed

    private void seatOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatOption2ActionPerformed
        seatType2 = (String) seatOption2.getSelectedItem();
    }//GEN-LAST:event_seatOption2ActionPerformed

    private void seatOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatOption3ActionPerformed
        seatType3 = (String) seatOption3.getSelectedItem();
    }//GEN-LAST:event_seatOption3ActionPerformed

    private void seatRowBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatRowBox1ActionPerformed
        seatRow1 = (String) seatRowBox1.getSelectedItem();
    }//GEN-LAST:event_seatRowBox1ActionPerformed

    private void seatRowBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatRowBox2ActionPerformed
        seatRow2 = (String) seatRowBox2.getSelectedItem();
    }//GEN-LAST:event_seatRowBox2ActionPerformed

    private void seatRowBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatRowBox3ActionPerformed
        seatRow3 = (String) seatRowBox3.getSelectedItem();
    }//GEN-LAST:event_seatRowBox3ActionPerformed

    private void seatNumBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatNumBox1ActionPerformed
        seatNum1 = (String) seatNumBox1.getSelectedItem();
    }//GEN-LAST:event_seatNumBox1ActionPerformed

    private void seatNumBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatNumBox2ActionPerformed
        seatNum2 = (String) seatNumBox2.getSelectedItem();
    }//GEN-LAST:event_seatNumBox2ActionPerformed

    private void seatNumBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatNumBox3ActionPerformed
        seatNum3 = (String) seatNumBox3.getSelectedItem();
    }//GEN-LAST:event_seatNumBox3ActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        
        area.append("*********************************************\n\n");
        
        String name = nameTextField.getText();
        String phoneNumber = phoneTextField.getText();
        String email = emailTextField.getText();

        if (!isValidName(name)) {
            area.append("Invalid name format. \nName should be alphabetic and up to 20 characters.\n");
            
            return; // Stop further processing
        }
        
        if (!isValidEmail(email)) {
            area.append("Invalid email format. \nEmail should be up to 20 characters\nand follow the format 'example@example.com'.\n");
            return; // Stop further processing
        }

        if (!isValidPhoneNumber(phoneNumber)) {
            area.append("Invalid phone number format.\nPlease enter up to 11 numeric digits.\n");
            return; // Stop further processing
        }

       

        // If all inputs are valid, proceed with further actions
        area.append("Name: " + name + "\n");
        area.append("Phone: " + phoneNumber + "\n");
        area.append("Email: " + email + "\n");


        area.append("\n         ***********Your Order*********\n");
        area.append("Musical: " + musical + "\n");
        area.append("Date: " + month + " " + day + "\n");
        area.append("Time Slot: " + time + "\n");
        
       
        // Setting the price and the seat choice for spectator#1
        
        setTicketType(ticket1, seatType1, seatRow1, seatNum1);
        setTicketType(ticket2, seatType2, seatRow2, seatNum2);
        setTicketType(ticket3, seatType3, seatRow3, seatNum3);
        
        area.append("\nTotal Price: £" + totalPrice + "\n");
        area.append("\n\n              Thank You!\n");
       
    }//GEN-LAST:event_bookBtnActionPerformed

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed
        try {
            SaveCSV.saveAsCSV(area);
        }
        catch(Exception e) {
            
        }
    }//GEN-LAST:event_printBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        area.setText(""); // Clears the text area
        totalPrice = 0;     //Sets the total price to null
    }//GEN-LAST:event_resetBtnActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookTickets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookTickets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton bookBtn;
    private javax.swing.JButton bookTicketsBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> dayBox;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> monthBox;
    private javax.swing.JComboBox<String> musicalBox;
    private javax.swing.JButton musicalListBtn;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JButton printBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JComboBox<String> seatNumBox1;
    private javax.swing.JComboBox<String> seatNumBox2;
    private javax.swing.JComboBox<String> seatNumBox3;
    private javax.swing.JComboBox<String> seatOption1;
    private javax.swing.JComboBox<String> seatOption2;
    private javax.swing.JComboBox<String> seatOption3;
    private javax.swing.JComboBox<String> seatRowBox1;
    private javax.swing.JComboBox<String> seatRowBox2;
    private javax.swing.JComboBox<String> seatRowBox3;
    private javax.swing.JButton showScheduleBtn;
    private javax.swing.JComboBox<String> ticketOption1;
    private javax.swing.JComboBox<String> ticketOption2;
    private javax.swing.JComboBox<String> ticketOption3;
    private javax.swing.JComboBox<String> timeBox;
    // End of variables declaration//GEN-END:variables
}
