import java.util.*;

 class Palindrome{
 	public static void main(String[] args) {
 		Scanner sc=new Scanner(System.in);
 		List<Integer> al=new ArrayList<>();
 		int a=115;
 		int b=117;
 		for(int i=a;i<=b;i++){
 			if(pal(i))
 				al.add(i);
 		}
 		int s=0;
 		for(Integer i:al){
 			s+=i;
 		}
 		System.out.println(s);
 	}
 	public static boolean pal(int num){
 		int x=num;
 		int r=0;
 		while(num !=0){
 			int digit =num%10;
 			r=r*10+digit;
 			num/=10;
 		}
 		if(x==r)
 			return true;
 		return false;
 	}
 }