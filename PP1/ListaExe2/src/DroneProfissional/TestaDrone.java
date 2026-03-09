package DroneProfissional;

public class TestaDrone {
    public static void main(String[] args){
        Drone d1 = new Drone("1234", 0, 100);

        d1.decolar();
        System.out.println(d1.toString());

        Drone d2 = new Drone("4321", -1, 15);
        d2.decolar();

        d1.subir(50);
        System.out.println(d1.toString());

        d1.descer(60);
    }
}
