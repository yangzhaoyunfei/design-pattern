package com.company.mvc_pattern;

/**
 * @author tang.zhong.wei
 * @date 2021/11/15 9:54
 */
public class StudentController {
	private final Student model;
	private final StudentView view;

	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}

	public String getStudentName() {
		return model.getName();
	}

	public void setStudentName(String name) {
		model.setName(name);
	}

	public String getStudentRollNo() {
		return model.getRollNo();
	}

	public void setStudentRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public void updateView() {
		view.printStudentDetails(model.getName(), model.getRollNo());
	}
}
