package models;



import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "write_date",
        "notes",
        "message_partner_ids",
        "message_main_attachment_id",
        "kanban_state",
        "activity_date_deadline",
        "message_channel_ids",
        "activity_state",
        "message_has_error_counter",
        "activity_ids",
        "working_hours_open",
        "project_id",
        "analytic_account_active",
        "id",
        "create_date",
        "attachment_ids",
        "timesheet_ids",
        "message_attachment_count",
        "tag_ids",
        "user_email",
        "date_assign",
        "__last_update",
        "legend_done",
        "working_days_open",
        "stage_id",
        "working_days_close",
        "active",
        "activity_user_id",
        "date_end",
        "message_follower_ids",
        "display_name",
        "create_uid",
        "remaining_hours",
        "priority",
        "rating_count",
        "rating_ids",
        "access_token",
        "sequence",
        "access_warning",
        "date_start",
        "legend_blocked",
        "user_id",
        "parent_id",
        "name",
        "website_message_ids",
        "rating_last_image",
        "subtask_project_id",
        "email_cc",
        "subtask_planned_hours",
        "write_uid",
        "message_is_follower",
        "color",
        "working_hours_close",
        "description",
        "date_deadline",
        "child_ids",
        "subtask_effective_hours",
        "message_unread",
        "rating_last_feedback",
        "partner_id",
        "manager_id",
        "effective_hours",
        "company_id",
        "subtask_count",
        "planned_hours",
        "access_url",
        "allow_timesheets",
        "kanban_state_label",
        "date_last_stage_update",
        "message_unread_counter",
        "activity_type_id",
        "message_has_error",
        "displayed_image_id",
        "rating_last_value",
        "message_needaction",
        "activity_summary",
        "legend_normal",
        "message_needaction_counter",
        "progress",
        "message_ids",
        "total_hours_spent",
        "email_from"
})

public class Tasks {


