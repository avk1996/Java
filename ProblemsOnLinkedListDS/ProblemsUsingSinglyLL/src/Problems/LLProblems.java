package ProblemsUsingSinglyLL.src.Problems;

public class LLProblems{
    static private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    private static Node head;

    //empty linked list check
    public static boolean isEmpty(){
        return head == null;
    }

    //show linked list
    public static void displaySLL(){
        if(isEmpty()){
            throw new RuntimeException("linked list empty");
        }
        else{
            Node trav = head;
            while(trav!=null){
                System.out.println(trav.data);
                trav=trav.next;
            }
        }
    }

    //add elements at first 
    public static void addFirstElement(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
        }    
        else{
            newNode.next = head;
            head = newNode;            
        }
    }
}
