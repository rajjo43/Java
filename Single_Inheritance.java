package firstPackage;

class  ClassC{
    double methodC(double t){
     double part1=6*t*t;
     return part1;
 
    }
  }

  class  ClassB extends ClassC{
    double methodB(double x,double t){
     double part2=Math.sqrt(t)+x;
     double getpart1 =super.methodC(t);
     double m=Math.sqrt(getpart1/part2);
     return m;
 
    }
  }
  
 public  class Single_Inheritance {
 
     public static void main(String[] args){
         ClassB objB = new ClassB();
         
         System.out.println("Both Float: " +objB.methodB(72.0, 46.0));
        
     }
 }
 
