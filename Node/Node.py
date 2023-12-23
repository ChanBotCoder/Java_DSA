class Node:
    def __init__ (self,data):
        self.data = data
        self.next = None
    
    def setNextNode(self,node):
        self.next = node
    
    def getNodeNext(self):
        return self.next
    
first_node = Node("I am first node")
second_node = Node("I am second node")
third_node = Node("I am Third node")

first_node.setNextNode(second_node)
second_node.setNextNode(third_node)

current_node = first_node

while current_node is not None:
    print(current_node.data)
    current_node = current_node.getNodeNext()