
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author isaura
 */
public class Draw extends JPanel implements Runnable
{
    Thread thread = new Thread( this);
    
    EntradaTeclado input = new EntradaTeclado();
    
    Bola bola = new Bola( 300,200,100,90);
    
    Bola retangulo = new Bola(200,300,150,200);
    
    int r = 20;
    
    int c = 10;
    int v = 0;
    
    public Draw()
    {
        JFrame frame  = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,1200);
        frame.add(this);
        
        thread.start();
        
        frame.addKeyListener(input);
        
        frame.setVisible(true);
    }
    
    public void paintComponent( Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2d  = (Graphics2D)g;
        
        AffineTransform objecto  = g2d.getTransform();
        
        g2d.translate(v, r);
        
        g2d.setColor(Color.red);
        
        Rectangle2D.Double quadrado = new Rectangle2D.Double(retangulo.getPosx(),retangulo.getPosy(),retangulo.getLargura(),retangulo.getAltura());
        g2d.fill(quadrado);
        
        
        AffineTransform obj1 = g2d.getTransform();
        
        g2d.rotate(Math.toRadians(c), retangulo.getPosx()+(retangulo.getLargura()/2),retangulo.getPosy()+(retangulo.getAltura()/2));
        g2d.setColor(Color.white);
        Ellipse2D.Double esfera = new  Ellipse2D.Double(retangulo.getPosx()+(retangulo.getLargura()/2),retangulo.getPosy()+(retangulo.getAltura()/2),20,20);
        g2d.fill(esfera); //colocando no centro
        
        g2d.setTransform(obj1);
        obj1 = g2d.getTransform();
        
        AffineTransform obj2 = g2d.getTransform();

        g2d.rotate(Math.toRadians(c), retangulo.getPosx(),retangulo.getPosy()+retangulo.getAltura());
        g2d.setColor(Color.yellow);
        Ellipse2D.Double esfera1 = new  Ellipse2D.Double(retangulo.getPosx(),retangulo.getPosy()+retangulo.getAltura(),20,20);
        g2d.fill(esfera1); //no canto inferior esquerdo
        
         g2d.setTransform(obj2);
        obj2 = g2d.getTransform();
        
        
        
        AffineTransform obj = g2d.getTransform();
        g2d.rotate(Math.toRadians(c),retangulo.getPosx()+retangulo.getLargura(),retangulo.getPosy()+retangulo.getPosx());
        
         g2d.setColor(Color.yellow);
        Rectangle2D.Double esfera2 = new  Rectangle.Double(retangulo.getPosx()+retangulo.getLargura(),retangulo.getPosy()+retangulo.getPosx(),20,20);
        g2d.fill(esfera2); //no canto inferior esquerdo
       
        
        g2d.setTransform(obj);
        
        obj = g2d.getTransform();
       
       
       g2d.setTransform(objecto);
       objecto = g2d.getTransform();
        
    }
    
    public void dormir()
    {
        try 
        {
            Thread.sleep(10);
        } catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void atualizar()
    {
      
        //Realizando os eventos dads teclas
        
        
        if(input.isEsquerda())
        {
            v-=1;
        }
        
         if(input.isDireita())
        {
            v+=1;
        }
        
        if(input.isCima())
        {
            r-=3;
        }
        
        if(input.isBaixo())
        {
           r+=3;
        }
        if( r>=this.getHeight())
        {
            r =r*(0);
        }
       
        
        if(v>=this.getWidth())
        {
            v*=(0);
        }
    }

    @Override
    public void run()
    {
        while(true)
        {
         
            c++;
            atualizar();
            repaint();
            dormir();
        }
        
    }
    
}
