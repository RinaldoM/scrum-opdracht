import java.util.ArrayList;
import java.util.List;

public class calcRound implements ICalculator{

    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();

        for(Double value: values){
            if(value%2>=5){
                resultList.add((value - value%2) + 1);
            }else{
                resultList.add(value - value%2);
            }
        }
        return resultList;
    }
}
