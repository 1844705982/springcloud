package com.hepeng.springcloud.service.impl;

import com.hepeng.springcloud.dao.PaymentDao;
import com.hepeng.springcloud.entities.Payment;
import com.hepeng.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements  PaymentService{
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

  @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
  }
}
