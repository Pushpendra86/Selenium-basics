public class CalculatorProg {
    int n1 = 88, n2=56;
    //method
    public void add(){
        int res = n1+n2;
        System.out.println(res);
    }
    public static void main(String[] args) {
        CalculatorProg cal = new CalculatorProg();
        cal.add();
    }
}
