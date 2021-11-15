package com.mycompany.myapp.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mycompany.myapp.domain.Message} entity.
 */
public class MessageDTO implements Serializable {

    private String id;

    @NotNull
    private Instant receivedAt;

    @NotNull
    private Long version;

    private String newContent;

    private MessageDTO previousMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Instant getReceivedAt() {
        return receivedAt;
    }

    public void setReceivedAt(Instant receivedAt) {
        this.receivedAt = receivedAt;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent;
    }

    public MessageDTO getPreviousMessage() {
        return previousMessage;
    }

    public void setPreviousMessage(MessageDTO previousMessage) {
        this.previousMessage = previousMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MessageDTO)) {
            return false;
        }

        MessageDTO messageDTO = (MessageDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, messageDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "MessageDTO{" +
            "id='" + getId() + "'" +
            ", receivedAt='" + getReceivedAt() + "'" +
            ", version=" + getVersion() +
            ", newContent='" + getNewContent() + "'" +
            ", previousMessage=" + getPreviousMessage() +
            "}";
    }
}
