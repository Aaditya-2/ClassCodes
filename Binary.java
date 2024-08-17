import java.util.*;
public class Binary{
  int A[],N,Lb,Ub;
  Binary(int nn){
    N=nn;
    A=new int[nn][nn];
    Lb=0;
    Ub=nn-1;
  }
  void readdata(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements in ascending order: ");
    for(int i=0;i<N;i++)
        A[i]=sc.nextInt();
  }
  int binary_search(int v){
    if(Lb<=Ub){
      int m=(Lb+Ub)/2;
      if(A[m]<v){
        Lb=m+1;
        return binary_search(v);
      }
      else if(A[m]>v){
        Ub=m-1;
        return binary_seach(v);
      }
      else return m;
    }
    return -1;
  }
  public static void main(){
    Binary obj=new Binary(5);
    obj.readdata();
    System.out.println(obj.binary_search(3));
  }
}
