package Replit;

public class Replit195 {
    public static void main(String[] args) {
        isAnagram("listen", "Silent");
        System.out.println(isAnagram("listen", "Silent") );

        /*
        boolean result = isAnagram("now","own");
        System.out.println(result);
         */
    }
    public static boolean isAnagram(String word1, String word2) {
        // remove all whitespaces and convert strings to lowercase
        word1=word1.replaceAll(" ","").toLowerCase();
        word2=word2.replaceAll(" ","").toLowerCase();
      /* check whether string lengths are equal or not,
     if unequal then not anagram */
        if (word1.length()!=word2.length())
            return false;
        // convert word1 string to char array
        char[]w1=word1.toCharArray();
        // check whether each character of firstArray is present in second string
        for (char i:w1){
            int index= word2.indexOf(i);
            // indexOf function returns -1 if the character is not found
            if (index==-1)
                return false;
            // if character is present in second string, remove that character from second string
            word2=word2.substring(0,index)+ word2.substring(index+1,word2.length());
    }
      return true;

    }
}
/*

isAnagram method checks if word1 and word2 are anagram to each other then return a boolean.

each letter in word1 should appear in word2 exact number of times
ignore empty spaces
make your code case insensitive

Examples:

isAnagram("listen", "Silent") ==> true

isAnagram("earth", "heart") ==> true

isAnagram("star", "rats") ==> true

isAnagram("hi", "bye") ==> false

isAnagram("java", "cava") ==> false


 */
/*
  word1=word1.toLowerCase();
word2=word2.toLowerCase();
char w1[] = word1.toCharArray();
char w2[] = word2.toCharArray();
Arrays.sort(w1);
Arrays.sort(w2);
if(Arrays.equals(w1, w2)){
    return true;
}
else{
    return false;
}
  }
}

 */
