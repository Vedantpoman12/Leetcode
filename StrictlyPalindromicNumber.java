class Solution {
    public boolean isStrictlyPalindromic(int n) {
        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 9; // Example input
        System.out.println(sol.isStrictlyPalindromic(n));
    }
}
// A number n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive),
// the representation of n in base b is palindromic.