import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Dimension;

public class Visual extends Canvas {
    
    private static final long serialVersionUID = 240840600533728354L;

    public Visual( int w, int h, String n, Game g ) {

        JFrame f = new JFrame( n );
        f.setPreferredSize( new Dimension( w, h ) );
        f.setMaximumSize( new Dimension( w, h ) );
        f.setMinimumSize( new Dimension( w, h ) );
        f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        f.setResizable( false );
        f.setLocationRelativeTo( null );
        f.add( g );
        f.setVisible( true );
        g.start( );
        
    }
}