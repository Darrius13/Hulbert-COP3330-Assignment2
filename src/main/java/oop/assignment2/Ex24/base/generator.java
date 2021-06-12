package oop.assignment2.Ex24.base;
import java.util.*;

public class generator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings and i'll tell you if they are anagrams:");
        System.out.print("enter the first string: ");
        String a=sc.next();
        System.out.print("enter the second string: ");
        String b=sc.next();
        if(isAnagram(a,b))
            System.out.println(a+" and "+b+" are anagrams");
        else
            System.out.println(a +" and "+ b +" are not anagrams");

    }
    public static boolean isAnagram(String s1,String s2){
        //if lengths not matching , then not anagrams
        if(s1.length()!=s2.length()) return false;
        int [] freq = new int[26];//Character frequency
        for(int i=0 ; i< s1.length(); i++){
            //know the frequency of character and increment
            freq[s1.charAt(i)-'a']++;
            //know the frequency of character and decrement
            freq[s2.charAt(i)-'a']--;
        }
        //now if they are anagrams freq should contains all 0's
        for(int x : freq){
            if(x!=0) return false;//if found 1
        }
        return true;
    }
}



