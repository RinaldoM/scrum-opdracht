import java.util.List;

public class calcAverage implements ICalculator{
    @Override
    public double calculate(List<Double> values) {
        double sum = 0;
        for(int i=0; i<values.size(); i++){
            sum+=values.get(i);
        }
        return sum/ values.size();
    }
}
