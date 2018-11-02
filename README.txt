IN PROGRESS: an imporved version 

#jnetworks
This is a library for studying and using graphs.

Basics
--------------
What is a Graph?
What is a Node?
What is an edge?
What is a degree?

Representations
--------------
There are three conventional methods for representing a graph computationally;
(1) An adjacency matrix:
with column and row indices representing nodes. The value of the
matrix element (i,j) corresponds to the number of edges from node i -> node j.


Advantages of this representation are that it is easy to find the degree
of a node by summing its rows and columns. Manipulation of nodes (adding or removing
a node) is failry easy as it requires removal of corresponing rows and columns.
Search algorithms for finding an edge is also relatively fast O(N). 

Disadvantages are large memory usage, it is difficult to keep track of edge weights.

(2) An edgelist:
 of all the edges in the graph.
 Avantages 
Disadvantages are that search times can take more than O(E) for an unordered list.
However there is a method for reducing ths to O(logE)

(3)An adjacency list:

