class  ClassA{
   double methodA(int x, int t){
    int p=6*t*t;
    double p2=Math.sqrt(t)+x;
    double m=Math.sqrt(p/p2);
    return m;

   }

 }
public  class equation {

    public static void main(String[] args){
        ClassA objA = new ClassA();
        
        System.out.println("Both Integer: " +objA.methodA(2, 3));
       
        
    }
}
