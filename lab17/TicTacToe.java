package ru.mirea.java2020.lab17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class TicTacToe extends JComponent {
    public int scoreX =0;
    public int scoreO =0;
    public static final int FIELD_EMPTY=0;
    public static final int FIELD_X = 10;
    public static final int FIELD_O = 200;
    int[][] field;
    boolean isXTurn;
    public JTextArea sX = new JTextArea("0");
    public JTextArea sXText = new JTextArea("Победы крестиков:");
    public JTextArea sO = new JTextArea("0");
    public JTextArea sOText = new JTextArea("Победы ноликов:");
    public JButton btnClear = new JButton("Очистить");

    public TicTacToe(){

        sXText.setFont(new Font("Times New Romans", Font.PLAIN, 15));
        sXText.setSize(150,50);
        sXText.setLocation(401,0);


        sOText.setFont(new Font("Times New Romans", Font.PLAIN, 15));
        sOText.setSize(150,50);
        sOText.setLocation(401,200);


        sX.setFont(new Font("Times New Romans", Font.PLAIN, 40));
        sX.setSize(150,50);
        sX.setLocation(401,40);


        sO.setFont(new Font("Times New Romans", Font.PLAIN, 40));
        sO.setSize(150,50);
        sO.setLocation(401,249);

        btnClear.setSize(100,30);
        btnClear.setLocation(410,150);
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sO.setText(String.valueOf("0"));
                sX.setText(String.valueOf("0"));
                scoreO=0;
                scoreX=0;
            }
        });
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
        field = new int[3][3];
        initGame();

        add(sXText);
        add(sX);
        add(sOText);
        add(sO);
        add(btnClear);
    }

    public void initGame(){
        for (int i=0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = FIELD_EMPTY;
            }
        }
        isXTurn = true;
    }

    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        graphics.clearRect(0,0,getWidth(),getHeight());
        drawGrid(graphics);
        drawXO(graphics);
    }

    void drawGrid(Graphics graphics){
        int w = (getWidth()-200);
        int h = getHeight();
        int dw = w/3;
        int dh = h/3;
        graphics.setColor(Color.black);
        for (int i=0;i<4;i++){
            graphics.drawLine(0,dh*i,w,dh*i);
            graphics.drawLine(dw*i,0,dw*i,h);
        }


    }

    void drawX(int i, int j, Graphics graphics){
        graphics.setColor(Color.black);
        int dw = (getWidth()-200)/3;
        int dh = getHeight()/3;
        int x = i*dw;
        int y=j*dh;
        graphics.drawLine(x,y,x+dw,y+dh);
        graphics.drawLine(x,y+dh,x+dh,y);
    }

    void drawO(int i, int j, Graphics graphics){
        graphics.setColor(Color.black);
        int dw = (getWidth()-200)/3;
        int dh = getHeight()/3;
        int x = i*dw;
        int y = j*dh;
        graphics.drawOval(x+5*dw/100,y,dw*9/10, dh);

    }

    void drawXO(Graphics graphics){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (field[i][j]==FIELD_X) drawX(i,j,graphics);
                else if  (field[i][j] == FIELD_O) drawO(i,j,graphics);
            }
        }
    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent){
        super.processMouseEvent(mouseEvent);

        if (mouseEvent.getButton() == mouseEvent.BUTTON1 &&  mouseEvent.getX()<385){
             int x = mouseEvent.getX();
            int y = mouseEvent.getY();
            int i = (int) ((float) x/(getWidth()-200)*3);
            int j = (int) ((float) y/getHeight()*3);

            if (field[i][j] == FIELD_EMPTY){
                field[i][j] = isXTurn?FIELD_X: FIELD_O;
                isXTurn = !isXTurn;
                repaint();
                int res = checkState();
                if (res !=0){
                    if (res == FIELD_O*3) {
                        scoreO++;
                        JOptionPane.showMessageDialog(this, "Нолики выиграли!", "Игра окночена!", JOptionPane.INFORMATION_MESSAGE);
                        sO.setText(String.valueOf(scoreO));
                    } else if (res == FIELD_X*3){
                        scoreX++;
                        JOptionPane.showMessageDialog(this, "Крестики выиграли!", "Игра окночена!", JOptionPane.INFORMATION_MESSAGE);
                        sX.setText(String.valueOf(scoreX));
                    } else {
                        JOptionPane.showMessageDialog(this, "Ничья!", "Игра окночена!", JOptionPane.INFORMATION_MESSAGE);
                    }
                    initGame();
                    repaint();
                }
            }
        }
    }

    int checkState(){
        int diag =0;
        int diag2 =0;
        int checkI, checkJ;
        boolean hasEmpty = false;
        for (int i=0;i<3;i++){
            diag += field[i][i];
            diag2 += field[i][2-i];
        }

        if (diag == FIELD_O*3 || diag == FIELD_X*3) return diag;
        if (diag2 == FIELD_O*3 || diag2 == FIELD_X*3) return diag2;

        for (int i=0;i<3;i++){
            checkI =0;
            checkJ=0;
            for (int j=0;j<3;j++){
                if (field[i][j]==0) hasEmpty = true;
                checkI += field[i][j];
                checkJ +=field[j][i];

                if (checkI == FIELD_O*3 || checkI==FIELD_X*3) return checkI;
                if (checkJ == FIELD_O*3 || checkJ==FIELD_X*3) return checkJ;

            }
        }
        if (hasEmpty) return 0;
        else return -1;
    }

}
