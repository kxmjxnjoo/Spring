package ezen.student.dto;

public class DataBaseConnectionInfo {

	private String url;
	private String Id; //다른 이용자도 사용하기 위해 scott이라는 이용자를 지정하지 않음
	private String pw;
	private String driver;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getId() {
		return Id;
	}
	public void setId(String useId) {
		this.Id = useId;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
}