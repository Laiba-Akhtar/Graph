import java.io.*;
import java.util.*;



public class Graph {
    int size;
    String[] vertices;
    boolean a[][];
    public Graph(String [] args){
        size=args.length;
        vertices =new String [size];
        System.arraycopy(args,0,vertices,0,size);
        a=new boolean[size][size];
    }
    public void add(String v,String w){
        int i=index(v);
        int j=index(w);
        a[i][j]=a[j][i]=true;

    }
    private int index(String v){
        for(int i=0;i<size;i++){
            if(vertices[i].equals(v))
                return i;
        }
        return a.length;
    }
    public String toString(){
        if(size==0) return "{}";
        StringBuffer buf=new StringBuffer("{"+vertex(0));
        for(int i=1;i<size;i++)
            buf.append(","+vertex(i));
        return buf+"}";
    }
    private String vertex(int i){
        StringBuffer buf =new StringBuffer(vertices[i]+":");
        for(int j=0;j<size;j++)
            if(a[i][j])buf.append(vertices[j]);
            return buf+"";

    }

    public static void main(String[] args) {
      
       
        Graph g=new Graph(new String[]{"1","2","3","4","5","6"});
              g.add("1","4");
              g.add("1","2");
              g.add("1","3");
             
              System.out.println(g);
    }
}