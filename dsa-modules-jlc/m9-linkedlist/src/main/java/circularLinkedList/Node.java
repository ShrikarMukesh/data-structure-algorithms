package circularLinkedList;

import lombok.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
public class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next =null;
    }
}
