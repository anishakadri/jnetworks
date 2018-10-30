/*
 * EDGE CLASS
 * defines an connection between nodes x & y
 * Directed edges (x,y) != (y,x)
 * Undirected edges (x,y)== (y,x)
 * 
 * Weighted edges can also be implemented
 * in order to symbolise strength of connection
 */

/*TO DO:
1. Add a opy function; useful for multigraphs
2. Add subclasses,
e.g. undirected + directed Edges
weighted and unweighted.
3. this allows graph types to have either type
with same method implementations
N.B. take particular care for defining equals for the ordered Edge.
*/	

package network;

//import java.io.*;

public class Edge {
	
	
	Integer node0;
	Integer node1;   
	public static final int SIZE = 2;
	Double weight;
	
	//constructors
	public Edge(){
		this.node0 = null;
		this.node1 = null;
		this.weight = 1d;
	}
	
	//get functions
	
	public Double getWeight() {
		return this.weight;	
	}
	
	public Integer getNode(Integer n){
		if(n==0) {
			return node0;
		}
		if(n==1) {
			return node1;
		}
		else {
			System.out.println("Error: edge index must be 0 or 1");
			return 0;}
	}
	
	public void printEdge() {
		System.out.println("["+ this.getNode(0)+ ","+ this.getNode(1)+"]");
	}
	
	//Test code:
	/*public static void main(String []args) {
		int m = 2;
		Edge x = new Edge(m,1);
		Edge y = new Edge(1,m);
		y.printEdge();
		Integer z = 6;
		//z = null;
		Integer w = 6;
		if(z == w){
			System.out.println(x.unorderedEquals(y));}
		
	}*/
}
