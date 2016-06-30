package com.pcn.interview.ds.graph;

import java.util.LinkedList;
import java.util.Queue;

public class GraphImlimentation {


	public enum State {

	    Unvisited,Visiting,Visited;

	}
	
	public class Graph {

	    public int count; // num of vertices
	    private Node vertices[];

	    public Graph()
	    {
	        vertices = new Node[8];
	        count = 0;
	    }

	    public void addNode(Node n)
	    {
	        if(count < 10)
	        {
	            vertices[count] = n;
	            count++;
	        }
	        else
	        {
	            System.out.println("graph full");
	        }
	    }

	    public Node[] getNode()
	    {
	        return vertices;
	    }
	}
	
	public class Node {

	    public Node[] child;
	    public int childCount;
	    private String vertex;
	    public State state;

	    public Node(String vertex)
	    {
	        this.vertex = vertex;
	    }

	    public Node(String vertex, int childlen)
	    {
	        this.vertex = vertex;
	        childCount = 0;
	        child = new Node[childlen];
	    }

	    public void addChildNode(Node adj)
	    {
	        adj.state = State.Unvisited;
	        if(childCount < 30)
	        {
	            this.child[childCount] = adj;
	            childCount++;
	        }
	    }

	    public Node[] getChild()
	    {
	        return child;
	    }

	    public String getVertex()
	    {
	        return vertex;
	    }

	}
	
	

    public void dfs(Node root)
    {       
        //Avoid infinite loops
        if(root == null) return;

        System.out.print(root.getVertex() + "\t");
        root.state = State.Visited;

        //for every child
        for(Node n: root.getChild())
        {
            //if childs state is not visited then recurse
            if(n.state == State.Unvisited)
            {
                dfs(n);
            }
        }
    }

    public void bfs(Node root)
    {
        //Since queue is a interface
        Queue<Node> queue = new LinkedList<Node>();

        if(root == null) return;

        root.state = State.Visited;
         //Adds to end of queue
        queue.add(root);

        while(!queue.isEmpty())
        {
            //removes from front of queue
            Node r = queue.remove(); 
            System.out.print(r.getVertex() + "\t");

            //Visit child first before grandchild
            for(Node n: r.getChild())
            {
                if(n.state == State.Unvisited)
                {
                    queue.add(n);
                    n.state = State.Visited;
                }
            }
        }


    }

    public static Graph createNewGraph()
    {
        Graph g = new Graph();        
        Node[] temp = new Node[8];

        temp[0] = new Node("A", 3);
        temp[1] = new Node("B", 3);
        temp[2] = new Node("C", 1);
        temp[3] = new Node("D", 1);
        temp[4] = new Node("E", 1);
        temp[5] = new Node("F", 1);

        temp[0].addChildNode(temp[1]);
        temp[0].addChildNode(temp[2]);
        temp[0].addChildNode(temp[3]);

        temp[1].addChildNode(temp[0]);
        temp[1].addChildNode(temp[4]);
        temp[1].addChildNode(temp[5]);

        temp[2].addChildNode(temp[0]);
        temp[3].addChildNode(temp[0]);
        temp[4].addChildNode(temp[1]);
        temp[5].addChildNode(temp[1]);

        for (int i = 0; i < 7; i++) 
        {
            g.addNode(temp[i]);
        }
        return g;
    }

    public static void main(String[] args) {

        Graph gDfs = createNewGraph();
        GraphImplementation s = new GraphImplementation();

        System.out.println("--------------DFS---------------");
        s.dfs(gDfs.getNode()[0]);
        System.out.println();
        System.out.println();
        Graph gBfs = createNewGraph();
        System.out.println("---------------BFS---------------");
        s.bfs(gBfs.getNode()[0]);

    }

}