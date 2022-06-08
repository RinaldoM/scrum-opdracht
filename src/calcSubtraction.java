import java.util.ArrayList;
import java.util.List;

public class calcSubtraction implements ICalculator{
    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();

        double result = 0;
        for (int i = 0; i<values.size(); i++) {
            if(i==0){
                result = values.get(i);
            }else{
                result -= values.get(i);
            }

        }
        resultList.add(result);
        return resultList;
    }
}
