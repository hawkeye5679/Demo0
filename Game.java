import java.awt.Canvas;

public class Game extends Canvas implements Runnable {
   
   public static final long serialVersionUID = 1550691097823471818L;
   
   public static final int w = 640, h = ( w / 12 * 9 );
   public Thread thread;
   public boolean on = false;
   
   
   public Game( ) {
      new Visual( w, h, "CHICKENS", this );
      
   }
   public static void main( String args[ ] ){
      
      new Game( );
   
   }
   public synchronized void start( ) {
   
      thread = new Thread( this );
      thread.start( );
      on = true;
      
   }
   public synchronized void stop( ) {
   
      try{
         thread.join( );
         on = false;
      }
      catch( Exception e ) {
         e.printStackTrace( );
      }
      
   }
   
   public void run( ) {
   
     stop( );
   
   }
}