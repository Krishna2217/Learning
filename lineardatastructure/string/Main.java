package lineardatastructure.string;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        KMP kmp = new KMP();

        // Test Case 1: Multiple matches (your example)
        runTest(kmp, "AABBACAABBAADAABBAFAABBAA", "AABBAA");

        // Test Case 2: Single match at start
        runTest(kmp, "abcde", "abc");

        // Test Case 3: No match
        runTest(kmp, "abcdefgh", "xyz");

        // Test Case 4: Full string match
        runTest(kmp, "pattern", "pattern");

        // Test Case 5: Pattern longer than text
        runTest(kmp, "short", "muchlongerpattern");

        // Test Case 6: Overlapping matches
        runTest(kmp, "aaaaaa", "aaa"); // should match at [0, 1, 2, 3]

        // Test Case 7: Pattern at end
        runTest(kmp, "xxxyyyzzzabc", "abc");

        // Test Case 8: Repeated pattern
        runTest(kmp, "ababababab", "abab");

        // Test Case 9: Text and pattern with special characters
        runTest(kmp, "ab#c$d#ab#c$d#", "ab#c$d#");

        // Test Case 10: Empty pattern
        runTest(kmp, "anything", "");

        // Test Case 11: Empty text
        runTest(kmp, "", "abc");

        // Test Case 12: Both empty
        runTest(kmp, "", "");


    }

    private static void runTest(KMP kmp, String txt, String pattern) {
        if(txt.isEmpty() || pattern.isEmpty()) {
            System.out.println(new ArrayList<>());
            return;
        }

        System.out.println("Text: " + txt);
        System.out.println("Pattern: " + pattern);
        List<Integer> result = kmp.Kmp(txt, pattern);
        System.out.println("Match indices: " + result);
        System.out.println("-----");


    }
}
