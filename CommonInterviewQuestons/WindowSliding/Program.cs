using System;

namespace WindowSliding
{

    /*
     * a sliding window is a sub-list that runs over an underlying collection
     * [a b c d e f g h]
     * 
     *  [a b c]
     *     [b c d]
     *        [c d e]
     *           [d e f]
     *              [e f g]
     *                 [f g h]
     *                 
     *                 
     * The problem will involve a data structure that is ordered and iterable like an array or a string
     * You are looking for some subrange in that array/string, like a longest, shortest or target value.
     * There is an apparent naive or brute force solution that runs in O(N²), O(2^N) or some other large time complexity.
     * looking for is often some kind of optimal, like the longest sequence 
     * or shortest sequence of something that satisfies a given condition exactly.
     * 
     * Two type: 
     *  Fixed window length k:
     *  Two pointers + criteria
     * 
     * 1, find max averge  -> Given an array consisting of n integers, find the contiguous subarray of given length k that has the maximum average value. 
     * And you need to output the maximum average value. >> first type
     * 
     * 2. Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
     * You can only see the k numbers in the window. Each time the sliding window moves right by one position. 
     * Your job is to output the median array for each window in the original array.
     * 
     * 3. Given an array of n positive integers and a positive integer s, 
     * find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn’t one, return 0 instead.
     * 
     * 4. Given a string, find the length of the longest substring T that contains at most k distinct characters.
     * [e,c,e,b,a], k = 2, the first window is [e, c, e], the next starting index should be 2
     * [e,c,c,b,a], k = 2, the first window is [e, c, c], the next starting index should be 1
     * 
     * 
     *  https://medium.com/@zengruiwang/sliding-window-technique-360d840d5740
     * 
     */


    class Program
    {
        static void Main(string[] args)
        {

            SlidingImp sliding = new SlidingImp();
            Console.WriteLine(sliding.FindMaxAverage(new int[] { 1,12,-5,-6,50,3}, 4));


            Console.WriteLine(sliding.LengthOfLongestSubstringKDistinct("eceba", 2));


        }
    }
}
