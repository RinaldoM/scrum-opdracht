import java.util.ArrayList;
import java.util.List;

public class calcAbsolutValue{
    public List<Double> calculate(List<Double> values) {
        List<Double> result = new ArrayList<>();

        for (Double value : values) {
            if(value<0){
                result.add(value*-1);
            }else{
                result.add(value);
            }
        }
        return result;
    }
}
