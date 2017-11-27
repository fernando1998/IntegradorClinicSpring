package com.tecsup.integrador.model;

public class UserApi {

		private Long id;
	    private String username;
	    private String password;
	    private String type;
	    private String reg_date;
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getReg_date() {
			return reg_date;
		}
		public void setReg_date(String reg_date) {
			this.reg_date = reg_date;
		}
		@Override
		public String toString() {
			return "UserApi [id=" + id + ", username=" + username + ", password=" + password + ", type=" + type
					+ ", reg_date=" + reg_date + "]";
		}
	    
	    
	    
	    
	    
	    
}


