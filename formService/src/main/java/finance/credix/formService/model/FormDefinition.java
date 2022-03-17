package finance.credix.formService.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

@Entity
public class FormDefinition extends BaseEntity {
	private static final long serialVersionUID = -4743992746358200029L;

	@Column(name = "name")
	private String name;
//	@JsonIgnore
	@OneToMany(mappedBy = "form", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<FormField> fields;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<FormField> getFields() {
		return fields;
	}

	public void setFields(Set<FormField> fields) {
		this.fields = fields;
	}

}
