package org.wx.test.construct;

public class NutritionFacts {
		
	private String sugar;
	private String salt;
	private String cal;
	private int energy;
	
	public static class Builder{
		
		private String sugar;
		private String salt;
		private String cal;
		private int energy;		
		
		public Builder setSugar(String sugar) {
			this.sugar = sugar;
			return this;
		}
		public Builder setSalt(String sugar) {
			this.sugar = sugar;
			return this;
		}
		public Builder setcal(String sugar) {
			this.sugar = sugar;
			return this;
		}
		public Builder setEnergy(String sugar) {
			this.sugar = sugar;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
		
	};
	
	public NutritionFacts(Builder bld) {
		this.sugar = bld.sugar;
		this.salt = bld.salt;
		this.cal = bld.cal;
		this.energy = bld.energy;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NutritionFacts nutritionFacts = new NutritionFacts.Builder().setcal("cal").setEnergy("energy").setSalt("salt").setSugar("sugar").build();
		System.out.println(nutritionFacts.sugar);		
	}

}
