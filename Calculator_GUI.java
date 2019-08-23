import javax.swing.JFrame; //
import javax.swing.JMenuBar; //
import javax.swing.JMenu; //
import javax.swing.JMenuItem; //
import javax.swing.JButton; //
import javax.swing.JTextField; //
import javax.swing.GroupLayout; //
import javax.swing.LayoutStyle; //
import java.awt.event.ActionEvent; //
import java.awt.event.ActionListener; //
import javax.swing.JOptionPane; //
import javax.swing.JRootPane;
import javax.swing.SwingUtilities;

/**
 * Calculator GUI class, sets up the Frame and the Buttons for a calculator
 *
 * @author (Muhammad Hammad)
 * @version (v1.0, 19-Aug-2019)
 */
public class Calculator_GUI extends javax.swing.JFrame {
    // Class variables
    private JMenuItem aboutMenuItem, copyMenuItem, cutMenuItem, exitMenuItem, pasteMenuItem,trigFMenuItem, clearMenuItem;
    private JMenu editMenu, fileMenu, helpMenu;
    private JTextField inputField;
    private JMenuBar menuBar;
    private JButton minusBtn, multiplyBtn, nineBtn, oneBtn, fiveBtn, fourBtn, eightBtn, equalBtn, addBtn;   
    private JButton eraseBtn, sevenBtn, sinBtn, sixBtn, tanBtn, threeBtn, twoBtn, zeroBtn, divideBtn, dotBtn, cosBtn;    
    private String main;
    
