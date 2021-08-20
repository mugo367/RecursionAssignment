package com.company;

public class RecursionClass {
    /**Given a string and a non-empty substring sub,
     * compute recursively the number of times that
     * sub appears in the string, without the sub strings overlapping.
     * */
    public int strCount(String str, String sub) {
        if (str.length() < sub.length())
            return 0;
        if (str.startsWith(sub))
            return 1 + strCount(str.substring(sub.length()), sub);
        else
            return strCount(str.substring(1), sub);
    }
    /**
     * Given a string, compute recursively a new string where identical
     * chars that are adjacent in the original string are separated
     * from each other by a "*".
     * */
    public String pairStar(String string) {
        if (string.length() <= 1)
            return string;
        if (string.charAt(0) == string.charAt(1))
            return string.charAt(0) + "*" + pairStar(string.substring(1));
        else
            return string.charAt(0) + pairStar(string.substring(1));
    }
    /**
     * We have triangle made of blocks.
     * The topmost row has 1 block, the next row down has 2 blocks,
     * the next row has 3 blocks, and so on.
     * Compute recursively(no loops or multiplication) the total number
     * of blocks in such a triangle with the given number of rows.
     * */
        public int triangleBlocks(int rows) {
        if (rows == 0)
            return 0;
        return rows + triangleBlocks(rows-1);
    }
    /**
     * Given a string, compute recursively (no loops) the
     * number of lowercase 'x' chars in the string.
     * */
    public int countLowercaseX(String string) {
        if (string.equals(""))
            return 0;
        if (string.charAt(0) == 'x')
            return 1 + countLowercaseX(string.substring(1));
        else
            return countLowercaseX(string.substring(1));
    }
    /**
     * Given a string that contains a single pair of parenthesis,
     * compute recursively a new string made of only of the parenthesis
     * and their contents, so "xyz(abc)123" yields "(abc)".
     * */
    public String parenthesisBit(String string) {
        if (string.equals(""))
            return string;
        if (string.charAt(0) == '(') {
            if (string.charAt(string.length()-1) == ')')
                return string;
            else
                return parenthesisBit(string.substring(0, string.length()-1));
        } else
            return parenthesisBit(string.substring(1));
    }
}
