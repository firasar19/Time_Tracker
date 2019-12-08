package models;



import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "write_date",
        "date",
        "message_partner_ids",
        "type_ids",
        "message_main_attachment_id",
        "privacy_visibility",
        "message_channel_ids",
        "alias_contact",
        "task_count",
        "message_has_error_counter",
        "alias_parent_thread_id",
        "analytic_account_id",
        "id",
        "create_date",
        "tasks",
        "favorite_user_ids",
        "alias_parent_model_id",
        "message_attachment_count",
        "__last_update",
        "label_tasks",
        "active",
        "message_follower_ids",
        "percentage_satisfaction_task",
        "display_name",
        "create_uid",
        "access_token",
        "sequence",
        "access_warning",
        "date_start",
        "user_id",
        "name",
        "website_message_ids",
        "rating_status_period",
        "subtask_project_id",
        "write_uid",
        "message_is_follower",
        "is_favorite",
        "color",
        "alias_id",
        "portal_show_rating",
        "message_unread",
        "alias_model_id",
        "partner_id",
        "resource_calendar_id",
        "rating_request_deadline",
        "alias_user_id",
        "doc_count",
        "company_id",
        "percentage_satisfaction_project",
        "access_url",
        "allow_timesheets",
        "task_ids",
        "alias_name",
        "alias_domain",
        "message_unread_counter",
        "message_has_error",
        "rating_status",
        "message_needaction",
        "message_needaction_counter",
        "alias_force_thread_id",
        "message_ids",
        "currency_id",
        "alias_defaults"
})

public class Projects {

    @JsonProperty("write_date")
    private String writeDate;
    @JsonProperty("date")
    private Boolean date;
    @JsonProperty("message_partner_ids")
    private Object[] messagePartnerIds = null;
    @JsonProperty("type_ids")
    private Object[] typeIds = null;
    @JsonProperty("message_main_attachment_id")
    private Boolean messageMainAttachmentId;
    @JsonProperty("privacy_visibility")
    private String privacyVisibility;
    @JsonProperty("message_channel_ids")
    private Object[] messageChannelIds = null;
    @JsonProperty("alias_contact")
    private String aliasContact;
    @JsonProperty("task_count")
    private Integer taskCount;
    @JsonProperty("message_has_error_counter")
    private Integer messageHasErrorCounter;
    @JsonProperty("alias_parent_thread_id")
    private Integer aliasParentThreadId;
    @JsonProperty("analytic_account_id")
    private Object[] analyticAccountId = null;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("create_date")
    private String createDate;
    @JsonProperty("tasks")
    private Object[] tasks = null;
    @JsonProperty("favorite_user_ids")
    private Object[] favoriteUserIds = null;
    @JsonProperty("alias_parent_model_id")
    private Object[] aliasParentModelId = null;
    @JsonProperty("message_attachment_count")
    private Integer messageAttachmentCount;
    @JsonProperty("__last_update")
    private String lastUpdate;
    @JsonProperty("label_tasks")
    private String labelTasks;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("message_follower_ids")
    private Object[] messageFollowerIds = null;
    @JsonProperty("percentage_satisfaction_task")
    private Integer percentageSatisfactionTask;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("create_uid")
    private Object[] createUid = null;
    @JsonProperty("access_token")
    private Boolean accessToken;
    @JsonProperty("sequence")
    private Integer sequence;
    @JsonProperty("access_warning")
    private String accessWarning;
    @JsonProperty("date_start")
    private Boolean dateStart;
    @JsonProperty("user_id")
    private Object[] userId = null;
    @JsonProperty("name")
    private String name;
    @JsonProperty("website_message_ids")
    private Object[] websiteMessageIds = null;
    @JsonProperty("rating_status_period")
    private Boolean ratingStatusPeriod;
    @JsonProperty("subtask_project_id")
    private Object[] subtaskProjectId = null;
    @JsonProperty("write_uid")
    private Object[] writeUid = null;
    @JsonProperty("message_is_follower")
    private Boolean messageIsFollower;
    @JsonProperty("is_favorite")
    private Boolean isFavorite;
    @JsonProperty("color")
    private Integer color;
    @JsonProperty("alias_id")
    private Object[] aliasId = null;
    @JsonProperty("portal_show_rating")
    private Boolean portalShowRating;
    @JsonProperty("message_unread")
    private Boolean messageUnread;
    @JsonProperty("alias_model_id")
    private Object[] aliasModelId = null;
    @JsonProperty("partner_id")
    private Boolean partnerId;
    @JsonProperty("resource_calendar_id")
    private Object[] resourceCalendarId = null;
    @JsonProperty("rating_request_deadline")
    private String ratingRequestDeadline;
    @JsonProperty("alias_user_id")
    private Boolean aliasUserId;
    @JsonProperty("doc_count")
    private Integer docCount;
    @JsonProperty("company_id")
    private Object[] companyId = null;
    @JsonProperty("percentage_satisfaction_project")
    private Integer percentageSatisfactionProject;
    @JsonProperty("access_url")
    private String accessUrl;
    @JsonProperty("allow_timesheets")
    private Boolean allowTimesheets;
    @JsonProperty("task_ids")
    private Object[] taskIds = null;
    @JsonProperty("alias_name")
    private Boolean aliasName;
    @JsonProperty("alias_domain")
    private Boolean aliasDomain;
    @JsonProperty("message_unread_counter")
    private Integer messageUnreadCounter;
    @JsonProperty("message_has_error")
    private Boolean messageHasError;
    @JsonProperty("rating_status")
    private String ratingStatus;
    @JsonProperty("message_needaction")
    private Boolean messageNeedaction;
    @JsonProperty("message_needaction_counter")
    private Integer messageNeedactionCounter;
    @JsonProperty("alias_force_thread_id")
    private Integer aliasForceThreadId;
    @JsonProperty("message_ids")
    private Object[] messageIds = null;
    @JsonProperty("currency_id")
    private Object[] currencyId = null;
    @JsonProperty("alias_defaults")
    private String aliasDefaults;
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

