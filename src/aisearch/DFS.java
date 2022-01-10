/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aisearch;

import java.util.Arrays;
import java.util.Vector;

/**
 *
 * @author j
 */
public class DFS {

	static Vector<Vector<Integer>> v = new Vector<Vector<Integer>>();
	
	// An utility function to add an edge in an
	// undirected graph.
	static void addEdge(int x, int y){
		v.get(x).add(y);
		v.get(y).add(x);
	}
	
	// A function to print the path between
	// the given pair of nodes.
	static void printPath(Vector<Integer> stack)
	{
		for(int i = 0; i < stack.size() - 1; i++)
		{
			System.out.print(stack.get(i) + " -> ");
		}
		System.out.println(stack.get(stack.size() - 1));
	}
	
	// An utility function to do
	// DFS of graph recursively
	// from a given vertex x.
	static void DFS(boolean vis[], int x, int y, Vector<Integer> stack)
	{
		stack.add(x);
		if (x == y)
		{
		
			// print the path and return on
			// reaching the destination node
			printPath(stack);
			return;
		}
		vis[x] = true;
	
		// if backtracking is taking place	
		if (v.get(x).size() > 0)
		{
			for(int j = 0; j < v.get(x).size(); j++)
			{
			
				// if the node is not visited
				if (vis[v.get(x).get(j)] == false)
				{
					DFS(vis, v.get(x).get(j), y, stack);
				}
			}
		}
		
		stack.remove(stack.size() - 1);
	}
	
	// A utility function to initialise
	// visited for the node and call
	// DFS function for a given vertex x.
	static void DFSCall(int x, int y, int n,
						Vector<Integer> stack)
	{
	
		// visited array
		boolean vis[] = new boolean[n + 1];
		Arrays.fill(vis, false);
	
		// memset(vis, false, sizeof(vis))
	
		// DFS function call
		DFS(vis, x, y, stack);
	}
	
// Driver code
	public static void main(String[] args)
	{
		for(int i = 0; i < 100; i++)
		{
			v.add(new Vector<Integer>());
		}
	
		int n = 10;
		Vector<Integer> stack = new Vector<Integer>();
		
		// Vertex numbers should be from 1 to 9.
		addEdge(1, 2);
//		addEdge(1, 3);
//		addEdge(2, 4);
//		addEdge(2, 5);
//		addEdge(2, 6);
//		addEdge(3, 7);
//		addEdge(3, 8);
//		addEdge(3, 9);
		System.out.println(v);
//		// Function Call
//		DFSCall(4, 8, n, stack);
	}
}

// This code is contributed by divyeshrabadiya07

