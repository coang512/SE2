package model;

public class Class {
	private String className;
	private String leader;
	private String headTeacher;
	public Class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Class(String className, String leader, String headTeacher) {
		super();
		this.className = className;
		this.leader = leader;
		this.headTeacher = headTeacher;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
	}
	public String getHeadTeacher() {
		return headTeacher;
	}
	public void setHeadTeacher(String headTeacher) {
		this.headTeacher = headTeacher;
	}
	
}
