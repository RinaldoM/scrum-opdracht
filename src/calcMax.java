import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class calcMax implements ICalculator{

    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();
        resultList.add(Collections.max(values));
        return resultList;
    }
}
