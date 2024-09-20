package geeks.searching;

public class maxi_water_two_buil {
        static int maxWater(int height[], int n)
        {
            n = height.length;
            if (n<2){
                return 0;
            }
            int left = 0 ,right = n-1;
            int maxwater = 0;
            while (left < right){
                int gap = right - left - 1;
                int minheight = Math.min(height[left] ,height[right]);
                int watertrap = minheight * gap;
                maxwater = Math.min(maxwater ,watertrap);
                if(height[left] < height[right]){
                    left++;
                }
                else {
                    right--;
                }
            }
            return maxwater;
        }
    }

