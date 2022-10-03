/* April 9, 2020
 * Lucas Ward
 * CSC 191 Lab 10
 * Create a Calculator GUI.
 */
package Calculator;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;

public class Calculator extends JFrame {

    //JPanel for number pad
    private JPanel numbersJPanel;
    
    //JPanel for operation symbols
    private JPanel operationsJPanel;
    
    //JPanel for Clear/Clear all commands
    private JPanel clearJPanel;
    
    //JTextField for displaying entered numbers to simulate Calculator
    private JTextField display;
    
    //JButtons for number pad
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton zerozero;
    
    //JButtons for operation symbols
    private JButton add;
    private JButton subtract;
    private JButton decimal;
    private JButton multiply;
    private JButton divide;
    private JButton equals;
    
    //JButtons for Clear/ clear all commands
    private JButton clear;
    private JButton clearAll;
    
    //JButton for exiting/ turning off Calculator
    private JButton off;
    
    //constructor
    public Calculator() {
        createUserInterface();
    }
    
    //create the GUI
    private void createUserInterface() {
        //get content pane for attaching GUI components
        Container contentPane = getContentPane();
        
        //enable explicit positioning of our GUI components
        contentPane.setLayout(null);
        
        //setup display textField
        display = new JTextField();
        display.setBounds(18,10,648,25);
        display.setHorizontalAlignment(JTextField.RIGHT);
        contentPane.add(display);
        
        //setup numbersJPanel
        numbersJPanel = new JPanel();
        numbersJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED ));
        numbersJPanel.setBounds(18,55,215,275);
        numbersJPanel.setLayout(null);
        contentPane.add(numbersJPanel);
        
        //setup operationsJPanel
        operationsJPanel = new JPanel();
        operationsJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        operationsJPanel.setBounds(255,55,190,275);
        operationsJPanel.setLayout(null);
        contentPane.add(operationsJPanel);
        
        //setup clearJPanel
        clearJPanel = new JPanel();
        clearJPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
        clearJPanel.setBounds(485,55,180,195);
        clearJPanel.setLayout(null);
        contentPane.add(clearJPanel);
        
        //setup off JButton
        off = new JButton();
        off.setBounds(485,270,180,60);
        off.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        off.setText("OFF");
        contentPane.add(off);
        
        //setup numbersJPanel JButtons
            //oneJButton
        one = new JButton();
        one.setBounds(19,18,58,58);
        one.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        one.setText("1");
        numbersJPanel.add(one);
            //twoJButton
        two = new JButton();
        two.setBounds(77,18,58,58);
        two.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        two.setText("2");
        numbersJPanel.add(two);
            //threeJButton
        three = new JButton();
        three.setBounds(135,18,58,58);
        three.setFont(new Font("SansSerif", Font.PLAIN, 18 ));
        three.setText("3");
        numbersJPanel.add(three);
            //fourJButton
        four = new JButton();
        four.setBounds(19,76,58,58);
        four.setFont(new Font("SansSerif", Font.PLAIN, 18));
        four.setText("4");
        numbersJPanel.add(four);
            //fiveJButton
        five = new JButton();
        five.setBounds(77,76,58,58);
        five.setFont(new Font("SansSerif", Font.PLAIN, 18));
        five.setText("5");
        numbersJPanel.add(five);
            //sixJButton
        six = new JButton();
        six.setBounds(135,76,58,58);
        six.setFont(new Font("SansSerif", Font.PLAIN, 18));
        six.setText("6");
        numbersJPanel.add(six);
            //sevenJButton
        seven = new JButton();
        seven.setBounds(19,134,58,58);
        seven.setFont(new Font("SansSerif", Font.PLAIN, 18));
        seven.setText("7");
        numbersJPanel.add(seven);
            //eightJButton
        eight = new JButton();
        eight.setBounds(77,134,58,58);
        eight.setFont(new Font("SansSerif", Font.PLAIN, 18));
        eight.setText("8");
        numbersJPanel.add(eight);
            //nineJButton
        nine = new JButton();
        nine.setBounds(135,134,58,58);
        nine.setFont(new Font("SansSerif", Font.PLAIN, 18));
        nine.setText("9");
        numbersJPanel.add(nine);
            //zeroJButton
        zero = new JButton();
        zero.setBounds(19,192,58,58);
        zero.setFont(new Font("SansSerif", Font.PLAIN, 18));
        zero.setText("0");
        numbersJPanel.add(zero);
            //zerozeroJButton
        zerozero = new JButton();
        zerozero.setBounds(77,192,116,58);
        zerozero.setFont(new Font("SansSerif", Font.PLAIN, 18));
        zerozero.setText("00");
        numbersJPanel.add(zerozero);
        //end numbersJPanel button initialization
        
        //setup operationsJPanel JButtons
            //addJButton
        add = new JButton();
        add.setBounds(19,18,58,156);
        add.setFont(new Font("SansSerif", Font.PLAIN, 18));
        add.setText("+");
        operationsJPanel.add(add);
            //decimalJButton
        decimal = new JButton();
        decimal.setBounds(19,192,58,58);
        decimal.setFont(new Font("SansSerif", Font.PLAIN, 18));
        decimal.setText(".");
        operationsJPanel.add(decimal);
            //subtractJButton
        subtract = new JButton();
        subtract.setBounds(104,18,58,58);
        subtract.setFont(new Font("SansSerif", Font.PLAIN, 18));
        subtract.setText("-");
        operationsJPanel.add(subtract);
            //multiplyJButton
        multiply = new JButton();
        multiply.setBounds(104,76,58,58);
        multiply.setFont(new Font("SansSerif", Font.PLAIN, 18));
        multiply.setText("*");
        operationsJPanel.add(multiply);
            //divideJButton
        divide = new JButton();
        divide.setBounds(104,134,58,58);
        divide.setFont(new Font("SansSerif", Font.PLAIN, 18));
        divide.setText("/");
        operationsJPanel.add(divide);
            //equalsJButton
        equals = new JButton();
        equals.setBounds(104,192,58,58);
        equals.setFont(new Font("SansSerif", Font.PLAIN, 18));
        equals.setText("=");
        operationsJPanel.add(equals);
        //end initializing operationsJPanel JButtons
        
        //setup clearJPanel buttons
            //clearJButton
        clear = new JButton();
        clear.setBounds(19,18,145,60);
        clear.setFont(new Font("SansSerif", Font.PLAIN, 18));
        clear.setText("C");
        clearJPanel.add(clear);
            //clearAllJButton
        clearAll = new JButton();
        clearAll.setBounds(19,108,145,60);
        clearAll.setFont(new Font("SansSerif", Font.PLAIN, 18));
        clearAll.setText("C/A");
        clearJPanel.add(clearAll);
        
        //set properties of application's window
        setTitle("Calculator"); //set title bar text
        setSize(700, 380); //width, height in pixels
        setVisible(true); //display window
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    
    
}
