package vn.ecoe.pigame.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vn.ecoe.pigame.dto.CustomerDTO;
import vn.ecoe.pigame.model.Customer;

@Component("customer_converter")
public class CustomerConverter extends SuperConverter<CustomerDTO, Customer> {

    @Autowired
    ModelMapper mapper;

    @Override
    public CustomerDTO convertToDTO(Customer entity) {
        return mapper.map(entity, CustomerDTO.class);
    }

    @Override
    public Customer convertToEntity(CustomerDTO dto) {
        return mapper.map(dto, Customer.class);
    }

    @Override
    public CustomerDTO convertEntityToDTOByUserId(String contactId, Customer entity) {
        return null;
    }
}
