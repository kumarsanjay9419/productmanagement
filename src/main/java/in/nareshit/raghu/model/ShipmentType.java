package in.nareshit.raghu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="shipment_type_tab")
public class ShipmentType {
	@Id
	@GeneratedValue
	@Column(name="ship_id_col")
	private Integer id;
	@Column(name="ship_mode_col")
	private  String shipModel;
	@Column(name="ship_code_col")
	private  String shipCode;
	@Column(name="ship_enable_col")
	private  String enableShip;
	@Column(name="ship_grade_col")
	private  String shipGrade;
	@Column(name="ship_desc_col")
	private  String shipDesc;

}
