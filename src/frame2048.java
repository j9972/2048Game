import javax.swing.*;
import java.awt.*;

public class frame2048 extends  JFrame {

    frame2048() {
        this.add(new game2048());

        this.setTitle("2048"); // 창의 타이틀
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,800);
        this.getContentPane().setBackground(new Color(187,173,160));
        this.setLayout(new GridLayout(4,4));
        this.setResizable(false); // 창의 크기를 조절할 수 없도록 하기
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
