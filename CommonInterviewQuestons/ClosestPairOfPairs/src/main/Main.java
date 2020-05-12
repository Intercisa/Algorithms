package main;

import java.util.Arrays;
import java.util.List;

import closestpair.ClosestPairOfPoints;
import closestpair.Point;

/*
 * Closest Pair of Points
 * 
 *  	We are given an array of N points in the 2-D plane and the problem is to find the closest pair of points in the array 
 *  	It has several applications: for example air-traffic control
 *  	We may want to monitor planes that come too close together -> they might collide
 *  	Brute-force approache: O(Npow2) very slow, we need something faster
 *  	Divide and conquer approache might help to achive O(N*logN) time complexity  
 *  
 *  	
 *		//brute-force:
 *		private static double bruteForceApproach(List<Point> points) {
 *			double minDistance = Double.MAX_VALUE;
 *		
 *			for (int i = 0; i < points.size(); i++) {
 *				for (int j = i+1; j < points.size(); j++) {
 *					if(distance(points.get(i), points.get(j) < minDistance)) {
 *						minDistance = distance(points.get(i), points.get(j));
 *					}
 *				}
 *			}
 *		
 *			return minDistance;
 *		}	
 * 
 *
 *	better solution 
 *		Algorithm:
 *			1, sort all points according to the x coordinates
 *			2, divide all points into two subsets with the help of a middleIndex
 *			3, find the minimum distance recursively in the two subsets //d1 and d2
 *			4, calculate the minimum of these smallest distances // d = min(d1,d2)
 *			5, check the neighbourhood of the middle line (strip) there may be points that are closer to each other than min (d1, d2)
 *				so we get a stripMinimum
 *			6, find the smallest distance in the strip
 *			7, finally return min(d, stripMinimum)	 
 */

public class Main {

	public static void main(String[] args) {
		List<Point> points = Arrays.asList(new Point(1, 1),new Point(1, 2),new Point(2, 1),
						new Point(2, 2),new Point(2, 3),new Point(3, 3));
		ClosestPairOfPoints closestPairOfPoints = new ClosestPairOfPoints(points);
		System.out.println(closestPairOfPoints.solveProblem());

	}
}
	
