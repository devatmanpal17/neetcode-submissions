class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        java.util.List<java.util.List<String>>result=new java.util.ArrayList<>();
        boolean[]used=new boolean[strs.length];
        for(int i=0;i<strs.length;i++){
            if(used[i]){
                continue;

            }
            java.util.List<String>group=new java.util.ArrayList<>();
            group.add(strs[i]);
            used[i]=true;
            for(int j=i+1;j<strs.length;j++){
                if(!used[j]&&isAnagram(strs[i],strs[j])){
                    group.add(strs[j]);
                    used[j]=true;

                }
            }
            result.add(group);
        }
        return result;

    }
    public boolean isAnagram(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1,arr2);
    }
}

