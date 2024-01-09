class Node:
    def __intit__(self):
        self.data = None
        self.next = None

    def setNextNode(self,node):
        self.next = node
    
    def getNextNode(self):
        return self.next

class DoublyLinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
    
    def addToTail(self,data):
        newHead = Node(data)
        currentHead = self.head

        if(currentHead != None):
            currentHead.setPreviousNode(newHead)
            newHead.setNextNode(currentHead)
        
        self.head = newHead

        if(self.tail == None):
            self.tail = newHead

    def addToTail(self,data):
        newTail = Node(data)
        currentTail = self.tail

        if(currentTail != None):
            currentTail.setNextNode(newTail)
            newTail.setPrevious(currentTail)
        
        self.tail = newTail

        if(self.head == None):
            self.head = newTail

    def removeHead(self):
        removedHead = self.head
        if(removedHead == None):
            return None
        
        self.head = removedHead.getNextNode()

        if(self.head != None):
            self.head.setPreviousNode(None)

        if(removedHead == None):
            self.removedTail()
        
        return removedHead.data

    def removeTail(self):
        removedTail = this.tail

        if(removedTail == None):
            return None
        
        self.tail = removedTail.getPreviousNode()

        if(self.tail != None):
            self.tail.setNextNode(None)
        
        if(removedTail == self.head):
            self.removedHead()

        return removedTail.data

    def removedByData(self,data):
        nodeToRemove = None
        currentNode = self.head

        while(currentNode != None):
            if(currentNode.data == data):
                nodeToRemove = currentNode
                break
            currentNode = currentNode.getNextNode()

        if(nodeToRemove == None):
            return None

        if(nodeToRemove == self.head):
            self.removeHead()
        elif (nodeToRemove == self.tail):
            self.removeTail()
        else:
            nextNode = nodeToRemove.getNextNode()
            previousNode = nodeToRemove.getPreviousNode()
            nextNode.setPreviousNode(previousNode)
            previousNode.setNextNode(nextNode)
        
        return nodeToRemove

    def printList(self):
        currentNode = self.head
        output = "<head> "
        while(currentNode != None):
            output += currentNode.data + " "
            currentNode = currentNode.getNextNode()
        output += "<tail> "
        System.out.println(output)
        return output
        

