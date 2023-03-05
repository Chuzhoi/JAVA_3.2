public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weightKg = 98;
        double heightMetr = 1.87;
        double index = service.calculate(heightMetr, weightKg);
        int bmi = (int) index;
        System.out.println("Вес:" + weightKg + " кг");
        System.out.println("Рост:" + heightMetr + " м");
        System.out.println("Индекс массы тела:" + bmi + " кг/м2");
    }

}
