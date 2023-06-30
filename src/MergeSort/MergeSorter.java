package MergeSort;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    public MergeSorter(List<Integer> arrayToSort){
        this.arrayToSort = arrayToSort;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <= 1){
            return arrayToSort;
        }
        int mid = arrayToSort.size()/2;
        List<Integer> leftArray = new LinkedList<>();
        List<Integer> rightArray = new LinkedList<>();

        for (int i=0; i<mid; i++){
            leftArray.add(arrayToSort.get(i));
        }
        for (int j=mid; j<arrayToSort.size(); j++) {
            rightArray.add(arrayToSort.get(j));
        }
        MergeSorter leftMergeSorter = new MergeSorter(leftArray);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray);

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<List<Integer>> leftSortedArrayF = executorService.submit(leftMergeSorter);
        Future<List<Integer>> rightSortedArrayF = executorService.submit(rightMergeSorter);

        List<Integer> leftSortedArray = leftSortedArrayF.get();
        List<Integer> rightSortedArray = rightSortedArrayF.get();

        int i=0, j=0;
        List<Integer> sortedList = new LinkedList<>();
        while (i<leftSortedArray.size() && j<rightSortedArray.size()) {
            if(leftSortedArray.get(i) < rightSortedArray.get(j)){
                sortedList.add(leftSortedArray.get(i));
                i++;
            } else{
                sortedList.add(rightSortedArray.get(j));
                j++;
            }
        }
        while (i<leftSortedArray.size()){
            sortedList.add(leftSortedArray.get(i));
            i++;
        }
        while (j<rightSortedArray.size()){
            sortedList.add(rightSortedArray.get(j));
            j++;
        }
        return sortedList;
    }
}
