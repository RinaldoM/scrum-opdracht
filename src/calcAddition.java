import java.util.List;

public class calcAddition implements ICalculator{
    @Override
    public double calculate(List<Double> values) {
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum;
    }
}
