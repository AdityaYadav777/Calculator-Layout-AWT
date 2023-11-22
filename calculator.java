import java.awt.*;
import java.awt.event.WindowAdapter;

public class calculator extends WindowAdapter {

    Frame frame;
    TextField tf;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnSub, btnDiv, btnMul,btnEqual;

    calculator() {

        frame = new Frame();
        tf = new TextField();
        tf.setBounds(200, 50, 205, 50);
        frame.add(tf);

        btn1 = new Button("1");
        btn2 = new Button("2");
        btn3 = new Button("3");
        btn4 = new Button("4");
        btn5 = new Button("5");
        btn6 = new Button("6");
        btn7 = new Button("7");
        btn8 = new Button("8");
        btn9 = new Button("9");
        btn0 = new Button("0");
        btnAdd = new Button("+");
        btnSub = new Button("-");
        btnMul = new Button("*");
        btnDiv = new Button("/");
        btnEqual=new Button("=");

        btn1.setBounds(200, 120, 40, 40);
        frame.add(btn1);

    

        btn2.setBounds(250, 120, 40, 40);
        frame.add(btn2);

     
        btn3.setBounds(300,120,40,40);
        frame.add(btn3);

        btnAdd.setBounds(350,120,55,40);
        frame.add(btnAdd);
        
        btn4.setBounds(200,165,40,40);
        frame.add(btn4);
        btn5.setBounds(250,165,40,40);
        frame.add(btn5);

        btn6.setBounds(300,165,40,40);
        frame.add(btn6);

        btnSub.setBounds(350,165,55,40);
        frame.add(btnSub);

        btn7.setBounds(200,210,40,40);
        frame.add(btn7);
        
        btn8.setBounds(250,210,40,40);
        frame.add(btn8);

        btn9.setBounds(300,210,40,40);
        frame.add(btn9);

        btnDiv.setBounds(350,210,55,40);
        frame.add(btnDiv);

        btn0.setBounds(200,255,40,40);
        frame.add(btn0);

        btnMul.setBounds(250,255,40,40);
        frame.add(btnMul);
        
        btnEqual.setBounds(300,255,105,40);
        frame.add(btnEqual);
       



        frame.setTitle("Title X");
        frame.setSize(600, 600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(this);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new calculator();
    }

}
