class ArrayTest3{
	public static void main(String[] args) {
		char[][] arr = new char[2][3];

		arr[0][0]='A';
		arr[0][1]='B';
		arr[0][2]='C';

		arr[1][0]='가';
		arr[1][1]='나';
		arr[1][2]='다';
		
		for(int a=0;a<arr.length;a++){
			for(int i=0;i<arr[a].length;i++){// 호수
				System.out.print(arr[a][i]);
			}
			System.out.println();
		}
	}
}
