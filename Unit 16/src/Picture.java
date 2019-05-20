import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  //PICTURE LAB EXTENSION************************************************

  //ATTEMPT #1
  /** For every black pixel in the messagePict:
  * Use the least significant digit of the first character of each line
  * to change the Blue value by +- 10 units. on the corresponding pixel
  * for encoded image
  * @param messagePict the picture with a message
  */
  public void encode(Picture messagePict)
  {
		Pixel[][] messagePixels = messagePict.getPixels2D();
		Pixel[][] currPixels = this.getPixels2D();
		Pixel currPixel = null;
		Pixel messagePixel = null;
		try
		{
			
			CharMap map = new CharMap();
			map.setMap(new Scanner(new File("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\words.dat")));
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println("Literature not found");
			e.printStackTrace();
		}
		
		//actual encoding
//		for(int row = 0; row < this.getHeight(); row++)
//		{
//		  for(int col = 0; col < this.getWidth(); col++)
//		  {
//			  if(messagePixel.colorDistance(Color.BLACK) < 50)
//			  {
//				  
//			  }
//		  }
//		}
//		System.out.println(count);
  }
  
  /**
  * Method to decode a message hidden in the
  * blue value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {

		  }
	  }
//	  System.out.println(count);
	  return messagePicture;
  }
  
  //MR. MAURO'S EXAMPLE CODE---------------------------------------------
  /** Hide a black and white message in the current
  * picture by changing the red to even and then
  * setting it to odd if the message pixel is black
  * @param messagePict the picture with a message
  */
  public void testEncode(Picture messagePict)
  { 
	Pixel[][] messagePixels = messagePict.getPixels2D();
	Pixel[][] currPixels = this.getPixels2D();
	Pixel currPixel = null;
	Pixel messagePixel = null;
	int count = 0;
	for(int row = 0; row < this.getHeight(); row++)
	{
	  for(int col = 0; col < this.getWidth(); col++)
	  {
		  // if the current pixel red is odd make it even
		  currPixel = currPixels[row][col];
		  if (currPixel.getRed() % 2 == 1)
			  currPixel.setRed(currPixel.getRed() - 1);
		  messagePixel = messagePixels[row][col];
		  if (messagePixel.colorDistance(Color.BLACK) < 50)
		  {
			  currPixel.setRed(currPixel.getRed() + 1);
			  count++;
		  }
	  }
	}
//	System.out.println(count);
  }
  
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture testDecode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
			  {
				  messagePixel.setColor(Color.BLACK);
				  count++;  
			  }
		  }
	  }
