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
    			System.out.println("up Ű�� ���Ƚ��ϴ�.");
    			this.event = 1;
    			break;

            case KeyEvent.VK_DOWN:
    			System.out.println("down Ű�� ���Ƚ��ϴ�.");
    			this.event = 2;
    			break;
    			
            case KeyEvent.VK_RIGHT:
    			System.out.println("right Ű�� ���Ƚ��ϴ�.");
    			this.event = 3;
    			break;
    			
            case KeyEvent.VK_LEFT:
    			System.out.println("left Ű�� ���Ƚ��ϴ�.");
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
