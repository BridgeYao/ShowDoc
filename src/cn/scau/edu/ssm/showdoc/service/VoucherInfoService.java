package cn.scau.edu.ssm.showdoc.service;

import cn.scau.edu.ssm.showdoc.po.VoucherVO;

public interface VoucherInfoService {
	
	public Integer insertVoucherInfo(VoucherVO voucherVO) throws Exception;
	
	public Integer queryVoucherByName(String username) throws Exception;
}