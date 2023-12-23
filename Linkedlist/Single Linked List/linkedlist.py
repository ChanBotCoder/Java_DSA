class linkedlist:
    def __init__(self):
        self.head = None
        
    def addtohead(self,data):
        newhead = Node(data)
        current = self.head
        self.head = newhead
        if(current != None):
            self.head.getNodeNext(current)
    
    
    