package oops_p;

import java.util.Arrays;
import java.util.Iterator;

public class Exam {
	
	String name, grade;
	int [] jum;
	int tot, avg, rank;
	public Exam (String name, String ... jum) {
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
		
		if (avg >= 90) {
			grade = "수";
		} else if (avg >= 80) {
			grade = "우";
		} else if (avg >= 70) {
			grade = "미";
		} else if (avg >= 60) {
			grade = "양";
		} else {
			grade = "가";
		}

	}
	
	
	
	public void rankCalc (Exam [] exArr) {
		rank = 1;
		for (Exam you : exArr) {
			if(avg < you.avg) {
				rank++;
			}
		}
		
	}
	
	

	public int[] getJum() {
		return jum;
	}

	public void setJum(int[] jum) {
		this.jum = jum;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public int getAvg() {
		return avg;
	}

	public void setAvg(int avg) {
		this.avg = avg;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	
	@Override
	public String toString() {
		return "Exam [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", grade="
				+ grade + ", rank=" + rank + "]";
	}
	
	
}
