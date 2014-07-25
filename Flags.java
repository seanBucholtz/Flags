/**
 * 
 * The purpose of this assignment is to create a class from scratch
 * and to manipulate properties of the graphic components in the NsccWindow class
 * 
 * <p>Level at which to grade the assignment: <b>Challenge</b><p>
 * 
 * @author Sean Bucholtz
 * @version Assignment 2: Flags
 * 
 */

public class Flags {
 
  /**
  * This is the application method that instantiates the various flag methods.
  * @param args The command-line arguments
  */
  
  public static void main(String[] args){
   
    Flags parade = new Flags();
    parade.drawNigerFlag();
    parade.drawSwedenFlag();
    parade.drawNorwayFlag();
    parade.drawSeychellesFlag();
    parade.drawAlabamaFlag();
    parade.drawGermanFlag();
  }
  
  /**
   * <p>Draws the flag of Niger</p>
   * 
   * <p>Calculations: <br>
   * fly:hoist::7:6::308:264 <br>
   * orangle:white:green::1:1:1::88:88:88 along the hoist</p>
   * <p>overall flag: <br>
   * dimension: 308x264 <br>
   * location: 25,30 (adjusted for centering on main window) </p>
   * <p>horizontal bars: <br>
   * dimensions: 308x88 <br>
   * locations: (0,0) & (0,176) <br>
   * 0 + 88 + 88 = 176 </p>
   * <p>center circle: <br>
   * dimensions: 66x66 <br>
   * 88*.75 = 66 <br>
   * location: 121,99 <br>
   * (308/2)-(66/2) = 121 along the fly <br>
   * (264/2)-(66/2) = 99 along the hoist</p>
   * 
   **/
  
  public void drawNigerFlag() {
   
    NsccWindow win = new NsccWindow(0,0,370,350);
    win.setTitle("Flag of Niger");
    NsccRectangle base = new NsccRectangle(25,30,308,264); // base flag object
    base.setBackground(java.awt.Color.white);
    base.setFilled(true);
    win.add(base);
    NsccRectangle rectTop = new NsccRectangle(0,0,308,88); // top color bar
    java.awt.Color customOrange = new java.awt.Color(255,127,0);
    rectTop.setBackground(customOrange);
    rectTop.setFilled(true);
    base.add(rectTop);
    NsccRectangle rectBottom = new NsccRectangle(0,176,308,88); // bottom color bar
    java.awt.Color customGreen = new java.awt.Color(0,204,0);
    rectBottom.setBackground(customGreen);
    rectBottom.setFilled(true);
    base.add(rectBottom);
    NsccEllipse centCir = new NsccEllipse(121,99,66,66); // center circle
    centCir.setBackground(customOrange);
    centCir.setFilled(true);
    base.add(centCir);
   
  }
  
  /**
   * <p>Draws the flag of Sweden</p>
   * 
   * <p>Calculations:<br>
   * fly:hoist::8:5::416:260 <br>
   * blue:yellow:blue::5:2:9::130:52:234 along the fly <br>
   * 5+2+9 = 16, 416/16 = 26, 26(5) = 130, 26(2) = 52, 26(9) = 234 <br>
   * blue:yellow:blue::4:2:4::104:52:104 along the hoist <br>
   * 4+2+4 = 10, 260/10 = 26, 26(4) = 104, 26(2) = 52 </p>
   * <p>overall flag: <br>
   * dimension: 416x260 <br>
   * location: 15,10 (adjusted for centering on main window)</p>
   * <p>horizontal bars: <br>
   * dimensions: 130x104 & 234x104 <br>
   * locations: (0,0),(0,156) & (182,0),(182,156) <br>
   * 0+130+52 = 182 along the fly <br>
   * 0+104+52 = 156 along the hoist </p>
   * 
   **/
  
