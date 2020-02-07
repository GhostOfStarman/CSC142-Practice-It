/*CS142 Practice-It Lab 3: Parameters, Graphics problems
 *completed 2/7/20 
 */



public class CS1LabGraphics {

	public static void main(String[] args) {
	
		
	}
	

//******FACE******: 
//	public class Face {
//	    public static void main(String[] args) {
//	        
//	        DrawingPanel face = new DrawingPanel(220, 150);
//	        Graphics g = face.getGraphics();
//	        
//	        //FACE: drawOval(x,y, w, h)
//	        g.drawOval(10,30,100,100);
//	        
//	        //EYES: colors change when this line is declared (once each time)
//	        g.setColor(Color.BLUE);
//	        g.fillOval(30,60,20,20);
//	        g.setColor(Color.BLUE);
//	        g.fillOval(70,60,20,20);
//	        
//	        //MOUTH:
//	        g.setColor(Color.RED);
//	        g.drawLine(40,100,80,100);
//	    
//	    }
//	}

	
	
//******FACE2******:	
//	public class Face2 {
//	    public static void main(String[] args) {
//	        
//	        DrawingPanel face = new DrawingPanel(320, 180);
//	        Graphics g = face.getGraphics();
//	        
//	        drawface(g,10,30);
//	        drawface(g, 150, 50);
//	    
//	    }
//	    
//	    /*assume 10,30 is the origin, the static method can be written with coordinates relative to the origin
//	    it comes down to just the difference b/t x and y points (which are also the parameters of the static method)*/
//	    
//	    public static void drawface(Graphics g, int x, int y){
//	        
//	        g.setColor(Color.BLACK);
//	        g.drawOval(x,y,100,100);
//	        
//	        g.setColor(Color.BLUE);
//	        g.fillOval(x + 20,y + 30 ,20,20);
//	        g.setColor(Color.BLUE);
//	        g.fillOval(x + 60,y + 30, 20,20);
//
//	        g.setColor(Color.RED);
//	        g.drawLine(x + 30, y + 70, x + 70, y + 70);
//	    }
//	}
	
	
	
//******FACE3******:
//	public class Face3 {
//	    public static void main(String[] args) {
//	        
//	        DrawingPanel face = new DrawingPanel(520,180);
//	        Graphics g = face.getGraphics();
//	        
//	        drawface(g,10,30);
//	        
//	    }
//	    
//	    public static void drawface(Graphics g, int x, int y){
//	        
//	        for(int i = 0; i < 5; i++){
//	        
//	        g.setColor(Color.BLACK);
//	        g.drawOval(x,y,100,100);
//	        
//	        g.setColor(Color.BLUE);
//	        g.fillOval(x + 20,y + 30 ,20,20);
//	        g.setColor(Color.BLUE);
//	        g.fillOval(x + 60,y + 30, 20,20);
//
//	        g.setColor(Color.RED);
//	        g.drawLine(x + 30, y + 70, x + 70, y + 70);
//	        
//	            x+=100;
//	        }
//	    }
//	}
	
	
//******STAIRS******:
//	DrawingPanel panel = new DrawingPanel(110, 110);
//	Graphics g = panel.getGraphics();
//	for (int i = 0; i < 10; i++) {
//	    g.drawRect(5, 10* i + 5, 10*i + 10 , 10);
//	}
	
	
	
//******STAIRS2******:	
//	DrawingPanel panel = new DrawingPanel(110, 110);
//	Graphics g = panel.getGraphics();
//	for (int i = 0; i < 10; i++) {
//	    g.drawRect(5, 10* i + 5, 100-(10*i), 10);
//	}
	
	
	
//******STAIRS3******:
//	DrawingPanel panel = new DrawingPanel(110, 110);
//	Graphics g = panel.getGraphics();
//	for (int i = 0; i < 10; i++) {
//	    g.drawRect(95-(10*i), 10* i + 5 , 10*i + 10, 10 );
//	}
	
	
	
//******STAIRS4******:
//	DrawingPanel panel = new DrawingPanel(110, 110);
//	Graphics g = panel.getGraphics();
//	for (int i = 0; i < 10; i++) {
//	    g.drawRect(10*i + 5 , 10*i + 5 , 100-(10*i) , 10);
//	}
	
	
//******SPIRAL(CLASS)******:
//	public class Spiral {
//	    public static void main(String[] args) {
//	        
//	        DrawingPanel spiral = new DrawingPanel(170,170);
//	        Graphics g = spiral.getGraphics();
//	        
//	        int x1= 0;
//	        int y1=10;
//	        int x2=160;
//	        int y2=10;
//	        
//	        
//	        for(int i = 0; i < 20; i++){
//	            g.drawLine(x1, y1, x2, y2);
//	            
//	            
//	            x1+=10;
//	            y1+=10;
//	            x2-=10;
//	            y2+=10; 
//	        }
//	        
//	        int x3 = 160;
//	        int y3 = 10;
//	        int x4 = 160;
//	        int y4 = 160; 
//	        
//	        int x5 = 80;
//	        int y5 = 90;
//	        int x6 = 90;
//	        int y6 = 90;
//	       
//	        for(int i = 0; i < 8; i++){
//	            
//	            g.drawLine(x5,y5,x6,y6);
//	            g.drawLine(x3, y3, x4, y4);
//	            
//	            x3-=10;
//	            y3+=10;
//	            x4-=10;
//	            y4-=10; 
//	            
//	            x5 -= 10;
//	            y5 += 10;
//	            x6 += 10;
//	            y6 += 10;
//
//	        }
//	        
//	        int x7 = 10;
//	        int y7 = 20;
//	        int x8 = 10;
//	        int y8 =160;
//	        for(int i = 0; i < 7; i++){
//	            
//	            g.drawLine(x7, y7, x8, y8);
//	            
//	            x7 += 10;
//	            y7 += 10;
//	            x8 +=10;
//	            y8 -=10; 
//	        
//	        }
//	}
//}
	
	
}
