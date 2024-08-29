import java.io.*;

public class Graph {
    int weight[][] = new int[20][20]; //adjencency matrix
    int visited[] = new int[20]; //follow vertex 
    int d[] = new int[20]; //shortest edge between edge
    int p[] = new int[20]; //parent vertex
    int v, e;

    void creategraph() throws IOException { //ส่งต่อผู้เรียกใช้ จัดการ
        int i, j, a, b, w;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number of vertices: ");
        v = Integer.parseInt(in.readLine());
        System.out.print("Enter number of Edges : ");
        e = Integer.parseInt(in.readLine());

        for (i = 1; i <= v; i++) { //loop for intialize for vertex
            p[i] = visited[i] = 0;
            d[i] = 32767; //ค่าตำสุดของแต่ละnode
        }

        for (i = 1; i <= e; i++) {
            System.out.println("==Round "+i+"==");
            System.out.print("Enter edge a: ");
            a = Integer.parseInt(in.readLine());
            System.out.print("Enter edge b: ");
            b = Integer.parseInt(in.readLine());
            System.out.print("Enter weight w: ");
            w = Integer.parseInt(in.readLine());
            weight[a][b] = weight[b][a] = w;
        }
    }

    void algo() throws IOException {
        creategraph();
        int current, total, mincost, i;
        current = 1;  //v start
        d[current] = 0; 
        total = 1; //count virtices visited
        visited[current] = 1;  //visited
        

        while (total < v) {
            for (i = 1; i <= v; i++) {
                if (weight[current][i] != 0) {  //have edge
                    if (visited[i] == 0) { //not visited
                        if (d[i] > weight[current][i]) { //weight = currentweight
                            d[i] = weight[current][i]; //ud.
                            p[i] = current; //parent ver
                        }
                    }
                }
            }

        //หาจุดต่อไป
            mincost = 32767; //var find min
            for (i = 1; i <= v; i++) {
                if (visited[i] == 0) {
                    if (d[i] < mincost) { //distance less than mincost
                        mincost = d[i]; //ud
                        current = i;
                    }
                }
            }
            visited[current] = 1;
            total++;
        }

        mincost = 0;
        for (i = 1; i <= v; i++) {
            mincost = mincost + d[i];
        }

        System.out.println("Minimum cost = " + mincost);
        System.out.println("Minimum Spanning tree is ");

        for (i = 1; i < v; i++) {
            System.out.println("vertex " + i + " is connected to " + p[i]);
        }
    }
}
