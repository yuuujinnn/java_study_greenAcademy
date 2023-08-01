package oops_p;

import java.util.Arrays;
import java.util.Iterator;

public class Exam2 {
	
	String name, grade;
	int [] jum;
	int tot, avg, rank;
	public Exam2 (String name, String ... jum) {
		super();
		this.name = name;
		this.jum = new int [jum.length];
		
		for(int i = 0; i <jum.length; i++) {
			this.jum[i] = Integer.parseInt(jum[i]);
		}
		calc();


		
	}
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		
		avg = tot/jum.length;
		
		grade = "가가가가가가양미우수수".charAt(avg/10) + "";
	}
	
	void rankCalc (Exam2 [] exArr) {
		rank = 1;
		for (Exam2 you : exArr) {
			if(avg < you.avg) {
				rank++;
			}
		}
	}

	@Override
	public String toString() {
		return "Exam2 [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", grade="
				+ grade + ", rank=" + rank + "]";
	}
	
	
}
