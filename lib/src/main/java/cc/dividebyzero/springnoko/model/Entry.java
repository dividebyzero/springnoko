
package cc.dividebyzero.springnoko.model;

import java.io.Serializable;
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
    "id",
    "date",
    "user",
    "billable",
    "minutes",
    "description",
    "project",
    "tags",
    "source_url",
    "invoiced_at",
    "invoice",
    "import",
    "approved_at",
    "approved_by",
    "url",
    "invoiced_outside_of_noko_url",
    "approved_url",
    "unapproved_url",
    "created_at",
    "updated_at"
})
public class Entry implements Serializable
{

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("date")
    private String date;
    @JsonProperty("user")
    private User user;
    @JsonProperty("billable")
    private Boolean billable;
    @JsonProperty("minutes")
    private Integer minutes;
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("tags")
    private List<Tag> tags = null;
    @JsonProperty("source_url")
    private String sourceUrl;
    @JsonProperty("invoiced_at")
    private String invoicedAt;
    @JsonProperty("invoice")
    private Invoice invoice;
    @JsonProperty("import")
    private Import _import;
    @JsonProperty("approved_at")
    private String approvedAt;
    @JsonProperty("approved_by")
    private ApprovedBy approvedBy;
    @JsonProperty("url")
    private String url;
    @JsonProperty("invoiced_outside_of_noko_url")
    private String invoicedOutsideOfNokoUrl;
    @JsonProperty("approved_url")
    private String approvedUrl;
    @JsonProperty("unapproved_url")
    private String unapprovedUrl;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3359045217103115203L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("billable")
    public Boolean isBillable() {
        return billable;
    }

    @JsonProperty("billable")
    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    @JsonProperty("minutes")
    public Integer getMinutes() {
        return minutes;
    }

    @JsonProperty("minutes")
    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @JsonProperty("source_url")
    public String getSourceUrl() {
        return sourceUrl;
    }

    @JsonProperty("source_url")
    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @JsonProperty("invoiced_at")
    public String getInvoicedAt() {
        return invoicedAt;
    }

    @JsonProperty("invoiced_at")
    public void setInvoicedAt(String invoicedAt) {
        this.invoicedAt = invoicedAt;
    }

    @JsonProperty("invoice")
    public Invoice getInvoice() {
        return invoice;
    }

    @JsonProperty("invoice")
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    @JsonProperty("import")
    public Import getImport() {
        return _import;
    }

    @JsonProperty("import")
    public void setImport(Import _import) {
        this._import = _import;
    }

    @JsonProperty("approved_at")
    public String getApprovedAt() {
        return approvedAt;
    }

    @JsonProperty("approved_at")
    public void setApprovedAt(String approvedAt) {
        this.approvedAt = approvedAt;
    }

    @JsonProperty("approved_by")
    public ApprovedBy getApprovedBy() {
        return approvedBy;
    }

    @JsonProperty("approved_by")
    public void setApprovedBy(ApprovedBy approvedBy) {
        this.approvedBy = approvedBy;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("invoiced_outside_of_noko_url")
    public String getInvoicedOutsideOfNokoUrl() {
        return invoicedOutsideOfNokoUrl;
    }

    @JsonProperty("invoiced_outside_of_noko_url")
    public void setInvoicedOutsideOfNokoUrl(String invoicedOutsideOfNokoUrl) {
        this.invoicedOutsideOfNokoUrl = invoicedOutsideOfNokoUrl;
    }

    @JsonProperty("approved_url")
    public String getApprovedUrl() {
        return approvedUrl;
    }

    @JsonProperty("approved_url")
    public void setApprovedUrl(String approvedUrl) {
        this.approvedUrl = approvedUrl;
    }

    @JsonProperty("unapproved_url")
    public String getUnapprovedUrl() {
        return unapprovedUrl;
    }

    @JsonProperty("unapproved_url")
    public void setUnapprovedUrl(String unapprovedUrl) {
        this.unapprovedUrl = unapprovedUrl;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
