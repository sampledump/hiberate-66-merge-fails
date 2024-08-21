package com.example.data.jpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.data.jpa.model.Voucher;

public interface VoucherRepository extends CrudRepository<Voucher, Integer> {

	List<Voucher> findByMsisdn(String msisdn);

}
