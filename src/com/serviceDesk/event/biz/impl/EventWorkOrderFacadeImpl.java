package com.serviceDesk.event.biz.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.common.dao.impl.BaseDAO;
import com.serviceDesk.common.util.ClassCastUtil;
import com.serviceDesk.common.util.DateFilter;
import com.serviceDesk.event.biz.EventWorkOrderFacade;
import com.serviceDesk.event.dao.impl.TEventWorkOrderDAO;
import com.serviceDesk.event.domain.TEventWorkOrder;
import com.serviceDesk.event.form.TEventWorkOrderForm;

public class EventWorkOrderFacadeImpl implements EventWorkOrderFacade {

	private static final Log log = LogFactory.getLog(EventWorkOrderFacadeImpl.class);
	private TEventWorkOrderDAO eventWorkOrderDAO;
	private BaseDAO baseDao;

	public void saveOrUpdate(TEventWorkOrder eventWorkOrder) throws Exception {
		if(eventWorkOrder!=null){
			this.eventWorkOrderDAO.save(eventWorkOrder);
		}else{
			if(log.isErrorEnabled())
				log.error("工单对象为空");
		}
	}

	public void deleteById(Integer id) throws Exception {
	}

	public TEventWorkOrder getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TEventWorkOrderForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<TEventWorkOrderForm> findByDevAssetsId(String devAssetsId)
			throws Exception {

		StringBuilder sql = new StringBuilder("");
		List<Object> args = new ArrayList<Object>();

		//通过组织id查询建筑信息
		sql.append("SELECT ER.EVENT_TYPE, ER.EVENT_LEVEL, ER.DESCRIPTION, ER.EVENT_STATUS, ER.REQUEST_TIME, ER.SOLVE_TIME, ");
		sql.append(" EWO.EVENT_WORK_ORDER_ID, EWO.SERVICE_RECORD ");
		sql.append(" FROM T_EVENT_REQUEST ER, T_EVENT_WORK_ORDER EWO ");
		sql.append(" WHERE ER.EVENT_REQUEST_ID = EWO.EVENT_REQUEST_ID ");

		//组织机构代码
		if(devAssetsId!=null && !"".equals(devAssetsId.trim())){
			sql.append(" AND ER.DEVICE_ASSET_ID = ?");
			args.add(devAssetsId);
		}else{
			return null;
		}

		List<Object[]> list = this.baseDao.findListBySql(sql.toString(), args);	
		List<TEventWorkOrderForm> tEventWorkOrderFormList = getNewList(list); 

		return tEventWorkOrderFormList;
	}
	
	public List<TEventWorkOrder> findByEventRequestId(Integer eventRequestId) throws Exception{
		return this.eventWorkOrderDAO.findByProperty("eventRequestId", eventRequestId);
	}

	private List<TEventWorkOrderForm> getNewList(List<Object[]> list) throws Exception{
		List<TEventWorkOrderForm> newList = new ArrayList<TEventWorkOrderForm>();

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				Object[] obj = list.get(i);
				TEventWorkOrderForm tEventWorkOrderForm = new TEventWorkOrderForm();
				
				tEventWorkOrderForm.setEventType(ClassCastUtil.transString(obj[0]));
				tEventWorkOrderForm.setEventLevel(ClassCastUtil.transString(obj[1]));
				tEventWorkOrderForm.setDescription(ClassCastUtil.transString(obj[2]));
				tEventWorkOrderForm.setEventStatus(ClassCastUtil.transString(obj[3]));
				tEventWorkOrderForm.setRequestTime(DateFilter.str2SQLDateTime(ClassCastUtil.transString(obj[4])));
				tEventWorkOrderForm.setSolveTime(DateFilter.str2SQLDateTime(ClassCastUtil.transString(obj[5])));
				if(ClassCastUtil.transString(obj[6])!=null && !"".equals(ClassCastUtil.transString(obj[6]))){
					tEventWorkOrderForm.setEventWorkOrderId(Integer.valueOf(obj[6].toString()));
				}
				tEventWorkOrderForm.setServiceRecord(ClassCastUtil.transString(obj[7]));
				
				newList.add(tEventWorkOrderForm);
			}
		}
		return newList;
	}

	public TEventWorkOrderDAO getEventWorkOrderDAO() {
		return eventWorkOrderDAO;
	}

	public void setEventWorkOrderDAO(TEventWorkOrderDAO eventWorkOrderDAO) {
		this.eventWorkOrderDAO = eventWorkOrderDAO;
	}

	public BaseDAO getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDAO baseDao) {
		this.baseDao = baseDao;
	}

}
