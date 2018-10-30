package network;


import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Template{

	  int nodes;
	  ArrayList<ArrayList<Integer>> edgeList = new ArrayList<ArrayList<Integer>>();           

	//Constructor

	  public Graph(int graphNodes, ArrayList<ArrayList<Integer>> edges ){
	    
	    this.nodes = graphNodes;  //note: index numbering starts from 1 so that nodes is a measure of system size        
	    this.edgeList = edges;   //**need to add further limitation that size of edge does not exceed 2.
	          
	    //the following code ensures all indexed nodes in the edge list appear on the node list
	      for (int i = 0; i < edgeList.size(); i++){
	        ArrayList<Integer> thisEdge = new ArrayList<Integer>();
	          thisEdge= edgeList.get(i);
	          
	        
	        if (thisEdge.size()>2){
	          System.out.println("Error! more than two nodes specified in edge.");
	        }

	        if (Collections.max(thisEdge)> nodes){
	            nodes = Collections.max(thisEdge);
	            System.out.println(Collections.max(thisEdge));
	        }
	      }
	  }
	    //end 
	      
	    
	  
	  //Methods: edgeList manipulation 
	  public ArrayList<ArrayList<Integer>> getEdges(){
	    return edgeList;
	  }
	        
	  public void printEdges() {
	    for (int i = 0; i < edgeList.size(); i++){
	    System.out.println(edgeList.get(i));
	      }
	  }
	      
	  
	  public void addEdge(ArrayList<Integer> newEdge) {
	    edgeList.add(newEdge);
	      
	      for (int j = 0; j < newEdge.size(); j++){ //check that node indices exist for edge added
	        if(newEdge.get(j)>nodes){
	          nodes = newEdge.get(j);
	        }
	      }
	    }

	  public void createEdge(int node1, int node2){
	    //N.B. for directed graphs, order of nodes matters
	    ArrayList<Integer> newEdge = new ArrayList<Integer>();
	    newEdge.add(node1);
	    newEdge.add(node2);
	    edgeList.add(newEdge);
	    
	    if(node1>nodes){      //check that node indices exist for edge added
	      nodes = node1;
	    }
	    else if(node2>nodes){
	      nodes = node2;
	    }
	    else{
	      nodes = nodes;
	    }
	  
	    }
	  
	  
	  
	   //Methods: node manipulation
	  public int getNodes() {
	      return nodes;
	  }
	        
	  public void printNodes() {
	      System.out.println(nodes);
	      }
	 
	  
	  public void addNodes(int moreNodes) { //N.B. this increases the number of nodes by the specified value
	      nodes = nodes+ moreNodes;
	      }
	  
	  
	    public int getDegree(int nodeIndex){ //argument is the index of the node
	      int degree = 0;
	        
	        for (int i = 0; i < edgeList.size(); i++){
	          ArrayList<Integer> thisEdge = new ArrayList<Integer>();
	            thisEdge= edgeList.get(i);
	            
	          for (int j = 0; j < thisEdge.size(); j++){
	            
	              if(thisEdge.get(j)==nodeIndex){
	                  degree = degree + 1 ;}
	            }
	        }
	      return degree;
	    }
	  
	  
	  
	  //Methods: Growing networks via different models

	  public Graph randomAttachment(){
	    //probability of attachment to each node is equal.
	    Graph initialState = new Graph(nodes,edgeList);
	    int size = initialState.getNodes();
	    Random rand = new Random(); 
	    int randomNode = rand.nextInt(size) + 1;
	    initialState.addNodes(1);
	    int newNode = initialState.getNodes();
	    initialState.createEdge(newNode,randomNode);
	    return initialState;

	  }


	  public Graph prefAttachment(){
	    //probability of attachment is proportional to degree of node.
	    Graph initialState = new Graph(nodes,edgeList);
	    ArrayList<Integer> randSet = new ArrayList<Integer>(); 
	    for (int i = 0; i < initialState.getNodes(); i++){
	        for (int j = 0; j < initialState.getDegree(i); j++){
	            randSet.add(i);
	        }
	    }
	    Random rand = new Random();

	      int randomNode = rand.nextInt(randSet.size()) + 1;
	      initialState.addNodes(1);
	      int newNode = initialState.getNodes();
	      initialState.createEdge(newNode,randomNode);
	      return initialState;
	  }
	  
	}




