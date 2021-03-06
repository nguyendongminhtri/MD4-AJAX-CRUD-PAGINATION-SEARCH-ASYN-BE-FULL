package chinh.anh.repository;

import chinh.anh.model.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISmartPhoneRepository extends JpaRepository<SmartPhone, Long> {
List<SmartPhone> findAllByProducerContaining(String producer);
boolean existsByProducer(String producer); //Hàm kiểm tra DB đã tồn tại hay chưa
}
