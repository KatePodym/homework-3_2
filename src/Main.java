public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKg = 75; // вес в килограммах
        double heightMeters = 1.67; // рост в метрах
        int bmi = service.calculate(weightKg, heightMeters);
        System.out.println(bmi);
    }
}
