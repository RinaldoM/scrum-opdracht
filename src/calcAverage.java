import java.util.ArrayList;
import java.util.List;

public class calcAverage implements ICalculator{
    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();

        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        resultList.add(sum/values.size());
        return resultList;
    }
}
