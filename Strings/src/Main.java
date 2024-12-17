import java.util.*;
public class Main {

    //Print each element of a String
    public static void printLetter(String MyName){
        for(int i=0;i<MyName.length();i++){
            System.out.print(MyName.charAt(i)+" ");
        }
    }

    //Check Palindrome or not
    public static void isPalindrome(String str){
        String flag="True";
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length() - 1-i)) {
                flag = "False";
            }
        }
        if(flag.equals("True")){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    //To find Shortest Distance
    public static float shortestDistance(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if (dir=='N')
                y++;
            else if (dir=='S')
                y--;
            else if(dir=='E')
                x++;
            else
                x--;
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    //Print Largest String
    public static String largestString(String str1,String str2,String str3){
            if(str1.compareToIgnoreCase(str2)>0){
                if (str1.compareToIgnoreCase(str3) > 0) {
                    return str1;
                }
            }
            else if(str2.compareToIgnoreCase(str3) > 0){
                    return str2;
            }
            return str3;
    }
    // String Builder
    public static void stringBuilder(){
        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println("StringBuilder : "+sb);
        System.out.println("String : "+sb.toString());
        System.out.println("Length of the StringBuilder: "+sb.length());
    }

    //To Convert first character of given String into uppercase
    public static void toUpperCase(){
        String str = "hi, i'm chhotu kumar from india";
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }

    //Compress a String
    public static String compress(String str){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    //Ques 1. Count how many times lowercase vowels occurred in a String entered by the user.
    public static int vowelsCount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        return count;
    }

    //Ques 2. Determine if 2 Strings are anagrams of each other.
    public static void isAnagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()==str2.length()){
            char[] str1charArray=str1.toCharArray();
            char[] str2charArray=str2.toCharArray();
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
            boolean result=Arrays.equals(str1charArray,str2charArray);
            if(result){
                System.out.println("Anagram");
            }
            else{
                System.out.println("Not Anagram");
            }
        }
        else{
            System.out.println("Not anagram");
        }
    }
    // OR
//    public static void isAnagrams(String str1,String str2){
//        StringBuilder str=new StringBuilder("");
//        for(int i=0;i<str1.length();i++){
//            for(int j=0;j<str2.length();j++){
//                if(str1.charAt(i)!=str2.charAt(j)){
//                    str=new StringBuilder("False");
//                    break;
//                }
//            }
//        }
//        if(str.equals("False")){
//            System.out.println(" Not Anagram");
//        }
//        else{
//            System.out.println("Anagram");
//        }
//    }
    public static void main(String[] args) {
        //String fullName="CHHOTU KUMAR";
        //printLetter(fullName);
        //String str="racecar";
        //isPalindrome(str);
        //String path ="WNENNW";
        //System.out.print("The shortest Distance is : "+shortestDistance(path));
        //String fruit1="apple";
        //String fruit2="mango";
        //String fruit3="banana";
        //System.out.println(largestString(fruit1,fruit2,fruit3));
        //stringBuilder();
        //toUpperCase();
        //String str="AAAbbccdddaaaAAA";
        //System.out.println(compress(str));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st string");
        String str1=sc.nextLine();
        System.out.println("Enter the 2nd string");
        String str2=sc.nextLine();
        //System.out.println("Vowel count is : "+vowelsCount(str));
        //System.out.println(str.replace("l",""));
        isAnagram(str1,str2);
    }
}