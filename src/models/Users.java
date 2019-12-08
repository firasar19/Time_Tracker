package models;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "write_date",
        "bank_ids",
        "message_main_attachment_id",
        "login_date",
        "activity_date_deadline",
        "type",
        "alias_contact",
        "message_channel_ids",
        "activity_state",
        "moderation_counter",
        "message_has_error_counter",
        "password",
        "action_id",
        "supplier",
        "id",
        "state",
        "state_id",
        "sel_groups_1_9_10",
        "message_bounce",
        "resource_ids",
        "zip",
        "channel_ids",
        "message_attachment_count",
        "sel_groups_2_3",
        "vat",
        "is_blacklisted",
        "active",
        "sel_groups_15_16",
        "create_uid",
        "image_small",
        "in_group_26",
        "in_group_23",
        "in_group_22",
        "user_id",
        "additional_info",
        "phone",
        "in_group_21",
        "company_name",
        "in_group_20",
        "moderation_channel_ids",
        "country_id",
        "notification_type",
        "odoobot_state",
        "company_ids",
        "message_is_follower",
        "im_status",
        "city",
        "signature",
        "alias_id",
        "image_medium",
        "login",
        "child_ids",
        "sel_groups_29_30",
        "in_group_14",
        "in_group_13",
        "category_id",
        "commercial_partner_id",
        "share",
        "street2",
        "signup_url",
        "email",
        "resource_calendar_id",
        "log_ids",
        "website",
        "sel_groups_24_25",
        "company_id",
        "user_ids",
        "task_ids",
        "is_moderator",
        "activity_type_id",
        "signup_expiration",
        "self",
        "message_ids",
        "is_company",
        "companies_count",
        "parent_name",
        "date",
        "company_type",
        "message_partner_ids",
        "sel_groups_27_28",
        "tz",
        "sel_groups_19_17_18",
        "employee",
        "partner_share",
        "task_count",
        "ref",
        "activity_ids",
        "tz_offset",
        "commercial_company_name",
        "function",
        "create_date",
        "barcode",
        "image",
        "__last_update",
        "employee_ids",
        "activity_user_id",
        "message_follower_ids",
        "display_name",
        "sel_groups_11_12",
        "parent_id",
        "name",
        "website_message_ids",
        "website_id",
        "industry_id",
        "write_uid",
        "color",
        "in_group_6",
        "in_group_7",
        "in_group_8",
        "title",
        "in_group_4",
        "groups_id",
        "in_group_5",
        "message_unread",
        "partner_id",
        "street",
        "partner_gid",
        "credit_limit",
        "lang",
        "contact_address",
        "email_formatted",
        "mobile",
        "signup_valid",
        "signup_type",
        "message_unread_counter",
        "message_has_error",
        "ocn_token",
        "message_needaction",
        "signup_token",
        "activity_summary",
        "message_needaction_counter",
        "new_password",
        "comment",
        "customer"
})


public class Users {



