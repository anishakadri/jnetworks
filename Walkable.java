package network;
import java.util.ArrayList;

public interface Walkable {
	
	//methods for taking random walks, generates a walkable path:
	//similar to an array of adjacent nodes
	public Path randomWalk(Graph g, Integer t);
	public Path prefWalk(Graph g, Integer t);

}
