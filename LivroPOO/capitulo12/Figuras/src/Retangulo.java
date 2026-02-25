import java.awt.*;

public class Retangulo extends Figura{
    private int altura;
    private int largura;

    public Retangulo(Ponto p, int l, int a){
        super(p);
        largura = l;
        altura = a;
    }
    public Retangulo(Ponto p, int l){
        this(p, l, l);
    }

    public void desenhaFigura(Graphics g){
        int pX, pY;
        pX = getCentro().getX() - getLargura()/2;
        pY = getCentro().getY() - getAltura()/2;
        g.drawRect(pX,pY,getLargura(),getAltura());
    }
    public double getArea(){
        return getAltura() * getLargura();
    }

    public int getAltura(){
        return altura;
    }
    public int getLargura(){
        return largura;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }
    public void setLargura(int largura){
        this.largura = largura;
    }
}
