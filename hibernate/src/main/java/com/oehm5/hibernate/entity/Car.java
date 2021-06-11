package com.oehm5.hibernate.entity;

public class Car {
	package com.javacodegeeks.example;

	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.Id;


	@Entity
	public class Car implements Serializable {
		
		private static final long serialVersionUID = 1L;
		
		@Id
		private String model;
		private String price;
		
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		
	
}
