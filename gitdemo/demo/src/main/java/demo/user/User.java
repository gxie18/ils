package demo.user;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 用户
 * @author 
 * @generated
 */
@Entity(id = "entity:demo.user.user", table = "smuser", ds = "oracledb")
public class User implements Serializable {
	private static final long serialVersionUID = 1625358764802048L;
	/**
	 *
	 */
	@Column(id = "ilineid", type = ColumnType.increment, datatype = "int")
	private java.lang.Integer ilineid;

	/**
	 *用户名
	 */
	@Column(id = "vcuserno", datatype = "string32")
	private java.lang.String vcuserno;

	/**
	 *用户姓名
	 */
	@Column(id = "vcusername", datatype = "string128")
	private java.lang.String vcusername;

	/**
	 *电话
	 */
	@Column(id = "vctel", datatype = "string32")
	private java.lang.String vctel;

	/**
	 *电子邮件
	 */
	@Column(id = "vcemail", datatype = "string64")
	private java.lang.String vcemail;

	/**
	 *手机号
	 */
	@Column(id = "vcmobile", datatype = "string32")
	private java.lang.String vcmobile;

	@Column(id = "vcpassword", datatype = "string128")
	private java.lang.String vcpassword;

	@Column(id = "ideptid", datatype = "bigdouble")
	private java.lang.Double ideptid;

	@Column(id = "badmin", datatype = "bigdouble")
	private java.lang.Double badmin;

	@Column(id = "bactive", datatype = "bigdouble")
	private java.lang.Double bactive;

	@Column(id = "dtlastupdatedate", datatype = "date")
	private java.sql.Date dtlastupdatedate;

	@Column(id = "iroleid", datatype = "bigdouble")
	private java.lang.Double iroleid;

	@Column(id = "iusertype", datatype = "bigdouble")
	private java.lang.Double iusertype;

	@Column(id = "icustomerid", datatype = "bigdouble")
	private java.lang.Double icustomerid;

	@Column(id = "vcuserno2", datatype = "string32")
	private java.lang.String vcuserno2;

	@Column(id = "dtdate", datatype = "date")
	private java.sql.Date dtdate;

	/**
	 * 设置
	 */
	public void setIlineid(java.lang.Integer ilineid) {
		this.ilineid = ilineid;
	}

	/**
	 * 获取
	 */
	public java.lang.Integer getIlineid() {
		return ilineid;
	}

	/**
	 * 设置用户名
	 */
	public void setVcuserno(java.lang.String vcuserno) {
		this.vcuserno = vcuserno;
	}

	/**
	 * 获取用户名
	 */
	public java.lang.String getVcuserno() {
		return vcuserno;
	}

	/**
	 * 设置用户姓名
	 */
	public void setVcusername(java.lang.String vcusername) {
		this.vcusername = vcusername;
	}

	/**
	 * 获取用户姓名
	 */
	public java.lang.String getVcusername() {
		return vcusername;
	}

	/**
	 * 设置电话
	 */
	public void setVctel(java.lang.String vctel) {
		this.vctel = vctel;
	}

	/**
	 * 获取电话
	 */
	public java.lang.String getVctel() {
		return vctel;
	}

	/**
	 * 设置电子邮件
	 */
	public void setVcemail(java.lang.String vcemail) {
		this.vcemail = vcemail;
	}

	/**
	 * 获取电子邮件
	 */
	public java.lang.String getVcemail() {
		return vcemail;
	}

	/**
	 * 设置手机号
	 */
	public void setVcmobile(java.lang.String vcmobile) {
		this.vcmobile = vcmobile;
	}

	/**
	 * 获取手机号
	 */
	public java.lang.String getVcmobile() {
		return vcmobile;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setVcpassword(java.lang.String vcpassword) {
		this.vcpassword = vcpassword;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getVcpassword() {
		return vcpassword;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setIdeptid(java.lang.Double ideptid) {
		this.ideptid = ideptid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIdeptid() {
		return ideptid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setBadmin(java.lang.Double badmin) {
		this.badmin = badmin;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getBadmin() {
		return badmin;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setBactive(java.lang.Double bactive) {
		this.bactive = bactive;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getBactive() {
		return bactive;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setDtlastupdatedate(java.sql.Date dtlastupdatedate) {
		this.dtlastupdatedate = dtlastupdatedate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getDtlastupdatedate() {
		return dtlastupdatedate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setIroleid(java.lang.Double iroleid) {
		this.iroleid = iroleid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIroleid() {
		return iroleid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setIusertype(java.lang.Double iusertype) {
		this.iusertype = iusertype;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIusertype() {
		return iusertype;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setIcustomerid(java.lang.Double icustomerid) {
		this.icustomerid = icustomerid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIcustomerid() {
		return icustomerid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setVcuserno2(java.lang.String vcuserno2) {
		this.vcuserno2 = vcuserno2;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getVcuserno2() {
		return vcuserno2;
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
}
