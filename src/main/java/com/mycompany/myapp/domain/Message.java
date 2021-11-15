package com.mycompany.myapp.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Instant;
import javax.validation.constraints.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * A Message.
 */
@Document(collection = "message")
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    @NotNull
    @Field("received_at")
    private Instant receivedAt;

    @NotNull
    @Field("version")
    private Long version;

    @Field("new_content")
    private String newContent;

    @DBRef
    @Field("previousMessage")
    private Message previousMessage;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public String getId() {
        return this.id;
    }

    public Message id(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getReceivedAt() {
        return this.receivedAt;
    }

    public Message receivedAt(Instant receivedAt) {
        this.setReceivedAt(receivedAt);
        return this;
    }

    public void setReceivedAt(Instant receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Long getVersion() {
        return this.version;
    }

    public Message version(Long version) {
        this.setVersion(version);
        return this;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getNewContent() {
        return this.newContent;
    }

    public Message newContent(String newContent) {
        this.setNewContent(newContent);
        return this;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    public Message getPreviousMessage() {
        return this.previousMessage;
    }

    public void setPreviousMessage(Message message) {
        this.previousMessage = message;
    }

    public Message previousMessage(Message message) {
        this.setPreviousMessage(message);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Message)) {
            return false;
        }
        return id != null && id.equals(((Message) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Message{" +
            "id=" + getId() +
            ", receivedAt='" + getReceivedAt() + "'" +
            ", version=" + getVersion() +
            ", newContent='" + getNewContent() + "'" +
            "}";
    }
}
