public class Test {
    public static void main(String[] args) {
        ConstantPredictor cp = new ConstantPredictor();
        double[] w = {1,2,3,4,5,6};
        LinearPredictor lp = new LinearPredictor(w);
        LogisticPredictor lop = new LogisticPredictor(w);

        double[] a = {0,2,3,4,7,1};

        System.out.println("Constant Predictor: "+cp.predict(a));
        System.out.println("Linear Predictor: "+lp.predict(a));
        System.out.println("Logisitc Predictor: "+lop.predict(a));
    }
}
