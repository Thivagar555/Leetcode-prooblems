//CORE LOGIC
       //water at current index i depends on min(max height on left, max height on right) - height[i] 
        
        // int water = Math.min(leftMax, rightMax) - height[i];

class Solution {
    public int trap(int[] height) {
 
        //BRUTE FORCE
        // int n = height.length;
        // int totalWater = 0;

        // for (int i = 0; i < n; i++) {

        //     // Find left max
        //     int leftMax = 0;
        //     for (int j = 0; j <= i; j++) {
        //         leftMax = Math.max(leftMax, height[j]);
        //     }

        //     // Find right max
        //     int rightMax = 0;
        //     for (int j = i; j < n; j++) {
        //         rightMax = Math.max(rightMax, height[j]);
        //     }

        //     // Water at index i
        //     int water = Math.min(leftMax, rightMax) - height[i];

        //     if (water > 0) {
        //         totalWater += water;
        //     }
        // }

        // return totalWater;

        //TWO POINTERS APPROACH
//Move the smaller side
// Use its max boundary
// If bar smaller → add water
// Else → update boundary
    int left =0;
    int right = height.length-1;

    int leftMax = 0;
    int rightMax = 0;//to update boundries both side

    int totalWater = 0;

    while(left<right)
    {
        if(height[left] < height[right]) //because min side will be considered from both --min(leftMax, RightMax)
        {
            if(leftMax <= height[left])
            {
                leftMax = height[left];//update boundry
            }
            else
            {
                totalWater += leftMax - height[left];
            }
            left++;
        }
        else
        {
            if(rightMax <= height[right])
            {
                rightMax = height[right];
            }
            else
            {
                totalWater += rightMax - height[right];
            }
            right--;
        }
    }
    return totalWater;

//Why Compare height[left] < height[right] ? becaus min(lefmax, rightmax)

// We are deciding which side is smaller boundary.

// If height[left] < height[right]:

// Right side definitely has a taller wall somewhere

// So left side becomes the limiting boundary

// Water can be calculated using leftMax only

// Move left++

// Else:

// Left side has taller wall somewhere

// So right side becomes limiting boundary

// Use rightMax

// Move right--
    }
}