package hypesofts.owlfonso.domain.question;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class QuestionFactory {

    public static Question create(String question) {
        return new Question(question, QuestionId.of(UUID.randomUUID()));
    }
}