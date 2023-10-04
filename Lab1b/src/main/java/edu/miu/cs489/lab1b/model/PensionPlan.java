package edu.miu.cs489.lab1b.model;

import java.time.LocalDate;

public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private Double monthlyContribution;
    private Long employeeId;

    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution, Long employeeId) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
        this.employeeId = employeeId;
    }

    public PensionPlan(){
        this(null, null, null,null);
    }

    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }

    public void setPlanReferenceNumber(String planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Double getMonthlyContribution() {
        return monthlyContribution;
    }

    public void setMonthlyContribution(Double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "PensionPlan{" +
                "planReferenceNumber='" + planReferenceNumber + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                ", monthlyContribution=" + monthlyContribution +
                ", employeeId=" + employeeId +
                '}';
    }
}
