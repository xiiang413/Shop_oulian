package tst.project.bean.system;

public class DetailBean {
	private int detail_id;
	private String name;
	private String is_visible;
	private String detail_type;
	private String type_name;
	private String role_detail_id;
	private String detail_state;
	private String role_id;
	
	public String getRole_id() {
		return role_id;
	}
	public DetailBean setRole_id(String role_id) {
		this.role_id = role_id;
		return this;
	}
	public String getRole_detail_id() {
		return role_detail_id;
	}
	public DetailBean setRole_detail_id(String role_detail_id) {
		this.role_detail_id = role_detail_id;
		return this;
	}
	public String getDetail_state() {
		return detail_state;
	}
	public DetailBean setDetail_state(String detail_state) {
		this.detail_state = detail_state;
		return this;
	}
	public String getType_name() {
		return type_name;
	}
	public DetailBean setType_name(String type_name) {
		this.type_name = type_name;
		return this;
	}
	public String getDetail_type() {
		return detail_type;
	}
	public DetailBean setDetail_type(String detail_type) {
		this.detail_type = detail_type;
		return this;
	}
	public int getDetail_id() {
		return detail_id;
	}
	public DetailBean setDetail_id(int detail_id) {
		this.detail_id = detail_id;
		return this;
	}
	public String getName() {
		return name;
	}
	public DetailBean setName(String name) {
		this.name = name;
		return this;
	}
	public String getIs_visible() {
		return is_visible;
	}
	public DetailBean setIs_visible(String is_visible) {
		this.is_visible = is_visible;
		return this;
	}

}
