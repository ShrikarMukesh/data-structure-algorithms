package doublylinkedlist;

public class DoublyLinkedList {

    static Node deleteFirst(Node headNode){
        //If Head is null
        if(headNode ==null){
            return null;
        }
        //2. If one Node is there
        if(headNode.next == null ){
            return null;
        }
        //3. If Head is not null
        Node temp = headNode;
        headNode = headNode.next;
        headNode.prev = null;

        temp.next =null;
        return headNode;
    }
    static Node deleteLast(Node headNode){
        //If Head is null
        if(headNode ==null){
            return null;
        }
        //2. If one Node is there
        if(headNode.next == null ){
            return null;
        }
        //3. If Head is not null
        Node currentNode = headNode;
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        Node temp = currentNode.next;
        temp.prev = null;
        currentNode.next = null;
        return headNode;
    }
    static int search(Node headNode, int element){
        int position = -1;
        Node currentNode = headNode;

        while (currentNode != null){
            if (currentNode.data == element){
                return position;
            }
            else {
                position++;
                currentNode = currentNode.next;
            }
        }
        return -1;
    }
}
