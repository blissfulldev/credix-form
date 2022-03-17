package finance.credix.formService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class FormField extends BaseEntity {
	private static final long serialVersionUID = -8023122772824312457L;
	@Column(name = "label")
	private String label;
	@Column(name = "dataType")
	private String dataType;
	@ManyToOne()
	private FormDefinition form;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public FormDefinition getForm() {
		return form;
	}

	public void setForm(FormDefinition form) {
		this.form = form;
	}

}
