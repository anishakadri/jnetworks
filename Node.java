package network;

//these can be used for data storage during analysis

public class Node {
	Integer index;
	Integer degree;
	Integer degreeIn;   
	Integer degreeOut;

	public Node(Integer ind) {
		this.index = ind;
		this.degree = 0;
		this.degreeIn = 0;
		this.degreeOut= 0;
		
	}
	
	public Integer getIndex() {
		return this.index;
	}
	
	public Integer getDegree() {
		return this.degree;
	}
	
	public Integer getDegreeIn() {
		return this.degreeIn;
	}

	public Integer getDegreeOut() {
		return this.degreeOut;
	}
	
	public void printNode() {
		System.out.println("Node: "+ this.index);
		System.out.println("Degree: "+ this.degree);
		System.out.println("DegreeeIn: "+ this.degreeIn);
		System.out.println("DegreeOut: "+ this.degreeOut);
	}
	
}
