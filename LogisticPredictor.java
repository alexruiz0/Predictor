
public class LogisticPredictor extends Predictor{
    double[] weights;

    public LogisticPredictor(double[] w){
        this.weights = w;
    }

    @Override
    public double predict(double[] a){
        double sum = 0;
        for(int i=0;i<a.length;++i){
            sum += a[i]*this.weights[i];
        }
        
        double phi = 1/(1+Math.exp(sum));
        return phi;
    }
}
