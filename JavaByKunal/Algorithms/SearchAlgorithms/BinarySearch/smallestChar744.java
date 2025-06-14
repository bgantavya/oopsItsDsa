

public class smallestChar744{
    public static void main(String[] args) {
        
    }
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length -1;
        int mid;
        while(low <= high){
            mid = low + (high - low) /2;
            if(target < letters[mid]) high = mid -1;
            else low = mid +1;
            // else return letters[mid];
            
        }
        return letters[low % letters.length];
    }

}