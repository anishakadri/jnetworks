package network;

public class DirectedEdge extends Edge{
		
		
		Integer node0;
		Integer node1;   
		public static final int SIZE = 2;
		Double weight;
		
		//constructors
		
		public DirectedEdge(Integer nodei, Integer nodej){
			this.node0 = nodei;
			this.node1 = nodej;
			this.weight = 1d; //default, unweighted case	
		}
		
		public DirectedEdge(){
			this.node0 = null;
			this.node1 = null;
			this.weight = 1d;
		}
		
		public DirectedEdge(Integer nodei, Integer nodej, Double w){
			this.node0 = nodei;
			this.node1 = nodej;
			this.weight = w;
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
		
		@Override
		public boolean equals(Object obj) {
			boolean result = false;
			DirectedEdge j = ((DirectedEdge) obj);
			//tests equivalence of ordered pairs
			// for unordered pairs order both pairs first
			if (this.node0 == j.getNode(0) && this.node1 == j.getNode(1)) {
				result= true;
			}
			
			return result;
		}
		
		@Override
		public int hashCode() { return 0; }
		
		
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


