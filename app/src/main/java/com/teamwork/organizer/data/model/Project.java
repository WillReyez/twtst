package com.teamwork.organizer.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Victor Tellez on 09/02/2018.
 */

public class Project implements Serializable {

    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("starred")
    @Expose
    private Boolean starred;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("show-announcement")
    @Expose
    private Boolean showAnnouncement;
    @SerializedName("announcement")
    @Expose
    private String announcement;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("isProjectAdmin")
    @Expose
    private Boolean isProjectAdmin;
    @SerializedName("created-on")
    @Expose
    private String createdOn;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("start-page")
    @Expose
    private String startPage;
    @SerializedName("startDate")
    @Expose
    private Date startDate;
    @SerializedName("logo")
    @Expose
    private String logo;
    @SerializedName("notifyeveryone")
    @Expose
    private Boolean notifyeveryone;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("last-changed-on")
    @Expose
    private Date lastChangedOn;
    @SerializedName("endDate")
    @Expose
    private Date endDate;
    @SerializedName("harvest-timers-enabled")
    @Expose
    private String harvestTimersEnabled;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getShowAnnouncement() {
        return showAnnouncement;
    }

    public void setShowAnnouncement(Boolean showAnnouncement) {
        this.showAnnouncement = showAnnouncement;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIsProjectAdmin() {
        return isProjectAdmin;
    }

    public void setIsProjectAdmin(Boolean isProjectAdmin) {
        this.isProjectAdmin = isProjectAdmin;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getStartPage() {
        return startPage;
    }

    public void setStartPage(String startPage) {
        this.startPage = startPage;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Boolean getNotifyeveryone() {
        return notifyeveryone;
    }

    public void setNotifyeveryone(Boolean notifyeveryone) {
        this.notifyeveryone = notifyeveryone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getLastChangedOn() {
        return lastChangedOn;
    }

    public void setLastChangedOn(Date lastChangedOn) {
        this.lastChangedOn = lastChangedOn;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getHarvestTimersEnabled() {
        return harvestTimersEnabled;
    }

    public void setHarvestTimersEnabled(String harvestTimersEnabled) {
        this.harvestTimersEnabled = harvestTimersEnabled;
    }

}