    @JsonProperty("write_date")
    private String writeDate;
    @JsonProperty("notes")
    private Boolean notes;
    @JsonProperty("message_partner_ids")
    private Object[] messagePartnerIds = null;
    @JsonProperty("message_main_attachment_id")
    private Boolean messageMainAttachmentId;
    @JsonProperty("kanban_state")
    private String kanbanState;
    @JsonProperty("activity_date_deadline")
    private Boolean activityDateDeadline;
    @JsonProperty("message_channel_ids")
    private Object[] messageChannelIds = null;
    @JsonProperty("activity_state")
    private Boolean activityState;
    @JsonProperty("message_has_error_counter")
    private Integer messageHasErrorCounter;
    @JsonProperty("activity_ids")
    private Object[] activityIds = null;
    @JsonProperty("working_hours_open")
    private Double workingHoursOpen;
    @JsonProperty("project_id")
    private Object[] projectId = null;
    @JsonProperty("analytic_account_active")
    private Boolean analyticAccountActive;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("create_date")
    private String createDate;
    @JsonProperty("attachment_ids")
    private Object[] attachmentIds = null;
    @JsonProperty("timesheet_ids")
    private Object[] timesheetIds = null;
    @JsonProperty("message_attachment_count")
    private Integer messageAttachmentCount;
    @JsonProperty("tag_ids")
    private Object[] tagIds = null;
    @JsonProperty("user_email")
    private String userEmail;
    @JsonProperty("date_assign")
    private String dateAssign;
    @JsonProperty("__last_update")
    private String lastUpdate;
    @JsonProperty("legend_done")
    private String legendDone;
    @JsonProperty("working_days_open")
    private Double workingDaysOpen;
    @JsonProperty("stage_id")
    private Object[] stageId = null;
    @JsonProperty("working_days_close")
    private Double workingDaysClose;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("activity_user_id")
    private Boolean activityUserId;
    @JsonProperty("date_end")
    private Boolean dateEnd;
    @JsonProperty("message_follower_ids")
    private Object[] messageFollowerIds = null;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("create_uid")
    private Object[] createUid = null;
    @JsonProperty("remaining_hours")
    private Double remainingHours;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("rating_count")
    private Integer ratingCount;
    @JsonProperty("rating_ids")
    private Object[] ratingIds = null;
    @JsonProperty("access_token")
    private Boolean accessToken;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("access_warning")
    private String accessWarning;
    @JsonProperty("date_start")
    private String dateStart;
    @JsonProperty("legend_blocked")
    private String legendBlocked;
    @JsonProperty("user_id")
    private Object[] userId = null;
    @JsonProperty("parent_id")
    private Boolean parentId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("website_message_ids")
    private Object[] websiteMessageIds = null;
    @JsonProperty("rating_last_image")
    private Boolean ratingLastImage;
    @JsonProperty("subtask_project_id")
    private Object[] subtaskProjectId = null;
    @JsonProperty("email_cc")
    private Boolean emailCc;
    @JsonProperty("subtask_planned_hours")
    private Double subtaskPlannedHours;
    @JsonProperty("write_uid")
    private Object[] writeUid = null;
    @JsonProperty("message_is_follower")
    private Boolean messageIsFollower;
    @JsonProperty("color")
    private Integer color;
    @JsonProperty("working_hours_close")
    private Double workingHoursClose;
    @JsonProperty("description")
    private Boolean description;
    @JsonProperty("date_deadline")
    private Boolean dateDeadline;
    @JsonProperty("child_ids")
    private Object[] childIds = null;
    @JsonProperty("subtask_effective_hours")
    private Double subtaskEffectiveHours;
    @JsonProperty("message_unread")
    private Boolean messageUnread;
    @JsonProperty("rating_last_feedback")
    private Boolean ratingLastFeedback;
    @JsonProperty("partner_id")
    private Boolean partnerId;
    @JsonProperty("manager_id")
    private Object[] managerId = null;
    @JsonProperty("effective_hours")
    private Double effectiveHours;
    @JsonProperty("company_id")
    private Object[] companyId = null;
    @JsonProperty("subtask_count")
    private Integer subtaskCount;
    @JsonProperty("planned_hours")
    private Double plannedHours;
    @JsonProperty("access_url")
    private String accessUrl;
    @JsonProperty("allow_timesheets")
    private Boolean allowTimesheets;
    @JsonProperty("kanban_state_label")
    private String kanbanStateLabel;
    @JsonProperty("date_last_stage_update")
    private String dateLastStageUpdate;
    @JsonProperty("message_unread_counter")
    private Integer messageUnreadCounter;
    @JsonProperty("activity_type_id")
    private Boolean activityTypeId;
    @JsonProperty("message_has_error")
    private Boolean messageHasError;
    @JsonProperty("displayed_image_id")
    private Boolean displayedImageId;
    @JsonProperty("rating_last_value")
    private Double ratingLastValue;
    @JsonProperty("message_needaction")
    private Boolean messageNeedaction;
    @JsonProperty("activity_summary")
    private Boolean activitySummary;
    @JsonProperty("legend_normal")
    private String legendNormal;
    @JsonProperty("message_needaction_counter")
    private Integer messageNeedactionCounter;
    @JsonProperty("progress")
    private Double progress;
    @JsonProperty("message_ids")
    private Object[] messageIds = null;
    @JsonProperty("total_hours_spent")
    private Double totalHoursSpent;
    @JsonProperty("email_from")
    private Boolean emailFrom;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("write_date")
    public String getWriteDate() {
        return writeDate;
    }

    @JsonProperty("write_date")
    public void setWriteDate(String writeDate) {
        this.writeDate = writeDate;
    }

    @JsonProperty("notes")
    public Boolean getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(Boolean notes) {
        this.notes = notes;
    }

    @JsonProperty("message_partner_ids")
    public Object[] getMessagePartnerIds() {
        return messagePartnerIds;
    }

