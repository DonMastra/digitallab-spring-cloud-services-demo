package academy.digitallab.store.shopping.repository;

import academy.digitallab.store.shopping.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    List<Invoice> findByCustomerId(Long customerId );
    Invoice findByNumberInvoice(String numberInvoice);
}
