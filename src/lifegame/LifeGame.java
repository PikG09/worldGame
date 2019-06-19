package lifegame;

import javax.swing.JFrame;  




/** 
 * 生命游戏 
 *  
 */  
  
public class LifeGame extends JFrame{  
  
      
    private static final long serialVersionUID = -1660060555234651445L;  //序列化
  
    LifeGame(){  
        this.setSize(630,600);  
        this.setTitle("生命游戏[LifeGame]DEMO");  
        this.add(new WorldMap());  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //关闭窗口
        this.setLocationRelativeTo(null);  //窗口居中
        this.setResizable(false);  //用户不能改变窗口大小
    }  
      
    public static void main(String[] args){  
        LifeGame game = new LifeGame();  
        game.setVisible(true);  //窗口可见
    }  
  
}