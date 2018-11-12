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
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture cp = new Picture("caterpillar.jpg");
    cp.explore();
    cp.mirrorVertical();
    cp.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
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
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testKeepOnlyBlue(){
	  Picture geta = new Picture("gogeta.jpg");
	  geta.keepOnlyBlue();
	  geta.explore();
  }
  public static void testNegate() {
	  Picture geta = new Picture("gogeta.jpg");
	  geta.negate();
	  geta.explore();	  
  }
  public static void testGrayscale() {
	  Picture geta = new Picture("gogeta.jpg");
	  geta.grayscale();
	  geta.explore();	  
  }
  public static void testFixUnderwater() {
	  Picture water = new Picture("water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  public static void testMirrorVerticalRightToLeft() {
	  Picture cp = new Picture("caterpillar.jpg");
	  cp.explore();
	  cp.mirrorVerticalRightToLeft();
	  cp.explore();
  }
  public static void testMirrorHorizontal() {
	  Picture cp = new Picture("caterpillar.jpg");
	  cp.explore();
	  cp.mirrorHorizontal();
	  cp.explore();	  
  }
  public static void testMirrorHorizontalBotToTop() {
	  Picture cp = new Picture("caterpillar.jpg");
	  cp.explore();
	  cp.mirrorHorizontalBotToTop();
	  cp.explore();
  }
  public static void testMirrorDiagonal() {
	  Picture b = new Picture("beach.jpg");
	  b.explore();
	  b.mirrorDiagonal();
	  b.explore();	  
  }
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }
  public static void testCopy2() {
	  Picture flower1 = new Picture("flower1.jpg");
	  Picture flower2 = new Picture("flower2.jpg");
	  flower1.copy2(flower2, 0, 100, 0, 100);
	  flower2.explore();
  }
  public static void testMyCollage() {
	  Picture snowman = new Picture("snowman.jpg");
	  snowman.myCollage();
	  snowman.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    testZeroBlue();
    testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    testNegate();
    testGrayscale();
    testFixUnderwater();
    testMirrorVertical();
    testMirrorVerticalRightToLeft();
    testMirrorHorizontal();
    testMirrorHorizontalBotToTop();
    testMirrorDiagonal();
    testMirrorTemple();
    testMirrorArms();
    testMirrorGull();
    testCopy2();
    testMyCollage();
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