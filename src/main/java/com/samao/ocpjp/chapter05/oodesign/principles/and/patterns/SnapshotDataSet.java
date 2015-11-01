package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */

public class SnapshotDataSet {
    Sorting sorting;

    public SnapshotDataSet() {
        sorting = new QuickSort();
    }
}
