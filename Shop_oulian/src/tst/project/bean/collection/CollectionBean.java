package tst.project.bean.collection;

import tst.project.bean.goods.GoodsBean;
import tst.project.bean.goods.GoodsFindBuyBean;
import tst.project.bean.information.InformationBean;
import tst.project.bean.member.MemberBean;
import tst.project.bean.merchants.MerchantsBean;

public class CollectionBean {
	private int collection_id;
	private String member_id;
	private String relation_id;
	private String collection_type;
	private String is_delete;
	private String create_time;
	private MerchantsBean merchantsBean;
	private GoodsBean goodsBean;
	private InformationBean informationBean;
	private GoodsFindBuyBean findBuyBean;
	private MemberBean memberBean;
	private String goods_name;
	private String company_name;
	

	public String getCompany_name() {
		return company_name;
	}
	public CollectionBean setCompany_name(String companyName) {
		this.company_name = companyName;
		return this;
	}
	public MemberBean getMemberBean() {
		return memberBean;
	}
	public CollectionBean setMemberBean(MemberBean memberBean) {
		this.memberBean = memberBean;
		return this;
	}
	public GoodsFindBuyBean getFindBuyBean() {
		return findBuyBean;
	}
	public CollectionBean setFindBuyBean(GoodsFindBuyBean findBuyBean) {
		this.findBuyBean = findBuyBean;
		return this;
	}
	public String getGoods_name() {
		return goods_name;
	}
	public CollectionBean setGoods_name(String goods_name) {
		this.goods_name = goods_name;
		return this;
	}
	public InformationBean getInformationBean() {
		return informationBean;
	}
	public CollectionBean setInformationBean(InformationBean informationBean) {
		this.informationBean = informationBean;
		return this;
	}
	public GoodsBean getGoodsBean() {
		return goodsBean;
	}
	public CollectionBean setGoodsBean(GoodsBean goodsBean) {
		this.goodsBean = goodsBean;
		return this;
	}
	public MerchantsBean getMerchantsBean() {
		return merchantsBean;
	}
	public CollectionBean setMerchantsBean(MerchantsBean merchantsBean) {
		this.merchantsBean = merchantsBean;
		return this;
	}
	public int getCollection_id() {
		return collection_id;
	}
	public CollectionBean setCollection_id(int collection_id) {
		this.collection_id = collection_id;
		return this;
	}
	public String getMember_id() {
		return member_id;
	}
	public CollectionBean setMember_id(String member_id) {
		this.member_id = member_id;
		return this;
	}
	public String getRelation_id() {
		return relation_id;
	}
	public CollectionBean setRelation_id(String relation_id) {
		this.relation_id = relation_id;
		return this;
	}
	public String getCollection_type() {
		return collection_type;
	}
	public CollectionBean setCollection_type(String collection_type) {
		this.collection_type = collection_type;
		return this;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public CollectionBean setIs_delete(String is_delete) {
		this.is_delete = is_delete;
		return this;
	}
	public String getCreate_time() {
		return create_time;
	}
	public CollectionBean setCreate_time(String create_time) {
		this.create_time = create_time;
		return this;
	}
	
	
}
