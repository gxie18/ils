package demo.user;

import java.io.Serializable;

import com.chinacreator.c2.annotation.Column;
import com.chinacreator.c2.annotation.ColumnType;
import com.chinacreator.c2.annotation.Entity;

/**
 * 订单实体
 * @author 
 * @generated
 */
@Entity(id = "entity:demo.user.order", table = "ODORDER", ds = "oracledb")
public class Order implements Serializable {
	private static final long serialVersionUID = 1639405777666048L;
	@Column(id = "lineid", type = ColumnType.increment, datatype = "bigdouble")
	private java.lang.Double lineid;

	/**
	 *订单编号
	 */
	@Column(id = "orderno", datatype = "string32")
	private java.lang.String orderno;

	/**
	 *
	 */
	@Column(id = "custshipno", datatype = "string64")
	private java.lang.String custshipno;

	@Column(id = "customerid", datatype = "bigdouble")
	private java.lang.Double customerid;

	@Column(id = "contractid", datatype = "bigdouble")
	private java.lang.Double contractid;

	@Column(id = "userno", datatype = "string32")
	private java.lang.String userno;

	@Column(id = "dtdate", datatype = "date")
	private java.sql.Date dtdate;

	@Column(id = "address", datatype = "string512")
	private java.lang.String address;

	@Column(id = "contact", datatype = "string32")
	private java.lang.String contact;

	@Column(id = "tel", datatype = "string32")
	private java.lang.String tel;

	@Column(id = "address2", datatype = "string512")
	private java.lang.String address2;

	@Column(id = "contact2", datatype = "string32")
	private java.lang.String contact2;

	@Column(id = "tel2", datatype = "string32")
	private java.lang.String tel2;

	@Column(id = "startprovince", datatype = "string64")
	private java.lang.String startprovince;

	@Column(id = "startcityid", datatype = "bigdouble")
	private java.lang.Double startcityid;

	@Column(id = "startcity", datatype = "string64")
	private java.lang.String startcity;

	@Column(id = "endprovince", datatype = "string64")
	private java.lang.String endprovince;

	@Column(id = "endcityid", datatype = "bigdouble")
	private java.lang.Double endcityid;

	@Column(id = "endcity", datatype = "string64")
	private java.lang.String endcity;

	@Column(id = "shipdate", datatype = "date")
	private java.sql.Date shipdate;

	@Column(id = "comedate", datatype = "date")
	private java.sql.Date comedate;

	@Column(id = "urgent", datatype = "bigdouble")
	private java.lang.Double urgent;

	@Column(id = "itemid", datatype = "bigdouble")
	private java.lang.Double itemid;

	@Column(id = "itemno", datatype = "string256")
	private java.lang.String itemno;

	@Column(id = "itemname", datatype = "string256")
	private java.lang.String itemname;

	@Column(id = "unit", datatype = "string32")
	private java.lang.String unit;

	@Column(id = "qty", datatype = "bigdouble")
	private java.lang.Double qty;

	@Column(id = "shipedqty", datatype = "bigdouble")
	private java.lang.Double shipedqty;

	@Column(id = "pid", datatype = "bigdouble")
	private java.lang.Double pid;

	@Column(id = "orderid", datatype = "bigdouble")
	private java.lang.Double orderid;

	@Column(id = "istrans", datatype = "bigdouble")
	private java.lang.Double istrans;

	@Column(id = "transcityname", datatype = "string128")
	private java.lang.String transcityname;

	@Column(id = "memo", datatype = "string512")
	private java.lang.String memo;

	@Column(id = "payid", datatype = "bigdouble")
	private java.lang.Double payid;

	@Column(id = "pay", datatype = "bigdouble")
	private java.lang.Double pay;

	@Column(id = "payed", datatype = "bigdouble")
	private java.lang.Double payed;

	@Column(id = "isclose", datatype = "bigdouble")
	private java.lang.Double isclose;

	@Column(id = "closedate", datatype = "date")
	private java.sql.Date closedate;

	@Column(id = "closeuserno", datatype = "string32")
	private java.lang.String closeuserno;

	@Column(id = "closereason", datatype = "string64")
	private java.lang.String closereason;