  public void drawSwedenFlag() {
    
    NsccWindow win = new NsccWindow(0,0,455,315);
    win.setTitle("Flag of Sweden");
    NsccRectangle base = new NsccRectangle(15,10,416,260);
    base.setBackground(java.awt.Color.yellow);
    base.setFilled(true);
    win.add(base);
    NsccRectangle recTopRight = new NsccRectangle(182,0,234,104);
    recTopRight.setBackground(java.awt.Color.blue);
    recTopRight.setFilled(true);
    base.add(recTopRight);
    NsccRectangle recTopLeft = new NsccRectangle(0,0,130,104);
    recTopLeft.setBackground(java.awt.Color.blue);
    recTopLeft.setFilled(true);
    base.add(recTopLeft);
    NsccRectangle recBottomRight = new NsccRectangle(182,156,234,104);
    recBottomRight.setBackground(java.awt.Color.blue);
    recBottomRight.setFilled(true);
    base.add(recBottomRight);
    NsccRectangle recBottomLeft = new NsccRectangle(0,156,130,104);
    recBottomLeft.setBackground(java.awt.Color.blue);
    recBottomLeft.setFilled(true);
    base.add(recBottomLeft);
    
  }
  
   /**
   * <p>Draws the flag of Norway</p>
   * 
   * <p>Calculations: <br>
   * fly:hoist::22:16::352:256 <br>
   * red:white:blue:white:red::6:1:2:1:12::96:16:32:16:192 along the fly <>br
   * 6+1+2+1+12 = 22, 352/22 = 16, 16(6) = 96, 16(1) = 16, 16(2) = 32, 16(12) = 192 <>br
   * red:white:blue:white:red::6:1:2:1:6::96:16:32:16:96 along the hoist <br>
   * 6+1+2+1+6 = 16, 256/16 = 16, 16(6) = 96, 16(1) = 16, 16(2) = 32 </p>
   * <p>overall flag: <br>
   * dimension: 352x256 <br>
   * location: 15,15 (adjusted for centering on main window) <\p>
   * <p>horizontal bars: <br>
   * dimensions: r,w,w,r 96x96, 112x112, 208x112, 192x96 <br>
   * width: <br>
   * 16(6) = 96, 96+16(1) = 112, 16(1)+16(12) = 208, 16(12) = 192 <br>
   * height: <br>
   * 16(6) = 96, 96+16(1) = 112, 16(1)+16(6) = 112, 16(6) = 96 </p>
   * <p>locations: r,w,w,r (0,0),(0,0),(144,0),(160,0) & (0,144),(0,160),(144,144),(160,160) <br>
   * 2nd layer(white): 0+112+16(2 *blue*) = 144 along the fly <br>
   * 3rd layer(red): 0+96+16(1 *white*)+16(2 *blue*)+16(1 *white*) = 160 along the fly <br>
   * 2nd layer(white): 0+112+16(2 *blue*) = 144 along the hoist <br>
   * 3rd layer(red): 0+96+16(1 *white*)+16(2 *blue*)+16(1 *white*) = 160 along the hoist </p>
   * 
   **/

