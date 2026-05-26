class Solution {

    public String encode(List<String> strs) {
         StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {

         List<String> result = new ArrayList<>();
          int i = 0;

        while (i < str.length()) {
            // Find the '#' delimiter
            int j = str.indexOf('#', i);

            // Read the length prefix
            int length = Integer.parseInt(str.substring(i, j));

            // Extract the string using the length
            String decodedStr = str.substring(j + 1, j + 1 + length);
            result.add(decodedStr);

            // Move pointer forward
            i = j + 1 + length;
        }

        return result;
    }
}
