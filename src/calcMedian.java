import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calcMedian implements ICalculator{
    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();

        Collections.sort(values);

        if(values.size()%2>0){
            resultList.add(values.get(values.size()/2));
        }else{

            double median = (values.get((int) values.size()/2) +values.get(((int) values.size()/2)+1))/2;
            resultList.add(median);
        }
        return resultList;
    }
}
