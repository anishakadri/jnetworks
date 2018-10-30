//*******************************************************************
//------Basic Introduction------
//*Graphs* include linked systems like social networks, 
//citation networks, or the world wide web.
//*Nodes* refer to the people/papers/webpages.
//*Edges* refer to the links between the nodes
//-the edges can have a direction & weight depending on the graph type.
//*Degree* is the number of links going in and out of a node.
//
//For more information see: https://en.wikipedia.org/wiki/Graph_theory
//
//-------------About--------------
//
//This is a Base Class template  for a generalised Network/Graph
//N.B.- Allows multiple bi-directional edges and self-loops.
//Two class attributes: 
//(a) the number of nodes (i.e. maximum index in the edge list)
//(b) the edge list (a list of mappings between two nodes)
//
//Constructor:
//   Graph(int graphNodes, ArrayList<ArrayList<Integer>> edges)
//
//Methods:
//
//---------------------------------
//Author: Anisha Kadri, ak4114@ic.ac.uk
//*******************************************************************
package network;

import java.util.*;

/*import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Random;*/


abstract public class Graph{
//abstract public class Graph implements Walkable{
	
	
	//Instance Vars
	ArrayList<Edge> edgeList = new ArrayList<Edge>();           
	
	
	public ArrayList<Edge> getEdges(){
	    return edgeList;
	  }
	
	public ArrayList<Edge> getEdges(Integer nodeIndex){
		//returns list of edges going in or out of node
		ArrayList<Edge> newList = new ArrayList<Edge>();
		
	    for (int i = 0; i < edgeList.size(); i++) {
	    	Edge thisEdge = edgeList.get(i);
	        if(thisEdge.getNode(0)==nodeIndex) {
	        	newList.add(thisEdge);
	        }
	        else if(thisEdge.getNode(1)==nodeIndex) {
	        	newList.add(thisEdge);
	        }
	    }
	    return newList;
	}
	
	public ArrayList<Edge> getEdgesOut(Integer nodeIndex){
		//returns list of edges going in or out of node
		ArrayList<Edge> newList = new ArrayList<Edge>();
		
	    for (int i = 0; i < edgeList.size(); i++) {
	    	Edge thisEdge = edgeList.get(i);
	        if(thisEdge.getNode(0)==nodeIndex) {
	        	newList.add(thisEdge);
	        }
	    }
	    return newList;
	}
	
	public ArrayList<Edge> getEdgesIn(Integer nodeIndex){
		//returns list of edges going in or out of node
		ArrayList<Edge> newList = new ArrayList<Edge>();
		
	    for (int i = 0; i < edgeList.size(); i++) {
	    	Edge thisEdge = edgeList.get(i);
	        if(thisEdge.getNode(1)==nodeIndex) {
	        	newList.add(thisEdge);
	        }
	    }
	    return newList;
	}
	
	        
	public void printEdges() {
	    for (int i = 0; i < edgeList.size(); i++){
	    	Edge e = new Edge();
	    	e = edgeList.get(i);
	    	e.printEdge();
	      }
	}
	
	
	public ArrayList<Integer> getNodes(){
		/*ArrayList<Integer> nodeList = new ArrayList<Integer>();
		for (int i = 0; i < edgeList.size(); i++){
			
			Edge thisEdge = new Edge();
	    	thisEdge= edgeList.get(i);
	    	for (int n = 0; n < 2; n++) {
	    		int thisNode = thisEdge.getNode(n);
	    		nodeList.add(thisNode);
	    	}
		}*/
		return nodeList;
	}
	
	public boolean hasNode(Integer nodeIndex) {
	//finish this
		return true;
	}
	
	public boolean hasEdge(Edge thisEdge) {
	//finish this
		
		return true;
	}
	
	public void printNodes() {
		//ArrayList<Integer> nodes  = this.getNodes();
		this.nodeList.forEach(System.out::println);
		
	}
	
	public int graphSize() {
		return this.nodeList.size();
	}

	
    public int getDegree(Integer nodeIndex){ //argument is the index of the node
    	Integer degree = 0;
	    for (int i = 0; i < this.edgeList.size(); i++){
	    	Edge thisEdge = this.edgeList.get(i);
	        if(thisEdge.getNode(0)==nodeIndex) {
	        	degree +=1;
	        }
	        if(thisEdge.getNode(1)==nodeIndex) { 	
	        	//here self-loops must be counted twice
	        	degree +=1;
	        }
	    }
	    return degree;
	 }
    
    public int randNode() {
    	//finish this
    	return 0;
    }
    
    public int prefNode() {
    	//finish this
    	return 0;
    }
    
    // Create paths:
    /*
	public Path prefWalk(Graph g, Integer t) {
		nodes = 
		newPath = new Path(nodes, );
		return newPath;
	}
	public Path randomWalk(Graph g, Integer t) {
		return newPath;
		
	}
	*/
    
    
    
	//abstract methods;	  
	abstract public void addEdge(Edge newEdge);
	abstract public void addEdge(Integer i, Integer j);
	abstract public void addNode(Integer n);
	//abstract public void delNode(); these are trickier
	//abstract public void delEdge();
}

