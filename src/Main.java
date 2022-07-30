public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 75;
        double growth = 1.74;
        double BMI = service.calculate(weight,growth);
        System.out.println("Ваш индекс массы тела: " + BMI);
    }
}