  public void drawNorwayFlag() {
    
    NsccWindow win = new NsccWindow(0,0,385,320);
    win.setTitle("Flag of Norway");
    NsccRectangle base = new NsccRectangle(15,15,352,256); // base layer (blue) ! adjust centering
    base.setBackground(java.awt.Color.blue);
    base.setFilled(true);
    win.add(base);
    NsccRectangle ltWhiteRec = new NsccRectangle(0,0,112,112); //2nd layer (white) top-left
    ltWhiteRec.setBackground(java.awt.Color.white);
    ltWhiteRec.setFilled(true);
    base.add(ltWhiteRec);
    NsccRectangle rtWhiteRec = new NsccRectangle(144,0,208,112); ////2nd layer (white) top-right
    rtWhiteRec.setBackground(java.awt.Color.white);
    rtWhiteRec.setFilled(true);
    base.add(rtWhiteRec);
    NsccRectangle lbWhiteRec = new NsccRectangle(0,144,112,112); //2nd layer (white) bottom-left
    lbWhiteRec.setBackground(java.awt.Color.white);
    lbWhiteRec.setFilled(true);
    base.add(lbWhiteRec);
    NsccRectangle rbWhiteRec = new NsccRectangle(144,144,208,112); ////2nd layer (white) bottom-right
    rbWhiteRec.setBackground(java.awt.Color.white);
    rbWhiteRec.setFilled(true);
    base.add(rbWhiteRec);
    NsccRectangle ltRedRec = new NsccRectangle(0,0,96,96); //3rd layer (red) top-left
    ltRedRec.setBackground(java.awt.Color.red);
    ltRedRec.setFilled(true);
    base.add(ltRedRec);
    NsccRectangle rtRedRec = new NsccRectangle(160,0,192,96); //3rd layer (red) top-right
    rtRedRec.setBackground(java.awt.Color.red);
    rtRedRec.setFilled(true);
    base.add(rtRedRec);
    NsccRectangle lbRedRec = new NsccRectangle(0,160,96,96); //3rd layer (red) bottom-left
    lbRedRec.setBackground(java.awt.Color.red);
    lbRedRec.setFilled(true);
    base.add(lbRedRec);
    NsccRectangle rbRedRec = new NsccRectangle(160,160,192,96); //3rd layer (red) bottom-right
    rbRedRec.setBackground(java.awt.Color.red);
    rbRedRec.setFilled(true);
    base.add(rbRedRec);
  
}
 
   /**
   * <p>Draws the flag of Seychelles</p>
   * 
   * <p>Calculations: <br>
   * fly:hoist::2:1::444:222 <br>
   * blue:yellow:red::1:1:1::148:148:148 along the fly <br>
   * 1+1+1 = 3, 444/3 = 148, 148(1) = 148 <br>
   * red:white:green::1:1:1::74:74:74 along the hoist <br>
   * 1+1+1 = 3, 222/3 = 74, 74(1) = 74 </p>
   * <p>overall flag: <br>
   * dimension: 444x222 <br>
   * location: 15,15 (adjusted for centering on main window) </p>
   * <p>Triangles: <br>
   * dimensions: b,y,w,g 296x222, 592x222, 444x296, 444x148 <br>
   * 2*148 = 296, 4*148 = 592, 4*74 = 296, 2*148 <br>
   * locations: b,y,w,g (-148,0),(-296,0),(0,74),(0,148) <br>
   * 0-(296/2) = -148, 0-(296/2) = -148, 222-(296/2) = 74, 222-(148/2) = 148 </p>
   * 
   **/
  
  public void drawSeychellesFlag() {
   
    NsccWindow win = new NsccWindow(0,0,474,282);
    win.setTitle("Flag of Seychelles");
    NsccRectangle base = new NsccRectangle(15,15,444,222);
    base.setBackground(java.awt.Color.red);
    base.setFilled(true);
    win.add(base);
    NsccDownTriangle topBig = new NsccDownTriangle(-296,0,592,222);
    topBig.setBackground(java.awt.Color.yellow);
    topBig.setFilled(true);
    base.add(topBig);
    NsccDownTriangle topSmall = new NsccDownTriangle(-148,0,296,222);
    topSmall.setBackground(java.awt.Color.blue);
    topSmall.setFilled(true);
    base.add(topSmall);
    NsccLeftTriangle bottomBig = new NsccLeftTriangle(0,74,444,296);
    bottomBig.setBackground(java.awt.Color.white);
    bottomBig.setFilled(true);
    base.add(bottomBig);
    NsccLeftTriangle bottomSmall = new NsccLeftTriangle(0,148,444,148);
    java.awt.Color customGreen = new java.awt.Color(0,128,0);
    bottomSmall.setBackground(customGreen);
    bottomSmall.setFilled(true);
    base.add(bottomSmall);
  }
  
