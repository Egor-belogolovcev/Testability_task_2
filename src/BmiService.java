public class BmiService {
    public double calculate (double weight , double growth) {
        double BMI = weight / (growth * growth);
        return BMI;
        //Например, масса человека составляет 64 кг, а рост равен 162 см.
        // Показатель индекса массы тела в этом случае равен: ИМТ = 64 : (1,62 х 1,62) = 24,3
    }
}