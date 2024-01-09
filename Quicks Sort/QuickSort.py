class QuickSort:
    
    def Swap(arr,leftIndex,rightIndex):
        temp = arr[rightIndex]
        arr[rightIndex] = arr[leftIndex]
        arr[leftIndex] = temp

    def quicksort(arr,start,end):
        if(start == end):
            return arr
        index = partition(arr,start,end)
        if(start < index-1):
            quicksort(arr,start,index-1)
        if(index < end):
            quicksort(arr,index,end)
        return arr

    def partition(arr,leftIndex,rightIndex):
        pivot = arr[(leftIndex+rightIndex)//2]
        print("The pivot value is: "+ pivot)

        while(leftIndex <= rightIndex):
            while(arr[leftIndex] < pivot):
                leftIndex +=1
            while(arr[rightIndex] > pivot):
                rightIndex +=1
            if(leftIndex <= rightIndex):
                Swap(arr,leftIndex,rightIndex)
                print("Swapping "+ arr[leftIndex]," and ",arr[rightIndex])
                leftIndex += 1
                rightIndex += 1
        
        return leftIndex
    
    