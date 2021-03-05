package javaapplication1;
import java.awt.*;
//import java.awt.Graphics.;
/**
 *
 * @author Toyosi
 */
public class Toyosi 
{

    /**
     * @param args the command line arguments
     */
    public void Toyosi_1()
    {
        Frame f = new Frame();
        MenuBar mb = new MenuBar();
        
        Menu m = new Menu("File");
        mb.add(m);
    
        Menu e = new Menu("Edit");
        mb.add(e);
    
        Menu v = new Menu("View");
        mb.add(v);
    
        Menu h = new Menu("Help");
        mb.add(h);
        
        f.setMenuBar(mb);
        
    }
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Toyosi j = new Toyosi();
                j.Toyosi_1();
    }
    
}
