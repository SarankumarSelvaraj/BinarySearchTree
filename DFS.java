import java.util.*;
/* Depth first search is used to traverse all the nodes in the graph data structure. choose the root node 
  in the graph and it will traverse the nodes in vertically. if the node is visited not again traverse through that
  node it will move to the next node.
  for example, here we take Integer data type that total number is 6. such as 1, 2, 3, 4, 5, 6. we add the edges for
  the dfs and it traverse the nodes in depth first search.
 */
public class DFS {
  // declare the two variables here.
    private LinkedList<Integer> adjList[];
    private boolean visited[];
    // create the constructor for DFS class and pass the parameter vertices to specify the size of the dfs.
    DFS(int vertices) {
        adjList = new LinkedList[vertices];
        visited = new boolean[vertices];
        // traverse the nodes within the given size.
      for(int i = 0; i < vertices; i++) 
        adjList[i] = new LinkedList<Integer>();
      }
        // added the edges to connect the nodes.
        public void addEdge(int x, int y) {
            adjList[x].add(y);
        }
        // write the dfs method to perform the dfs. pass the parameter to where the node is start(root node).
        public void dfs(int vertex) {
          // if the node is visited print the vertex.
            visited[vertex] = true;
            System.out.print(vertex + " ");
            // iterates the each node.
            Iterator<Integer> it = adjList[vertex].listIterator();
            while(it.hasNext()) {
                int adj = it.next();
                // if the node is not visited it will perform the dfs to visited the node. 
                if(!visited[adj]) 
                dfs(adj);
            }
        }

        public static void main(String[] args) {
            DFS d = new DFS(6);
      // pass the edges(value) of the graph.  
        d.addEdge(0, 1);
        d.addEdge(0, 2);
        d.addEdge(1, 0);
        d.addEdge(1, 3);
        d.addEdge(2, 0);
        d.addEdge(2, 3);
        d.addEdge(3, 4);
        d.addEdge(3, 5);
        d.addEdge(4, 3);
        d.addEdge(5, 3);
 
            System.out.println("Following depth first search is ");
            // we start the node from 0 which is source node.
            d.dfs(0);
        }
      }
