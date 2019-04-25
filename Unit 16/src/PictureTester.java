/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
	
	//School computer path: C:\Users\geroes3431\Downloads\images
	//Laptop path: C:\Users\Serena\Desktop\geroe_serena_apcsa-p222\Unit 16\src\images\\
	
	
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
	//School
	Picture beach = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\beach.jpg");
	
	//Laptop
//    Picture beach = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\beach.jpg");
    
	beach.explore();
    beach.zeroBlue();
    beach.explore();
    
	  
//	 //Testing another pic for exercise 1, pg. 6
//	Picture caterpillar = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\caterpillar.jpg");
//    caterpillar.explore();
//    caterpillar.zeroBlue();
//    caterpillar.explore();
    
    
////    testing a new pic for exercise 2, pg. 6
//	Picture pug = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
//	pug.explore();
//	pug.zeroBlue();
//	pug.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	//School
	Picture pug = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
	//H:\APCSA Units\geroe_serena_apcsa-p222\Unit 16\src\images
	
	//Laptop
//	Picture pug = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\pugonabike.jpg");
	
	pug.explore();
	pug.keepOnlyBlue();
	pug.explore();  
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
	//Laptop
//	Picture pug = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
	  
	  //School
	Picture pug = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
	pug.explore();
	pug.keepOnlyRed();
	pug.explore();  
  }
  
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
	//Laptop
//	  Picture pug = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
	  
	//School
	Picture pug = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");

	pug.explore();
	pug.keepOnlyGreen();
	pug.explore();  
  }

  /** Method to test negate*/
  public static void testNegate()
  {
	 //Laptop
//	Picture pug = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
	  
	//School
	  
	Picture pug = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");

	pug.explore();
	pug.negate();
	pug.explore();  
  }
  
  /** Method to test grayscale*/
  public static void testGrayscale()
  {
	//Laptop
//	Picture pug = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
	
	//School
	Picture pug = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\pugonabike.jpg");
  
	
	pug.explore();
	pug.grayscale();
	pug.explore();  
  }  
  
  /** Method to test test FixUnderwater*/
  public static void testFixUnderwater()
  {
	  //Laptop
//	Picture water = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\water.jpg");
	
	//School
	Picture water = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\water.jpg");

	
	water.explore();
	water.fixUnderwater();
	water.explore();  
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
	 //School 
	 Picture caterpillar = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\caterpillar.jpg");
	  
	//Laptop
//	Picture caterpillar = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\caterpillar.jpg");
	 
	caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalRightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
	//Laptop
//	Picture caterpillar = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\caterpillar.jpg");
	
	//School
	Picture caterpillar = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\caterpillar.jpg");

	caterpillar.explore();
	caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
	//Laptop
//	Picture moto = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\redMotorcycle.jpg");
	  
	//School
	Picture moto = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\redMotorcycle.jpg");
	
	moto.explore();
	moto.mirrorHorizontal();
	moto.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
	//Laptop
//	Picture moto = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\redMotorcycle.jpg");
	
	//School
	Picture moto = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\redMotorcycle.jpg");

	moto.explore();
	moto.mirrorHorizontalBotToTop();
	moto.explore();
  }

  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
//	Picture beach = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\beach.jpg");
	  
	//Laptop
//	Picture beach = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\beach.jpg");
	
	//School
	Picture beach = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\beach.jpg");

	
	beach.explore();
	beach.mirrorDiagonal();
	beach.explore();
  }  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
	//Laptop
//    Picture temple = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\temple.jpg");
    
    //School
	Picture temple = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\temple.jpg");

    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
	//Laptop
//    Picture snowman = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\snowman.jpg");
	  
	//School
	Picture snowman = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\snowman.jpg");

	 
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  
  /** Method to test mirrorGull */
  public static void testMirrorGull()
  {
	//Laptop
//    Picture gull= new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\seagull.jpg");
    
    //School
	Picture gull = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\seagull.jpg");

    gull.explore();
    gull.mirrorGull();
    gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
	//School
    Picture canvas = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test copy */
  public static void testCopy()
  {
//	Laptop
//    Picture gull= new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\seagull.jpg");
//    Picture temple = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\temple.jpg");
    
//  School
	Picture gull = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\seagull.jpg");
	Picture temple = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\temple.jpg");

    
    temple.explore();
    gull.explore();
    temple.copy(gull,230,330,230,350);
    temple.explore();
  }
  
  /** Method to test myCollage */
  public static void testMyCollage()
  {
	  //laptop
//	    Picture myCanvas = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\640x480.jpg");
	    
	    //School
		Picture myCanvas = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\640x480.jpg");
		
	    myCanvas.myCollage();
	    myCanvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
	  //FOR SCHOOL COMP
//    Picture swan = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\swan.jpg");
    
    //FOR LAPTOP
    Picture swan = new Picture("H:\\APCSA Units\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	
//    testZeroBlue();
//    testKeepOnlyBlue();
    testKeepOnlyRed();
//    testKeepOnlyGreen();
    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVertical();
//    testMirrorVerticalRightToLeft();
//	  testMirrorHorizontal();
//	  testMirrorHorizontalBotToTop();
//	  testMirrorDiagonal();
//	  testMirrorTemple();
	  testMirrorArms();
//	  testMirrorGull();
//	  testCopy();
//	  testCollage();
//	  testMyCollage();
//	  testEdgeDetection();

	  
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}