package com.harish.bindings;

public class CitizenResponse {
	
		private Integer id;
		private String fullName;
		private Long ssn;
		private Integer appNumber;
		private Integer planId;
		
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public Long getSsn() {
			return ssn;
		}
		public void setSsn(Long ssn) {
			this.ssn = ssn;
		}
		public Integer getAppNumber() {
			return appNumber;
		}
		public void setAppNumber(Integer appNumber) {
			this.appNumber = appNumber;
		}
		public Integer getPlanId() {
			return planId;
		}
		public void setPlanId(Integer planId) {
			this.planId = planId;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
	}

