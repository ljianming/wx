package cn.bean;

public class BaseMessage {
	
		private String ToUserName;
		private String FromUserName;
		private String CreateTime;
		private String MsgType;

		public BaseMessage() {
			super();
		}
		public BaseMessage(String toUserName, String fromUserName, String createTime, String msgType) {
			super();
			ToUserName = toUserName;
			FromUserName = fromUserName;
			CreateTime = createTime;
			MsgType = msgType;
		}
		public String getToUserName() {
			return ToUserName;
		}
		public void setToUserName(String toUserName) {
			ToUserName = toUserName;
		}

		public String getFromUserName() {
			return FromUserName;
		}

		public void setFromUserName(String fromUserName) {
			FromUserName = fromUserName;
		}

		public String getCreateTime() {
			return CreateTime;
		}

		public void setCreateTime(String createTime) {
			CreateTime = createTime;
		}

		public String getMsgType() {
			return MsgType;
		}

		public void setMsgType(String msgType) {
			MsgType = msgType;
		}

		@Override
		public String toString() {
			return "BaseMessage [ToUserName=" + ToUserName + ", FromUserName=" + FromUserName + ", CreateTime=" + CreateTime
					+ ", MsgType=" + MsgType + "]";
		}

	}

