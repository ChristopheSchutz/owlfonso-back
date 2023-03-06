package hypesofts.owlfonso.domain.technical.event;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionalEventListener;

@Service
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Slf4j
public class OwlEventListener {

    @TransactionalEventListener
    public void handle(OwlEvent event) {
        log.info("Event received: {}", event.getPayload());
    }
}
