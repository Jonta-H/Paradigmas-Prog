public class TestaSmartTV {
    public static void main(String[] args){
        SmartTV s1 = new SmartTV();

        s1.setVolume(6);
        System.out.println("Volume S1: " + s1.getVolume());

        SmartTV s2 = new SmartTV("Samsung", "ABC" ,0);

        SmartTV s3 = new SmartTV("LG", "UTV", 30);

    }
}
