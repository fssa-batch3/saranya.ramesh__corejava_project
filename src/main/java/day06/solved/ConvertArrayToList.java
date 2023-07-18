package day06.solved;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

	 public static void main(String[] args) {
		 ConvertArrayToList convertToList = new ConvertArrayToList();
	        convertToList.convertAndPrint();
	    }
	    String[] deptNames = new String[3];
	    public ConvertArrayToList() {
	        deptNames[0] = "CSE";
	        deptNames[1] = "EEE";
	        deptNames[2] = "MECH";
	    }
	    public void convertAndPrint() {
	        List<String> list = Arrays.asList(deptNames);
	        System.out.println(list);
	    }
}