package com.ideas2it.ism.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;      
import javax.persistence.Id;  
import javax.persistence.Table;

import com.ideas2it.ism.common.Constant;
import com.ideas2it.ism.common.Department;
import com.ideas2it.ism.common.Result;
import com.ideas2it.ism.common.Technology;

/**
 * Informations of the candidate who applied for an interview. Informations such
 * as personal details, contact details, experience and position for which he 
 * applied are maintained. Then the result of the interview is also maintained.
 *
 * @author-M.Mani Bharathi.
 * @date-04/09/19
 */
@Entity
@Table(name = "CANDIDATE")
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false, nullable = false)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE_NUMBER")
    private long phoneNo;

    @Column(name = "EMAIL_ID")
    private String emailId;

    @Column(name = "POSITION")
    private String position;

    @Column(name = "EXPERIENCE")
    private String experience;

    @Column(name = "RESUME_FILE_PATH")
    private String resumeFilePath;

    @Enumerated(EnumType.STRING)
    @Column(name = "DEPARTMENT")
    private Department department;

    @Enumerated(EnumType.STRING)
    @Column(name = "TECHNOLOGY")
    private Technology technology;

    @Enumerated(EnumType.STRING)
    @Column(name = "INTERVIEW_RESULT")
    private Result interviewResult;

    @Override
    public int hashCode() {
        return this.id;
    }
    
    @Override
    public String toString() {
        String candidateInfo = new StringBuilder().append(Constant.ID)
                .append(this.id).append("    ").append(Constant.NAME)
                .append(this.name).append("    ").toString();
       return candidateInfo;
    }

    /**
     * GETTERS AND SETTERS
     */
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNo() {
        return this.phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo= phoneNo;
    }

    public String getEmailId() {
        return this.emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getResumeFilePath() {
        return this.resumeFilePath;
    }

    public void setResumeFilePath(String resumeFilePath) {
        this.resumeFilePath = resumeFilePath;
    }

    public String getExperience() {
        return this.experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Technology getTechnology() {
        return this.technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public Result getInterviewResult() {
        return this.interviewResult;
    }

    public void setInterviewResult(Result interviewResult) {
        this.interviewResult = interviewResult;
    }
}