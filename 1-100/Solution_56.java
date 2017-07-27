package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Merge Intervals  
 * 合并间隔，Given a collection of intervals, merge all overlapping intervals.
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * 思路：
 * @author dong
 *
 */
public class Solution_56 {
	public List<Interval> merge(List<Interval> intervals) {
		List<Interval> ret=new ArrayList<>();
		if(intervals.size()==0)
			return ret;
        //先排序，再合并,将start小的interval排在前面
		Interval []data=intervals.toArray(new Interval[0]);
		quicksort(data, 0, data.length-1);
		intervals.clear();
		Collections.addAll(intervals, data);
		//合并
		for (int i=0;i<intervals.size()-1;i++) {//对i+1进行更新
			if(intervals.get(i).end>=intervals.get(i+1).start){
				intervals.get(i+1).start=intervals.get(i).start;
				if(intervals.get(i).end>intervals.get(i+1).end)
					intervals.get(i+1).end=intervals.get(i).end;
			}
			else{
				ret.add(intervals.get(i));
			}
			
		}
		ret.add(intervals.get(intervals.size()-1));
		return ret;
    }
	private void quicksort(Interval[] intervals,int low ,int high){
		if(low<high){
			int mid=partition(intervals, low, high);
			quicksort(intervals, low, mid-1);
			quicksort(intervals, mid+1, high);
		}
	}
	private int partition(Interval[] intervals,int low ,int high){
		Interval key=intervals[low];
		Interval tmp;
		while (low<high){
			while(low<high&&intervals[high].start>=key.start)
				high--;
			tmp=intervals[high];
			intervals[high]=key;
			intervals[low]=tmp;
			while(low<high&&intervals[low].start<=key.start)
				low++;
			tmp=intervals[low];
			intervals[low]=key;
			intervals[high]=tmp;	
		}
		return low;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
