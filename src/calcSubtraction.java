import java.util.List;

public class calcSubtraction implements ICalculator{
    @Override
    public double calculate(List<Double> values) {
        double result = 0;
        for (Double value : values) {
            result -= value;
        }
        return result;
    }
}
