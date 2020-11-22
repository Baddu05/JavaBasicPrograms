package com.basicJavaProgram;

class Exam
{
	String subject;
	int score1;
	int totalScore = 0;
	public Exam(String subject, int score1)
	{
		this.subject = subject;
		this.score1 = score1;
		//this.score2 = score2
		System.out.println("2 parameter constructor run "+this.subject);
		System.out.println("1 parameter constructor run "+this.score1);
	}
	void Calc()
	{
		System.out.println(score1);
	}
}

public class ConstructorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam results = new Exam("Maths", 80);
		results.Calc();
	}
	
}
