package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망";
        System.out.println(b1.modelName);
        System.out.println(b1.serialNumber);

        System.out.println("-----------------------------------");

        BlackBox b2 = new BlackBox("하양", "UHD", 300000, "화이트");
        System.out.println(b2.modelName);
        System.out.println(b2.serialNumber);
        System.out.println(b2.resolution);


    }
}
