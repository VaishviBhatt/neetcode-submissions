class Solution {

    public String encode(List<String> strs) {
        if(strs == null){
            return "";
        }

        String str = "";

        for(String word : strs){
            str += word.length() + "#" + word;
        }

        return str.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();
        int i = 0;

        while( i < str.length()){
            int slash = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, slash));

            int startIndex = slash + 1;

            int endingIndex = startIndex + length;

            String word = str.substring(startIndex, endingIndex);

            result.add(word);

            i = endingIndex;
        }

        return result;

        
    }
}
