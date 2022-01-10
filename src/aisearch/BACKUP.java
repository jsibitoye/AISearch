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
public class BACKUP {
    public static String pointA;
    public static String pointB;

	static Vector<Vector<String>> v = new Vector<Vector<String>>();
        
	static void addNode(int x,String x1, int y,  String y1){
		v.get(x).add(y1);
		v.get(y).add(x1);
	}
	

	static void printPath(Vector<Integer> stack)
	{
            System.out.println( "the Path from point " +pointA +" to point "+pointB +" is shown bellow : ");
		for(int i = 0; i < stack.size() - 1; i++)
		{
                        
			System.out.print( retrieveNode(stack.get(i)) + " -> ");
		}
		System.out.println(retrieveNode(stack.get(stack.size() - 1)));
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
               // System.out.println(stack);
	}
	
	
	static void DFSFunction(int x, int y, int n, Vector<Integer> stack)
	{
	
		// visited array
		boolean vis[] = new boolean[n + 1];
		Arrays.fill(vis, false);
               // System.out.println(stack);
	
		DFS(vis, x, y, stack);
	}

    private static int getNode(int x, int j) {
        int index = 0;
        switch(v.get(x).get(j)) {
                                        case "A":
                                          index = 1;
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
    }

    private static int setIndex(String pointA) {
              int index = 0;
        switch(pointA) {
                                        case "A":
                                          index = 1;
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
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   


    BACKUP(String StringA, String StringB) {
       // System.out.print("josh");
        pointA = StringA;
        pointB = StringB;
        v.clear();
        
         for(int n = 0; n < 20; n++)
                    {
                        v.add(new Vector<String>());
                    }
                    int n = 10;
                    Vector<Integer> stack = new Vector<Integer>();

                    addNode(1, "A", 2,"B");
                    addNode(1, "A", 3,"C");
                    addNode(2, "B", 4,"D");
                    addNode(2, "B", 5,"E");
                    addNode(2, "B", 6,"F");
                    addNode(3, "C", 7,"G");
                    addNode(3, "C", 8,"H");
                    addNode(3, "C", 9,"I");
		DFSFunction(setIndex(pointA),setIndex(pointB) , n, stack);
	
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
