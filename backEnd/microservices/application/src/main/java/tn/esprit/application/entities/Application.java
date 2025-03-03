package tn.esprit.application.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Application {
    @Id
    @GeneratedValue
    private Long id;
    private Date applicationDate;
    private String motivation;

    public Long getId() {
        return id;
    }

    public Application(Date applicationDate, String motivation) {
        this.applicationDate = applicationDate;
        this.motivation = motivation;
    }

    public Application() {
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }
}
