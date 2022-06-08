import java.util.ArrayList;
import java.util.List;

public class calcFaculty implements ICalculator{

    @Override
    public List<Double> calculate(List<Double> values) {
        List<Double> resultList = new ArrayList<>();
        double faculty = 1;
        for(int i=1; i<=values.get(0); i++){
            faculty*= (i+1);
        }
        resultList.add(faculty);
        return resultList;
    }
}
