class Node{
    int Roll;
    Node ptr;
    Node(){
        Roll=0;
        ptr=null;
    }
}
public class List{
    Node start;
    List(){
        start=null;
    }
    void insertB(int N){//insert and beginning
        Node temp=new Node();
        temp.Roll=N;
        if(start==null) start=temp;
        else{
            temp.ptr=start;
            start=temp;
        }
    }
    void insertE(int x){//insert at end
        Node temp=new Node();
        temp.Roll=x;
        if(start==null) start=temp;
        else{
            Node t=new Node();
            t=start;
            while(t.ptr!=null)
                t=t.ptr;
            t.ptr=temp;
        }
    }
    int countN(){//to count nodes
        int c=0;
        Node t=new Node();
        t=start;
        while(t!=null){
            c++;
            t=t.ptr;
        }
        return c;
    }
    int largestN(){//to find largest node
        Node t=new Node();
        t=start;
        int h=t.Roll;
        while(t!=null){
            if(h<t.Roll)
                h=t.Roll;
            t=t.ptr;
        }
        return h;
    }
    void display(){//display all elements
        Node t=new Node();
        t=start;
        while(t!=null){
            System.out.println(t.Roll);
            t=t.ptr;
        }
    }
    void removeE(){//remove from end
        if(start!=null){
            if(start.ptr==null) start=null;
            else{
                Node t=new Node();
                t=start;
                while(t.ptr.ptr!=null)
                    t=t.ptr;
                t.ptr=null;
            }
        }
    }
    void removeB(){//to remove from beginning
        if(start!=null){
            if(start.ptr==null) start=null;
            else{
                Node t=new Node();
                t=start;
                start=start.ptr;
                t.ptr=null;
            }
        }
    }
    boolean searchN(int x){//to search for a node
        Node t=new Node();
        t=start;
        if(t!=null){
            while(t.ptr!=null){
                if(t.Roll==x) return true;
                t=t.ptr;
            }
            return (t.Roll==x);
        }
        return false;
    }
}
