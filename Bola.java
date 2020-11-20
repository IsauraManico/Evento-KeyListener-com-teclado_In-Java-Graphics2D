//Class responsavel pelo encapsulamento dos atributos a ser usados no painel

/**
 *
 * @author isaura
 */
public class Bola
{

    public Bola( int posx, int posy, int largura, int altura)
    {
        this.posx = posx;
        this.posy = posy;
        this.largura = largura;
        this.altura =  altura;
    }
    
    private int posx;
    private int posy;
    
    private int largura;
    private int altura;
    
    private int velx = 3;
    private int vely = 3;
    
    public int getPosx()
    {
        return posx;
    }

    public void setPosx(int posx)
    {
        this.posx = posx;
    }

    public int getPosy()
    {
        return posy;
    }

    public void setPosy(int posy) 
    {
        this.posy = posy;
    }

    public int getLargura() 
    {
        return largura;
    }

    public void setLargura(int largura)
    {
        this.largura = largura;
    }

    public int getAltura()
    {
        return altura;
    }

    public void setAltura(int altura) 
    {
        this.altura = altura;
    }

    public int getVelx()
    {
        return velx;
    }

    public void setVelx(int velx) 
    {
        this.velx = velx;
    }

    public int getVely() 
    {
        return vely;
    }

    public void setVely(int vely)
    {
        this.vely = vely;
    }
   
    public void atualizar()
    {
        this.posx+= velx;
        this.posy+=vely;
    }
    
    
    
    
}
