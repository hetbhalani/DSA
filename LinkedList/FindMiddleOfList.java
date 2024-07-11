import AddNode.NodePackage;
import  AddNode.NodePackage.*;

public class FindMiddleOfList {
   
    public static void main(String[] args) {
        NodePackage l1 = new NodePackage();

        l1.addNode(0);
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
        l1.addNode(5);

        // Node temp = l1.head;
        // int cnt = 1;
        
        // while(temp != null){
        //     temp = temp.next;
        //     cnt++;
        // }

        // int mid = (cnt/2) + 1;
        // temp = l1.head;

        // while (temp != null) {
        //     mid = mid-1;
        //     if(mid ==0){
        //         break;
        //     }
        //     temp = temp.next;
        // }

        //---------------OR------------------//

        Node slow = l1.head;
        Node fast = l1.head;

        while(fast != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