    @JsonProperty("message_partner_ids")
    public void setMessagePartnerIds(Object[] messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    @JsonProperty("message_main_attachment_id")
    public Boolean getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    @JsonProperty("message_main_attachment_id")
    public void setMessageMainAttachmentId(Boolean messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    @JsonProperty("kanban_state")
    public String getKanbanState() {
        return kanbanState;
    }

    @JsonProperty("kanban_state")
    public void setKanbanState(String kanbanState) {
        this.kanbanState = kanbanState;
    }

    @JsonProperty("activity_date_deadline")
    public Boolean getActivityDateDeadline() {
        return activityDateDeadline;
    }

    @JsonProperty("activity_date_deadline")
    public void setActivityDateDeadline(Boolean activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    @JsonProperty("message_channel_ids")
    public Object[] getMessageChannelIds() {
        return messageChannelIds;
    }

    @JsonProperty("message_channel_ids")
    public void setMessageChannelIds(Object[] messageChannelIds) {
        this.messageChannelIds = messageChannelIds;
    }

    @JsonProperty("activity_state")
    public Boolean getActivityState() {
        return activityState;
    }

    @JsonProperty("activity_state")
    public void setActivityState(Boolean activityState) {
        this.activityState = activityState;
    }

    @JsonProperty("message_has_error_counter")
    public Integer getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    @JsonProperty("message_has_error_counter")
    public void setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    @JsonProperty("activity_ids")
    public Object[] getActivityIds() {
        return activityIds;
    }

    @JsonProperty("activity_ids")
    public void setActivityIds(Object[] activityIds) {
        this.activityIds = activityIds;
    }

    @JsonProperty("working_hours_open")
    public Double getWorkingHoursOpen() {
        return workingHoursOpen;
    }

    @JsonProperty("working_hours_open")
    public void setWorkingHoursOpen(Double workingHoursOpen) {
        this.workingHoursOpen = workingHoursOpen;
    }

    @JsonProperty("project_id")
    public Object[] getProjectId() {
        return projectId;
    }

    @JsonProperty("project_id")
    public void setProjectId(Object[] projectId) {
        this.projectId = projectId;
    }

    @JsonProperty("analytic_account_active")
    public Boolean getAnalyticAccountActive() {
        return analyticAccountActive;
    }

    @JsonProperty("analytic_account_active")
    public void setAnalyticAccountActive(Boolean analyticAccountActive) {
        this.analyticAccountActive = analyticAccountActive;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("create_date")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("create_date")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("attachment_ids")
    public Object[] getAttachmentIds() {
        return attachmentIds;
    }

    @JsonProperty("attachment_ids")
    public void setAttachmentIds(Object[] attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    @JsonProperty("timesheet_ids")
    public Object[] getTimesheetIds() {
        return timesheetIds;
    }

    @JsonProperty("timesheet_ids")
    public void setTimesheetIds(Object[] timesheetIds) {
        this.timesheetIds = timesheetIds;
    }

    @JsonProperty("message_attachment_count")
    public Integer getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    @JsonProperty("message_attachment_count")
    public void setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    @JsonProperty("tag_ids")
    public Object[] getTagIds() {
        return tagIds;
    }

    @JsonProperty("tag_ids")
    public void setTagIds(Object[] tagIds) {
        this.tagIds = tagIds;
    }

    @JsonProperty("user_email")
    public String getUserEmail() {
        return userEmail;
    }

    @JsonProperty("user_email")
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @JsonProperty("date_assign")
    public String getDateAssign() {
        return dateAssign;
    }

    @JsonProperty("date_assign")
    public void setDateAssign(String dateAssign) {
        this.dateAssign = dateAssign;
    }

    @JsonProperty("__last_update")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("__last_update")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonProperty("legend_done")
    public String getLegendDone() {
        return legendDone;
    }

    @JsonProperty("legend_done")
    public void setLegendDone(String legendDone) {
        this.legendDone = legendDone;
    }

    @JsonProperty("working_days_open")
    public Double getWorkingDaysOpen() {
        return workingDaysOpen;
    }

    @JsonProperty("working_days_open")
    public void setWorkingDaysOpen(Double workingDaysOpen) {
        this.workingDaysOpen = workingDaysOpen;
    }

    @JsonProperty("stage_id")
    public Object[] getStageId() {
        return stageId;
    }

    @JsonProperty("stage_id")
    public void setStageId(Object[] stageId) {
        this.stageId = stageId;
    }

    @JsonProperty("working_days_close")
    public Double getWorkingDaysClose() {
        return workingDaysClose;
    }

    @JsonProperty("working_days_close")
    public void setWorkingDaysClose(Double workingDaysClose) {
        this.workingDaysClose = workingDaysClose;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("activity_user_id")
    public Boolean getActivityUserId() {
        return activityUserId;
    }

    @JsonProperty("activity_user_id")
    public void setActivityUserId(Boolean activityUserId) {
        this.activityUserId = activityUserId;
    }

    @JsonProperty("date_end")
    public Boolean getDateEnd() {
        return dateEnd;
    }

    @JsonProperty("date_end")
    public void setDateEnd(Boolean dateEnd) {
        this.dateEnd = dateEnd;
    }

    @JsonProperty("message_follower_ids")
    public Object[] getMessageFollowerIds() {
        return messageFollowerIds;
    }

    @JsonProperty("message_follower_ids")
    public void setMessageFollowerIds(Object[] messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @JsonProperty("create_uid")
    public Object[] getCreateUid() {
        return createUid;
    }

    @JsonProperty("create_uid")
    public void setCreateUid(Object[] createUid) {
        this.createUid = createUid;
    }

    @JsonProperty("remaining_hours")
    public Double getRemainingHours() {
        return remainingHours;
    }

    @JsonProperty("remaining_hours")
    public void setRemainingHours(Double remainingHours) {
        this.remainingHours = remainingHours;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("rating_count")
    public Integer getRatingCount() {
        return ratingCount;
    }

    @JsonProperty("rating_count")
    public void setRatingCount(Integer ratingCount) {
        this.ratingCount = ratingCount;
    }

    @JsonProperty("rating_ids")
    public Object[] getRatingIds() {
        return ratingIds;
    }

    @JsonProperty("rating_ids")
    public void setRatingIds(Object[] ratingIds) {
        this.ratingIds = ratingIds;
    }

    @JsonProperty("access_token")
    public Boolean getAccessToken() {
        return accessToken;
    }

    @JsonProperty("access_token")
    public void setAccessToken(Boolean accessToken) {
        this.accessToken = accessToken;
    }

    @JsonProperty("sequence")
    public Integer getSequence() {
        return sequence;
    }

    @JsonProperty("sequence")
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @JsonProperty("access_warning")
    public String getAccessWarning() {
        return accessWarning;
    }

    @JsonProperty("access_warning")
    public void setAccessWarning(String accessWarning) {
        this.accessWarning = accessWarning;
    }

    @JsonProperty("date_start")
    public String getDateStart() {
        return dateStart;
    }

    @JsonProperty("date_start")
    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    @JsonProperty("legend_blocked")
    public String getLegendBlocked() {
        return legendBlocked;
    }

    @JsonProperty("legend_blocked")
    public void setLegendBlocked(String legendBlocked) {
        this.legendBlocked = legendBlocked;
    }

    @JsonProperty("user_id")
    public Object[] getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Object[] userId) {
        this.userId = userId;
    }

    @JsonProperty("parent_id")
    public Boolean getParentId() {
        return parentId;
    }

    @JsonProperty("parent_id")
    public void setParentId(Boolean parentId) {
        this.parentId = parentId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("website_message_ids")
    public Object[] getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    @JsonProperty("website_message_ids")
    public void setWebsiteMessageIds(Object[] websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    @JsonProperty("rating_last_image")
    public Boolean getRatingLastImage() {
        return ratingLastImage;
    }

    @JsonProperty("rating_last_image")
    public void setRatingLastImage(Boolean ratingLastImage) {
        this.ratingLastImage = ratingLastImage;
    }

    @JsonProperty("subtask_project_id")
    public Object[] getSubtaskProjectId() {
        return subtaskProjectId;
    }

    @JsonProperty("subtask_project_id")
    public void setSubtaskProjectId(Object[] subtaskProjectId) {
        this.subtaskProjectId = subtaskProjectId;
    }

    @JsonProperty("email_cc")
    public Boolean getEmailCc() {
        return emailCc;
    }

    @JsonProperty("email_cc")
    public void setEmailCc(Boolean emailCc) {
        this.emailCc = emailCc;
    }

    @JsonProperty("subtask_planned_hours")
    public Double getSubtaskPlannedHours() {
        return subtaskPlannedHours;
    }

    @JsonProperty("subtask_planned_hours")
    public void setSubtaskPlannedHours(Double subtaskPlannedHours) {
        this.subtaskPlannedHours = subtaskPlannedHours;
    }

    @JsonProperty("write_uid")
    public Object[] getWriteUid() {
        return writeUid;
    }

    @JsonProperty("write_uid")
    public void setWriteUid(Object[] writeUid) {
        this.writeUid = writeUid;
    }

    @JsonProperty("message_is_follower")
    public Boolean getMessageIsFollower() {
        return messageIsFollower;
    }

    @JsonProperty("message_is_follower")
    public void setMessageIsFollower(Boolean messageIsFollower) {
        this.messageIsFollower = messageIsFollower;
    }

    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Integer color) {
        this.color = color;
    }

    @JsonProperty("working_hours_close")
    public Double getWorkingHoursClose() {
        return workingHoursClose;
    }

    @JsonProperty("working_hours_close")
    public void setWorkingHoursClose(Double workingHoursClose) {
        this.workingHoursClose = workingHoursClose;
    }

    @JsonProperty("description")
    public Boolean getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Boolean description) {
        this.description = description;
    }

    @JsonProperty("date_deadline")
    public Boolean getDateDeadline() {
        return dateDeadline;
    }

    @JsonProperty("date_deadline")
    public void setDateDeadline(Boolean dateDeadline) {
        this.dateDeadline = dateDeadline;
    }

    @JsonProperty("child_ids")
    public Object[] getChildIds() {
        return childIds;
    }

    @JsonProperty("child_ids")
    public void setChildIds(Object[] childIds) {
        this.childIds = childIds;
    }

    @JsonProperty("subtask_effective_hours")
    public Double getSubtaskEffectiveHours() {
        return subtaskEffectiveHours;
    }

    @JsonProperty("subtask_effective_hours")
    public void setSubtaskEffectiveHours(Double subtaskEffectiveHours) {
        this.subtaskEffectiveHours = subtaskEffectiveHours;
    }

    @JsonProperty("message_unread")
    public Boolean getMessageUnread() {
        return messageUnread;
    }

    @JsonProperty("message_unread")
    public void setMessageUnread(Boolean messageUnread) {
        this.messageUnread = messageUnread;
    }

    @JsonProperty("rating_last_feedback")
    public Boolean getRatingLastFeedback() {
        return ratingLastFeedback;
    }

    @JsonProperty("rating_last_feedback")
    public void setRatingLastFeedback(Boolean ratingLastFeedback) {
        this.ratingLastFeedback = ratingLastFeedback;
    }

    @JsonProperty("partner_id")
    public Boolean getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(Boolean partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("manager_id")
    public Object[] getManagerId() {
        return managerId;
    }

    @JsonProperty("manager_id")
    public void setManagerId(Object[] managerId) {
        this.managerId = managerId;
    }

    @JsonProperty("effective_hours")
    public Double getEffectiveHours() {
        return effectiveHours;
    }

    @JsonProperty("effective_hours")
    public void setEffectiveHours(Double effectiveHours) {
        this.effectiveHours = effectiveHours;
    }

    @JsonProperty("company_id")
    public Object[] getCompanyId() {
        return companyId;
    }

    @JsonProperty("company_id")
    public void setCompanyId(Object[] companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("subtask_count")
    public Integer getSubtaskCount() {
        return subtaskCount;
    }

    @JsonProperty("subtask_count")
    public void setSubtaskCount(Integer subtaskCount) {
        this.subtaskCount = subtaskCount;
    }

    @JsonProperty("planned_hours")
    public Double getPlannedHours() {
        return plannedHours;
    }

    @JsonProperty("planned_hours")
    public void setPlannedHours(Double plannedHours) {
        this.plannedHours = plannedHours;
    }

    @JsonProperty("access_url")
    public String getAccessUrl() {
        return accessUrl;
    }

    @JsonProperty("access_url")
    public void setAccessUrl(String accessUrl) {
        this.accessUrl = accessUrl;
    }

    @JsonProperty("allow_timesheets")
    public Boolean getAllowTimesheets() {
        return allowTimesheets;
    }

    @JsonProperty("allow_timesheets")
    public void setAllowTimesheets(Boolean allowTimesheets) {
        this.allowTimesheets = allowTimesheets;
    }

    @JsonProperty("kanban_state_label")
    public String getKanbanStateLabel() {
        return kanbanStateLabel;
    }

    @JsonProperty("kanban_state_label")
    public void setKanbanStateLabel(String kanbanStateLabel) {
        this.kanbanStateLabel = kanbanStateLabel;
    }

    @JsonProperty("date_last_stage_update")
    public String getDateLastStageUpdate() {
        return dateLastStageUpdate;
    }

    @JsonProperty("date_last_stage_update")
    public void setDateLastStageUpdate(String dateLastStageUpdate) {
        this.dateLastStageUpdate = dateLastStageUpdate;
    }

    @JsonProperty("message_unread_counter")
    public Integer getMessageUnreadCounter() {
        return messageUnreadCounter;
    }

    @JsonProperty("message_unread_counter")
    public void setMessageUnreadCounter(Integer messageUnreadCounter) {
        this.messageUnreadCounter = messageUnreadCounter;
    }

    @JsonProperty("activity_type_id")
    public Boolean getActivityTypeId() {
        return activityTypeId;
    }

    @JsonProperty("activity_type_id")
    public void setActivityTypeId(Boolean activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    @JsonProperty("message_has_error")
    public Boolean getMessageHasError() {
        return messageHasError;
    }

    @JsonProperty("message_has_error")
    public void setMessageHasError(Boolean messageHasError) {
        this.messageHasError = messageHasError;
    }

    @JsonProperty("displayed_image_id")
    public Boolean getDisplayedImageId() {
        return displayedImageId;
    }

    @JsonProperty("displayed_image_id")
    public void setDisplayedImageId(Boolean displayedImageId) {
        this.displayedImageId = displayedImageId;
    }

    @JsonProperty("rating_last_value")
    public Double getRatingLastValue() {
        return ratingLastValue;
    }

    @JsonProperty("rating_last_value")
    public void setRatingLastValue(Double ratingLastValue) {
        this.ratingLastValue = ratingLastValue;
    }

    @JsonProperty("message_needaction")
    public Boolean getMessageNeedaction() {
        return messageNeedaction;
    }

    @JsonProperty("message_needaction")
    public void setMessageNeedaction(Boolean messageNeedaction) {
        this.messageNeedaction = messageNeedaction;
    }

    @JsonProperty("activity_summary")
    public Boolean getActivitySummary() {
        return activitySummary;
    }

    @JsonProperty("activity_summary")
    public void setActivitySummary(Boolean activitySummary) {
        this.activitySummary = activitySummary;
    }

    @JsonProperty("legend_normal")
    public String getLegendNormal() {
        return legendNormal;
    }

    @JsonProperty("legend_normal")
    public void setLegendNormal(String legendNormal) {
        this.legendNormal = legendNormal;
    }

    @JsonProperty("message_needaction_counter")
    public Integer getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    @JsonProperty("message_needaction_counter")
    public void setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    @JsonProperty("progress")
    public Double getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Double progress) {
        this.progress = progress;
    }

    @JsonProperty("message_ids")
    public Object[] getMessageIds() {
        return messageIds;
    }

    @JsonProperty("message_ids")
    public void setMessageIds(Object[] messageIds) {
        this.messageIds = messageIds;
    }

    @JsonProperty("total_hours_spent")
    public Double getTotalHoursSpent() {
        return totalHoursSpent;
    }

    @JsonProperty("total_hours_spent")
    public void setTotalHoursSpent(Double totalHoursSpent) {
        this.totalHoursSpent = totalHoursSpent;
    }

    @JsonProperty("email_from")
    public Boolean getEmailFrom() {
        return emailFrom;
    }

    @JsonProperty("email_from")
    public void setEmailFrom(Boolean emailFrom) {
        this.emailFrom = emailFrom;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