    /**
     *  Default constructor creates a frame and sets it to visible
     */
    public Calculator_GUI(){    
        makeFrame();
        
        
        setVisible(true);
    }
    /**
     * Creates the frame and declares its specification
     *
     * @return void
     */    
    public void makeFrame(){
        // Input Field
        inputField = new JTextField();
        
        //Frame Specifications
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Calculator");
        setSize(520, 350);
        
        //Frame Elements
        makeButtons();
        makeMenu();
        setFrameLayout();
    }
    /**
     * Creates the buttons for the calculator
     *
     * @return void
    */
    private void makeButtons(){ 
        minusBtn = new JButton("-");
        addBtn = new JButton("+");
        multiplyBtn = new JButton("*");
        divideBtn = new JButton("/");
        zeroBtn = new JButton("0");
        oneBtn = new JButton("1");
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");
        eraseBtn = new JButton("⌫");
        dotBtn = new JButton(".");         
        cosBtn = new JButton("cos()");           
        tanBtn = new JButton("tan()");           
        sinBtn = new JButton("sin()");           
        equalBtn = new JButton("="); 
        setButtonFont();
        setButtonFunctionality();
    }
    /**
     * Sets the font and size for the buttons for the Calculator
     *
     * @return void
    */
    private void setButtonFont(){
        minusBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        addBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        multiplyBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        divideBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        threeBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        sixBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        nineBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        twoBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        fiveBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        eightBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        zeroBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        oneBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        fourBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        sevenBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        eraseBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        dotBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        cosBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        tanBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        sinBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        equalBtn.setFont(new java.awt.Font("SansSerif", 1, 24));
        inputField.setFont(new java.awt.Font("SansSerif", 1, 19));        
    }   
    /**
     * Adds the functionality to the buttons in the calculator
     *
     * @return void
    */
    private void setButtonFunctionality(){
        minusBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"-");
        });
        addBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"+");
        });
        multiplyBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"*");
        });  
        divideBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"/");
        });  
        zeroBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"0");
        });        
        oneBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"1");
        }); 
        twoBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"2");
        });   
        threeBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"3");
        });    
        fourBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"4");
        });  
        fiveBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"5");
        });  
        sixBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"6");
        });  
        sevenBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"7");
        }); 
        eightBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"8");
        }); 
        nineBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+"9");
        });    
        eraseBtn.addActionListener(
        (ActionEvent ev) -> {
            String st = inputField.getText().substring(0, inputField.getText().length()-1);
            inputField.setText(st);
        });  
        dotBtn.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText(inputField.getText()+".");
        });   
        
        // Set Equal Button to the default button for Enter key
        JRootPane rootPane = getRootPane(); 
        rootPane.setDefaultButton(equalBtn);

        cosBtn.addActionListener(new ButtonPress()); 
        tanBtn.addActionListener(new ButtonPress());   
        sinBtn.addActionListener(new ButtonPress());   
        equalBtn.addActionListener(new ButtonPress());
    } 
    /**
     * Creates the menu and adds it to the frame
     *
     * @return void
     */
    private void makeMenu(){
        //Initialize menu items
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        exitMenuItem = new JMenuItem("Exit");
        editMenu = new JMenu("Edit");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");
        helpMenu = new JMenu("Help");
        aboutMenuItem = new JMenuItem("About");   
        trigFMenuItem = new JMenuItem("Trig Function");
        clearMenuItem = new JMenuItem("Clear");
        
        // Add menu items to the frame
        fileMenu.add(clearMenuItem);
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        menuBar.add(editMenu);
        helpMenu.add(trigFMenuItem);
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar); 
        setMenuFunctionality();
    }
    /**
     * Sets the functionality for the menu 
     *
     * @return void
     */
    private void setMenuFunctionality(){
        aboutMenuItem.addActionListener(
        (ActionEvent ev) -> {
            String aboutInfo = "Calculator v1.0 \nCreated By: Muhammad Hammad";
            JOptionPane.showMessageDialog(null, aboutInfo, "About", JOptionPane.INFORMATION_MESSAGE);
        });
        exitMenuItem.addActionListener(
        (ActionEvent ev) -> {
            System.exit(0);
        });     
        trigFMenuItem.addActionListener(
        (ActionEvent ev) -> {
            String trigInfo = "Press the trigonometry buttons to evaluate the value that is in the input field.";
            JOptionPane.showMessageDialog(null, trigInfo, "Trigonometry Functions", JOptionPane.INFORMATION_MESSAGE);
        });
        copyMenuItem.addActionListener(
        (ActionEvent ev) -> {
            String msg = "This feature has not yet been implemented.\nWork in progress!";
            JOptionPane.showMessageDialog(null, msg, "Error!", JOptionPane.INFORMATION_MESSAGE);            
        });
        cutMenuItem.addActionListener(
        (ActionEvent ev) -> {
            String msg = "This feature has not yet been implemented.\nWork in progress!";
            JOptionPane.showMessageDialog(null, msg, "Error!", JOptionPane.INFORMATION_MESSAGE);            
        });        
        pasteMenuItem.addActionListener(
        (ActionEvent ev) -> {
            String msg = "This feature has not yet been implemented.\nWork in progress!";
            JOptionPane.showMessageDialog(null, msg, "Error!", JOptionPane.INFORMATION_MESSAGE);            
        });
        clearMenuItem.addActionListener(
        (ActionEvent ev) -> {
            inputField.setText("");            
        });        
    }    
    /**
     * Sets the layout of the frame for the calculator
     *
     * @return void
     */
    private void setFrameLayout(){
        // Layout of the frame
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputField, GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(divideBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplyBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(minusBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(oneBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(sevenBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dotBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(twoBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(fiveBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                            .addComponent(zeroBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(threeBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addComponent(sixBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addComponent(nineBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                            .addComponent(eraseBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(cosBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addComponent(tanBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                .addComponent(sinBtn, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
                            .addComponent(equalBtn, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputField, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(threeBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sixBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nineBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oneBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fourBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sevenBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(twoBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fiveBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eightBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(zeroBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addComponent(eraseBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(minusBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(multiplyBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(divideBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addComponent(dotBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cosBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tanBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sinBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(equalBtn, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );        
    }
    /**
     * Private class Solve that implements ActionListener for the buttons
     *
     */
    private class ButtonPress implements ActionListener{ 
        /**
         * Determines which button is pressed on the calculator.
         * Calls the appropriate function depending on the button.
         *
         * @return void
         */
        public void actionPerformed(ActionEvent e){
            main = inputField.getText();
            if (notSolveableYet(main)) {
                String st = "Cannot solve for multiple operators consecutively or if the first character is negative. \nWorking on solutions!";
                JOptionPane.showMessageDialog(null, st , "Error!", JOptionPane.ERROR_MESSAGE); 
            }
            else{
                Calculation cal = new Calculation(main);
                if (e.getSource() == equalBtn){               
                    main = cal.returnAnswer();
                }
                if (e.getSource() == cosBtn){
                    main = cal.cosAnswer();
                }
                if (e.getSource() == tanBtn){
                    main = cal.tanAnswer();
                }
                if (e.getSource() == sinBtn){
                    main = cal.sinAnswer();
                }
                inputField.setText(main);
            }
        }
        /**
         * A function that gives an error for any features that are not yet implemented.
         *
         * @param - String st 
         * @return - boolean true if the equation is not solveable
         */
        private boolean notSolveableYet(String st){
            char prev = ' ';
            for (int i = 0; i < st.length(); i++){
                char ch = st.charAt(i);
                if ((ch == '-') && (i==0)){
                    return true;
                }
                if( (st.contains("*-")) || (st.contains("/-")) || (st.contains("//")) || (st.contains("**")) ||  (st.contains("-/")) || (st.contains("-*")) ||
                (st.contains("+/")) || (st.contains("+*"))){
                    return true;
                }
                prev = ch;
            }
            return false;
        }
    } 
}
