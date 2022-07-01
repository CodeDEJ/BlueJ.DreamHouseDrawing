
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square roof1;
    private Square roof2;
    private Square roof3;
    private Square roof4;
    private Square roof5;
    private Square roof6;
    private Square roof7;
    private Square roof8;
    private Triangle fin;
    private Circle moat;
    private Square door;
    private Triangle tree;
    private Square wall2;
    private Square grass;
    private Square wall3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        
        grass = new Square();
        grass.changeColor("grass");
        grass.moveHorizontal (-60);
        grass.changeSize(700);
        grass.makeVisible();
        grass.moveVertical(350);
        

        
        moat = new Circle();
        moat.changeColor("blue");
        moat.moveHorizontal(250);
        moat.moveVertical(200);
        moat.changeSize(350);
        moat.makeVisible();
        
        
        
        wall = new Square();
        wall.changeColor("gray");
        wall.moveVertical(60);
        wall.changeSize(300);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.changeColor("gray");
        wall2.moveVertical(60);
        wall2.moveHorizontal (150);
        wall2.changeSize(300);
        wall2.makeVisible();
        
        wall3 = new Square();
        wall3.changeColor("gray");
        wall3.moveVertical(60);
        wall3.moveHorizontal (370);
        wall3.changeSize(300);
        wall3.makeVisible();
        
        door = new Square();
        door.changeColor("brown");
        door.moveHorizontal(250);
        door.moveVertical(160);
        door.changeSize(200);
        door.makeVisible();


        roof1 = new Square();
        roof1.changeSize(70);
        roof1.changeColor("gray");
        roof1.moveHorizontal(-20);
        roof1.moveVertical(0);
        roof1.makeVisible();
        
        roof2 = new Square();
        roof2.changeSize(70);
        roof2.changeColor("gray");
        roof2.moveHorizontal(70);
        roof2.moveVertical(0);
        roof2.makeVisible();
        
        roof3 = new Square();
        roof3.changeSize(70);
        roof3.changeColor("gray");
        roof3.moveHorizontal(160);
        roof3.moveVertical(0);
        roof3.makeVisible();

        roof4 = new Square();
        roof4.changeSize(70);
        roof4.changeColor("gray");
        roof4.moveHorizontal(250);
        roof4.moveVertical(0);
        roof4.makeVisible();
        
        roof5 = new Square();
        roof5.changeSize(70);
        roof5.changeColor("gray");
        roof5.moveHorizontal(340);
        roof5.moveVertical(0);
        roof5.makeVisible();
        
        roof6 = new Square();
        roof6.changeSize(70);
        roof6.changeColor("gray");
        roof6.moveHorizontal(430);
        roof6.moveVertical(0);
        roof6.makeVisible();
        
        roof7 = new Square();
        roof7.changeSize(70);
        roof7.changeColor("gray");
        roof7.moveHorizontal(520);
        roof7.moveVertical(0);
        roof7.makeVisible();
        
        roof8 = new Square();
        roof8.changeSize(70);
        roof8.changeColor("gray");
        roof8.moveHorizontal(610);
        roof8.moveVertical(0);
        roof8.makeVisible();
        

        
        fin = new Triangle();
        fin.changeColor("gray");
        fin.changeSize(90, 100);
        fin.moveHorizontal(450);
        fin.moveVertical(450);
        fin.makeVisible();


    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            roof1.changeColor("white");
            fin.changeColor("black");
            moat.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            roof1.changeColor("black");
            fin.changeColor("green");
            moat.changeColor("yellow");
        }
    }

}
