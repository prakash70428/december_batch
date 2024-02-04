package lecture_6;

public class finding_cb_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "127";
        System.out.println(PrintSubstring(str));
	}

	public static int PrintSubstring(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for(int len=1;len <= str.length();len++) {
			for(int j=len ; j <= str.length();j++) {
				int i = j - len;
				String s1 = str.substring(i,j);
				if(isCBnumber(Long.parseLong(s1)) == true && isValid(visited,i,j) == true) {
					//System.out.println(str.substring(i,j));
					count++;
					
					for(int k=i;k < j;k++) {
						visited[k] = true;
					}
				}
				
			}
		}
		
		return count;
	}
	
	public static boolean isValid(boolean[] visited,int i,int j) {
		for(;i < j;i++) {
			if(visited[i] == true) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isCBnumber(long num) {
		if(num == 0 || num == 1) {
			return false;
		}
		
		int[] arr = {2,3,5,7,11,13,17,19,23,29};
		for(int i=0 ; i < arr.length;i++) {
			if(num == arr[i]) {
				return true;
			}
		}
		
		for(int i=0 ; i < arr.length;i++) {
			if(num % arr[i] == 0) {
				return false;
			}
		}
		
		return true;
	}

}
