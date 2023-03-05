public class BmiService {
    public double calculate(double heightMetr, double weightKg){
        double bmi = weightKg/(heightMetr * heightMetr);
        return bmi;
    }
}
