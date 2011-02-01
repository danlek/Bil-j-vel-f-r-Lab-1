import wheels.users.*;

public class Car extends Frame 
{
	//private Rectangle carChassi;
	private Rectangle [] carChassi;
	private Rectangle [] whiteSpaces;
	private Line [] formLinjer;
	private Ellipse [] rundaGrejor;
	

	public Car()
	{
		carChassi = new Rectangle[18];
		whiteSpaces = new Rectangle[4];
		formLinjer = new Line[3];
		rundaGrejor = new Ellipse[5];

		carChassi[0] = new Rectangle(java.awt.Color.GRAY);
		carChassi[0].setSize(400, 150);
		carChassi[0].setLocation(150, 300);
		
		whiteSpaces[0] = new Rectangle(java.awt.Color.WHITE);
		whiteSpaces[0].setSize(200, 50);
		whiteSpaces[0].setRotation(-30);
		whiteSpaces[0].setLocation(100, 250);
		
		whiteSpaces[1] = new Rectangle(java.awt.Color.WHITE);
		whiteSpaces[1].setSize(200, 50);
		whiteSpaces[1].setRotation(30);
		whiteSpaces[1].setLocation(400, 250);
		
		carChassi[1] = new Rectangle(java.awt.Color.GRAY);
		carChassi[1].setSize(300, 100);
		carChassi[1].setLocation(200, 200);
		
		carChassi[2] = new Rectangle(java.awt.Color.BLUE);
		carChassi[2].setSize(230, 75);
		carChassi[2].setLocation(235, 205);
		
		whiteSpaces[2] = new Rectangle(java.awt.Color.WHITE);
		whiteSpaces[2].setSize(200, 60);
		whiteSpaces[2].setLocation(130, 180);
		whiteSpaces[2].setRotation(-60);
		
		whiteSpaces[3] = new Rectangle(java.awt.Color.WHITE);
		whiteSpaces[3].setSize(200, 60);
		whiteSpaces[3].setLocation(370, 180);
		whiteSpaces[3].setRotation(60);
		
		carChassi[3] = new Rectangle(java.awt.Color.GRAY);
		carChassi[3].setSize(304, 50);
		carChassi[3].setLocation(198, 306);
		
		carChassi[4] = new Rectangle(java.awt.Color.GRAY);
		carChassi[4].setSize(8, 100);
		carChassi[4].setLocation(246, 195);
		carChassi[4].setRotation(30);

		carChassi[5] = new Rectangle(java.awt.Color.GRAY);
		carChassi[5].setSize(8, 100);
		carChassi[5].setLocation(446, 195);
		carChassi[5].setRotation(-30);

		carChassi[5] = new Rectangle(java.awt.Color.BLACK);
		carChassi[5].setSize(75, 40);
		carChassi[5].setLocation(270, 352);
		
		carChassi[6] = new Rectangle(java.awt.Color.BLACK);
		carChassi[6].setSize(75, 40);
		carChassi[6].setLocation(355, 352);
		
		carChassi[7] = new Rectangle(java.awt.Color.BLACK);
		carChassi[7].setSize(85, 40);
		carChassi[7].setLocation(175, 352);
		
		carChassi[8] = new Rectangle(java.awt.Color.BLACK);
		carChassi[8].setSize(85, 40);
		carChassi[8].setLocation(440, 352);
		
		carChassi[9] = new Rectangle(java.awt.Color.GRAY);
		carChassi[9].setSize(85, 25);
		carChassi[9].setLocation(220, 352);
		carChassi[9].setRotation(60);
		
		carChassi[10] = new Rectangle(java.awt.Color.GRAY);
		carChassi[10].setSize(85, 25);
		carChassi[10].setLocation(397, 352);
		carChassi[10].setRotation(-60);
		
		formLinjer[0] = new Line();
		formLinjer[0].setColor(java.awt.Color.BLACK);
		formLinjer[0].setThickness(2);
		formLinjer[0].setP1(150, 335);
		formLinjer[0].setP2(175, 350);
	
		formLinjer[1] = new Line();
		formLinjer[1].setColor(java.awt.Color.BLACK);
		formLinjer[1].setThickness(2);
		formLinjer[1].setP1(550, 335);
		formLinjer[1].setP2(525, 350);
		
		formLinjer[2] = new Line();
		formLinjer[2].setColor(java.awt.Color.BLACK);
		formLinjer[2].setThickness(2);
		formLinjer[2].setP1(175, 350);
		formLinjer[2].setP2(525, 350);
		
		rundaGrejor[0] = new Ellipse(java.awt.Color.WHITE);
		rundaGrejor[0].setLocation(180, 355);
		rundaGrejor[0].setSize(30, 30);

		rundaGrejor[1] = new Ellipse(java.awt.Color.WHITE);
		rundaGrejor[1].setLocation(215, 360);
		rundaGrejor[1].setSize(25, 25);
		
		rundaGrejor[2] = new Ellipse(java.awt.Color.WHITE);
		rundaGrejor[2].setLocation(490, 355);
		rundaGrejor[2].setSize(30, 30);

		rundaGrejor[3] = new Ellipse(java.awt.Color.WHITE);
		rundaGrejor[3].setLocation(455, 360);
		rundaGrejor[3].setSize(25, 25);
		
		carChassi[11] = new Rectangle(java.awt.Color.BLACK);
		carChassi[11].setSize(70, 25);
		carChassi[11].setLocation(175, 410);
		
		carChassi[12] = new Rectangle(java.awt.Color.BLACK);
		carChassi[12].setSize(70, 25);
		carChassi[12].setLocation(455, 410);
		
		carChassi[13] = new Rectangle(java.awt.Color.BLACK);
		carChassi[13].setSize(220, 30);
		carChassi[13].setLocation(245, 410);
		
		carChassi[14] = new Rectangle(java.awt.Color.GRAY);
		carChassi[14].setSize(50, 30);
		carChassi[14].setLocation(235, 405);
		carChassi[14].setRotation(-80);
		
		carChassi[15] = new Rectangle(java.awt.Color.GRAY);
		carChassi[15].setSize(50, 30);
		carChassi[15].setLocation(425, 405);
		carChassi[15].setRotation(80);
		
		carChassi[16] = new Rectangle(java.awt.Color.BLACK);
		carChassi[16].setSize(60, 25);
		carChassi[16].setLocation(175, 450);
		
		carChassi[16] = new Rectangle(java.awt.Color.BLACK);
		carChassi[16].setSize(60, 25);
		carChassi[16].setLocation(465, 450);
	}

	public static void main(String[] args) 
	{
		Car BMW = new Car();

	}

}