	/**
	 * 设置${field.desc}
	 */
	public void setLineid(java.lang.Double lineid) {
		this.lineid = lineid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getLineid() {
		return lineid;
	}

	/**
	 * 设置订单编号
	 */
	public void setOrderno(java.lang.String orderno) {
		this.orderno = orderno;
	}

	/**
	 * 获取订单编号
	 */
	public java.lang.String getOrderno() {
		return orderno;
	}

	/**
	 * 设置
	 */
	public void setCustshipno(java.lang.String custshipno) {
		this.custshipno = custshipno;
	}

	/**
	 * 获取
	 */
	public java.lang.String getCustshipno() {
		return custshipno;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setCustomerid(java.lang.Double customerid) {
		this.customerid = customerid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getCustomerid() {
		return customerid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setContractid(java.lang.Double contractid) {
		this.contractid = contractid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getContractid() {
		return contractid;
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
	public void setAddress2(java.lang.String address2) {
		this.address2 = address2;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getAddress2() {
		return address2;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setContact2(java.lang.String contact2) {
		this.contact2 = contact2;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getContact2() {
		return contact2;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setTel2(java.lang.String tel2) {
		this.tel2 = tel2;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getTel2() {
		return tel2;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setStartprovince(java.lang.String startprovince) {
		this.startprovince = startprovince;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getStartprovince() {
		return startprovince;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setStartcityid(java.lang.Double startcityid) {
		this.startcityid = startcityid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getStartcityid() {
		return startcityid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setStartcity(java.lang.String startcity) {
		this.startcity = startcity;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getStartcity() {
		return startcity;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setEndprovince(java.lang.String endprovince) {
		this.endprovince = endprovince;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getEndprovince() {
		return endprovince;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setEndcityid(java.lang.Double endcityid) {
		this.endcityid = endcityid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getEndcityid() {
		return endcityid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setEndcity(java.lang.String endcity) {
		this.endcity = endcity;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getEndcity() {
		return endcity;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setShipdate(java.sql.Date shipdate) {
		this.shipdate = shipdate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getShipdate() {
		return shipdate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setComedate(java.sql.Date comedate) {
		this.comedate = comedate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getComedate() {
		return comedate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setUrgent(java.lang.Double urgent) {
		this.urgent = urgent;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getUrgent() {
		return urgent;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setItemid(java.lang.Double itemid) {
		this.itemid = itemid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getItemid() {
		return itemid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setItemno(java.lang.String itemno) {
		this.itemno = itemno;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getItemno() {
		return itemno;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setItemname(java.lang.String itemname) {
		this.itemname = itemname;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getItemname() {
		return itemname;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getUnit() {
		return unit;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setQty(java.lang.Double qty) {
		this.qty = qty;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getQty() {
		return qty;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setShipedqty(java.lang.Double shipedqty) {
		this.shipedqty = shipedqty;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getShipedqty() {
		return shipedqty;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setPid(java.lang.Double pid) {
		this.pid = pid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getPid() {
		return pid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setOrderid(java.lang.Double orderid) {
		this.orderid = orderid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getOrderid() {
		return orderid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setIstrans(java.lang.Double istrans) {
		this.istrans = istrans;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIstrans() {
		return istrans;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setTranscityname(java.lang.String transcityname) {
		this.transcityname = transcityname;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getTranscityname() {
		return transcityname;
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
	public void setPayid(java.lang.Double payid) {
		this.payid = payid;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getPayid() {
		return payid;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setPay(java.lang.Double pay) {
		this.pay = pay;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getPay() {
		return pay;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setPayed(java.lang.Double payed) {
		this.payed = payed;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getPayed() {
		return payed;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setIsclose(java.lang.Double isclose) {
		this.isclose = isclose;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.Double getIsclose() {
		return isclose;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setClosedate(java.sql.Date closedate) {
		this.closedate = closedate;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.sql.Date getClosedate() {
		return closedate;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setCloseuserno(java.lang.String closeuserno) {
		this.closeuserno = closeuserno;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getCloseuserno() {
		return closeuserno;
	}

	/**
	 * 设置${field.desc}
	 */
	public void setClosereason(java.lang.String closereason) {
		this.closereason = closereason;
	}

	/**
	 * 获取${field.desc}
	 */
	public java.lang.String getClosereason() {
		return closereason;
	}
}
