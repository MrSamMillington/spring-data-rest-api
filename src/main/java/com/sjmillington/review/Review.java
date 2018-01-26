package com.sjmillington.review;

import com.sjmillington.core.BaseEntity;
import com.sjmillington.course.Course;
import com.sjmillington.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Review extends BaseEntity{

    private int rating;

    @NotNull
    private String description;

    @ManyToOne
    private Course course;

    @ManyToOne
    private User reviewer;

    //TODO: csd - we are duplicating code here every single entity. share it?
    protected Review(){
        super();
    }

    public Review(int rating, String description) {
        this();
        this.rating = rating;
        this.description = description;
    }

    public User getReviewer() {
        return reviewer;
    }

    public void setReviewer(User reviewer) {
        this.reviewer = reviewer;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
