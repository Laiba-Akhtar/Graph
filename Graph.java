import java.io.*;
import java.util.*;
 
// Main class
class Graph {
 
    // Method 1
    // To make pair of nodes
    static void
    addEdge(LinkedList<LinkedList<Integer> > Adj, int u,
            int v)
    {
        // Creating bi-directional vertex
        Adj.get(u).add(v);
        Adj.get(v).add(u);
    }
 
    // Method 2
    // To print the adjacency list
    static void
    printadjacencylist(LinkedList<LinkedList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); ++i) {
 
            // Printing the head
            System.out.print(i + ":");
 
            for (int v : adj.get(i)) {
                // Printing the nodes
                System.out.print(v + " ");
            }
 
            // Now a new lin eis needed
            System.out.println();
        }
    }
 
    // Method 3
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating vertex
        int V = 5;
 
        LinkedList<LinkedList<Integer> > adj
            = new LinkedList<LinkedList<Integer> >();
        for (int i = 0; i < V; ++i) {
            adj.add(new LinkedList<Integer>());
        }
 
        // Inserting nodes
        // Custom input node elements
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
 
        // Printing adjacency list
        printadjacencylist(adj);
    }
}


// public class Graph {
//     int size;
//     String[] vertices;
//     boolean a[][];
//     public Graph(String [] args){
//         size=args.length;
//         vertices =new String [size];
//         System.arraycopy(args,0,vertices,0,size);
//         a=new boolean[size][size];
//     }
//     public void add(String v,String w){
//         int i=index(v);
//         int j=index(w);
//         a[i][j]=a[j][i]=true;

//     }
//     private int index(String v){
//         for(int i=0;i<size;i++){
//             if(vertices[i].equals(v))
//                 return i;
//         }
//         return a.length;
//     }
//     public String toString(){
//         if(size==0) return "{}";
//         StringBuffer buf=new StringBuffer("{"+vertex(0));
//         for(int i=1;i<size;i++)
//             buf.append(","+vertex(i));
//         return buf+"}";
//     }
//     private String vertex(int i){
//         StringBuffer buf =new StringBuffer(vertices[i]+":");
//         for(int j=0;j<size;j++)
//             if(a[i][j])buf.append(vertices[j]);
//             return buf+"";

//     }

//     public static void main(String[] args) {
      
       
//         Graph g=new Graph(new String[]{"1","2","3","4","5","6"});
//               g.add("1","4");
//               g.add("1","2");
//               g.add("1","3");
             
//               System.out.println(g);
//     }
// }