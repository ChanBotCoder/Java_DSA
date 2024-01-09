class Node {
    public Integer data;
    private Node next;

    public Node(Integer data) {
        this.data = data;
        this.next = null;
    }

    public Node getNextNode() {
        return this.next;
    }

    public void setNextNode(Node next) {
        this.next = next;
    }
}

class LinkedList {
    public Node head;

    public void addToTail(Integer data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.getNextNode();
        }
        System.out.println();
    }
}

public class SwapNodes {

    public static void main(String[] args) {
        LinkedList testList = new LinkedList();
        for (int i = 0; i <= 10; i++) {
            testList.addToTail(i);
        }

        System.out.println("Original List:");
        testList.printList();

        swapNode(testList, 3, 7);

        System.out.println("List after swapping nodes 3 and 7:");
        testList.printList();
    }

    public static void swapNode(LinkedList list, int data1, int data2) {
        System.out.println("Swapping " + data1 + " with " + data2);

        Node node1Prev = null;
        Node node2Prev = null;
        Node node1 = list.head;
        Node node2 = list.head;

        if (data1 == data2) {
            System.out.println("Elements are the same - no swap to be made");
            return;
        }

        while (node1 != null) {
            if (node1.data.equals(data1)) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }

        while (node2 != null) {
            if (node2.data.equals(data2)) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }

        if (node1 == null || node2 == null) {
            System.out.println("Swap not possible - one or more elements are not in the list");
            return;
        }

        if (node1Prev == null) {
            list.head = node2;
        } else {
            node1Prev.setNextNode(node2);
        }

        if (node2Prev == null) {
            list.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }

        Node temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(temp);

        // Update next nodes of node1Prev and node2Prev
        if (node1Prev != null) {
            node1Prev.setNextNode(node2);
        }

        if (node2Prev != null) {
            node2Prev.setNextNode(node1);
        }
    }
}
