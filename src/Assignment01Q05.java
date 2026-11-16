public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        int n=m.length ;
        int[] dist=new int[n];
        for (int x=0; x<n; x++){
            if (x==i)
                dist[x]=0;
            else
                dist[x]=-1;
        }
        int[] que=new int[n];
        int head=0;
        int tail=0;
        que[tail++]=i ;
        while (head<tail){
            int curr=que[head++];
            for (int next=0 ; next<n ; next++){
                if (m[curr][next]==1 && dist[next]==-1){
                    dist[next]=dist[curr]+1;
                    que[tail++]=next;
                }
            }
        }
        return dist[j];
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}