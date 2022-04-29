package com.session1.enum_assignment;

class Student {
	private Integer studentId;
	private String name;
	private Integer totalMarks;
	private Grade grade;
	// Grade is the name of enum

	private float scholarshipAmount;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(Integer totalMarks) {
		this.totalMarks = totalMarks;
	}

	public Grade getGrade() {
		return grade;
	}

	public void setGrade(Grade grade) {
		this.grade = grade;
	}

	public float getScolarshipAmount() {
		return scholarshipAmount;
	}

	public void setScolarshipAmount(float scolarshipAmount) {
		this.scholarshipAmount = scolarshipAmount;
	}

	public void calculateGrade() {
		/*
		 * write the logic to calculate the grade of the student
		 */
	}

	public void calculateScolarshipAmount() {
		/*
		 * write the logic to calculate scholarship amount based on grade
		 */
	}
}
