import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
;import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    int t1 = 0;
    int t2 = 0;
    String team = "N/A";
    JLabel res = new JLabel("Result: " + t1 + "X" + t2);
    JLabel lastsc = new JLabel("Last scorer: " + team);
    JLabel winner = new JLabel("DRAW");
    JPanel panel = new JPanel(null);
    JButton teamMilan = new JButton("FC Milan");
    JButton teamReal = new JButton("Real Madrid");


    public Gui() {
        this.setContentPane(panel);
        teamMilan.setBounds(40, 40, 110, 20);
        teamMilan.addActionListener(this);
        teamReal.setBounds(170, 40, 110, 20);
        teamReal.addActionListener(this);
        lastsc.setBounds(125, 80, 140, 20);
        res.setBounds(125, 60, 80, 20);
        winner.setBounds(125, 100, 70, 20);
        panel.add(teamMilan);
        panel.add(lastsc);
        panel.add(winner);
        panel.add(teamReal);
        panel.add(res);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Real Madrid")) {
            team = "Real Madrid";
            t2++;
            if (t2 > t1) {
                winner.setText("Real Madrid");
            } else if (t1 == t2) {
                winner.setText("DRAW");
            }
            res.setText("Result: " + t1 + "X" + t2);
            lastsc.setText("Last scorer: " + team);

        } else if (command.equals("FC Milan")) {
            team = "FC Milan";
            t1++;
            if (t1 > t2) {
                winner.setText("FC Milan");
            } else if (t1 == t2) {
                winner.setText("DRAW");
            }
            res.setText("Result: " + t1 + "X" + t2);
            lastsc.setText("Last scorer: " + team);

        }
    }
}