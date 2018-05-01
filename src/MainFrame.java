import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    private JButton jbtAdd = new JButton("Add");
    private JButton jbtSub = new JButton("Sub");
    private JButton jbtExit = new JButton("Exit");
    private JLabel jlbCount = new JLabel("0");
    private  int count = 0 ;
    public MainFrame () {
        init();
    }
    private void init () {
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(40,40,1280,960);

        jbtAdd.setBounds(30,30,200,120);
        jbtSub.setBounds(240,30,200,120);
        jbtExit.setBounds(450,30,200,120);
        jlbCount.setBounds(30,180,100,120);

        jbtAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
                setTitle(Integer.toString(count));
                jlbCount.setText(Integer.toString(count));
            }
        });

        jbtSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                setTitle(Integer.toString(count));
                jlbCount.setText(Integer.toString(count));
            }
        });

        jbtExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.exit(0);
            }
        });

        this.add(jbtAdd);
        this.add(jbtSub);
        this.add(jbtExit);
        this.add(jlbCount);
    }
}
