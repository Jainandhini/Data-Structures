marks=[10,2,8,6,7,4,5,1,9,1]

def bubbleSort(alist):
    l=len(alist)
    for i in range(0,l-1):
        for j in range(0,l-1-i):
            if alist[j+1]<alist[j]:
                temp=alist[j+1]
                alist[j+1]=alist[j]
                alist[j]=temp
    print("Sorted list: "+str(alist))

bubbleSort(marks)

