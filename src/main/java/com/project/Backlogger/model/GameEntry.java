package com.project.Backlogger.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class GameEntry implements Serializable {
    @Id
    @GeneratedValue(strategy =  GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long Id;
    private String Name;
    private String Platform;
    private String finishStatus;
    private String Rating;
    private String entryDate;
    private String imageUrl;


    public GameEntry() {}

    public GameEntry(Long id, String name, String Platform, String finishStatus, String rating, String imageUrl) {
        this.Name = name;
        this.Platform = Platform;
        this.finishStatus = finishStatus;
        this.Rating = rating;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getFinishStatus() {
        return finishStatus;
    }

    public void setFinishStatus(String finishStatus) {
        this.finishStatus = finishStatus;
    }

    public String getRating() {
        return Rating;
    }

    public void setRating(String rating) {
        Rating = rating;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", Platform='" + Platform + '\'' +
                ", finishStatus='" + finishStatus + '\'' +
                ", Rating='" + Rating + '\'' +
                ", entryDate='" + entryDate + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
