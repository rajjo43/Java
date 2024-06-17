package firstPackage;

class  Class1{
    double method1(double t){
     double part1=6*t*t;
     return part1;
 
    }
  }

class  Class2 extends Class1{
    double method2(double x,double t){
     double part2=Math.sqrt(t)+x;
     double getpart1 =super.method1(t);
     double p=(getpart1/part2);
     return p;
    }
  }

class  Class3 extends Class2{
    double method3(double x,double t){
     double getp =super.method2(x,t);
    double m=Math.sqrt(getp);
     return m ;
    }
  }

public class Multi_Level_Inheritance {
	 public static void main(String[] args) {
       Class3 obj = new Class3();
         
         System.out.println("Both Float: " +obj.method3(72.0, 46.0));
	 }
}
