package AddNode;

public class NodePackage {
    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public void printData() {
        Node temp = head;

        if (head == null) {
            System.out.println("Empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
}
