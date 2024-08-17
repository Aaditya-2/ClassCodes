import java.util.*;
public class BinaryNum{
  long binno;
  BinaryNum(long n){
    binno=n;
  }
  boolean isValid(){
    while(binno!=0){
      //if(binno%10!=1&&binno%10!=0) return false;
      if(binno%10!=1){
          if(binno%10!=0) return false;
        }
      binno/=10;
    }
    return true;
  }
  int calcHamming(BinaryNum a,BinaryNum b){
      int c=0;
      long x=a.binno,y=b.binno;
     //System.out.println(a.binno!=0);
      if(a.isValid()&&b.isValid()){
          //System.out.println("In if loop");
         //boolean ans=(a.binno!=0);
         a.binno=x;
         b.binno=y;
          while(a.binno!=0){
              //System.out.println("In while loop");
              if(a.binno%10!=b.binno%10){
                //return c;
                return c;
                //break;
            }
              else{  
              c++;
              a.binno/=10;
              b.binno/=10;
              //ans=(a.binno!=0);
            }
        }
    }
        
        return 0;
  }
  public static void main(){
      BinaryNum obj=new BinaryNum(0);
      BinaryNum obj1=new BinaryNum(11010);
      BinaryNum obj2=new BinaryNum(10110);
      //obj.calcHamming(obj1,obj2);
      System.out.println(obj.calcHamming(obj1,obj2));
      //System.out.println(1101L%10!=1||1101L%10==0);
    }
}
