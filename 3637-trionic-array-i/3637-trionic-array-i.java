class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 4) return false;

        int p = -1, q = -1;

        // 1️⃣ Find p (increase -> decrease)
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) {
                p = i;
                break;
            }
        }
        if (p <= 0) return false;

        // 2️⃣ Validate strictly increasing [0..p]
        for (int i = 0; i < p; i++) {
            if (nums[i] >= nums[i + 1]) return false;
        }

        // 3️⃣ Find q (decrease -> increase)
        for (int i = p; i < n - 1; i++) {
            if (nums[i] <= nums[i + 1]) {
                q = i;
                break;
            }
        }
        if (q == -1 || q == p) return false;

        // 4️⃣ Validate strictly decreasing [p..q]
        for (int i = p; i < q; i++) {
            if (nums[i] <= nums[i + 1]) return false;
        }

        // 5️⃣ Validate strictly increasing [q..n-1]
        for (int i = q; i < n - 1; i++) {
            if (nums[i] >= nums[i + 1]) return false;
        }

        return true;
    }
}
