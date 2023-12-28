class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

    def setNextNode(self,node):
        self.next = node

    def getNextNode(self):
        return self.next

class linkedlist:
    def __init__(self):
        self.head = None

    def addtohead(self,data):
        newhead = Node(data)
        current = self.head
        self.head = newhead
        if(current != None):
            self.head.setNextNode(current)

    def addtotail(self,data):
        tail = self.head
        if(tail == None):
            self.head = Node(data)
        else:
            while(tail.getNextNode() != None):
                tail = tail.getNextNode()
        tail.setNextNode(Node(data))

    def removehead(self):
        removedhead = self.head
        if(removedhead == None):
            return None
        self.head = removedhead.getNextNode()
        return removedhead.data

    def printlist(self):
        output = "<head> "
        currentNode = self.head
        while(currentNode != None):
            output += currentNode.data+ " "
            currentNode = currentNode.getNextNode()
        output += " <tail>"
        print(output)
        return output

seasons = linkedlist()

seasons.printlist()
seasons.addtohead("summer")
seasons.addtohead("spring")
seasons.printlist()
seasons.addtotail("fall")
seasons.addtotail("fall")
seasons.printlist()
seasons.removehead()
seasons.printlist()