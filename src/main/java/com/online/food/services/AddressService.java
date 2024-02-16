package com.online.food.services;



import com.online.food.modal.Address;

import java.util.List;

public interface AddressService {

    public Address add(Address address);

    public Address get(Long id);

    public List<Address> findAll();

    public void delete(Address address);

    public List<Address> byCustomerId(Long cId);
}
