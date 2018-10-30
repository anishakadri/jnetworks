//*******************************************************************
//
//-------------About--------------
// 	A class for simple graphs
// 	edges are undirected (i.e. [x,y] == [y,x])
//	must sort x,y & search before adding
// 	must remove 
//	no self loops ( i.e. [x,x] not allowed)
//	
//	
//
//
//---------------------------------
//Author: Anisha Kadri, ak4114@ic.ac.uk
//*******************************************************************

package network;

import java.util.ArrayList;

public class SimpleGraph extends Graph implements Growable{
	//overload for adding weights to edges
	
	public SimpleGraph() {
		//initialising an empty SimpleGraph
		ArrayList<Integer> nodeList = new ArrayList<Integer>();
		ArrayList<Edge> edgeList = new ArrayList<Edge>();
		this.nodeList = nodeList;
		this.edgeList = edgeList;
	}
	
	public SimpleGraph(ArrayList<Edge> edges) {
		//initialising a Simple Graph from an list of edges
		ArrayList<Integer> nodeList = new ArrayList<Integer>();
		ArrayList<Edge> edgeList =  new ArrayList<Edge>();
		//1. Add each node and edge to list ONCE, with no repetitions
		
		for (int i = 0; i < edges.size(); i++){
			
			Edge thisEdge = edges.get(i);
			thisEdge.order(); //sort
			
			//if edgeList does not contain edge, add
			if (edgeList.contains(thisEdge)== false) {
				edgeList.add(thisEdge);
				}
			
			//if nodeList does not contain node, add 
		    for (int n = 0; n < 2; n++) {
		    	if (nodeList.contains(thisEdge.getNode(n))==false){
		    	nodeList.add(thisEdge.getNode(n));}
		    }
		}
		this.nodeList = nodeList;
		this.edgeList = edgeList;
	}
	
	public void addEdge(Edge newEdge) {
		newEdge.order();
		if (this.edgeList.contains(newEdge)== false) {
			this.edgeList.add(newEdge);
		}
		for (int n = 0; n < 2; n++) {
	    	if (this.nodeList.contains(newEdge.getNode(n))==false){
	    	this.nodeList.add(newEdge.getNode(n));}
	    }
	}
	
	public void addEdge(Integer nodei, Integer nodej) {
		Edge newEdge = new Edge(nodei,nodej);
		newEdge.order();
		if (this.edgeList.contains(newEdge)== false) {
			this.edgeList.add(newEdge);
		}
		for (int n = 0; n < 2; n++) {
	    	if (this.nodeList.contains(newEdge.getNode(n))==false){
	    	this.nodeList.add(newEdge.getNode(n));}
	    }
	}
	
	public void addNode(Integer n) {
		if (this.nodeList.contains(n)==false){
	    	this.nodeList.add(n);}
		
	}
	
	public void randomGrowth(int t) {
		int timestep = 0;
		while(timestep <t) {
			timestep++;
		}
		//empty
	}
	public void prefGrowth(int t) {
		//empty
	}
	
		
	public static void main(String[] args) {
		int m = 2;
		Edge x = new Edge(m,1);
		Edge y = new Edge(1,m);
		y.order();
		x.order();
		ArrayList<Edge> edge2 =  new ArrayList<Edge>();
		edge2.add(x);
		edge2.add(y);
		SimpleGraph g = new SimpleGraph(edge2);
		g.printEdges();
	
	}
}
	
	
