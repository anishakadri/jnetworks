package network;
import java.util.*;

public class Path{
	Integer length;
	ArrayList<Integer> vertices;
	
	public Path(ArrayList<Integer> vert){
		this.length = vert.size();
		this.vertices = vert;
	}
	/*
	 * this needs to be in Graph implements Walkable
	 * 
	public Path prefWalk(Graph g, Integer t) {
		nodes = 
		newPath = new Path(nodes, );
		return newPath;
	}
	public Path randomWalk(Graph g, Integer t) {
		return newPath;
		
	}
	*/
	public Integer getStart() {
		return this.vertices.get(0);
	}
	
	public Integer getEnd() {
		return this.vertices.get(this.length);
	}
}
