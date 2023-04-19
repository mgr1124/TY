package com.mgr.thoseyears0_1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mgr.thoseyears0_1.dao.PaymentDao;
import com.mgr.thoseyears0_1.domain.Payment;
import com.mgr.thoseyears0_1.service.IPaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao, Payment> implements IPaymentService {

}
