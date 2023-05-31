public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        int weightKg = 98;
        int index = service.calculate(98,1.87);
        System.out.println(index);
    }
}