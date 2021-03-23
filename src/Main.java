public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 82.5F;
        float height = 1.8F;
        float index = service.calculate(weight, height);
        System.out.println(index);
    }
}