package finance.credix.formService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FormInput extends BaseEntity {
	private static final long serialVersionUID = 2226152618880079772L;
	@OneToOne
	private FormField field;
	@Column(name = "answer")
	private String answer;
	
	@ManyToOne()
	private FormAnswer formAnswer;
}
