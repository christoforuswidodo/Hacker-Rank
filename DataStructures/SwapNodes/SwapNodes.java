import java.util.*;

public class SwapNodes {

	// Represent a BST with an Array (idea from cs61b)
	static int[][] childTrees;

	public static void swapChildren(int[][] trees, int depth, int swapLevel) {
		swapChildren(trees, 0, depth, swapLevel);
	}

	public static void printInorderTraversal(int[][] trees, int node) {
		if (trees[node][1] > 0)
			printInorderTraversal(trees, trees[node][1] - 1);
		System.out.print(trees[node][0] + " ");
		if (trees[node][2] > 0)
			printInorderTraversal(trees, trees[node][2] - 1);
	}

	public static void printTreeSpaced(int[][] trees, int node) {
		printInorderTraversal(trees, node);
		System.out.println("");
	}

	public static void swapChildren(int[][] trees, int node, int depth, int swapLevel) {
		if (trees[node][1] > 0)
			swapChildren(trees, trees[node][1] - 1, depth + 1, swapLevel);
		if (trees[node][2] > 0)
			swapChildren(trees, trees[node][2] - 1, depth + 1, swapLevel);
		if ((depth % swapLevel) == 0) {
			// swap tree node since now we are at the intended depth
			int childContainer = trees[node][1];
			trees[node][1] = trees[node][2];
			trees[node][2] = childContainer;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		childTrees = new int[n][3];
		for (int i = 0; i < n; i += 1) {
			// 0 index refers to left child, 1 index refers to right child
			childTrees[i][0] = i + 1;
			childTrees[i][1] = in.nextInt();
			childTrees[i][2] = in.nextInt();
		}
		int t = in.nextInt();
		for (int i = 0; i < t; i += 1) {
			int swapLevel = in.nextInt();
			swapChildren(childTrees, 1, swapLevel);
			printTreeSpaced(childTrees, 0);
		} 		
	}


}