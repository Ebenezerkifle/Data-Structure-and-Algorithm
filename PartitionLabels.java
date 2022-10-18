class Solution {
    public List<Integer> partitionLabels(String s) {
        int pointer1=0;
        int pointer2=0;
        int index=0;
        List<Integer> list= new ArrayList<Integer>();

        while(index < s.length()){
            for(int i=pointer2;i<s.length();i++){
                if(s.charAt(index)==s.charAt(i)){
                    pointer2=i;
                }
            }
            if(index==pointer2){
                list.add(pointer2-pointer1+1);
                pointer1=index+1;
                pointer2=pointer1;
                // the pointer value gets updated.
            }
            index++;
        }
        return list;
    }
}
