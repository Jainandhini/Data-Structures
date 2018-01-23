marks=[10,3,8,6,7,4,5,2,9,1]

def selectionSort(alist):
    l=len(alist)
    for i in range(0,l):
        min=i
        #print("i: "+str(i)+" alist[i] "+str(alist[i]))
        for j in range(i,l):
            #print("         j "+str(j)+" alist[j] " + str(alist[j])+" alist[min] "+str(alist[min]))
            if alist[j]<alist[min]:
                min=j
        temp = alist[min]
        alist[min] = alist[i]
        alist[i] = temp
    print("Sorted list: "+str(alist))

selectionSort(marks)

