package demo.user;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 车队实体
 * @author 
 * @generated
 */
@Entity(id = "entity:demo.user.fleet", table = "CAFLEET", ds = "oracledb")
public class Fleet implements Serializable {
	private static final long serialVersionUID = 1632501228535808L;
	@Column(id = "lineid", type = ColumnType.increment, datatype = "int")
	private java.lang.Integer lineid;

	@Column(id = "fleetno", datatype = "string10")
	private java.lang.String fleetno;

	@Column(id = "fleetname", datatype = "string128")
	private java.lang.String fleetname;

	@Column(id = "fleettype", datatype = "bigdouble")
	private java.lang.Double fleettype;

	@Column(id = "contact", datatype = "string32")
	private java.lang.String contact;

	@Column(id = "tel", datatype = "string32")
	private java.lang.String tel;

	@Column(id = "cityname", datatype = "string512")
	private java.lang.String cityname;

	@Column(id = "memo", datatype = "string128")
	private java.lang.String memo;

	@Column(id = "dtdate", datatype = "date")
	private java.sql.Date dtdate;

	@Column(id = "userno", datatype = "string32")
	private java.lang.String userno;

	@Column(id = "active", datatype = "bigdouble")
	private java.lang.Double active;

	@Column(id = "bankname", datatype = "string512")
	private java.lang.String bankname;

	@Column(id = "bankbillno", datatype = "string512")
	private java.lang.String bankbillno;

	@Column(id = "invoicecompany", datatype = "string512")
	private java.lang.String invoicecompany;

	/**
	 * 设置${field.desc}
	 */
	public void setLineid(java.lang.Integer lineid) {
		this.lineid = lineid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Integer getLineid() {
		return lineid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setFleetno(java.lang.String fleetno) {
		this.fleetno = fleetno;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getFleetno() {
		return fleetno;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setFleetname(java.lang.String fleetname) {
		this.fleetname = fleetname;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getFleetname() {
		return fleetname;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setFleettype(java.lang.Double fleettype) {
		this.fleettype = fleettype;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getFleettype() {
		return fleettype;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setContact(java.lang.String contact) {
		this.contact = contact;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getContact() {
		return contact;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setTel(java.lang.String tel) {
		this.tel = tel;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getTel() {
		return tel;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setCityname(java.lang.String cityname) {
		this.cityname = cityname;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getCityname() {
		return cityname;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setMemo(java.lang.String memo) {
		this.memo = memo;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getMemo() {
		return memo;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setDtdate(java.sql.Date dtdate) {
		this.dtdate = dtdate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getDtdate() {
		return dtdate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setUserno(java.lang.String userno) {
		this.userno = userno;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getUserno() {
		return userno;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setActive(java.lang.Double active) {
		this.active = active;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getActive() {
		return active;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setBankname(java.lang.String bankname) {
		this.bankname = bankname;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getBankname() {
		return bankname;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setBankbillno(java.lang.String bankbillno) {
		this.bankbillno = bankbillno;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getBankbillno() {
		return bankbillno;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setInvoicecompany(java.lang.String invoicecompany) {
		this.invoicecompany = invoicecompany;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getInvoicecompany() {
		return invoicecompany;
	}
}
