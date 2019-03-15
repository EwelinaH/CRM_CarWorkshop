package com.ewelina.app.Orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrdersService {

    @Autowired
    OrdersRepository ordersRepository;

    public void save(Orders orders){
        ordersRepository.save(orders);
    }

    public Orders find(Long id){
        return ordersRepository.findOne(id);
    }

    public void update(Orders orders){
        ordersRepository.save(orders);

    }

    public void delete(Long id){
        ordersRepository.delete(id);
    }

    public List<Orders> findAll() {
        return ordersRepository.findAll();
    }
}