//	  System.out.println(count);
	  return messagePicture;
  }
  //MR. MAURO'S EXAMPLE CODE---------------------------------------------
  
  //PICTURE LAB EXTENSION************************************************

  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  //Sharpen
  public void sharpen(int x,int y,int w,int h)
  {
		Pixel[][] pixels = this.getPixels2D();
		Pixel upLeftPix = null;
		Pixel thisPixel = null;
		
//		int[] upLftCols = new int[pixels.length]; If time: use matrices instead of repeating code
//		int[] thisColos= new int[pixels.length];		

		for (int row = 1; row < pixels.length; row++)
		{
		  for(int col = 1; col < pixels[0].length; col++)
		  {
		    thisPixel = pixels[row][col];  
		    upLeftPix = pixels[row-1][col-1];
		    
//		    add one-half of the difference between the current 
//		    pixel and pixel located immediately above and to the
//		    left of the current pixel
//		    System.out.println(thisPixel.getColor());
		    
		    
		    
		    int upLeftRed = upLeftPix.getRed();
		    int thisRed = thisPixel.getRed();
		    int tryRed = thisPixel.getRed() + (int) (0.5 * (Math.abs(upLeftRed - thisRed ) ) );
		    if(tryRed >255) thisPixel.setRed(255);
		    else if(tryRed < 0) thisPixel.setRed(0);
		    else thisPixel.setRed(tryRed);

		    int upLeftGre = upLeftPix.getGreen();
		    int thisGre = thisPixel.getGreen();
		    int tryGre = thisPixel.getGreen() + (int) (0.5 * Math.abs((upLeftGre - thisGre)) );
		    if(tryGre >255) thisPixel.setGreen(255);
		    else if(tryGre < 0) thisPixel.setGreen(0);
		    else thisPixel.setGreen(tryGre);
		    
		    int thisBlu = thisPixel.getBlue();
		    int upLeftBlu = upLeftPix.getBlue();
		    int tryBlu = thisPixel.getBlue() + (int) (0.5 * Math.abs((upLeftBlu - thisBlu )) );
		    if(tryBlu >255) thisPixel.setBlue(255);
		    else if(tryBlu < 0) thisPixel.setBlue(0);
		    else thisPixel.setBlue(tryBlu);

		  }
		}
  }
  
  
  /**
   * Method to keep only the blue values, 
   * that is, it will set the red and green values 
   * to zero.
   */
  
  public void keepOnlyBlue()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
    {
	  for (Pixel pixelObj : rowArray)
      {
	    pixelObj.setRed(0);
	    pixelObj.setGreen(0);
      }
    }
  }
  
  /**
   * Method to keep only the red values, 
   * that is, it will set the blue and green values 
   * to zero.
   */
  
  public void keepOnlyRed()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
    {
	  for (Pixel pixelObj : rowArray)
      {
	    pixelObj.setBlue(0);
	    pixelObj.setGreen(0);
      }
    }
  }
  
  /**
   * Method to keep only the green values, 
   * that is, it will set the red and blue values 
   * to zero.
   */
  
  public void keepOnlyGreen()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
    {
	  for (Pixel pixelObj : rowArray)
      {
	    pixelObj.setRed(0);
	    pixelObj.setBlue(0);
      }
    }
  }  
  
  /**
   *  Method to set the red value to 255 minus
   *  the current red value, the green value 
   *  to 255 minus the current green value
   *  and the blue value to 255 minus the current 
   *  blue value
   */
  public void negate()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
    {
	  for (Pixel pixelObj : rowArray)
	  {
	    pixelObj.setRed(255-pixelObj.getRed());
	    pixelObj.setBlue(255-pixelObj.getBlue());
	    pixelObj.setGreen(255-pixelObj.getGreen());
	  }
	}
  }
  
  /**
   * Method to turn the picture into shades of 
   * gray. Set the red, green, and blue values 
   * to the average of the current red, green,
   *  and blue values (add all three values and
   *  divide by 3)
   */
  public void grayscale()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
    {
	  for (Pixel pixelObj : rowArray)
	  {
		int avg = ( pixelObj.getRed() + pixelObj.getGreen()
		 + pixelObj.getBlue() )/3; 
	    pixelObj.setRed(avg);
	    pixelObj.setBlue(avg);
	    pixelObj.setGreen(avg);
	  }
	}
  }
  
  /**
   * Method to modify the pixel colors 
   * to make the fish easier to see.
   */
  
  public void fixUnderwater()
  {
	Pixel[][] pixels = this.getPixels2D();
	for (Pixel[] rowArray : pixels)
    {
	  for (Pixel pixelObj : rowArray)
      {  
		if(pixelObj.getRed() <=20 && pixelObj.getGreen()>155)
		{
			pixelObj.setGreen(0);
			pixelObj.setRed(0);
		}
      }
    }
  }
    
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /**
   * Method to mirror a picture around a mirror
   * placed vertically from right to left
   */
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
	  }
    }
  }
  
  /**
   * Method to mirror a picture around a mirror placed
   * horizontally at the middle of the height of the picture
   */
  public void mirrorHorizontal()
  {
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int height = pixels.length;
	for (int row = 0; row < height/2; row++)
	{
	  for(int col = 0; col < pixels[0].length; col++)
	  {
	    topPixel = pixels[row][col];
	    bottomPixel = pixels[height-row-1][col];
	    bottomPixel.setColor(topPixel.getColor());
	  }
	}
  }
  
  /**
   * Method to mirror the picture around a mirror
   * placed horizontally from bottom to top.
   */
  public void mirrorHorizontalBotToTop()
  {
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int height = pixels.length;
	for (int row = 0; row < height/2; row++)
	{
	  for(int col = 0; col < pixels[0].length; col++)
	  {
	    topPixel = pixels[row][col];
	    bottomPixel = pixels[height-row-1][col];
	    topPixel.setColor(bottomPixel.getColor());
	  }
	}
  }
  
  /**
   * Method to mirror just a square part of the picture 
   * from bottom left to top right around a mirror 
   * placed on the diagonal line (the diagonal line 
   * is the one where the row index equals the column index)
   */
  public void mirrorDiagonal()
  {
	Pixel[][] pixels = this.getPixels2D();
	Pixel topPixel = null;
	Pixel bottomPixel = null;
	int maxLen; //bc don't want index to go out of bounds
	
	if(pixels.length < pixels[0].length) maxLen = pixels.length;
	else maxLen = pixels[0].length;
	
	for (int row = 0; row < maxLen; row++)
	{
	  for(int col = 0; col < maxLen; col++)
	  {
	    topPixel = pixels[row][col];
	    bottomPixel = pixels[col][row];
	    bottomPixel.setColor(topPixel.getColor());
	  }
	}
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println("count :: "+count);
  }
  
  /**
   * Method to mirror the arms on the snowman 
   * (“snowman.jpg”) to make a snowman with 4 arms
   */
  public void mirrorArms() // Row 155 - 195
  {
	int mirrorPoint = 195; //row;
	Pixel bottomPixel = null;
	Pixel topPixel = null;
	Pixel[][] pixels = this.getPixels2D();
	    
	// loop from 155 to just before the mirror point
	for (int row = 165; row < mirrorPoint; row++)
	{
	  // loop through columns
	  for (int col = 0; col < pixels[0].length; col++)
	  {
	    topPixel = pixels[row][col];      
	    bottomPixel = pixels[mirrorPoint - row + mirrorPoint] [col];
	    bottomPixel.setColor(topPixel.getColor());
	  }
	}
  }
  
  
  /**
   * Method to mirror the seagull (“seagull.jpg”) to the right so
   * that there are two seagulls on the beach near each other
   */
  public void mirrorGull() // Row 230 -> 330, Col 230 -> 350,
  {
	int mirrorPoint = 350; //col
	Pixel leftPixel = null;
	Pixel rightPixel = null;
	Pixel[][] pixels = this.getPixels2D();
	    
	// loop through rows
	for (int row = 230; row < 330; row++)
	{
	  // loop from 230 to just before the mirror point
	  for (int col = 230; col < mirrorPoint; col++)
	  {
	    leftPixel = pixels[row][col];      
	    rightPixel = pixels[row] [mirrorPoint - col + mirrorPoint];
	    rightPixel.setColor(leftPixel.getColor());
	  }
	}
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** Method to create a second copy method that adds 
   * parameters to allow you to copy just part of the
   * fromPic. It adds parameters that specify the start 
   * row, end row, start column, and end column to copy from
  */
  public void copy(Picture fromPic, int startRow, int endRow, int startCol, int endCol)
  {
	Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startRow, toRow = startRow; 
         fromRow < endRow &&
         toRow < endRow; 
	     fromRow++, toRow++)
    {
       for (int fromCol = startCol, toCol = startCol; 
	        fromCol < endCol &&
	        toCol < endCol;  
	        fromCol++, toCol++)
	   {
         fromPixel = fromPixels[fromRow][fromCol];
         toPixel = toPixels[toRow][toCol];
         toPixel.setColor(fromPixel.getColor());
	   }
    }    
    
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
	//laptop
//    Picture flower1 = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\flower1.jpg");
//    Picture flower2 = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\flower2.jpg");
	  
	//school
	 Picture flower1 = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\flower1.jpg");
	 Picture flower2 = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\flower2.jpg");
	 
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    
    //laptop
//    this.write("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\imagescollage.jpg");
    
    //school
    this.write("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\imagescollage.jpg");
  }
  
  /** Method to create an image that has at least 
   * three pictures (can be the same picture) copied
   * three times with three different picture 
   * manipulations and at least one mirroring
   */
  public void myCollage()
  {
	  	//FOR LAPTOP
//	    Picture gull= new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\seagull.jpg");
//	    Picture flower2 = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\flower2.jpg");
//	    Picture snowman = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\snowman.jpg");
	   
//	    For School
	    Picture gull = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\seagull.jpg");
	    Picture flower2 = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\flower2.jpg");
	    Picture snowman = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\snowman.jpg");
	    
	    this.copy(flower2,0,0);
	    this.copy(gull,230,330,230,350);
	    this.copy(snowman,75,162,160,347);
	    
	    Picture snowmanNoBlue = new Picture(snowman);
	    snowmanNoBlue.zeroBlue();
	    this.copy(snowmanNoBlue,200,0);
	    
	    Picture negateFlower = new Picture(flower2);
	    negateFlower.negate();
	    this.copy(negateFlower,400, 0);
	    
	    Picture greenGull = new Picture(gull);
	    greenGull.keepOnlyGreen();
	    this.copy(greenGull,230,330,230,350);
	    
	    this.mirrorVertical();
	    
	    //Laptop
//	    this.write("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\imagesMyCollage.jpg");
	    
	    //School
	    this.write("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\imagesMyCollage.jpg");
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel bottomPixel = null;
    
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color bottomColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        bottomPixel = pixels[row+1][col];
        
        rightColor = rightPixel.getColor();
        bottomColor = bottomPixel.getColor();
        
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist || 
            leftPixel.colorDistance(bottomColor) >
            edgeDist)
        
        { 
        	leftPixel.setColor(Color.BLACK);
        }

        else
        {
          leftPixel.setColor(Color.WHITE);
        }
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