    @JsonProperty("write_date")
    private String writeDate;
    @JsonProperty("bank_ids")
    private List<Object> bankIds = null;
    @JsonProperty("message_main_attachment_id")
    private Boolean messageMainAttachmentId;
    @JsonProperty("login_date")
    private Boolean loginDate;
    @JsonProperty("activity_date_deadline")
    private Boolean activityDateDeadline;
    @JsonProperty("type")
    private String type;
    @JsonProperty("alias_contact")
    private Boolean aliasContact;
    @JsonProperty("message_channel_ids")
    private List<Object> messageChannelIds = null;
    @JsonProperty("activity_state")
    private Boolean activityState;
    @JsonProperty("moderation_counter")
    private Integer moderationCounter;
    @JsonProperty("message_has_error_counter")
    private Integer messageHasErrorCounter;
    @JsonProperty("password")
    private String password;
    @JsonProperty("action_id")
    private Boolean actionId;
    @JsonProperty("supplier")
    private Boolean supplier;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("state")
    private String state;
    @JsonProperty("state_id")
    private Boolean stateId;
    @JsonProperty("sel_groups_1_9_10")
    private Integer selGroups1910;
    @JsonProperty("message_bounce")
    private Integer messageBounce;
    @JsonProperty("resource_ids")
    private List<Integer> resourceIds = null;
    @JsonProperty("zip")
    private Boolean zip;
    @JsonProperty("channel_ids")
    private List<Integer> channelIds = null;
    @JsonProperty("message_attachment_count")
    private Integer messageAttachmentCount;
    @JsonProperty("sel_groups_2_3")
    private Integer selGroups23;
    @JsonProperty("vat")
    private Boolean vat;
    @JsonProperty("is_blacklisted")
    private Boolean isBlacklisted;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("sel_groups_15_16")
    private Integer selGroups1516;
    @JsonProperty("create_uid")
    private List<Integer> createUid = null;
    @JsonProperty("image_small")
    private String imageSmall;
    @JsonProperty("in_group_26")
    private Boolean inGroup26;
    @JsonProperty("in_group_23")
    private Boolean inGroup23;
    @JsonProperty("in_group_22")
    private Boolean inGroup22;
    @JsonProperty("user_id")
    private Boolean userId;
    @JsonProperty("additional_info")
    private Boolean additionalInfo;
    @JsonProperty("phone")
    private Boolean phone;
    @JsonProperty("in_group_21")
    private Boolean inGroup21;
    @JsonProperty("company_name")
    private Boolean companyName;
    @JsonProperty("in_group_20")
    private Boolean inGroup20;
    @JsonProperty("moderation_channel_ids")
    private List<Object> moderationChannelIds = null;
    @JsonProperty("country_id")
    private Boolean countryId;
    @JsonProperty("notification_type")
    private String notificationType;
    @JsonProperty("odoobot_state")
    private String odoobotState;
    @JsonProperty("company_ids")
    private List<Integer> companyIds = null;
    @JsonProperty("message_is_follower")
    private Boolean messageIsFollower;
    @JsonProperty("im_status")
    private String imStatus;
    @JsonProperty("city")
    private Boolean city;
    @JsonProperty("signature")
    private String signature;
    @JsonProperty("alias_id")
    private Boolean aliasId;
    @JsonProperty("image_medium")
    private String imageMedium;
    @JsonProperty("login")
    private String login;
    @JsonProperty("child_ids")
    private List<Object> childIds = null;
    @JsonProperty("sel_groups_29_30")
    private Boolean selGroups2930;
    @JsonProperty("in_group_14")
    private Boolean inGroup14;
    @JsonProperty("in_group_13")
    private Boolean inGroup13;
    @JsonProperty("category_id")
    private List<Object> categoryId = null;
    @JsonProperty("commercial_partner_id")
    private List<Integer> commercialPartnerId = null;
    @JsonProperty("share")
    private Boolean share;
    @JsonProperty("street2")
    private Boolean street2;
    @JsonProperty("signup_url")
    private String signupUrl;
    @JsonProperty("email")
    private String email;
    @JsonProperty("resource_calendar_id")
    private List<Integer> resourceCalendarId = null;
    @JsonProperty("log_ids")
    private List<Integer> logIds = null;
    @JsonProperty("website")
    private Boolean website;
    @JsonProperty("sel_groups_24_25")
    private Integer selGroups2425;
    @JsonProperty("company_id")
    private List<Integer> companyId = null;
    @JsonProperty("user_ids")
    private List<Integer> userIds = null;
    @JsonProperty("task_ids")
    private List<Object> taskIds = null;
    @JsonProperty("is_moderator")
    private Boolean isModerator;
    @JsonProperty("activity_type_id")
    private Boolean activityTypeId;
    @JsonProperty("signup_expiration")
    private Boolean signupExpiration;
    @JsonProperty("self")
    private List<Integer> self = null;
    @JsonProperty("message_ids")
    private List<Integer> messageIds = null;
    @JsonProperty("is_company")
    private Boolean isCompany;
    @JsonProperty("companies_count")
    private Integer companiesCount;
    @JsonProperty("parent_name")
    private Boolean parentName;
    @JsonProperty("date")
    private Boolean date;
    @JsonProperty("company_type")
    private String companyType;
    @JsonProperty("message_partner_ids")
    private List<Integer> messagePartnerIds = null;
    @JsonProperty("sel_groups_27_28")
    private Integer selGroups2728;
    @JsonProperty("tz")
    private Boolean tz;
    @JsonProperty("sel_groups_19_17_18")
    private Integer selGroups191718;
    @JsonProperty("employee")
    private Boolean employee;
    @JsonProperty("partner_share")
    private Boolean partnerShare;
    @JsonProperty("task_count")
    private Integer taskCount;
    @JsonProperty("ref")
    private Boolean ref;
    @JsonProperty("activity_ids")
    private List<Object> activityIds = null;
    @JsonProperty("tz_offset")
    private String tzOffset;
    @JsonProperty("commercial_company_name")
    private Boolean commercialCompanyName;
    @JsonProperty("function")
    private Boolean function;
    @JsonProperty("create_date")
    private String createDate;
    @JsonProperty("barcode")
    private Boolean barcode;
    @JsonProperty("image")
    private String image;
    @JsonProperty("__last_update")
    private String lastUpdate;
    @JsonProperty("employee_ids")
    private List<Integer> employeeIds = null;
    @JsonProperty("activity_user_id")
    private Boolean activityUserId;
    @JsonProperty("message_follower_ids")
    private List<Integer> messageFollowerIds = null;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("sel_groups_11_12")
    private Integer selGroups1112;
    @JsonProperty("parent_id")
    private Boolean parentId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("website_message_ids")
    private List<Object> websiteMessageIds = null;
    @JsonProperty("website_id")
    private Boolean websiteId;
    @JsonProperty("industry_id")
    private Boolean industryId;
    @JsonProperty("write_uid")
    private List<Integer> writeUid = null;
    @JsonProperty("color")
    private Integer color;
    @JsonProperty("in_group_6")
    private Boolean inGroup6;
    @JsonProperty("in_group_7")
    private Boolean inGroup7;
    @JsonProperty("in_group_8")
    private Boolean inGroup8;
    @JsonProperty("title")
    private Boolean title;
    @JsonProperty("in_group_4")
    private Boolean inGroup4;
    @JsonProperty("groups_id")
    private List<Integer> groupsId = null;
    @JsonProperty("in_group_5")
    private Boolean inGroup5;
    @JsonProperty("message_unread")
    private Boolean messageUnread;
    @JsonProperty("partner_id")
    private List<Integer> partnerId = null;
    @JsonProperty("street")
    private Boolean street;
    @JsonProperty("partner_gid")
    private Integer partnerGid;
    @JsonProperty("credit_limit")
    private Double creditLimit;
    @JsonProperty("lang")
    private String lang;
    @JsonProperty("contact_address")
    private String contactAddress;
    @JsonProperty("email_formatted")
    private String emailFormatted;
    @JsonProperty("mobile")
    private Boolean mobile;
    @JsonProperty("signup_valid")
    private Boolean signupValid;
    @JsonProperty("signup_type")
    private Boolean signupType;
    @JsonProperty("message_unread_counter")
    private Integer messageUnreadCounter;
    @JsonProperty("message_has_error")
    private Boolean messageHasError;
    @JsonProperty("ocn_token")
    private Boolean ocnToken;
    @JsonProperty("message_needaction")
    private Boolean messageNeedaction;
    @JsonProperty("signup_token")
    private Boolean signupToken;
    @JsonProperty("activity_summary")
    private Boolean activitySummary;
    @JsonProperty("message_needaction_counter")
    private Integer messageNeedactionCounter;
    @JsonProperty("new_password")
    private String newPassword;
    @JsonProperty("comment")
    private Boolean comment;
    @JsonProperty("customer")
    private Boolean customer;
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

