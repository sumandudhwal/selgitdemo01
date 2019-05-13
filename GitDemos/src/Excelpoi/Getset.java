package Excelpoi;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TestName")
public class Getset {

	private String empId,empName,empLocation;
	private int empLevel;
	//add getters n setters and create constructor with n without field
	@XmlElement
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	@XmlElement
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@XmlElement
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	@XmlElement
	public int getEmpLevel() {
		return empLevel;
	}

	public Getset(String empId, String empName, String empLocation, int empLevel) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empLevel = empLevel;
	}
	public Getset() {
		super();
	}
	public void setEmpLevel(int empLevel) {
		this.empLevel = empLevel;
	}
	
	
	
	
}
