class Solution {
    public String sortSentence(String s) {
           ArrayList<String> stringList=new ArrayList<String>();
        // a String list is to store a list of words.
        ArrayList<Integer> indexList= new ArrayList<>();
        // index list is used to store the index of words
        // on a single iteration we store both word and index so it would be easy to
        // access an expected index of a word(specific string).

        for (String val: s.split(" ")){
            int num=Character.getNumericValue(val.charAt(val.length()-1));
            // num gets the index where the given String is supposed to be put.
            val=val.substring(0,val.length()-1);
            // Here we are removing the number from the string.

            // both string list and index list are loaded with values.
            stringList.add(val);
            indexList.add(num-1);
        }
        // A loop iterate through a given string and split it with a space.
        // the strings are stored on String list and there index
        // is stored on index list.

         for(int i=0;i<stringList.size();i++){
            for(int j=i;j<stringList.size();j++){
                Collections.swap(stringList,indexList.get(j),j);
                Collections.swap(indexList,indexList.get(j),j);
            }
        }
        String result="";
        for(String element: stringList ){
            result=result+" "+element;
        }
        return result.substring(1);
    }
}
