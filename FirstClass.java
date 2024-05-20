 class  SecondClass{
    void methodA(int a, int b){
        int sum=a+b;
        System.out.println("Both Integer:" +sum);
    }

    void methodA(int a, double b){
        double sum=a+b;
        System.out.println("Integer and double:" +sum);
 }

    void methodA(double a, double b){
    double sum=a+b;
    System.out.println("Both double:" +sum);
}
 }
public  class FirstClass {

    public static void main(String[] args){
        SecondClass objA = new SecondClass();
        objA.methodA(10,22);
        objA.methodA(10,22.0);
        objA.methodA(10,22.0);
        System.out.println("hello this is java code");
       
        
    }
}