    @JsonProperty("bank_ids")
    public List<Object> getBankIds() {
        return bankIds;
    }

    @JsonProperty("bank_ids")
    public void setBankIds(List<Object> bankIds) {
        this.bankIds = bankIds;
    }

    @JsonProperty("message_main_attachment_id")
    public Boolean getMessageMainAttachmentId() {
        return messageMainAttachmentId;
    }

    @JsonProperty("message_main_attachment_id")
    public void setMessageMainAttachmentId(Boolean messageMainAttachmentId) {
        this.messageMainAttachmentId = messageMainAttachmentId;
    }

    @JsonProperty("login_date")
    public Boolean getLoginDate() {
        return loginDate;
    }

    @JsonProperty("login_date")
    public void setLoginDate(Boolean loginDate) {
        this.loginDate = loginDate;
    }

    @JsonProperty("activity_date_deadline")
    public Boolean getActivityDateDeadline() {
        return activityDateDeadline;
    }

    @JsonProperty("activity_date_deadline")
    public void setActivityDateDeadline(Boolean activityDateDeadline) {
        this.activityDateDeadline = activityDateDeadline;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("alias_contact")
    public Boolean getAliasContact() {
        return aliasContact;
    }

    @JsonProperty("alias_contact")
    public void setAliasContact(Boolean aliasContact) {
        this.aliasContact = aliasContact;
    }

    @JsonProperty("message_channel_ids")
    public List<Object> getMessageChannelIds() {
        return messageChannelIds;
    }

    @JsonProperty("message_channel_ids")
    public void setMessageChannelIds(List<Object> messageChannelIds) {
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

    @JsonProperty("moderation_counter")
    public Integer getModerationCounter() {
        return moderationCounter;
    }

    @JsonProperty("moderation_counter")
    public void setModerationCounter(Integer moderationCounter) {
        this.moderationCounter = moderationCounter;
    }

    @JsonProperty("message_has_error_counter")
    public Integer getMessageHasErrorCounter() {
        return messageHasErrorCounter;
    }

    @JsonProperty("message_has_error_counter")
    public void setMessageHasErrorCounter(Integer messageHasErrorCounter) {
        this.messageHasErrorCounter = messageHasErrorCounter;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("action_id")
    public Boolean getActionId() {
        return actionId;
    }

    @JsonProperty("action_id")
    public void setActionId(Boolean actionId) {
        this.actionId = actionId;
    }

    @JsonProperty("supplier")
    public Boolean getSupplier() {
        return supplier;
    }

    @JsonProperty("supplier")
    public void setSupplier(Boolean supplier) {
        this.supplier = supplier;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("state_id")
    public Boolean getStateId() {
        return stateId;
    }

    @JsonProperty("state_id")
    public void setStateId(Boolean stateId) {
        this.stateId = stateId;
    }

    @JsonProperty("sel_groups_1_9_10")
    public Integer getSelGroups1910() {
        return selGroups1910;
    }

    @JsonProperty("sel_groups_1_9_10")
    public void setSelGroups1910(Integer selGroups1910) {
        this.selGroups1910 = selGroups1910;
    }

    @JsonProperty("message_bounce")
    public Integer getMessageBounce() {
        return messageBounce;
    }

    @JsonProperty("message_bounce")
    public void setMessageBounce(Integer messageBounce) {
        this.messageBounce = messageBounce;
    }

    @JsonProperty("resource_ids")
    public List<Integer> getResourceIds() {
        return resourceIds;
    }

    @JsonProperty("resource_ids")
    public void setResourceIds(List<Integer> resourceIds) {
        this.resourceIds = resourceIds;
    }

    @JsonProperty("zip")
    public Boolean getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(Boolean zip) {
        this.zip = zip;
    }

    @JsonProperty("channel_ids")
    public List<Integer> getChannelIds() {
        return channelIds;
    }

    @JsonProperty("channel_ids")
    public void setChannelIds(List<Integer> channelIds) {
        this.channelIds = channelIds;
    }

    @JsonProperty("message_attachment_count")
    public Integer getMessageAttachmentCount() {
        return messageAttachmentCount;
    }

    @JsonProperty("message_attachment_count")
    public void setMessageAttachmentCount(Integer messageAttachmentCount) {
        this.messageAttachmentCount = messageAttachmentCount;
    }

    @JsonProperty("sel_groups_2_3")
    public Integer getSelGroups23() {
        return selGroups23;
    }

    @JsonProperty("sel_groups_2_3")
    public void setSelGroups23(Integer selGroups23) {
        this.selGroups23 = selGroups23;
    }

    @JsonProperty("vat")
    public Boolean getVat() {
        return vat;
    }

    @JsonProperty("vat")
    public void setVat(Boolean vat) {
        this.vat = vat;
    }

    @JsonProperty("is_blacklisted")
    public Boolean getIsBlacklisted() {
        return isBlacklisted;
    }

    @JsonProperty("is_blacklisted")
    public void setIsBlacklisted(Boolean isBlacklisted) {
        this.isBlacklisted = isBlacklisted;
    }

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("sel_groups_15_16")
    public Integer getSelGroups1516() {
        return selGroups1516;
    }

    @JsonProperty("sel_groups_15_16")
    public void setSelGroups1516(Integer selGroups1516) {
        this.selGroups1516 = selGroups1516;
    }

    @JsonProperty("create_uid")
    public List<Integer> getCreateUid() {
        return createUid;
    }

    @JsonProperty("create_uid")
    public void setCreateUid(List<Integer> createUid) {
        this.createUid = createUid;
    }

    @JsonProperty("image_small")
    public String getImageSmall() {
        return imageSmall;
    }

    @JsonProperty("image_small")
    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    @JsonProperty("in_group_26")
    public Boolean getInGroup26() {
        return inGroup26;
    }

    @JsonProperty("in_group_26")
    public void setInGroup26(Boolean inGroup26) {
        this.inGroup26 = inGroup26;
    }

    @JsonProperty("in_group_23")
    public Boolean getInGroup23() {
        return inGroup23;
    }

    @JsonProperty("in_group_23")
    public void setInGroup23(Boolean inGroup23) {
        this.inGroup23 = inGroup23;
    }

    @JsonProperty("in_group_22")
    public Boolean getInGroup22() {
        return inGroup22;
    }

    @JsonProperty("in_group_22")
    public void setInGroup22(Boolean inGroup22) {
        this.inGroup22 = inGroup22;
    }

    @JsonProperty("user_id")
    public Boolean getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Boolean userId) {
        this.userId = userId;
    }

    @JsonProperty("additional_info")
    public Boolean getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additional_info")
    public void setAdditionalInfo(Boolean additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    @JsonProperty("phone")
    public Boolean getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(Boolean phone) {
        this.phone = phone;
    }

    @JsonProperty("in_group_21")
    public Boolean getInGroup21() {
        return inGroup21;
    }

    @JsonProperty("in_group_21")
    public void setInGroup21(Boolean inGroup21) {
        this.inGroup21 = inGroup21;
    }

    @JsonProperty("company_name")
    public Boolean getCompanyName() {
        return companyName;
    }

    @JsonProperty("company_name")
    public void setCompanyName(Boolean companyName) {
        this.companyName = companyName;
    }

    @JsonProperty("in_group_20")
    public Boolean getInGroup20() {
        return inGroup20;
    }

    @JsonProperty("in_group_20")
    public void setInGroup20(Boolean inGroup20) {
        this.inGroup20 = inGroup20;
    }

    @JsonProperty("moderation_channel_ids")
    public List<Object> getModerationChannelIds() {
        return moderationChannelIds;
    }

    @JsonProperty("moderation_channel_ids")
    public void setModerationChannelIds(List<Object> moderationChannelIds) {
        this.moderationChannelIds = moderationChannelIds;
    }

    @JsonProperty("country_id")
    public Boolean getCountryId() {
        return countryId;
    }

    @JsonProperty("country_id")
    public void setCountryId(Boolean countryId) {
        this.countryId = countryId;
    }

    @JsonProperty("notification_type")
    public String getNotificationType() {
        return notificationType;
    }

    @JsonProperty("notification_type")
    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    @JsonProperty("odoobot_state")
    public String getOdoobotState() {
        return odoobotState;
    }

    @JsonProperty("odoobot_state")
    public void setOdoobotState(String odoobotState) {
        this.odoobotState = odoobotState;
    }

    @JsonProperty("company_ids")
    public List<Integer> getCompanyIds() {
        return companyIds;
    }

    @JsonProperty("company_ids")
    public void setCompanyIds(List<Integer> companyIds) {
        this.companyIds = companyIds;
    }

    @JsonProperty("message_is_follower")
    public Boolean getMessageIsFollower() {
        return messageIsFollower;
    }

    @JsonProperty("message_is_follower")
    public void setMessageIsFollower(Boolean messageIsFollower) {
        this.messageIsFollower = messageIsFollower;
    }

    @JsonProperty("im_status")
    public String getImStatus() {
        return imStatus;
    }

    @JsonProperty("im_status")
    public void setImStatus(String imStatus) {
        this.imStatus = imStatus;
    }

    @JsonProperty("city")
    public Boolean getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(Boolean city) {
        this.city = city;
    }

    @JsonProperty("signature")
    public String getSignature() {
        return signature;
    }

    @JsonProperty("signature")
    public void setSignature(String signature) {
        this.signature = signature;
    }

    @JsonProperty("alias_id")
    public Boolean getAliasId() {
        return aliasId;
    }

    @JsonProperty("alias_id")
    public void setAliasId(Boolean aliasId) {
        this.aliasId = aliasId;
    }

    @JsonProperty("image_medium")
    public String getImageMedium() {
        return imageMedium;
    }

    @JsonProperty("image_medium")
    public void setImageMedium(String imageMedium) {
        this.imageMedium = imageMedium;
    }

    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(String login) {
        this.login = login;
    }

    @JsonProperty("child_ids")
    public List<Object> getChildIds() {
        return childIds;
    }

    @JsonProperty("child_ids")
    public void setChildIds(List<Object> childIds) {
        this.childIds = childIds;
    }

    @JsonProperty("sel_groups_29_30")
    public Boolean getSelGroups2930() {
        return selGroups2930;
    }

    @JsonProperty("sel_groups_29_30")
    public void setSelGroups2930(Boolean selGroups2930) {
        this.selGroups2930 = selGroups2930;
    }

    @JsonProperty("in_group_14")
    public Boolean getInGroup14() {
        return inGroup14;
    }

    @JsonProperty("in_group_14")
    public void setInGroup14(Boolean inGroup14) {
        this.inGroup14 = inGroup14;
    }

    @JsonProperty("in_group_13")
    public Boolean getInGroup13() {
        return inGroup13;
    }

    @JsonProperty("in_group_13")
    public void setInGroup13(Boolean inGroup13) {
        this.inGroup13 = inGroup13;
    }

    @JsonProperty("category_id")
    public List<Object> getCategoryId() {
        return categoryId;
    }

    @JsonProperty("category_id")
    public void setCategoryId(List<Object> categoryId) {
        this.categoryId = categoryId;
    }

    @JsonProperty("commercial_partner_id")
    public List<Integer> getCommercialPartnerId() {
        return commercialPartnerId;
    }

    @JsonProperty("commercial_partner_id")
    public void setCommercialPartnerId(List<Integer> commercialPartnerId) {
        this.commercialPartnerId = commercialPartnerId;
    }

    @JsonProperty("share")
    public Boolean getShare() {
        return share;
    }

    @JsonProperty("share")
    public void setShare(Boolean share) {
        this.share = share;
    }

    @JsonProperty("street2")
    public Boolean getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(Boolean street2) {
        this.street2 = street2;
    }

    @JsonProperty("signup_url")
    public String getSignupUrl() {
        return signupUrl;
    }

    @JsonProperty("signup_url")
    public void setSignupUrl(String signupUrl) {
        this.signupUrl = signupUrl;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("resource_calendar_id")
    public List<Integer> getResourceCalendarId() {
        return resourceCalendarId;
    }

    @JsonProperty("resource_calendar_id")
    public void setResourceCalendarId(List<Integer> resourceCalendarId) {
        this.resourceCalendarId = resourceCalendarId;
    }

    @JsonProperty("log_ids")
    public List<Integer> getLogIds() {
        return logIds;
    }

    @JsonProperty("log_ids")
    public void setLogIds(List<Integer> logIds) {
        this.logIds = logIds;
    }

    @JsonProperty("website")
    public Boolean getWebsite() {
        return website;
    }

    @JsonProperty("website")
    public void setWebsite(Boolean website) {
        this.website = website;
    }

    @JsonProperty("sel_groups_24_25")
    public Integer getSelGroups2425() {
        return selGroups2425;
    }

    @JsonProperty("sel_groups_24_25")
    public void setSelGroups2425(Integer selGroups2425) {
        this.selGroups2425 = selGroups2425;
    }

    @JsonProperty("company_id")
    public List<Integer> getCompanyId() {
        return companyId;
    }

    @JsonProperty("company_id")
    public void setCompanyId(List<Integer> companyId) {
        this.companyId = companyId;
    }

    @JsonProperty("user_ids")
    public List<Integer> getUserIds() {
        return userIds;
    }

    @JsonProperty("user_ids")
    public void setUserIds(List<Integer> userIds) {
        this.userIds = userIds;
    }

    @JsonProperty("task_ids")
    public List<Object> getTaskIds() {
        return taskIds;
    }

    @JsonProperty("task_ids")
    public void setTaskIds(List<Object> taskIds) {
        this.taskIds = taskIds;
    }

    @JsonProperty("is_moderator")
    public Boolean getIsModerator() {
        return isModerator;
    }

    @JsonProperty("is_moderator")
    public void setIsModerator(Boolean isModerator) {
        this.isModerator = isModerator;
    }

    @JsonProperty("activity_type_id")
    public Boolean getActivityTypeId() {
        return activityTypeId;
    }

    @JsonProperty("activity_type_id")
    public void setActivityTypeId(Boolean activityTypeId) {
        this.activityTypeId = activityTypeId;
    }

    @JsonProperty("signup_expiration")
    public Boolean getSignupExpiration() {
        return signupExpiration;
    }

    @JsonProperty("signup_expiration")
    public void setSignupExpiration(Boolean signupExpiration) {
        this.signupExpiration = signupExpiration;
    }

    @JsonProperty("self")
    public List<Integer> getSelf() {
        return self;
    }

    @JsonProperty("self")
    public void setSelf(List<Integer> self) {
        this.self = self;
    }

    @JsonProperty("message_ids")
    public List<Integer> getMessageIds() {
        return messageIds;
    }

    @JsonProperty("message_ids")
    public void setMessageIds(List<Integer> messageIds) {
        this.messageIds = messageIds;
    }

    @JsonProperty("is_company")
    public Boolean getIsCompany() {
        return isCompany;
    }

    @JsonProperty("is_company")
    public void setIsCompany(Boolean isCompany) {
        this.isCompany = isCompany;
    }

    @JsonProperty("companies_count")
    public Integer getCompaniesCount() {
        return companiesCount;
    }

    @JsonProperty("companies_count")
    public void setCompaniesCount(Integer companiesCount) {
        this.companiesCount = companiesCount;
    }

    @JsonProperty("parent_name")
    public Boolean getParentName() {
        return parentName;
    }

    @JsonProperty("parent_name")
    public void setParentName(Boolean parentName) {
        this.parentName = parentName;
    }

    @JsonProperty("date")
    public Boolean getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Boolean date) {
        this.date = date;
    }

    @JsonProperty("company_type")
    public String getCompanyType() {
        return companyType;
    }

    @JsonProperty("company_type")
    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    @JsonProperty("message_partner_ids")
    public List<Integer> getMessagePartnerIds() {
        return messagePartnerIds;
    }

    @JsonProperty("message_partner_ids")
    public void setMessagePartnerIds(List<Integer> messagePartnerIds) {
        this.messagePartnerIds = messagePartnerIds;
    }

    @JsonProperty("sel_groups_27_28")
    public Integer getSelGroups2728() {
        return selGroups2728;
    }

    @JsonProperty("sel_groups_27_28")
    public void setSelGroups2728(Integer selGroups2728) {
        this.selGroups2728 = selGroups2728;
    }

    @JsonProperty("tz")
    public Boolean getTz() {
        return tz;
    }

    @JsonProperty("tz")
    public void setTz(Boolean tz) {
        this.tz = tz;
    }

    @JsonProperty("sel_groups_19_17_18")
    public Integer getSelGroups191718() {
        return selGroups191718;
    }

    @JsonProperty("sel_groups_19_17_18")
    public void setSelGroups191718(Integer selGroups191718) {
        this.selGroups191718 = selGroups191718;
    }

    @JsonProperty("employee")
    public Boolean getEmployee() {
        return employee;
    }

    @JsonProperty("employee")
    public void setEmployee(Boolean employee) {
        this.employee = employee;
    }

    @JsonProperty("partner_share")
    public Boolean getPartnerShare() {
        return partnerShare;
    }

    @JsonProperty("partner_share")
    public void setPartnerShare(Boolean partnerShare) {
        this.partnerShare = partnerShare;
    }

    @JsonProperty("task_count")
    public Integer getTaskCount() {
        return taskCount;
    }

    @JsonProperty("task_count")
    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    @JsonProperty("ref")
    public Boolean getRef() {
        return ref;
    }

    @JsonProperty("ref")
    public void setRef(Boolean ref) {
        this.ref = ref;
    }

    @JsonProperty("activity_ids")
    public List<Object> getActivityIds() {
        return activityIds;
    }

    @JsonProperty("activity_ids")
    public void setActivityIds(List<Object> activityIds) {
        this.activityIds = activityIds;
    }

    @JsonProperty("tz_offset")
    public String getTzOffset() {
        return tzOffset;
    }

    @JsonProperty("tz_offset")
    public void setTzOffset(String tzOffset) {
        this.tzOffset = tzOffset;
    }

    @JsonProperty("commercial_company_name")
    public Boolean getCommercialCompanyName() {
        return commercialCompanyName;
    }

    @JsonProperty("commercial_company_name")
    public void setCommercialCompanyName(Boolean commercialCompanyName) {
        this.commercialCompanyName = commercialCompanyName;
    }

    @JsonProperty("function")
    public Boolean getFunction() {
        return function;
    }

    @JsonProperty("function")
    public void setFunction(Boolean function) {
        this.function = function;
    }

    @JsonProperty("create_date")
    public String getCreateDate() {
        return createDate;
    }

    @JsonProperty("create_date")
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    @JsonProperty("barcode")
    public Boolean getBarcode() {
        return barcode;
    }

    @JsonProperty("barcode")
    public void setBarcode(Boolean barcode) {
        this.barcode = barcode;
    }

    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    @JsonProperty("__last_update")
    public String getLastUpdate() {
        return lastUpdate;
    }

    @JsonProperty("__last_update")
    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @JsonProperty("employee_ids")
    public List<Integer> getEmployeeIds() {
        return employeeIds;
    }

    @JsonProperty("employee_ids")
    public void setEmployeeIds(List<Integer> employeeIds) {
        this.employeeIds = employeeIds;
    }

    @JsonProperty("activity_user_id")
    public Boolean getActivityUserId() {
        return activityUserId;
    }

    @JsonProperty("activity_user_id")
    public void setActivityUserId(Boolean activityUserId) {
        this.activityUserId = activityUserId;
    }

    @JsonProperty("message_follower_ids")
    public List<Integer> getMessageFollowerIds() {
        return messageFollowerIds;
    }

    @JsonProperty("message_follower_ids")
    public void setMessageFollowerIds(List<Integer> messageFollowerIds) {
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

    @JsonProperty("sel_groups_11_12")
    public Integer getSelGroups1112() {
        return selGroups1112;
    }

    @JsonProperty("sel_groups_11_12")
    public void setSelGroups1112(Integer selGroups1112) {
        this.selGroups1112 = selGroups1112;
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
    public List<Object> getWebsiteMessageIds() {
        return websiteMessageIds;
    }

    @JsonProperty("website_message_ids")
    public void setWebsiteMessageIds(List<Object> websiteMessageIds) {
        this.websiteMessageIds = websiteMessageIds;
    }

    @JsonProperty("website_id")
    public Boolean getWebsiteId() {
        return websiteId;
    }

    @JsonProperty("website_id")
    public void setWebsiteId(Boolean websiteId) {
        this.websiteId = websiteId;
    }

    @JsonProperty("industry_id")
    public Boolean getIndustryId() {
        return industryId;
    }

    @JsonProperty("industry_id")
    public void setIndustryId(Boolean industryId) {
        this.industryId = industryId;
    }

    @JsonProperty("write_uid")
    public List<Integer> getWriteUid() {
        return writeUid;
    }

    @JsonProperty("write_uid")
    public void setWriteUid(List<Integer> writeUid) {
        this.writeUid = writeUid;
    }

    @JsonProperty("color")
    public Integer getColor() {
        return color;
    }

    @JsonProperty("color")
    public void setColor(Integer color) {
        this.color = color;
    }

    @JsonProperty("in_group_6")
    public Boolean getInGroup6() {
        return inGroup6;
    }

    @JsonProperty("in_group_6")
    public void setInGroup6(Boolean inGroup6) {
        this.inGroup6 = inGroup6;
    }

    @JsonProperty("in_group_7")
    public Boolean getInGroup7() {
        return inGroup7;
    }

    @JsonProperty("in_group_7")
    public void setInGroup7(Boolean inGroup7) {
        this.inGroup7 = inGroup7;
    }

    @JsonProperty("in_group_8")
    public Boolean getInGroup8() {
        return inGroup8;
    }

    @JsonProperty("in_group_8")
    public void setInGroup8(Boolean inGroup8) {
        this.inGroup8 = inGroup8;
    }

    @JsonProperty("title")
    public Boolean getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Boolean title) {
        this.title = title;
    }

    @JsonProperty("in_group_4")
    public Boolean getInGroup4() {
        return inGroup4;
    }

    @JsonProperty("in_group_4")
    public void setInGroup4(Boolean inGroup4) {
        this.inGroup4 = inGroup4;
    }

    @JsonProperty("groups_id")
    public List<Integer> getGroupsId() {
        return groupsId;
    }

    @JsonProperty("groups_id")
    public void setGroupsId(List<Integer> groupsId) {
        this.groupsId = groupsId;
    }

    @JsonProperty("in_group_5")
    public Boolean getInGroup5() {
        return inGroup5;
    }

    @JsonProperty("in_group_5")
    public void setInGroup5(Boolean inGroup5) {
        this.inGroup5 = inGroup5;
    }

    @JsonProperty("message_unread")
    public Boolean getMessageUnread() {
        return messageUnread;
    }

    @JsonProperty("message_unread")
    public void setMessageUnread(Boolean messageUnread) {
        this.messageUnread = messageUnread;
    }

    @JsonProperty("partner_id")
    public List<Integer> getPartnerId() {
        return partnerId;
    }

    @JsonProperty("partner_id")
    public void setPartnerId(List<Integer> partnerId) {
        this.partnerId = partnerId;
    }

    @JsonProperty("street")
    public Boolean getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(Boolean street) {
        this.street = street;
    }

    @JsonProperty("partner_gid")
    public Integer getPartnerGid() {
        return partnerGid;
    }

    @JsonProperty("partner_gid")
    public void setPartnerGid(Integer partnerGid) {
        this.partnerGid = partnerGid;
    }

    @JsonProperty("credit_limit")
    public Double getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("credit_limit")
    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("lang")
    public String getLang() {
        return lang;
    }

    @JsonProperty("lang")
    public void setLang(String lang) {
        this.lang = lang;
    }

    @JsonProperty("contact_address")
    public String getContactAddress() {
        return contactAddress;
    }

    @JsonProperty("contact_address")
    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    @JsonProperty("email_formatted")
    public String getEmailFormatted() {
        return emailFormatted;
    }

    @JsonProperty("email_formatted")
    public void setEmailFormatted(String emailFormatted) {
        this.emailFormatted = emailFormatted;
    }

    @JsonProperty("mobile")
    public Boolean getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(Boolean mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("signup_valid")
    public Boolean getSignupValid() {
        return signupValid;
    }

    @JsonProperty("signup_valid")
    public void setSignupValid(Boolean signupValid) {
        this.signupValid = signupValid;
    }

    @JsonProperty("signup_type")
    public Boolean getSignupType() {
        return signupType;
    }

    @JsonProperty("signup_type")
    public void setSignupType(Boolean signupType) {
        this.signupType = signupType;
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

    @JsonProperty("ocn_token")
    public Boolean getOcnToken() {
        return ocnToken;
    }

    @JsonProperty("ocn_token")
    public void setOcnToken(Boolean ocnToken) {
        this.ocnToken = ocnToken;
    }

    @JsonProperty("message_needaction")
    public Boolean getMessageNeedaction() {
        return messageNeedaction;
    }

    @JsonProperty("message_needaction")
    public void setMessageNeedaction(Boolean messageNeedaction) {
        this.messageNeedaction = messageNeedaction;
    }

    @JsonProperty("signup_token")
    public Boolean getSignupToken() {
        return signupToken;
    }

    @JsonProperty("signup_token")
    public void setSignupToken(Boolean signupToken) {
        this.signupToken = signupToken;
    }

    @JsonProperty("activity_summary")
    public Boolean getActivitySummary() {
        return activitySummary;
    }

    @JsonProperty("activity_summary")
    public void setActivitySummary(Boolean activitySummary) {
        this.activitySummary = activitySummary;
    }

    @JsonProperty("message_needaction_counter")
    public Integer getMessageNeedactionCounter() {
        return messageNeedactionCounter;
    }

    @JsonProperty("message_needaction_counter")
    public void setMessageNeedactionCounter(Integer messageNeedactionCounter) {
        this.messageNeedactionCounter = messageNeedactionCounter;
    }

    @JsonProperty("new_password")
    public String getNewPassword() {
        return newPassword;
    }

    @JsonProperty("new_password")
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @JsonProperty("comment")
    public Boolean getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Boolean comment) {
        this.comment = comment;
    }

    @JsonProperty("customer")
    public Boolean getCustomer() {
        return customer;
    }

    @JsonProperty("customer")
    public void setCustomer(Boolean customer) {
        this.customer = customer;
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
