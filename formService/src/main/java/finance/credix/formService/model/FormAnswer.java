package finance.credix.formService.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FormAnswer extends BaseEntity{
	private static final long serialVersionUID = -1063511812160027676L;
	@OneToOne
	private FormDefinition form;
	
	@OneToMany(mappedBy = "formAnswer", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<FormInput> answers;
}
