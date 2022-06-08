import java.util.ArrayList;
import java.util.List;

public class calcMultiply implements ICalculator{
    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();

        double result = 0;
        for (Double value : values) {
            result *= value;
        }
        resultList.add(result);
        return resultList;
    }
}
