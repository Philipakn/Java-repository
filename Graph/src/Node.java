import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Node {

    int vertex;
    Node edge;
    String data;
    ArrayList<LinkedList<Node>> arrlist = new ArrayList<>();

    Node(String data) {
        this.data = data;
    }

    public void addNode(Node node) {

        LinkedList<Node> newLinkedList = new LinkedList<Node>();
        newLinkedList.add(node);
        arrlist.add(newLinkedList);
    }

    public void addEdge(int source, int destination) {

        LinkedList<Node> currentLinkedList = arrlist.get(source);
        Node dstn = arrlist.get(destination).get(0);
        currentLinkedList.add(dstn);
    }

    public boolean checkEdge(int source, int destination) {

        LinkedList<Node> currentLinkedList = arrlist.get(source);
        Node dstn = arrlist.get(destination).get(0);

        for (Node node : currentLinkedList) {

            if (node == dstn) {
                return true;
            }

        }
        return false;
    }

    public void depthfirstsearch(int index) {

        boolean[] visited = new boolean[5];
        Stack<Integer> stack = new Stack<>();
        stack.push(index);

        while (!stack.isEmpty()) {

            int poped = stack.pop();
            if (!visited[poped]) {

                visited[poped] = true;
                System.out.println("Visited node/vertex: " + poped);
                LinkedList<Node> newLL = arrlist.get(poped);

                for (Node v : arrlist.get(poped)) {
                    int pos = newLL.indexOf(v);
                    if (!visited[pos]) {
                        stack.push(pos);
                    }
                }
            }
        }
    }

    public void breadthfirstsearch(int index) {

        boolean[] visited = new boolean[5];
        Queue<Integer> que = new LinkedList<>();
        visited[index] = true;
        que.offer(index);

        while (!que.isEmpty()) {

            int poped = que.poll();
            System.out.println("Visited node/vortex: " + poped);
            LinkedList<Node> newLL = arrlist.get(poped);

            for (Node v : arrlist.get(poped)) {
                int pos = newLL.indexOf(v);
                if (!visited[pos]) {
                    que.offer(pos);
                }
            }
        }

    }

    public void print() {

        for (LinkedList<Node> currentList : arrlist) {

            for (Node node : currentList) {

                System.out.print(node.data + " -->");
            }
            System.out.println();
        }
    }

}

















