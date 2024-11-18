package org.example;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    @Column(length=50)
    private String empName;
    @ManyToMany
    @JoinTable(
            name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private List<Project> projects;

    public int getEid() {
        return eid;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public Employee()
    {
        super();
    }
    public Employee(int eid,String empName,List<Project>projects)
    {
        this.eid=eid;
        this.empName=empName;
        this.projects=projects;
    }
}
