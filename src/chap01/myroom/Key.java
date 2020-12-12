package chap01.myroom;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Key implements KeyListener {
	public int event = 0;
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
        int keyCode =e.getKeyCode();
        
        switch(keyCode){
            case KeyEvent.VK_UP:
    			System.out.println("up 키가 눌렸습니다.");
    			this.event = 1;
    			break;

            case KeyEvent.VK_DOWN:
    			System.out.println("down 키가 눌렸습니다.");
    			this.event = 2;
    			break;
    			
            case KeyEvent.VK_RIGHT:
    			System.out.println("right 키가 눌렸습니다.");
    			this.event = 3;
    			break;
    			
            case KeyEvent.VK_LEFT:
    			System.out.println("left 키가 눌렸습니다.");
    			this.event = 4;
    			break;

        }

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
