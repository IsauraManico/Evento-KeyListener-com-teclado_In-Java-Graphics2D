
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


/** //Class responsavel por implementar a interface q vai KeyListener responsavel pelos eventos de teclado
 *
 * @author isaura
 */
public class EntradaTeclado implements KeyListener
{

    private boolean cima;
    private boolean baixo;
    private boolean esquerda;
    private boolean direita;

    //Encapsulando as variaveis
    
    
    public boolean isCima() 
    {
        return cima;
    }

    public void setCima(boolean cima) 
    {
        this.cima = cima;
    }

    public boolean isBaixo() 
    {
        return baixo;
    }

    public void setBaixo(boolean baixo) {
        this.baixo = baixo;
    }

    public boolean isEsquerda() {
        return esquerda;
    }

    public void setEsquerda(boolean esquerda) {
        this.esquerda = esquerda;
    }

    public boolean isDireita() {
        return direita;
    }

    public void setDireita(boolean direita) {
        this.direita = direita;
    }
    
    
    
    @Override
    public void keyTyped(KeyEvent ke) //Invoca quando o key tem um tipo
    {
       
    }

    @Override
    public void keyPressed(KeyEvent ke)  //Metodo responsavel por pressionar , ou seja enquanto pressionar
    {
        if(ke.getKeyCode()  == KeyEvent.VK_UP)
        {
            cima =  true;
        }
        
         if(ke.getKeyCode()  == KeyEvent.VK_DOWN)
        {
            baixo =  true;
        }
         
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            direita = true;
        }
        
        if(ke.getKeyCode() == KeyEvent.VK_LEFT)
        {
            esquerda = true;
        }
        
    }

    @Override
    public void keyReleased(KeyEvent ke)  ////Invoca o evento depois de pressionado pelo KeyPressed
    {
        if(ke.getKeyCode()  == KeyEvent.VK_UP)
        {
            cima =  false;
        }
        
            
         if(ke.getKeyCode()  == KeyEvent.VK_DOWN)
        {
            baixo =  false;
        }
         
        if(ke.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            direita = false;
        }
        
         if(ke.getKeyCode() == KeyEvent.VK_LEFT)
        {
            esquerda = false;
        }
        
    }
    
}
