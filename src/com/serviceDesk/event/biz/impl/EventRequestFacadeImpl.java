package com.serviceDesk.event.biz.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.serviceDesk.event.biz.EventRequestFacade;
import com.serviceDesk.event.dao.impl.TEventRequestDAO;
import com.serviceDesk.event.domain.TEventRequest;
import com.serviceDesk.event.form.TEventRequestForm;

public class EventRequestFacadeImpl implements EventRequestFacade {

	private static final Log log = LogFactory.getLog(EventRequestFacadeImpl.class);
	private TEventRequestDAO eventRequestDAO;
	
	public void saveOrUpdate(TEventRequest eventRequest) throws Exception {
		// TODO Auto-generated method stub

	}

	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub

	}

	public TEventRequest getById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.eventRequestDAO.findById(id);
	}

	public List<TEventRequestForm> findList(int pageSize, int pageIndex)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public TEventRequestDAO getEventRequestDAO() {
		return eventRequestDAO;
	}

	public void setEventRequestDAO(TEventRequestDAO eventRequestDAO) {
		this.eventRequestDAO = eventRequestDAO;
	}

}
