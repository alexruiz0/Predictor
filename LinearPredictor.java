public class LinearPredictor extends Predictor{
    private double[] weights;

    public LinearPredictor(double[] w){
        this.weights = w;
    }

    @Override
    public double predict(double[] a){
        double sum = 0;
        for(int i=0;i<a.length;++i){
            sum += a[i]*this.weights[i];
        }
        return sum;
    }
}
