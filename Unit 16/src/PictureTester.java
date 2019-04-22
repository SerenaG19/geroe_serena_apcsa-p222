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
	
	//School computer path:     C:\Users\geroes3431\Downloads\images
	//Laptop path: C:\Users\Serena\Desktop\geroe_serena_apcsa-p222\Unit 16\src\images\\
	
	
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
//  Picture beach = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\beach.jpg");
//    Picture beach = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\beach.jpg");
//	beach.explore();
//    beach.zeroBlue();
//    beach.explore();
    
	  
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
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
//  Picture caterpillar = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\caterpillar.jpg");
	Picture caterpillar = new Picture("C:\\Users\\Serena\\Desktop\\geroe_serena_apcsa-p222\\Unit 16\\src\\images\\caterpillar.jpg");
	caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("C:\\Users\\geroes3431\\Downloads\\images\\swan.jpg");
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
    testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}