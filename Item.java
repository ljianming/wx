package cn.bean;

public class Item {
	private String Title;// 是 图文消息标题
	private String Description;// 是 图文消息描述
	private String PicUrl;// 是 图片链接，支持JPG、PNG格式，较好的效果为大图360*200，小图200*200
	private String Url;// 是 点击图文消息跳转链接

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(String title, String description, String picUrl, String url) {
		super();
		Title = title;
		Description = description;
		PicUrl = picUrl;
		Url = url;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	@Override
	public String toString() {
		return "Item [Title=" + Title + ", Description=" + Description + ", PicUrl=" + PicUrl + ", Url=" + Url + "]";
	}

}

