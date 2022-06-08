import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calcMin implements ICalculator{
    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();
        resultList.add(Collections.min(values));
        return resultList;
    }
}
