package codility.exercises;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		System.out.println(Integer.toBinaryString(i).toCharArray());
		System.out.println(solution(i));
	}
	
	public static int solution(int N) {
		String biRep = Integer.toBinaryString(N).toString();
		int gap = 0;
		int bigGap = 0;
		int tempCounter = 0;
		
		for(int i=0;i<biRep.length();i++) {
			char c = biRep.charAt(i);
			if(c == '0') {
				tempCounter++;
			}else {
				gap = tempCounter;
				if(gap > bigGap) {
					bigGap = gap;
				}
				tempCounter = 0;
			}
		}
		return bigGap;
		
	}

}
