class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def add_to_tail(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node

    def print_list(self):
        current = self.head
        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()

def swap_nodes(linked_list, data1, data2):
    print(f"Swapping {data1} with {data2}")

    node1_prev = None
    node2_prev = None
    node1 = linked_list.head
    node2 = linked_list.head

    if data1 == data2:
        print("Elements are the same - no swap to be made")
        return

    while node1 is not None:
        if node1.data == data1:
            break
        node1_prev = node1
        node1 = node1.next

    while node2 is not None:
        if node2.data == data2:
            break
        node2_prev = node2
        node2 = node2.next

    if node1 is None or node2 is None:
        print("Swap not possible - one or more elements are not in the list")
        return

    if node1_prev is None:
        linked_list.head = node2
    else:
        node1_prev.next = node2

    if node2_prev is None:
        linked_list.head = node1
    else:
        node2_prev.next = node1

    temp = node1.next
    node1.next = node2.next
    node2.next = temp

    # Update next nodes of node1_prev and node2_prev
    if node1_prev is not None:
        node1_prev.next = node2

    if node2_prev is not None:
        node2_prev.next = node1

if __name__ == "__main__":
    test_list = LinkedList()
    for i in range(11):
        test_list.add_to_tail(i)

    print("Original List:")
    test_list.print_list()

    swap_nodes(test_list, 3, 7)

    print("List after swapping nodes 3 and 7:")
    test_list.print_list()
