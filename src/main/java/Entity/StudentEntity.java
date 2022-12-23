package Entity;
import jakarta.persistence.*;
@Entity
public class StudentEntity {


    @Id
    private Integer stdId;
    private String stdName;
    private double fees;
    private String course;

    public StudentEntity() {
    }

    public StudentEntity(Integer stdId, String stdName, double fees, String course) {
        super();
        this.stdId = stdId;
        this.stdName = stdName;
        this.fees = fees;
        this.course = course;
    }

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "StudentEntity [stdId=" + stdId + ", stdName=" + stdName + ", fees=" + fees + ", course=" + course + "]";
    }
}