package chap01.myroom;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class MyGame {
    static int big = 20;
	public static void main(String[] args) throws InterruptedException {
		DrawFrame f = new DrawFrame();
		
		f.setTitle("my_game");
        f.setLayout( null );
        f.setSize(1500,1500);
        Key key = new Key();

        
        
        f.setVisible(true);
        f.addKeyListener(key);
        
        int start = 3;
        int count = 0;
        int stage;
        int num = 0;
        int arrow;
        int shape[] = new int[100];
        int input = 0;
        int life = 3;
        int speed;
        int time;
        int tentime = 10;
        
        ActionListener listener = new TimerFPS(f);
        Timer t = new Timer(100,listener);
        t.restart();
        
        stage = start;
        System.out.println("게임 시작");
        
        while(life>0) {
            while(stage>0)
            {
            	speed = (int)(Math.random()*500 + 350);
            	arrow = (int)(Math.random()*4) + 1;
            	shape[num] = arrow;
            	Thread.sleep(100);
            	num++;
            	if(arrow==1)
            	{
            		count = f.generationNumber();
            		f.arr[count] =new Up(
            				speed,
            				speed,
            				big * num,
            				big * num);
            		
            		f.repaint();
            		key.event = 0;
            	}
            	else if(arrow==2)
            	{
            		count = f.generationNumber();
            		f.arr[count] =new Down(
            				speed,
            				speed,
            				big * num,
            				big * num);
            		//count++;
            		f.repaint();
            		key.event = 0;
            	}
            	else if(arrow==3)
            	{
            		count = f.generationNumber();
            		f.arr[count] =new Right(
            				speed,
            				speed,
            				big * num,
            				big * num);
            		//count++;
            		f.repaint();
            		key.event = 0;
            	}
            	else if(arrow==4)
            	{
            		count = f.generationNumber();
            		f.arr[count] = new Left(
            				speed,
            				speed,
            				big * num,
            				big * num);
            		//count++;
            		f.repaint();
            		key.event = 0;
            	}
            	stage--;
            	count++;
            }
            
            time = num + 1;
            num--;
            
        	while(num>=0) {

        		
        		boolean oneCheckBox = false;
        		for(Shape o : f.arr)
        		{
        			if( o != null)
        			{
        				if(num!=0 && oneCheckBox == false)
        				{
        					oneCheckBox = true;
        				}
        				else
        				{
        					o.mouseCheck = false;
        				}
        			}
        		}
        		f.repaint();
        		
            	Thread.sleep(100);
            	tentime--;
            	if(tentime==0) {
            		System.out.printf("남은 시간 : %d초\n", time-1);
            		time--;
            		tentime = 10;
            	}
            	
            	if(time == 0) {
            		System.out.println("시간 초과");
					for(int i=0; i<=num; i++)
						f.arr[i] = null;
            		num = 0;
            		start -= 2;
            		life--;
            		time = 3;
            		break;
            	}

        			if(f.arr[num] != null)
        			{
        				if(key.event == shape[num])
        				{
        					System.out.println(num + "번재 데이터를 삭제.");
        					f.arr[num] = null;
        					System.out.println(num);
        					num--;
        					if(num==-1)
        						System.out.println("스테이지 클리어! 다음 스테이지로 넘어갑니다");
        				}
        				else if(key.event!= 0)
        				{
        					life--;
        					System.out.println("틀렸습니다. 남은횟수 " + life + "회");
        					for(int i=0; i<=num; i++)
        						f.arr[i] = null;
        					num = 0;
        					start -= 2;
        					break;
        				}
        			}
        		key.event = 0;
        		f.repaint();
        		input++;
        		
            	
            		
        	}
        	start += 2;
        	stage = start;
        	num = 0;
        }
        System.out.println("게임 오버");
	}

}
