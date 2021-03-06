package com.h3bpm.web.vo.query;

import com.h3bpm.web.vo.ReqListKnowledgePageVo;

@SuppressWarnings("deprecation")
public class QueryMyKnowledgeList extends ReqListKnowledgePageVo {
	private String queryUserId = null; // 当前查询的用户ID

	public QueryMyKnowledgeList(ReqListKnowledgePageVo voBean){
		this.setsEcho(voBean.getsEcho());
		this.setiDisplayStart(voBean.getiDisplayStart());
		this.setiDisplayLength(voBean.getiDisplayLength());
		this.setFlowCodes(voBean.getFlowCodes());
		this.setName(voBean.getName());
		this.setTagName(voBean.getTagName());
		this.setStartTimeStart(voBean.getStartTimeStart());
		this.setStartTimeEnd(voBean.getStartTimeEnd());
		this.setEndTimeStart(voBean.getEndTimeStart());
		this.setEndTimeEnd(voBean.getEndTimeEnd());
	}

	public String getQueryUserId() {
		return queryUserId;
	}

	public void setQueryUserId(String queryUserId) {
		this.queryUserId = queryUserId;
	}
}
