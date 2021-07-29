package day05_loop;

public class Quiz01 {
	public static void main(String[] args) {
		int su=1;
		for(su=1; su<=4; su++) {
			System.out.println(su+".hello");
		}
		int i=1,sum=0;
		for(i=1; i<=100; i++) {
			sum+=i;
			if(sum==528) {
				System.out.print("1~100까지의 합 중에서 그 합이 528일때 i의 값="+i);
			}
		}
		int num=1;
		for(num=1; num<=25; num++) {
			if(num%5==1) {
				System.out.println();
			}
			System.out.print(num+"\t");
		}
		
	}
}
