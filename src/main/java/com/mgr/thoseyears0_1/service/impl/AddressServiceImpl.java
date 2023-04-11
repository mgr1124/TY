package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.AddressDao;
import com.mgr.thoseyears0_1.domain.Address;
import com.mgr.thoseyears0_1.service.IAddressService;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl extends ServiceImpl<AddressDao, Address> implements IAddressService {

}
