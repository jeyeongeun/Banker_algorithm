import java.io.*;
import java.util.Vector;

public class Process {
		private Vector<Integer> Allocation = new Vector<Integer>();
		private Vector<Integer> Max = new Vector<Integer>();
		private Vector<Integer> Need = new Vector<Integer>();
		
		public Vector<Integer> getAllocation(){
			return Allocation;
		}
		
		public Vector<Integer> getMax(){
			return Max;
		}
		
		public Vector<Integer> getNeed(){
			return Need;
		}
		
		public void setAllocation(Vector<Integer> _allo){
			Allocation = _allo;
		}
		
		public void setMax(Vector<Integer> _max){
			Max = _max;
		}
		
		public void setNeed(){
			for(int i = 0; i < Allocation.size(); i++){
				int tmp = Max.elementAt(i) - Allocation.elementAt(i);
				Need.add(tmp);
			}
		}
}
