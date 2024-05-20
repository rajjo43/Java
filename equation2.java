class  ClassA{
    double methodA(double t){
     double part1=6*t*t;
     return part1;
 
    }
  }

  class  ClassB extends ClassA{
    double methodB(double x,double t){
     double part2=Math.sqrt(t)+x;
     double getpart1 =super.methodA(t);
     double m=Math.sqrt(getpart1/part2);
     return m;
 
    }
  }
 public  class equation2 {
 
     public static void main(String[] args){
         ClassB objB = new ClassB();
         
         System.out.println("Both Integer: " +objB.methodB(72.0, 46.0));
        
         
     }
 }
 