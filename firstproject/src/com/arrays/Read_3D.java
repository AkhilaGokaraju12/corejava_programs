package com.arrays;

public class Read_3D {

	public static void main(String[] args) {
		int a[][][]= {
				{{2,3},{1,6,0,7,8},{5,6,9}},
				{{2,1},{1,2},{9,0},{3,6}}
				};
System.out.println(a[1][0].length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++){
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
