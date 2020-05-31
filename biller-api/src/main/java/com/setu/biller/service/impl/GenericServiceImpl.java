/*
 * package com.setu.biller.service.impl;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.BeanPropertyRowMapper; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.stereotype.Service;
 * 
 * import com.setu.biller.domain.CustomerDetails; import
 * com.setu.biller.repository.CustomerRepository; import
 * com.setu.biller.service.GenericService;
 * 
 * @Service public class GenericServiceImpl implements GenericService {
 * 
 * 
 * @Autowired JdbcTemplate jdbcTemplate;
 * 
 * 
 * private static final String UPDATE_BILL_FETCH_SQL =
 * "update customer set billFetchStatus = 'NO_OUTSTANDING' where billerBillId = ?;"
 * ;
 * 
 * @Override public CustomerDetails findByCustomerId(String id) {
 * 
 * return jdbcTemplate.queryForObject("select * from student where id=?", new
 * Object[] { id }, new BeanPropertyRowMapper < CustomerDetails >
 * (CustomerDetails.class)); }
 * 
 * @Override public void updateBillFetchStatus(String billerBillId) {
 * 
 * jdbcTemplate.update(UPDATE_BILL_FETCH_SQL, billerBillId); }
 * 
 * @Override public CustomerDetails findByBillerBillId(String billerBillId) {
 * 
 * return
 * jdbcTemplate.queryForObject("select * from student where billerBillId=?", new
 * Object[] { billerBillId }, new BeanPropertyRowMapper < CustomerDetails >
 * (CustomerDetails.class)); }
 * 
 * }
 */