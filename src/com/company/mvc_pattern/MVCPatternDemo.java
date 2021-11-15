package com.company.mvc_pattern;

/**
 * j2ee模式-mvc https://www.runoob.com/design-pattern/mvc-pattern.html
 *
 * @author tang.zhong.wei
 * @date 2021/11/15 9:55
 */
public class MVCPatternDemo {
	public static void main(String[] args) {

		//从数据库获取学生记录
		Student model = retrieveStudentFromDatabase();

		//创建一个视图：把学生详细信息输出到控制台
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);

		controller.updateView();

		//更新模型数据
		controller.setStudentName("John");

		controller.updateView();
	}

	private static Student retrieveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
