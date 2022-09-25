import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class game2048 extends JPanel implements ActionListener {
    JPanel upperPanel = new JPanel();
    JPanel underPanel = new JPanel();
    JLabel textfield = new JLabel();

    // TODO: 4 * 4 크기로 게임창을 만들고, 그 위에  점수, 최고점, new game 버튼 만들기
    game2048() {

        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("2048");
        textfield.setOpaque(true); // 불투명성 설정 -> 메소드를 추가해야 변경사항이 적용된다

        upperPanel.setLayout(new GridLayout());
        upperPanel.setBounds(0,0,800,200);

        underPanel.addKeyListener(new MyKeyAdapter());

        upperPanel.add(textfield);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // TODO : L <-> R, U <-> D 으로 합쳐지면서 숫자가 커지는 것
    public class MyKeyAdapter implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    break;
                case KeyEvent.VK_RIGHT:
                    break;
                case KeyEvent.VK_DOWN:
                    break;
                case KeyEvent.VK_UP:
                    break;
            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
