import java.awt.*;

public abstract class Figura{
    private Ponto centro;

    public Figura (Ponto centro){
        this.centro = centro;
    }

    public void setCentro(Ponto centro){
        this.centro = centro;
    }
    public Ponto getCentro(){
        return (this.centro);
    }

    public abstract double getArea();
    public abstract void desenhaFigura(Graphics g);
}