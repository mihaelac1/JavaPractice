package JavaPracticeGitHub.C26_HashTable;

import java.util.*;

public class IntersectionTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> myFirstMap = new LinkedHashMap<>();
        Map<Integer, Integer> mySecondMap = new LinkedHashMap<>();
        List<Integer> arrayListResult = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            myFirstMap.put(nums1[i], myFirstMap.getOrDefault(nums1[i],0) + 1);
        }

        for(int i = 0; i < nums2.length; i++){
            mySecondMap.put(nums2[i], mySecondMap.getOrDefault(nums2[i],0) + 1);
        }

        for(Map.Entry mapElement : myFirstMap.entrySet()){
            if(mySecondMap.containsKey(mapElement.getKey())) {
                int nbApparition = Math.min((int)mapElement.getValue(), mySecondMap.get(mapElement.getKey()));
                int value = (int)mapElement.getKey();
                for(int j = 0; j < nbApparition; j++){
                    arrayListResult.add(value);
                }
            }
        }
        int[] result = new int[arrayListResult.size()];
        int i = 0;
        for(Integer val : arrayListResult){
            result[i++] = val;
        }
        return result;

    }

    public int[] intersectV2(int[] nums1, int[] nums2) {

        Map<Integer, Integer> myFirstMap = new LinkedHashMap<>();
        List<Integer> arrayListResult = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            myFirstMap.put(nums1[i], myFirstMap.getOrDefault(nums1[i],0) + 1);
        }

        for(Integer num : nums2){
            if(myFirstMap.get(num) != null && myFirstMap.get(num) > 0){
                arrayListResult.add(num);
                myFirstMap.put(num, myFirstMap.get(num) - 1);
            }
        }

        int[] result = new int[arrayListResult.size()];
        int i = 0;
        for(Integer val : arrayListResult){
            result[i++] = val;
        }
        return result;
    }

    public int[] intersectV3(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cnt1 = 0;
        int cnt2 = 0;
        ArrayList<Integer> myList = new ArrayList<>();
        while(cnt1 < nums1.length && cnt2 < nums2.length){
            if(nums1[cnt1] > nums2[cnt2]){
                cnt2++;
            }else if(nums1[cnt1] < nums2[cnt2]){
                cnt1++;
            }else {
                myList.add(nums1[cnt1]);
                cnt1++;
                cnt2++;
            }
        }
        int[] myArray = new int[myList.size()];
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = myList.get(i);
        }

        return myArray;

    }



    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(Arrays.toString(intersect(nums1, nums2)));

    }
}
