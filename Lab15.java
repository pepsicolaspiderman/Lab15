import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab15 extends JFrame {
    private JButton butplus;
    private JButton butminus;
    private TextField num;

    public Lab15(){
        setBounds(300, 300, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Label lfornum = new Label("Число");
        lfornum.setBounds(25,55,30,20);
        num = new TextField("0");
        num.setBounds(65, 55, 50, 20);
        num.setEditable(true);

        butplus = new JButton("+1");
        butminus = new JButton("-1");

        butplus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numba = Integer.parseInt(num.getText());
                if (numba != 3) {
                num.setText(Integer.toString(++numba));
            }}
        });
        butminus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numba = Integer.parseInt(num.getText());
                if (numba != -5){
                num.setText(Integer.toString(--numba));
            }}
        });
        add(lfornum);
        add(num);
        add(butplus);
        add(butminus);
        setVisible(true);
    }
    public static void main(String[] args){
        new Lab15();
    }
}
