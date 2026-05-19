class Solution {
    public boolean isAnagram(String s, String t) {
     boolean allMatch = true;
        if (s.length() == t.length()) {
            StringBuilder sb = new StringBuilder(t);
            for (int i = 0; i < s.length(); i++) {
                int index = sb.indexOf(String.valueOf(s.charAt(i)));
                if (index == -1) {
                    allMatch = false;
                    break;
                } else {
                    sb.deleteCharAt(index);
                }
            }
            return allMatch;
        } 

    return  false;
}
}


