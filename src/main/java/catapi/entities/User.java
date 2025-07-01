package catapi.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user_profile")
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(name = "start_weight", nullable = false)
    private Double startWeight;
    @Column(name = "target_weight", nullable = false)
    private Double targetWeight;
    @Temporal(TemporalType.DATE)
    @Column(name = "creation_date")
    private Date creationDate;

    public User() {
    }

    public User(String name, Double startWeight, Double targetWeight, Date creationDate) {
        this.name = name;
        this.startWeight = startWeight;
        this.targetWeight = targetWeight;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getStartWeight() {
        return startWeight;
    }

    public Double getTargetWeight() {
        return targetWeight;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartWeight(Double startWeight) {
        this.startWeight = startWeight;
    }

    public void setTargetWeight(Double targetWeight) {
        this.targetWeight = targetWeight;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Участник " + id + ": " + name + ", стартовый вес "
                + startWeight + ", цель: " + targetWeight + "\n";
    }
}
