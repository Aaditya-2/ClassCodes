import java.util.*;
public class Rearrange{
  String Txt,Cxt;
  int len;
  Rearrange(){
    Txt=Cxt="";
    len=0;
  }
  void readword(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a word in uppercase: ");
    Txt=sc.next().toUpperCase();
    len=Txt.length();
  }
  void convert(){
    int i;
    boolean a=false;
    for(i=0;i<len;i++){
      char ch=Txt.charAt(i);
      if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){ a=true; break;}
    }
    if(a){
      if(i==0) Cxt=Txt+"Y";
      else{
        Cxt=Txt.substring(i)+""+Txt.substring(0,i)+"C";
      }
    }
    else Cxt=Txt+"N";
  }
  void display(){
    System.out.println("ORIGINAL WORD: "+Txt);
    System.out.println("CHANGED WORD: "+Cxt);
  }
  public static void main(){
    Rearrange obj=new Rearrange();
    obj.readword();
    obj.convert();
    obj.display();
  }
}
