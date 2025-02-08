package problems;

import javax.swing.*;
import java.awt.*;
import java.util.Stack;

public class TowerOfHanoiVisualization extends JPanel {
    private static final int WIDTH = 800;  // 창 너비
    private static final int HEIGHT = 600; // 창 높이
    private static final int BASE_HEIGHT = 50; // 기둥 바닥 높이
    private static final int DISK_HEIGHT = 20; // 디스크 높이
    private static final int NUM_TOWERS = 3; // 기둥 개수

    private Stack<Integer>[] towers; // 각 기둥에 있는 디스크 상태 저장
    private int numDisks; // 디스크 개수

    public TowerOfHanoiVisualization(int numDisks) {
        this.numDisks = numDisks;
        towers = new Stack[NUM_TOWERS];
        for (int i = 0; i < NUM_TOWERS; i++) {
            towers[i] = new Stack<>();
        }
        for (int i = numDisks; i > 0; i--) {
            towers[0].push(i); // 첫 번째 기둥에 디스크 쌓기
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // 기둥 그리기
        int towerWidth = WIDTH / 4;
        for (int i = 0; i < NUM_TOWERS; i++) {
            g.setColor(Color.BLACK);
            g.fillRect((i + 1) * towerWidth - 10, HEIGHT - BASE_HEIGHT - 200, 20, 200); // 기둥
            g.fillRect((i + 1) * towerWidth - 50, HEIGHT - BASE_HEIGHT, 100, BASE_HEIGHT); // 바닥
        }

        // 디스크 그리기
        for (int i = 0; i < NUM_TOWERS; i++) {
            Stack<Integer> tower = towers[i];
            for (int j = 0; j < tower.size(); j++) {
                int diskSize = tower.get(j);
                int diskWidth = diskSize * 20;
                int x = (i + 1) * towerWidth - diskWidth / 2;
                int y = HEIGHT - BASE_HEIGHT - (j + 1) * DISK_HEIGHT;
                g.setColor(new Color(50 + diskSize * 20, 100, 200));
                g.fillRect(x, y, diskWidth, DISK_HEIGHT);
            }
        }
    }

    public void moveDisk(int fromTower, int toTower) throws InterruptedException {
        if (!towers[fromTower].isEmpty()) {
            int disk = towers[fromTower].pop();
            towers[toTower].push(disk);
            repaint();
            Thread.sleep(1500); // 애니메이션 속도 조절
        }
    }

    public void solveHanoi(int n, int fromTower, int toTower, int auxTower) throws InterruptedException {
        if (n == 1) {
            moveDisk(fromTower, toTower);
            return;
        }
        solveHanoi(n - 1, fromTower, auxTower, toTower);
        moveDisk(fromTower, toTower);
        solveHanoi(n - 1, auxTower, toTower, fromTower);
    }

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("하노이의 탑 시각화");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);

        int numDisks = Integer.parseInt(JOptionPane.showInputDialog("디스크 개수를 입력하세요:"));
        TowerOfHanoiVisualization hanoiPanel = new TowerOfHanoiVisualization(numDisks);

        frame.add(hanoiPanel);
        frame.setVisible(true);

        Thread.sleep(1000); // 초기 상태 표시 후 대기
        hanoiPanel.solveHanoi(numDisks, 0, 2, 1); // 하노이의 탑 풀이 시작
    }
}
