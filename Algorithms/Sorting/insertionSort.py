marks=[10,3,8,6,7,4,5,2,9,1]

def insertionSort(alist):
    l=len(alist)
    for i in range(0,l):
        pivot=alist[i]
        j=i-1
        while (alist[j] > pivot and j >= 0):
            #tmp=alist[j+1]
            alist[j+1]=alist[j]
            j=j-1
        alist[j+1]=pivot

    print("Sorted list: "+str(alist))

insertionSort(marks)

