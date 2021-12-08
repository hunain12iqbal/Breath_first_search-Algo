
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hunain
 */
public class BFS_PRAC {
    
    Queue<Node> openlist;
    List<Node> list;
    
    public static  class Node{
    String name;
    boolean visited;
    List<Node> neighbour;

    public void setname(String name){
     this.name = name;
    }
    public String getName(){
      return this.name;
    }
    public boolean isVisited(){
      return this.visited;
    }
    public void setVisited(boolean visited){this.visited=visited;}
    public Node(String name){
        this.name = name;
         this.neighbour = new ArrayList<>();
         this.visited = false;
    }
    public void addNeighbours(Node neighbour){this.neighbour.add(neighbour);}
    
    public List<Node> getNeighbour(){
     return this.neighbour;
    }
    
    public String toString(){
     return this.name;
    }
    public List<Node> getNeighbourList(){
      return this.neighbour;
    }
     
    }
    
    
    
   public void bsf(List<Node> node){
       for(Node n : node){
           System.out.println("1st"+n);
           if(n!=null){
            if(!n.visited){
             n.setVisited(true);
             BfsWithQueue(n);
            }
           }
       }
    
    
   }
   public void BfsWithQueue(Node n){
       this.openlist.add(n);
       for(Node neighbor: n.getNeighbour()){
           if(neighbor!=null){
             if(!neighbor.isVisited()){
               neighbor.setVisited(true);
               this.openlist.add(neighbor);
             }
           }}
       while(!openlist.isEmpty()){
        Node ele = this.openlist.remove();
        System.out.println(ele);
        for(Node el: ele.getNeighbour()){
            if(el!=null){
                if(!el.isVisited()){
                 el.setVisited(true);
                 
                }
             
            }
            
        
        }
       
       
       
       }
   }

   
    
    
    
    
    
    
    
   public BFS_PRAC(){
   this.openlist = new LinkedList<>();
   Node S  = new Node("Start");
   Node A  = new Node("A");
   Node B  = new Node("B");
   Node C  = new Node("C");
   Node D  = new Node("D");
   Node E  = new Node("E");
   Node G  = new Node("G");
   
   list = new ArrayList<>();
   list.add(S);
   list.add(A);
   list.add(B);
   list.add(C);
   list.add(D);
   list.add(E);
   list.add(G);
   
   
        S.addNeighbours(G);
        S.addNeighbours(B);
        S.addNeighbours(A);
        A.addNeighbours(S);
        A.addNeighbours(D);
        A.addNeighbours(C);
        B.addNeighbours(S);
        B.addNeighbours(E);
        B.addNeighbours(D);
        C.addNeighbours(G);
        C.addNeighbours(A);
        D.addNeighbours(G);
        D.addNeighbours(B);
        D.addNeighbours(A);
        E.addNeighbours(B);
        G.addNeighbours(S);
        G.addNeighbours(D);
        G.addNeighbours(C);
   
        
       System.out.print("S ->");
        System.out.println(S.getNeighbourList());
        System.out.print("A ->");
        System.out.println(A.getNeighbourList());
        System.out.print("B ->");
        System.out.println(B.getNeighbourList());
        System.out.print("C ->");
        System.out.println(C.getNeighbourList());
        System.out.print("D ->");
        System.out.println(D.getNeighbourList());
        System.out.print("E ->");
        System.out.println(E.getNeighbourList());
        System.out.print("G ->");
        System.out.println(G.getNeighbourList());
        System.out.print("Open List : [");

   
       bsf(list);
   }
    
    
    public static void main(String args[]){
      new BFS_PRAC();
    
    
    }
    
    
    
    
    
}
