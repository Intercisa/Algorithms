using System;
using System.Collections.Generic;
using System.Text;

namespace WindowSliding
{
    class SlidingImp
    {
        //1,
        public double FindMaxAverage(int[] nums, int k) {
            int sum = 0, maxSum = int.MinValue;

            for (int i = 0; i < k; i++)
                sum += nums[i];

            for (int i = k; i <= nums.Length; i++)
            {
                maxSum = Math.Max(maxSum, sum);

                if (i == nums.Length) break;
                sum -= nums[i - k];
                sum += nums[i];
            }

            return maxSum * 1.0 / k; //* 1.0 -> double and /k because average
        
        }

        //2,
        public double[] MedianSlidingWindow(int[] nums, int k) {
            int N = nums.Length;
            double[] res = new double[N - k + 1];
            int[] sorted = new int[k];
            //construct the first sorted window

            for (int i = 0; i < k; i++)
                sorted[i] = nums[i];
                Array.Sort(sorted);

                for (int i = k; i <= N ; i++)
                {
                //calculate the median, k / 2 is the right median (k - 1)/2 is the left median
                res[i - k] = sorted[k / 2] * 0.5 + sorted[(k - 1)/2] * 0.5;
                if (i == N) break;

                //remove the first element in the window
                Remove(sorted, nums[i - k]);

                //insert the next element to the window 
                insert(sorted, nums[i]);
                }

            return res;
        }

        private void insert(int[] sorted, int x)
        {
            int i = 0;
            while (i < sorted.Length && sorted[i] < x)
                i++;

            //shift all elements beyond x to left 1 position
            while (i < sorted.Length - 1) { 
                sorted[i] = sorted[i + 1];
                i++;
            }  
        }

        private void Remove(int[] sorted, int x)
        {
            //insert x into the right position
            int i = sorted.Length - 2;
            while (i >= 0 && sorted[i] > x) {
                sorted[i + 1] = sorted[i];
                i--;
            }
            sorted[i + 1] = x;
        }

        //3,
        public int MinSubArrayLen(int s, int[] nums)
        {
            int N = nums.Length, minLen = int.MaxValue, i = 0, sum = 0;

            for (int j = 0; j < N; j++)
            {
                sum += nums[j];

                while (sum >= s)
                {

                    minLen = Math.Min(minLen, j - i + 1);
                    sum -= nums[i++];

                }
            }
            return minLen == int.MaxValue ? 0 : minLen;
        }


        //4, 
        public int LengthOfLongestSubstringKDistinct(string s, int k) {

            Dictionary<char, int> dict = new Dictionary<char, int>();
            int maxLen = 0;
            for (int i = 0, j = 0; j < s.Length; j++)
            {
                //map.put(s.charAt(j), j);
                dict[s[j]] = j;
                if (dict.Count > k) {
                    while (i < j && dict[s[i]] != i) {
                        i++;
                    }
                    dict.Remove(s[i++]);
                }
                maxLen = Math.Max(maxLen, j - i + 1);
            }
            return maxLen;
        }

    }
}
