public class ConstantPredictor extends Predictor{
    
    public ConstantPredictor(){};
    
    @Override
    public double predict(double[] a){
        return 1;
    }
}