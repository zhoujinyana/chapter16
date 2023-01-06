package com.zjy.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();

    }
    public DrawCircle(){
        //初始化面板
        mp = new MyPanel();
        //把面板放在窗口
        this.add(mp);
        this.setSize(400,300);
        //当点击窗口关闭，程序就真正退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//定义一个面板
class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);
        //画一个圆
        g.drawOval(10,10,100,100);

        //演示绘制不同的图形
        //直线
        g.drawLine(10,10,100,100);
        //矩形
        g.drawRect(10,10,100,100);
        //填充矩形
        g.setColor(Color.cyan);
        g.fillRect(10,10,100,100);
        //填充椭圆
        g.setColor(Color.BLUE);
        g.fillOval(10,10,100,100);
        //画图片
        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/IMG_6672.PNG"));
        g.drawImage(image,10,10,400,400,this);
        //画字符串

        g.setColor(Color.MAGENTA);//设置画笔颜色
        g.setFont(new Font("楷体",Font.BOLD,50));
        g.drawString("北京你好",100,100);





    }

}