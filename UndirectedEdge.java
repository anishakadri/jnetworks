package network;

public class UndirectedEdge extends Edge {		
		Integer node0;
		Integer node1;   
		public static final int SIZE = 2;
		Double weight; //Weights must be a double of order 1 or greater
		
		//constructors
		
		public UndirectedEdge(Integer nodei, Integer nodej){
			this.node0 = nodei;
			this.node1 = nodej;
			this.weight = 1d; //default, unweighted case	
			
			this.order(); //ensures edges are always sorted
		}
		
		public UndirectedEdge(){
			this.node0 = null;
			this.node1 = null;
			this.weight = 1d;
		}
		
		public UndirectedEdge(Integer nodei, Integer nodej, Double w){
			this.node0 = nodei;
			this.node1 = nodej;
			if (w>=1d) {
				this.weight = w;}
			else {
				System.out.println("Error: Edge weight must be greater than or equal to 1.");
				}
			
			this.order(); //ensures edges are always sorted
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
			UndirectedEdge j = ((UndirectedEdge) obj);
			
			//order pairs
			this.order();
			j.order();
			
			//check equivalence
			if (this.node0 == j.getNode(0) && this.node1 == j.getNode(1)) {
				result= true;
			}
			
			return result;
		}
		
		@Override
		public int hashCode() { return 0; }

		
		public void order() {
			//sorts the pair in ascending order
			// i.e. so that node1 is higher than node0
			if (this.node1 < this.node0) {
				int higher = this.node0;
				this.node0 = this.node1;
				this.node1 = higher;
			}
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

