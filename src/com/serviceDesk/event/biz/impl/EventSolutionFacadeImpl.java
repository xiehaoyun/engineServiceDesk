package com.serviceDesk.event.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.dao.impl.BaseDAO;
import com.serviceDesk.common.util.ClassCastUtil;
import com.serviceDesk.common.util.DateFilter;
import com.serviceDesk.event.biz.EventSolutionFacade;
import com.serviceDesk.event.dao.impl.TEventSolutionDAO;
import com.serviceDesk.event.domain.TEventSolution;
import com.serviceDesk.event.form.TEventSolutionForm;

public class EventSolutionFacadeImpl implements EventSolutionFacade {

	private static final Log log = LogFactory.getLog(EventSolutionFacadeImpl.class);
	private TEventSolutionDAO eventSolutionDAO;
	private BaseDAO baseDao;

	public void saveOrUpdate(TEventSolution eventSolution) throws Exception {
		this.eventSolutionDAO.getHibernateTemplate().saveOrUpdate(eventSolution);
	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TEventSolution getById(Integer id) throws Exception {
		return this.eventSolutionDAO.findById(id);
	}

	public List<TEventSolutionForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public  List<TEventSolutionForm> findByKeywords(String keywords)
			throws Exception {

		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();
		String keywordsArray[] ; 
		
		//通过组织id查询建筑信息
		sql.append("SELECT ES.EVENT_SOLUTION_ID, ES.EVENT_REQUEST_ID, ES.EVENT_TYPE, ES.DESCRIPTION, ES.SOLUTION, ES.THUMBS_UP, ");
		sql.append(" ES.THUMBS_DOWN, ES.CREATE_TIME, ES.CREATOR_NAME ");
		sql.append(" FROM T_EVENT_SOLUTION ES ");
		sql.append(" WHERE 1=1");

		//关键字，如果有多个通过空格隔开
		if(keywords!=null && !"".equals(keywords.trim())){
			keywordsArray = keywords.split(" ");
			sql.append("  AND (");
			for(int i=0;i<keywordsArray.length;i++){
				if(i==0){
					//类型
					sql.append(" ES.EVENT_TYPE like ? ");
					args.add("%"+keywordsArray[i]+"%");
					//描述
					sql.append(" OR ES.DESCRIPTION like ? ");
					args.add("%"+keywordsArray[i]+"%");
				}else{
					//类型
					sql.append(" OR ES.EVENT_TYPE like ? ");
					args.add("%"+keywordsArray[i]+"%");
					//描述
					sql.append(" OR ES.DESCRIPTION like ? ");
					args.add("%"+keywordsArray[i]+"%");
				}	
			}
			sql.append(" ) ");
		}else{
			return null;
		}

		List<Object[]> list = this.baseDao.findListBySql(sql.toString(), args);	
		List<TEventSolutionForm> tEventSolutionFormList = getNewList(list); 

		return tEventSolutionFormList;
	}
	
	
	//获得好评，增加该事件解决方案的好评数
	public Integer thumbsUp(Integer eventSolutionId) throws Exception {
		TEventSolution eventSolution = this.getById(eventSolutionId);
		Integer thumbsUp = eventSolution.getThumbsUp();
		if(thumbsUp==null || ("").equals(thumbsUp)){
			thumbsUp=1;
		}else{
			thumbsUp++;
		}
		eventSolution.setThumbsUp(thumbsUp);
		this.saveOrUpdate(eventSolution);
		return thumbsUp;
	}
	
	public Integer thumbsDown(Integer eventSolutionId) throws Exception{
		TEventSolution eventSolution = this.getById(eventSolutionId);
		Integer thumbsDown = eventSolution.getThumbsDown();
		if(thumbsDown==null || ("").equals(thumbsDown)){
			thumbsDown=1;
		}else{
			thumbsDown++;
		}
		eventSolution.setThumbsDown(thumbsDown);
		this.saveOrUpdate(eventSolution);
		return thumbsDown;
	}

	private List<TEventSolutionForm> getNewList(List<Object[]> list) throws Exception{
		List<TEventSolutionForm> newList = new ArrayList<TEventSolutionForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);
				TEventSolutionForm tEventSolutionForm = new TEventSolutionForm();
				
				if(ClassCastUtil.transString(obj[0])!=null && !"".equals(ClassCastUtil.transString(obj[0]))){
					tEventSolutionForm.setEventSolutionId(Integer.valueOf(obj[0].toString()));
				}
				if(ClassCastUtil.transString(obj[1])!=null && !"".equals(ClassCastUtil.transString(obj[1]))){
					tEventSolutionForm.setEventRequestId(Integer.valueOf(obj[1].toString()));
				}
				tEventSolutionForm.setEventType(ClassCastUtil.transString(obj[2]));
				tEventSolutionForm.setDescription(ClassCastUtil.transString(obj[3]));
				tEventSolutionForm.setSolution(ClassCastUtil.transString(obj[4]));
				if(ClassCastUtil.transString(obj[5])!=null && !"".equals(ClassCastUtil.transString(obj[5]))){
					tEventSolutionForm.setThumbsUp(Integer.valueOf(obj[5].toString()));
				}
				if(ClassCastUtil.transString(obj[6])!=null && !"".equals(ClassCastUtil.transString(obj[6]))){
					tEventSolutionForm.setThumbsDown(Integer.valueOf(obj[6].toString()));
				}
				tEventSolutionForm.setCreateTime(DateFilter.str2SQLDateTime(ClassCastUtil.transString(obj[7])));
				tEventSolutionForm.setCreatorName(ClassCastUtil.transString(obj[8]));
				
				newList.add(tEventSolutionForm);
			}
		}
		return newList;
	}
	
	public BaseDAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDAO baseDao) {
		this.baseDao = baseDao;
	}

	public TEventSolutionDAO getEventSolutionDAO() {
		return eventSolutionDAO;
	}

	public void setEventSolutionDAO(TEventSolutionDAO eventSolutionDAO) {
		this.eventSolutionDAO = eventSolutionDAO;
	}

}
