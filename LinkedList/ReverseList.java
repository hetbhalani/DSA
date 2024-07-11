import AddNode.NodePackage;
import AddNode.NodePackage.Node;

public class ReverseList {
    public static void main(String[] args) {
        NodePackage l1 = new NodePackage();

            
        l1.addNode(0);
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
        l1.addNode(5);

        Node temp = l1.head;
        Node prev = null;
        
        while(temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        l1.head = prev;

        l1.printData();
    }    
}
