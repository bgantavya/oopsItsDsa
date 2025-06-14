package JavaByKunal.Algorithms.SearchAlgorithms.LinearSearch;


public class searchinStrings {
    public static void main(String[] args) {
        String name = "Gantavya";
        char target = 'g';
        int index = searchString(name,target);
        boolean found = verifyString(name,target);
        System.out.println(index);
        System.out.println(found);
    }
    static int searchString(String name, char target){
        if (name.length() == 0) return -1;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == target) return i;
        }
        // name = Arrays.tochar
        return -1;
    }
    static boolean verifyString(String name , char target){
        if (name.length() == 0) return false;
        for(char ch : name.toCharArray()){
            if(ch == target) return true;
        }
        return false;
    }
}
