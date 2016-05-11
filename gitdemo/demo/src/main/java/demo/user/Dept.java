package demo.user;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 部门
 * @author 
 * @generated
 */
@Entity(id = "entity:demo.user.dept", table = "SMDEPT", ds = "oracledb")
public class Dept implements Serializable {
	private static final long serialVersionUID = 1625502913282048L;
	@Column(id = "ilineid", type = ColumnType.increment, datatype = "bigdouble")
	private java.lang.Double ilineid;

	@Column(id = "vcdeptname", datatype = "string64")
	private java.lang.String vcdeptname;

	@Column(id = "vctel", datatype = "string64")
	private java.lang.String vctel;

	@Column(id = "bactive", datatype = "bigdouble")
	private java.lang.Double bactive;

	@Column(id = "vcuserno", datatype = "string32")
	private java.lang.String vcuserno;

	@Column(id = "dtdate", datatype = "date")
	private java.sql.Date dtdate;

	/**
	 * 设置${field.desc}
	 */
	public void setIlineid(java.lang.Double ilineid) {
		this.ilineid = ilineid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIlineid() {
		return ilineid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setVcdeptname(java.lang.String vcdeptname) {
		this.vcdeptname = vcdeptname;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getVcdeptname() {
		return vcdeptname;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setVctel(java.lang.String vctel) {
		this.vctel = vctel;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getVctel() {
		return vctel;
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
	public void setVcuserno(java.lang.String vcuserno) {
		this.vcuserno = vcuserno;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getVcuserno() {
		return vcuserno;
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
