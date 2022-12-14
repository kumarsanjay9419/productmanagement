package in.nareshit.raghu.model;


import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="uom_tab")
public class Uom {
	@Id
	@GeneratedValue
	@Column(name="uom_id_col")
	private Integer id;
	
	@Column(name="uom_type_col")
	private String uomType;
	
	@Column(name="uom_mode_col")
	private String uomModel;
	
	@Column(name="uom_desc_col")
	private String uomDesc;

}
