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
 * @author josh
 */
public class test {

	static Vector<Vector<String>> v = new Vector<Vector<String>>();

        	public static void main(String[] args){
                    for(int i = 0; i < 100; i++)
                    {
                        v.add(new Vector<String>());
                    }
                    int n = 10;
                    Vector<Integer> stack = new Vector<Integer>();

                    addEdge(1, "A", 2,"B");
                    addEdge(1, "A", 3,"C");
                    addEdge(2, "B", 4,"D");
                    addEdge(2, "B", 5,"E");
                    addEdge(2, "B", 6,"F");
                    addEdge(3, "C", 7,"G");
                    addEdge(3, "C", 8,"H");
                    addEdge(3, "C", 9,"I");

		DFSCall(2, 9, n, stack);
	}
                
	static void addEdge(int x,String x1, int y,  String y1){
		v.get(x).add(y1);
		v.get(y).add(x1);
	}
	
	static void printPath(Vector<Integer> stack)
	{
            System.out.print( " the Path is: ");
		for(int i = 0; i < stack.size() - 1; i++)
		{
                        
			System.out.print( retrieveNode(stack.get(i)) + " -> ");
		}
		System.out.println(stack.get(stack.size() - 1));
	}

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
                            int index = getNode(x, j);
                            
				if (vis[index] == false)
				{
					DFS(vis, index, y, stack);
				}
			}
		}
		
		stack.remove(stack.size() - 1);
	}
	
	
	static void DFSCall(int x, int y, int n,
						Vector<Integer> stack)
	{
	
		// visited array
		boolean vis[] = new boolean[n + 1];
		Arrays.fill(vis, false);
               
		// DFS function call
		DFS(vis, x, y, stack);
	}

    private static int getNode(int x, int j) {
        int index = 0;
        switch(v.get(x).get(j)) {
                                        case "A": index = 1;
                                          break;
                                        case "B": index =2;
                                        break;
                                        case "C": index =3;
                                        break;
                                        case "D": index =4;
                                        break;
                                        case "E": index =5;
                                        break;
                                        case "F": index =6;
                                        break;
                                        case "G": index =7;
                                        break;
                                        case "H": index =8;
                                        break;
                                        case "I": index =9;
                                        break;
                            }
        return index;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static String retrieveNode(Integer get) {
        
                String Node ="";
        switch(get) {
                                        case 1:Node = "A";
                                          break;
                                        case 2: Node ="B";
                                        break;
                                        case 3: Node ="C";
                                        break;
                                        case 4: Node ="D";
                                        break;
                                        case 5: Node ="E";
                                        break;
                                        case 6: Node ="F";
                                        break;
                                        case 7: Node ="G";
                                        break;
                                        case 8: Node ="H";
                                        break;
                                       case 9: Node ="I";
                                        break;
                            }
        return Node;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


