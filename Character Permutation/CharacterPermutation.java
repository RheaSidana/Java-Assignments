/*
Find out all the possible permutations of the characters in the string passed 
to the method findPermutations(). 
Implement the logic inside findPermutations() method and 
return a string array containing all the permutations.

Assumption: The length of the string will be 3.
E.g.: For the string "abc", the permutations will be abc, acb, bac, bca, cab and cba.

Sample Input and Output
Input  : abc
Output : abc acb bac bca cab cba

Input  : aad
Output : aad ada daa
*/

//package Assignments;

public class CharacterPermutation {
	static int noOfPermutations(int len){
		int count=1;
		for(int i=2;i<=len;i++){
			count*=i;
		}
		return count;
	}
	static boolean arrayContainsString(String[] arr,String str){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==null)break;
			if(arr[i].equals(str)) return true;
		}
		return false;
	}
    public static String[] findPermutations(String str){
        //Implement your code here and change the return value accordingly
        int len=noOfPermutations(str.length());
		 	String[] permut=new String[len];
		 	String temp;
		 	char[] ch = new char[3];
		 	int k=0;
		 	for(int i=0;i<str.length();i++){
		 		int x=0;
		 		ch[x]=str.charAt(i);
		 		for(int j=0;j<str.length();j++){
		 			if(i==j)continue;
		 			x++;
		 			ch[x]=str.charAt(j);
		 		}
		 		temp=Character.toString(ch[0])+Character.toString(ch[1])+Character.toString(ch[2]);
		 		if(k==0){
		 			permut[k]=temp;
		 			k++;
		 			temp=Character.toString(ch[0])+Character.toString(ch[2])+Character.toString(ch[1]);
		 			if(arrayContainsString(permut,temp)==false){
		 			permut[k]=temp;
		 			k++;
		 			}
		 		}
		 		else if(arrayContainsString(permut,temp)==false){
		 			permut[k]=temp;
		 			k++;
		 			temp=Character.toString(ch[0])+Character.toString(ch[2])+Character.toString(ch[1]);
		 			if(arrayContainsString(permut,temp)==false){
		 			permut[k]=temp;
		 			k++;
		 			}
		 		}
		 	}
	        return permut;
    }
    
    public static void main(String args[]){
        String str = "aad";
        String permutations[] = findPermutations(str);
        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }
    }
}
