package com.dcw.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Insert Interval
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * You may assume that the intervals were initially sorted according to their start times.
 * @author topdc
 *
 */
public class Solution_57 {
	
	public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		
		 List<Interval> ret=new ArrayList<>();
		 if(intervals==null||intervals.size()==0){
			 ret.add(newInterval);
			 return ret;
		 }
		 boolean flag=false;
		 for (int i=0;i<intervals.size();i++) {//��֤��Ҫ�����list�е�Ԫ���ǰ�start��С��������
			if(intervals.get(i).start>newInterval.start){
				intervals.add(i, newInterval);
				flag=true;
				break;
			}
		 }
		 if(!flag){//˵��Ҫ���������һ��λ��
			 intervals.add(newInterval);
		 }
		 Interval tmp=intervals.get(0);
		 for(int i=1;i<intervals.size();i++){
			 Interval data=intervals.get(i);
			 if(tmp.end<data.start){//���������޽���
				ret.add(tmp);
				tmp=data;
			 }
			 else {//�ϲ���������
				 tmp=new Interval(tmp.start, tmp.end<=data.end?data.end:tmp.end);
			 }
		 }
		 ret.add(tmp);
		 return ret;
		
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
