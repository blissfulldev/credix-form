package finance.credix.formService.response;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.OffsetDateTime;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FormDefinitionResponse {
	String title;
    String description;
    Integer priority;
    OffsetDateTime startDate;
    OffsetDateTime dueDate;
    String category;
    boolean completed;
    String externalLink;
    boolean notifyOnLocation;
}
