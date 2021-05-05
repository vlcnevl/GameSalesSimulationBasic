package SalesSimulation.entities.concretes;

import java.util.Date;

import SalesSimulation.core.entities.Entity;

public class Campaign implements Entity{
	private int id;
	private String description;
	private int discountPercent;
	private Date finishDate;
	public Campaign() {
		
	}
	
	public Campaign(int id, String description, int discountPercent,Date finishDate) {
		super();
		this.id = id;
		this.description = description;
		this.discountPercent = discountPercent;
		this.finishDate = finishDate;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(int discountPercent) {
		this.discountPercent = discountPercent;
	}

	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	

}
