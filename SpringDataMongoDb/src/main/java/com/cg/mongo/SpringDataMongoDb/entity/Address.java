package com.cg.mongo.SpringDataMongoDb.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
	public class Address {
		private String flatNo;
		private String city;
		private String pincode;
		private String state;
		
		public Address() {
		}
		
		public Address(String flatNo, String city, String pincode, String state) {
			super();
			this.flatNo = flatNo;
			this.city = city;
			this.pincode = pincode;
			this.state = state;
		}

		public String getFlatNo() {
			return flatNo;
		}

		public void setFlatNo(String flatNo) {
			this.flatNo = flatNo;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}
		
		@Override
		public String toString() {
			return "Address [flatNo=" + flatNo + ", city=" + city + ", pincode=" + pincode + ", state=" + state + "]";
		}
	
		
	}

