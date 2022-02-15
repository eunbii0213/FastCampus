package chapter8.practice03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem3 {
	
	static int[] x = {1,0,-1,0};
	static int[] y = {0,1,0,-1};
	static int N;
	static int M;
	static int[][] arr;
	static boolean[][] visited;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());;
		
		 N = Integer.parseInt(st.nextToken());
		 M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visited = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(),"10",true);
			for(int j=0;j<M;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//1은 이동할 수 있는 칸, 0은 이동불가
		
		
		search(0,0,0);
		System.out.println(arr[N-1][M-1]);
		
		

	}
	
	public static void search(int rowIndex, int colIndex,int count) {
		
		Queue<int[]> q = new LinkedList<>(); 
		q.offer(new int[] {rowIndex,colIndex});
		
		while(!q.isEmpty()) {
			
			int[] location = q.poll();
			visited[rowIndex][colIndex]=true;
			
			for(int i=0;i<4;i++) {
				
				int meRow = location[0]+y[i];
				int meCol = location[1]+x[i];
				
				//미로 범위내이고 
				if(meRow>=0 && meRow<=N-1 && meCol>=0 && meCol<=M-1) {
					//갈 수 있는 길 (1이라면) 간다
					if(arr[meRow][meCol]==1 && !visited[meRow][meCol]) {
						visited[meRow][meCol]=true;
						q.offer(new int[] {meRow,meCol});
						arr[meRow][meCol] = arr[location[0]][location[1]]+1;
					}
				}
			}
		}
		
	}
	
	

}