   /**
   * <p>Draws the flag of Alabama</p>
   * 
   * <p>Calculations: <br>
   * fly:hoist::10:6::440:264 <br>
   * red:white:red::1:9:1::40:360:40 along the fly <br>
   * 1+9+1 = 11, 440/11 = 40, 40(1) = 40, 40(9) = 360 <br>
   * red:white:red::1:9:1::24:216:24 along the hoist <br>
   * 1+9+1 = 11, 264/11 = 24, 24(1) = 24, 24(9) = 216 </p>
   * <p>overall flag:<br>
   * dimension: 440x264 <br>
   * location: 15,15 (adjusted for centering on main window) </p>
   * <p>Triangles: <br>
   * dimensions (white): 180x216, 360x108 <br>
   * 40(9)*1/2 = 180, 24(9) = 216, 40(9) = 360, 24(9)*1/2 = 108 <br>
   * <br>Having 4 triangle objects, connecting them together to form a rectangle with 
   * width 360 and height 216 the heights of the individual triangles equals
   * half of the length of the perpindicular side.</p> 
   * <p>locations (white): (0,24),(40,0),(260,24),(40,156) <br>
   * 24(1) = 24, 40(1) = 40, 440-180 = 260, 24(1) = 24, 264-108 = 156 </p>
   * 
   **/
  
  public void drawAlabamaFlag() {
   
    NsccWindow win = new NsccWindow(0,0,470,325);
    win.setTitle("Flag of Alabama");
    NsccRectangle base = new NsccRectangle(15,15,440,264);
    base.setBackground(java.awt.Color.red);
    base.setFilled(true);
    win.add(base);
    NsccRightTriangle rTria = new NsccRightTriangle(0,24,180,216);
    rTria.setBackground(java.awt.Color.white);
    rTria.setFilled(true);
    base.add(rTria);
    NsccDownTriangle dTria = new NsccDownTriangle(40,0,360,108);
    dTria.setBackground(java.awt.Color.white);
    dTria.setFilled(true);
    base.add(dTria);
    NsccLeftTriangle lTria = new NsccLeftTriangle(260,24,180,216); //(260,24,180,216)
    lTria.setBackground(java.awt.Color.white);
    lTria.setFilled(true);
    base.add(lTria);
    NsccUpTriangle uTria = new NsccUpTriangle(40,156,360,108);
    uTria.setBackground(java.awt.Color.white);
    uTria.setFilled(true);
    base.add(uTria);
    
  }
  
   /**
   * <p>Draws the flag of Germany</p>
   * 
   * <p>Calculations: <br>
   * fly:hoist::5:3::500:300 <br>
   * black:red:gold::1:1:1::100:100:100 along the hoist <br>
   * 1+1+1 = 3, 300/3 = 100, 100(1) </p>
   * <p>overall flag <br>:
   * dimension: 500x300 <br>
   * location: 15,15 (adjusted for centering on main window)</p>
   * <p>horizontal bars: <br>
   * dimensions: 500x100 </p>
   * <p>locations: (0,0) & (0,200) <br>
   * 0 + 100 + 100 = 200 </p>
   **/
  
  public void drawGermanFlag() {
   
    NsccWindow win = new NsccWindow(0,0,530,365);
    win.setTitle("Flag of Germany");
    NsccRectangle base = new NsccRectangle(15,15,500,300);
    java.awt.Color customRed = new java.awt.Color(255,0,0);
    base.setBackground(customRed);
    base.setFilled(true);
    win.add(base);
    NsccRectangle topBar = new NsccRectangle(0,0,500,100);
    java.awt.Color customBlack = new java.awt.Color(0,0,0);
    topBar.setBackground(customBlack);
    topBar.setFilled(true);
    base.add(topBar);
    NsccRectangle bottomBar = new NsccRectangle(0,200,500,100);
    java.awt.Color customGold = new java.awt.Color(255,204,0);
    bottomBar.setBackground(customGold);
    bottomBar.setFilled(true);
    base.add(bottomBar);
  }
}