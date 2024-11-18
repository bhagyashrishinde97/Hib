package org.example;

import javax.persistence.*;
import java.util.List;
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pid;
    private String projectName;
    @ManyToMany(mappedBy = "projects")
    private List<Employee> employeeList;
    public Project()
    {
        super();
    }
    public Project(int pid,String projectName,List<Employee>employeeList)
    {
        this.pid=pid;
        this.projectName=projectName;
    }

    public int getPid() {
        return pid;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
