class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        
        if (n > m) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        //Build the first window and check if it matches with s1count//
        for (int i = 0; i < n; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Check the first window
        if (matches(s1Count, windowCount)) return true;

        //Slide the window 
        for (int right = n; right < m; right++) {
            windowCount[s2.charAt(right) - 'a']++;     // Adding new char
            windowCount[s2.charAt(right - n) - 'a']--; // Removing old char

          
            if (matches(s1Count, windowCount)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}