package com.niit.biz;

import java.util.List;

import com.niit.entity.Questions;

public interface IQuestionBiz {
//	1:��Ӳ���
	public void save(Questions w);
//	2:���²���
	public void update(Questions w);
//	3:ɾ������
	public void delete(Integer q_id);
//	4:��ѯ����
	public List<Questions> findAll();
//	5:����ID��ѯ
	public Questions findById(Integer id);
	
	public List<Questions> findBywid(Integer w_id);
	
	

}
