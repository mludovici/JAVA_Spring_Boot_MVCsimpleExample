package myapp.springmvc.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "virus")
@Data
public class Virus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "mortality_rate")
	private float mortalityRate;

	@Column(name = "risk")
	private String risk;

	@Column(name = "year")
	private int year;

	@ManyToOne
	@JoinColumn(name = "treatment_id", nullable = false)
	private Treatment treatment;
}
