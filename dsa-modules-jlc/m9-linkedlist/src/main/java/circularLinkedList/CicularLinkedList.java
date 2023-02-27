package circularLinkedList;

class CicularLinkedList {

    static Node insertFirst(Node headNode, int data){

        Node temp = new Node(data);

         if (headNode == null){
             headNode = temp;
             headNode.next = headNode;
             return headNode;
         }
         temp.next =headNode.next;
         headNode.next =temp;

         //swap data 1st and 2nd Nodes
         int x = headNode.data;
         headNode.data = temp.data;
         temp.data =x;

         return headNode;
//         Node currentNode = headNode;
//         while (currentNode.next != headNode){
//             currentNode = currentNode.next;
//         }
    }

    public static void main(String[] args) {
        Node head = null;
        head = insertFirst(head,10);


    }
}
//Time