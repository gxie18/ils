package demo.user;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 司机实体
 * @author 
 * @generated
 */
@Entity(id = "entity:demo.user.driver", table = "CADRIVER", ds = "oracledb")
public class Driver implements Serializable {
	private static final long serialVersionUID = 1632500487159808L;
	/**
	 *主键
	 */
	@Column(id = "lineid", type = ColumnType.increment, datatype = "int")
	private java.lang.Integer lineid;

	/**
	 *
	 */
	@Column(id = "fleetid", datatype = "bigdouble")
	private java.lang.Double fleetid;

	/**
	 *编号
	 */
	@Column(id = "driverno", datatype = "string10")
	private java.lang.String driverno;

	/**
	 *驾驶证号
	 */
	@Column(id = "driverlicense", datatype = "string32")
	private java.lang.String driverlicense;

	/**
	 *姓名
	 */
	@Column(id = "drivername", datatype = "string10")
	private java.lang.String drivername;

	/**
	 *身份证号
	 */
	@Column(id = "cardno", datatype = "string20")
	private java.lang.String cardno;

	/**
	 *家庭地址
	 */
	@Column(id = "homeaddress", datatype = "string256")
	private java.lang.String homeaddress;

	/**
	 *
	 */
	@Column(id = "issuingorg", datatype = "string256")
	private java.lang.String issuingorg;

	@Column(id = "getcarddate", datatype = "date")
	private java.sql.Date getcarddate;

	@Column(id = "mobile", datatype = "string32")
	private java.lang.String mobile;

	@Column(id = "hometel", datatype = "string32")
	private java.lang.String hometel;

	@Column(id = "contact", datatype = "string32")
	private java.lang.String contact;

	@Column(id = "tel", datatype = "string32")
	private java.lang.String tel;

	@Column(id = "relationship", datatype = "string32")
	private java.lang.String relationship;

	@Column(id = "memo", datatype = "string256")
	private java.lang.String memo;

	@Column(id = "drivertype", datatype = "bigdouble")
	private java.lang.Double drivertype;

	@Column(id = "dtdate", datatype = "date")
	private java.sql.Date dtdate;

	@Column(id = "userno", datatype = "string32")
	private java.lang.String userno;

	@Column(id = "active", datatype = "bigdouble")
	private java.lang.Double active;

	@Column(id = "locationdate", datatype = "date")
	private java.sql.Date locationdate;

	@Column(id = "province", datatype = "string32")
	private java.lang.String province;

	@Column(id = "city", datatype = "string32")
	private java.lang.String city;

	@Column(id = "address", datatype = "string512")
	private java.lang.String address;

	@Column(id = "locationmemo", datatype = "string512")
	private java.lang.String locationmemo;

	/**
	 * 设置主键
	 */
	public void setLineid(java.lang.Integer lineid) {
		this.lineid = lineid;
	}

	/**
	 * 获取主键
	 */
	public java.lang.Integer getLineid() {
		return lineid;
	}

	/**
	 * 设置
	 */
	public void setFleetid(java.lang.Double fleetid) {
		this.fleetid = fleetid;
	}

	/**
	 * 获取
	 */
	public java.lang.Double getFleetid() {
		return fleetid;
	}

	/**
	 * 设置编号
	 */
	public void setDriverno(java.lang.String driverno) {
		this.driverno = driverno;
	}

	/**
	 * 获取编号
	 */
	public java.lang.String getDriverno() {
		return driverno;
	}

	/**
	 * 设置驾驶证号
	 */
	public void setDriverlicense(java.lang.String driverlicense) {
		this.driverlicense = driverlicense;
	}

	/**
	 * 获取驾驶证号
	 */
	public java.lang.String getDriverlicense() {
		return driverlicense;
	}

	/**
	 * 设置姓名
	 */
	public void setDrivername(java.lang.String drivername) {
		this.drivername = drivername;
	}

	/**
	 * 获取姓名
	 */
	public java.lang.String getDrivername() {
		return drivername;
	}

	/**
	 * 设置身份证号
	 */
	public void setCardno(java.lang.String cardno) {
		this.cardno = cardno;
	}

	/**
	 * 获取身份证号
	 */
	public java.lang.String getCardno() {
		return cardno;
	}

	/**
	 * 设置家庭地址
	 */
	public void setHomeaddress(java.lang.String homeaddress) {
		this.homeaddress = homeaddress;
	}

	/**
	 * 获取家庭地址
	 */
	public java.lang.String getHomeaddress() {
		return homeaddress;
	}

	/**
	 * 设置
	 */
	public void setIssuingorg(java.lang.String issuingorg) {
		this.issuingorg = issuingorg;
	}

	/**
	 * 获取
	 */
	public java.lang.String getIssuingorg() {
		return issuingorg;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setGetcarddate(java.sql.Date getcarddate) {
		this.getcarddate = getcarddate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getGetcarddate() {
		return getcarddate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setMobile(java.lang.String mobile) {
		this.mobile = mobile;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getMobile() {
		return mobile;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setHometel(java.lang.String hometel) {
		this.hometel = hometel;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getHometel() {
		return hometel;
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
	public void setRelationship(java.lang.String relationship) {
		this.relationship = relationship;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getRelationship() {
		return relationship;
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
	public void setDrivertype(java.lang.Double drivertype) {
		this.drivertype = drivertype;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getDrivertype() {
		return drivertype;
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
	public void setLocationdate(java.sql.Date locationdate) {
		this.locationdate = locationdate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getLocationdate() {
		return locationdate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setProvince(java.lang.String province) {
		this.province = province;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getProvince() {
		return province;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setCity(java.lang.String city) {
		this.city = city;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getCity() {
		return city;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setAddress(java.lang.String address) {
		this.address = address;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getAddress() {
		return address;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setLocationmemo(java.lang.String locationmemo) {
		this.locationmemo = locationmemo;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getLocationmemo() {
		return locationmemo;
	}
}
