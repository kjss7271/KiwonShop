package com.site.shop.member;

public class MemberVo {

	
	private String m_id;//1
	private String m_pw;//2
	
	private String m_idx;//3
	private String m_name;//4
	private String m_pw_do;//5
	private String m_email;//6
	private String m_email_status;//7
	private String m_address;//8
	private String m_address_detail;//9
	private String m_phone_tel;//10
	private String m_home_tel;//11
	private String m_birth;//12
	private String agree1;//13
	private String agree2;//14
	private String agree3;//15
	private String business;//16
	private String m_email_site;//17
	
	
	
	public MemberVo() {
	}

	
	
	
	
	
	//회원가입
	public String getM_idx() {
		return m_idx;
	}
	public void setM_idx(String m_idx) {
		this.m_idx = m_idx;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_pw_do() {
		return m_pw_do;
	}
	public void setM_pw_do(String m_pw_do) {
		this.m_pw_do = m_pw_do;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	public String getM_email_status() {
		return m_email_status;
	}
	public void setM_email_status(String m_email_status) {
		this.m_email_status = m_email_status;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public String getM_address_detail() {
		return m_address_detail;
	}
	public void setM_address_detail(String m_address_detail) {
		this.m_address_detail = m_address_detail;
	}
	public String getM_phone_tel() {
		return m_phone_tel;
	}
	public void setM_phone_tel(String m_phone_tel) {
		this.m_phone_tel = m_phone_tel;
	}
	public String getM_home_tel() {
		return m_home_tel;
	}
	public void setM_home_tel(String m_home_tel) {
		this.m_home_tel = m_home_tel;
	}
	public String getM_birth() {
		return m_birth;
	}
	public void setM_birth(String m_birth) {
		this.m_birth = m_birth;
	}
	public String getAgree1() {
		return agree1;
	}
	public void setAgree1(String agree1) {
		this.agree1 = agree1;
	}
	public String getAgree2() {
		return agree2;
	}
	public void setAgree2(String agree2) {
		this.agree2 = agree2;
	}
	public String getAgree3() {
		return agree3;
	}
	public void setAgree3(String agree3) {
		this.agree3 = agree3;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getM_email_site() {
		return m_email_site;
	}
	public void setM_email_site(String m_email_site) {
		this.m_email_site = m_email_site;
	}
	//회원가입
	public MemberVo(String m_id, String m_pw, String m_idx, String m_name, String m_pw_do, String m_email,
			String m_email_status, String m_address, String m_address_detail, String m_phone_tel, String m_home_tel,
			String m_birth, String agree1, String agree2, String agree3, String business, String m_email_site) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
		this.m_idx = m_idx;
		this.m_name = m_name;
		this.m_pw_do = m_pw_do;
		this.m_email = m_email;
		this.m_email_status = m_email_status;
		this.m_address = m_address;
		this.m_address_detail = m_address_detail;
		this.m_phone_tel = m_phone_tel;
		this.m_home_tel = m_home_tel;
		this.m_birth = m_birth;
		this.agree1 = agree1;
		this.agree2 = agree2;
		this.agree3 = agree3;
		this.business = business;
		this.m_email_site = m_email_site;
	}






	//로그인
	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_pw() {
		return m_pw;
	}

	public void setM_pw(String m_pw) {
		this.m_pw = m_pw;
	}
	//로그인
	public MemberVo(String m_id, String m_pw) {
		super();
		this.m_id = m_id;
		this.m_pw = m_pw;
	}
	
	

	
	
	
}
