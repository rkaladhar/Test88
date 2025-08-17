package pack;

public class LongestCommonPrefixExample {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];  // Take the first string as the initial prefix	
System.out.println("prefix : "+ prefix);
        for (int i = 1; i <=strs.length-1; i++) {
        	           while (strs[i].indexOf(prefix) != 0) {
        	        	   System.out.println("strs["+i+ "].indexOf("+prefix+")"+"<====> "+ strs[i].indexOf(prefix));
        	        	   
                // Keep shortening the prefix until it matches
                prefix = prefix.substring(0, prefix.length() - 1);
                System.out.println("prefix-----> "+ prefix);
                		
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] words = {"flower", "flow", "flour", "floight"};
        String result = longestCommonPrefix(words);
        System.out.println("Longest Common Prefix: " + result);
    }
}

