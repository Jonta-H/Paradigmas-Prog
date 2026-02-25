import java.awt.*;

public class Circulo extends Figura{
    private double raio;

    public void desenhaFigura(Graphics g){
        int pX, pY, diametro;
        pX = getCentro().getX() - (int)getRaio();
        pY = getCentro().getY() - (int)getRaio();
        diametro = ((int)getRaio()*2);
        g.drawOval(pX,pY,diametro,diametro);
    }
    public double getArea(){
        return (Math.PI * Math.pow(getRaio(), 2));
    }

    public Circulo(Ponto centro, double raio){
        super(centro);
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio = raio;
    }
}
