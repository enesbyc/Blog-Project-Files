package com.enesbyc.model;

public class Lesson {

	private int lessonId;
	private String lessonName;
	
	public Lesson() {
		
	}
	
	public Lesson(int lessonId, String lessonName) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
	}

	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	
	
}