    @JsonProperty("date")
    public Boolean getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Boolean date) {
        this.date = date;
    }

    @JsonProperty("message_partner_ids")
    public Object[] getMessagePartnerIds() {
        return messagePartnerIds;
    }

    @JsonProperty("message_partner_ids")
    public void setMessagePartnerIds(Object[] messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    @JsonProperty("type_ids")
    public Object[] getTypeIds() {
        return typeIds;
    }

    @JsonProperty("type_ids")
    public void setTypeIds(Object[] typeIds) {
        this.typeIds = typeIds;
    }

    @JsonProperty("message_main_attachment_id")
    public Boolean getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    @JsonProperty("message_main_attachment_id")
    public void setMessageMainAttachmentId(Boolean messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    @JsonProperty("privacy_visibility")
    public String getPrivacyVisibility() {
        return privacyVisibility;
    }

    @JsonProperty("privacy_visibility")
    public void setPrivacyVisibility(String privacyVisibility) {
        this.privacyVisibility = privacyVisibility;
    }

    @JsonProperty("message_channel_ids")
    public Object[] getMessageChannelIds() {
        return messageChannelIds;
    }

    @JsonProperty("message_channel_ids")
    public void setMessageChannelIds(Object[] messageChannelIds) {
        this.messageChannelIds = messageChannelIds;
    }

    @JsonProperty("alias_contact")
    public String getAliasContact() {
        return aliasContact;
    }

    @JsonProperty("alias_contact")
    public void setAliasContact(String aliasContact) {
        this.aliasContact = aliasContact;
    }

    @JsonProperty("task_count")
    public Integer getTaskCount() {
        return taskCount;
    }

    @JsonProperty("task_count")
    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    @JsonProperty("message_has_error_counter")
    public Integer getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    @JsonProperty("message_has_error_counter")
    public void setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    @JsonProperty("alias_parent_thread_id")
    public Integer getAliasParentThreadId() {
        return aliasParentThreadId;
    }

    @JsonProperty("alias_parent_thread_id")
    public void setAliasParentThreadId(Integer aliasParentThreadId) {
        this.aliasParentThreadId = aliasParentThreadId;
    }

    @JsonProperty("analytic_account_id")
    public Object[] getAnalyticAccountId() {
        return analyticAccountId;
    }

    @JsonProperty("analytic_account_id")
    public void setAnalyticAccountId(Object[] analyticAccountId) {
        this.analyticAccountId = analyticAccountId;
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

    @JsonProperty("tasks")
    public Object[] getTasks() {
        return tasks;
    }

    @JsonProperty("tasks")
    public void setTasks(Object[] tasks) {
        this.tasks = tasks;
    }

    @JsonProperty("favorite_user_ids")
    public Object[] getFavoriteUserIds() {
        return favoriteUserIds;
    }

    @JsonProperty("favorite_user_ids")
    public void setFavoriteUserIds(Object[] favoriteUserIds) {
        this.favoriteUserIds = favoriteUserIds;
    }

    @JsonProperty("alias_parent_model_id")
    public Object[] getAliasParentModelId() {
        return aliasParentModelId;
    }

    @JsonProperty("alias_parent_model_id")
    public void setAliasParentModelId(Object[] aliasParentModelId) {
        this.aliasParentModelId = aliasParentModelId;
    }

    @JsonProperty("message_attachment_count")
    public Integer getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    @JsonProperty("message_attachment_count")
    public void setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    @JsonProperty("__last_update")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("__last_update")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonProperty("label_tasks")
    public String getLabelTasks() {
        return labelTasks;
    }

    @JsonProperty("label_tasks")
    public void setLabelTasks(String labelTasks) {
        this.labelTasks = labelTasks;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("message_follower_ids")
    public Object[] getMessageFollowerIds() {
        return messageFollowerIds;
    }

    @JsonProperty("message_follower_ids")
    public void setMessageFollowerIds(Object[] messageFollowerIds) {
        this.messageFollowerIds = messageFollowerIds;
    }

    @JsonProperty("percentage_satisfaction_task")
    public Integer getPercentageSatisfactionTask() {
        return percentageSatisfactionTask;
    }

    @JsonProperty("percentage_satisfaction_task")
    public void setPercentageSatisfactionTask(Integer percentageSatisfactionTask) {
        this.percentageSatisfactionTask = percentageSatisfactionTask;
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
    public Boolean getDateStart() {
        return dateStart;
    }

    @JsonProperty("date_start")
    public void setDateStart(Boolean dateStart) {
        this.dateStart = dateStart;
    }

    @JsonProperty("user_id")
    public Object[] getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Object[] userId) {
        this.userId = userId;
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

    @JsonProperty("rating_status_period")
    public Boolean getRatingStatusPeriod() {
        return ratingStatusPeriod;
    }

    @JsonProperty("rating_status_period")
    public void setRatingStatusPeriod(Boolean ratingStatusPeriod) {
        this.ratingStatusPeriod = ratingStatusPeriod;
    }

    @JsonProperty("subtask_project_id")
    public Object[] getSubtaskProjectId() {
        return subtaskProjectId;
    }

    @JsonProperty("subtask_project_id")
    public void setSubtaskProjectId(Object[] subtaskProjectId) {
        this.subtaskProjectId = subtaskProjectId;
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

    @JsonProperty("is_favorite")
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    @JsonProperty("is_favorite")
    public void setIsFavorite(Boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Integer color) {
        this.color = color;
    }

    @JsonProperty("alias_id")
    public Object[] getAliasId() {
        return aliasId;
    }

    @JsonProperty("alias_id")
    public void setAliasId(Object[] aliasId) {
        this.aliasId = aliasId;
    }

    @JsonProperty("portal_show_rating")
    public Boolean getPortalShowRating() {
        return portalShowRating;
    }

    @JsonProperty("portal_show_rating")
    public void setPortalShowRating(Boolean portalShowRating) {
        this.portalShowRating = portalShowRating;
    }

    @JsonProperty("message_unread")
    public Boolean getMessageUnread() {
        return messageUnread;
    }

    @JsonProperty("message_unread")
    public void setMessageUnread(Boolean messageUnread) {
        this.messageUnread = messageUnread;
    }

    @JsonProperty("alias_model_id")
    public Object[] getAliasModelId() {
        return aliasModelId;
    }

    @JsonProperty("alias_model_id")
    public void setAliasModelId(Object[] aliasModelId) {
        this.aliasModelId = aliasModelId;
    }

    @JsonProperty("partner_id")
    public Boolean getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(Boolean partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("resource_calendar_id")
    public Object[] getResourceCalendarId() {
        return resourceCalendarId;
    }

    @JsonProperty("resource_calendar_id")
    public void setResourceCalendarId(Object[] resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    @JsonProperty("rating_request_deadline")
    public String getRatingRequestDeadline() {
        return ratingRequestDeadline;
    }

    @JsonProperty("rating_request_deadline")
    public void setRatingRequestDeadline(String ratingRequestDeadline) {
        this.ratingRequestDeadline = ratingRequestDeadline;
    }

    @JsonProperty("alias_user_id")
    public Boolean getAliasUserId() {
        return aliasUserId;
    }

    @JsonProperty("alias_user_id")
    public void setAliasUserId(Boolean aliasUserId) {
        this.aliasUserId = aliasUserId;
    }

    @JsonProperty("doc_count")
    public Integer getDocCount() {
        return docCount;
    }

    @JsonProperty("doc_count")
    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    @JsonProperty("company_id")
    public Object[] getCompanyId() {
        return companyId;
    }

    @JsonProperty("company_id")
    public void setCompanyId(Object[] companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("percentage_satisfaction_project")
    public Integer getPercentageSatisfactionProject() {
        return percentageSatisfactionProject;
    }

    @JsonProperty("percentage_satisfaction_project")
    public void setPercentageSatisfactionProject(Integer percentageSatisfactionProject) {
        this.percentageSatisfactionProject = percentageSatisfactionProject;
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

    @JsonProperty("task_ids")
    public Object[] getTaskIds() {
        return taskIds;
    }

    @JsonProperty("task_ids")
    public void setTaskIds(Object[] taskIds) {
        this.taskIds = taskIds;
    }

    @JsonProperty("alias_name")
    public Boolean getAliasName() {
        return aliasName;
    }

    @JsonProperty("alias_name")
    public void setAliasName(Boolean aliasName) {
        this.aliasName = aliasName;
    }

    @JsonProperty("alias_domain")
    public Boolean getAliasDomain() {
        return aliasDomain;
    }

    @JsonProperty("alias_domain")
    public void setAliasDomain(Boolean aliasDomain) {
        this.aliasDomain = aliasDomain;
    }

    @JsonProperty("message_unread_counter")
    public Integer getMessageUnreadCounter() {
        return messageUnreadCounter;
    }

    @JsonProperty("message_unread_counter")
    public void setMessageUnreadCounter(Integer messageUnreadCounter) {
        this.messageUnreadCounter = messageUnreadCounter;
    }

    @JsonProperty("message_has_error")
    public Boolean getMessageHasError() {
        return messageHasError;
    }

    @JsonProperty("message_has_error")
    public void setMessageHasError(Boolean messageHasError) {
        this.messageHasError = messageHasError;
    }

    @JsonProperty("rating_status")
    public String getRatingStatus() {
        return ratingStatus;
    }

    @JsonProperty("rating_status")
    public void setRatingStatus(String ratingStatus) {
        this.ratingStatus = ratingStatus;
    }

    @JsonProperty("message_needaction")
    public Boolean getMessageNeedaction() {
        return messageNeedaction;
    }

    @JsonProperty("message_needaction")
    public void setMessageNeedaction(Boolean messageNeedaction) {
        this.messageNeedaction = messageNeedaction;
    }

    @JsonProperty("message_needaction_counter")
    public Integer getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    @JsonProperty("message_needaction_counter")
    public void setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    @JsonProperty("alias_force_thread_id")
    public Integer getAliasForceThreadId() {
        return aliasForceThreadId;
    }

    @JsonProperty("alias_force_thread_id")
    public void setAliasForceThreadId(Integer aliasForceThreadId) {
        this.aliasForceThreadId = aliasForceThreadId;
    }

    @JsonProperty("message_ids")
    public Object[] getMessageIds() {
        return messageIds;
    }

    @JsonProperty("message_ids")
    public void setMessageIds(Object[] messageIds) {
        this.messageIds = messageIds;
    }

    @JsonProperty("currency_id")
    public Object[] getCurrencyId() {
        return currencyId;
    }

    @JsonProperty("currency_id")
    public void setCurrencyId(Object[] currencyId) {
        this.currencyId = currencyId;
    }

    @JsonProperty("alias_defaults")
    public String getAliasDefaults() {
        return aliasDefaults;
    }

    @JsonProperty("alias_defaults")
    public void setAliasDefaults(String aliasDefaults) {
        this.aliasDefaults = aliasDefaults;
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
